package typings.graphql.astMod

import typings.graphql.graphqlStrings.ListValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListValueNode
  extends ASTNode
     with ValueNode {
  val kind: ListValue = js.native
  val loc: js.UndefOr[Location] = js.native
  val values: js.Array[ValueNode] = js.native
}

object ListValueNode {
  @scala.inline
  def apply(kind: ListValue, values: js.Array[ValueNode]): ListValueNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListValueNode]
  }
  @scala.inline
  implicit class ListValueNodeOps[Self <: ListValueNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setKind(value: ListValue): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setValuesVarargs(value: ValueNode*): Self = this.set("values", js.Array(value :_*))
    @scala.inline
    def setValues(value: js.Array[ValueNode]): Self = this.set("values", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoc(value: Location): Self = this.set("loc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoc: Self = this.set("loc", js.undefined)
  }
  
}

