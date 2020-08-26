package typings.graphql.astMod

import typings.graphql.graphqlStrings.ObjectValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectValueNode
  extends ASTNode
     with ValueNode {
  val fields: js.Array[ObjectFieldNode] = js.native
  val kind: ObjectValue = js.native
  val loc: js.UndefOr[Location] = js.native
}

object ObjectValueNode {
  @scala.inline
  def apply(fields: js.Array[ObjectFieldNode], kind: ObjectValue): ObjectValueNode = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectValueNode]
  }
  @scala.inline
  implicit class ObjectValueNodeOps[Self <: ObjectValueNode] (val x: Self) extends AnyVal {
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
    def setFieldsVarargs(value: ObjectFieldNode*): Self = this.set("fields", js.Array(value :_*))
    @scala.inline
    def setFields(value: js.Array[ObjectFieldNode]): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def setKind(value: ObjectValue): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoc(value: Location): Self = this.set("loc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoc: Self = this.set("loc", js.undefined)
  }
  
}

