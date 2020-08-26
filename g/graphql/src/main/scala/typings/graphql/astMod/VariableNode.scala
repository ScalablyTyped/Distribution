package typings.graphql.astMod

import typings.graphql.graphqlStrings.Variable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VariableNode
  extends ASTNode
     with ValueNode {
  val kind: Variable = js.native
  val loc: js.UndefOr[Location] = js.native
  val name: NameNode = js.native
}

object VariableNode {
  @scala.inline
  def apply(kind: Variable, name: NameNode): VariableNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariableNode]
  }
  @scala.inline
  implicit class VariableNodeOps[Self <: VariableNode] (val x: Self) extends AnyVal {
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
    def setKind(value: Variable): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: NameNode): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoc(value: Location): Self = this.set("loc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoc: Self = this.set("loc", js.undefined)
  }
  
}

