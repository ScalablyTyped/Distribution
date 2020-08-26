package typings.graphql.astMod

import typings.graphql.graphqlStrings.FragmentDefinition
import typings.graphql.validationContextMod.NodeWithSelectionSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FragmentDefinitionNode
  extends ExecutableDefinitionNode
     with ASTNode
     with NodeWithSelectionSet {
  val directives: js.UndefOr[js.Array[DirectiveNode]] = js.native
  val kind: FragmentDefinition = js.native
  val loc: js.UndefOr[Location] = js.native
  val name: NameNode = js.native
  val selectionSet: SelectionSetNode = js.native
  val typeCondition: NamedTypeNode = js.native
  // Note: fragment variable definitions are experimental and may be changed
  // or removed in the future.
  val variableDefinitions: js.UndefOr[js.Array[VariableDefinitionNode]] = js.native
}

object FragmentDefinitionNode {
  @scala.inline
  def apply(
    kind: FragmentDefinition,
    name: NameNode,
    selectionSet: SelectionSetNode,
    typeCondition: NamedTypeNode
  ): FragmentDefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selectionSet = selectionSet.asInstanceOf[js.Any], typeCondition = typeCondition.asInstanceOf[js.Any])
    __obj.asInstanceOf[FragmentDefinitionNode]
  }
  @scala.inline
  implicit class FragmentDefinitionNodeOps[Self <: FragmentDefinitionNode] (val x: Self) extends AnyVal {
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
    def setKind(value: FragmentDefinition): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: NameNode): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectionSet(value: SelectionSetNode): Self = this.set("selectionSet", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypeCondition(value: NamedTypeNode): Self = this.set("typeCondition", value.asInstanceOf[js.Any])
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
    @scala.inline
    def setVariableDefinitionsVarargs(value: VariableDefinitionNode*): Self = this.set("variableDefinitions", js.Array(value :_*))
    @scala.inline
    def setVariableDefinitions(value: js.Array[VariableDefinitionNode]): Self = this.set("variableDefinitions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariableDefinitions: Self = this.set("variableDefinitions", js.undefined)
  }
  
}

