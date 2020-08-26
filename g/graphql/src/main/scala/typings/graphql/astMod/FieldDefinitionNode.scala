package typings.graphql.astMod

import typings.graphql.graphqlStrings.FieldDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldDefinitionNode extends ASTNode {
  val arguments: js.UndefOr[js.Array[InputValueDefinitionNode]] = js.native
  val description: js.UndefOr[StringValueNode] = js.native
  val directives: js.UndefOr[js.Array[DirectiveNode]] = js.native
  val kind: FieldDefinition = js.native
  val loc: js.UndefOr[Location] = js.native
  val name: NameNode = js.native
  val `type`: TypeNode = js.native
}

object FieldDefinitionNode {
  @scala.inline
  def apply(kind: FieldDefinition, name: NameNode, `type`: TypeNode): FieldDefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldDefinitionNode]
  }
  @scala.inline
  implicit class FieldDefinitionNodeOps[Self <: FieldDefinitionNode] (val x: Self) extends AnyVal {
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
    def setKind(value: FieldDefinition): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: NameNode): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: TypeNode): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setArgumentsVarargs(value: InputValueDefinitionNode*): Self = this.set("arguments", js.Array(value :_*))
    @scala.inline
    def setArguments(value: js.Array[InputValueDefinitionNode]): Self = this.set("arguments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArguments: Self = this.set("arguments", js.undefined)
    @scala.inline
    def setDescription(value: StringValueNode): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
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

