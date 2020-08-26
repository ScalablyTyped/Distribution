package typings.graphql.astMod

import typings.graphql.graphqlStrings.VariableDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VariableDefinitionNode extends ASTNode {
  val defaultValue: js.UndefOr[ValueNode] = js.native
  val directives: js.UndefOr[js.Array[DirectiveNode]] = js.native
  val kind: VariableDefinition = js.native
  val loc: js.UndefOr[Location] = js.native
  val `type`: TypeNode = js.native
  val variable: VariableNode = js.native
}

object VariableDefinitionNode {
  @scala.inline
  def apply(kind: VariableDefinition, `type`: TypeNode, variable: VariableNode): VariableDefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], variable = variable.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariableDefinitionNode]
  }
  @scala.inline
  implicit class VariableDefinitionNodeOps[Self <: VariableDefinitionNode] (val x: Self) extends AnyVal {
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
    def setKind(value: VariableDefinition): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: TypeNode): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setVariable(value: VariableNode): Self = this.set("variable", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultValue(value: ValueNode): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    @scala.inline
    def setDirectivesVarargs(value: DirectiveNode*): Self = this.set("directives", js.Array(value :_*))
    @scala.inline
    def setDirectives(value: js.Array[DirectiveNode]): Self = this.set("directives", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirectives: Self = this.set("directives", js.undefined)
    @scala.inline
    def setLoc(value: Location): Self = this.set("loc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoc: Self = this.set("loc", js.undefined)
  }
  
}

