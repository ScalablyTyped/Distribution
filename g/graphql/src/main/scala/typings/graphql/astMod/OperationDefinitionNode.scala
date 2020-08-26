package typings.graphql.astMod

import typings.graphql.graphqlStrings.OperationDefinition
import typings.graphql.validationContextMod.NodeWithSelectionSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OperationDefinitionNode
  extends ExecutableDefinitionNode
     with ASTNode
     with NodeWithSelectionSet {
  val directives: js.UndefOr[js.Array[DirectiveNode]] = js.native
  val kind: OperationDefinition = js.native
  val loc: js.UndefOr[Location] = js.native
  val name: js.UndefOr[NameNode] = js.native
  val operation: OperationTypeNode = js.native
  val selectionSet: SelectionSetNode = js.native
  val variableDefinitions: js.UndefOr[js.Array[VariableDefinitionNode]] = js.native
}

object OperationDefinitionNode {
  @scala.inline
  def apply(kind: OperationDefinition, operation: OperationTypeNode, selectionSet: SelectionSetNode): OperationDefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], selectionSet = selectionSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperationDefinitionNode]
  }
  @scala.inline
  implicit class OperationDefinitionNodeOps[Self <: OperationDefinitionNode] (val x: Self) extends AnyVal {
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
    def setKind(value: OperationDefinition): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setOperation(value: OperationTypeNode): Self = this.set("operation", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectionSet(value: SelectionSetNode): Self = this.set("selectionSet", value.asInstanceOf[js.Any])
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
    def setName(value: NameNode): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setVariableDefinitionsVarargs(value: VariableDefinitionNode*): Self = this.set("variableDefinitions", js.Array(value :_*))
    @scala.inline
    def setVariableDefinitions(value: js.Array[VariableDefinitionNode]): Self = this.set("variableDefinitions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariableDefinitions: Self = this.set("variableDefinitions", js.undefined)
  }
  
}

