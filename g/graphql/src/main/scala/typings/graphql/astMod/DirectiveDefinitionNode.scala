package typings.graphql.astMod

import typings.graphql.graphqlStrings.DirectiveDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectiveDefinitionNode
  extends TypeSystemDefinitionNode
     with ASTNode {
  val arguments: js.UndefOr[js.Array[InputValueDefinitionNode]] = js.native
  val description: js.UndefOr[StringValueNode] = js.native
  val kind: DirectiveDefinition = js.native
  val loc: js.UndefOr[Location] = js.native
  val locations: js.Array[NameNode] = js.native
  val name: NameNode = js.native
  val repeatable: Boolean = js.native
}

object DirectiveDefinitionNode {
  @scala.inline
  def apply(kind: DirectiveDefinition, locations: js.Array[NameNode], name: NameNode, repeatable: Boolean): DirectiveDefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], locations = locations.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], repeatable = repeatable.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectiveDefinitionNode]
  }
  @scala.inline
  implicit class DirectiveDefinitionNodeOps[Self <: DirectiveDefinitionNode] (val x: Self) extends AnyVal {
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
    def setKind(value: DirectiveDefinition): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocationsVarargs(value: NameNode*): Self = this.set("locations", js.Array(value :_*))
    @scala.inline
    def setLocations(value: js.Array[NameNode]): Self = this.set("locations", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: NameNode): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepeatable(value: Boolean): Self = this.set("repeatable", value.asInstanceOf[js.Any])
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
    def setLoc(value: Location): Self = this.set("loc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoc: Self = this.set("loc", js.undefined)
  }
  
}

