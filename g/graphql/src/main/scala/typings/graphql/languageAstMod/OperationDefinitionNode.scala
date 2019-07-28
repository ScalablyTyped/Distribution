package typings.graphql.languageAstMod

import typings.graphql.graphqlStrings.OperationDefinition
import typings.graphql.validationValidationContextMod.NodeWithSelectionSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationDefinitionNode
  extends ExecutableDefinitionNode
     with ASTNode
     with NodeWithSelectionSet {
  val directives: js.UndefOr[js.Array[DirectiveNode]] = js.undefined
  val kind: OperationDefinition
  val loc: js.UndefOr[Location] = js.undefined
  val name: js.UndefOr[NameNode] = js.undefined
  val operation: OperationTypeNode
  val selectionSet: SelectionSetNode
  val variableDefinitions: js.UndefOr[js.Array[VariableDefinitionNode]] = js.undefined
}

object OperationDefinitionNode {
  @scala.inline
  def apply(
    kind: OperationDefinition,
    operation: OperationTypeNode,
    selectionSet: SelectionSetNode,
    directives: js.Array[DirectiveNode] = null,
    loc: Location = null,
    name: NameNode = null,
    variableDefinitions: js.Array[VariableDefinitionNode] = null
  ): OperationDefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind, operation = operation, selectionSet = selectionSet)
    if (directives != null) __obj.updateDynamic("directives")(directives)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (name != null) __obj.updateDynamic("name")(name)
    if (variableDefinitions != null) __obj.updateDynamic("variableDefinitions")(variableDefinitions)
    __obj.asInstanceOf[OperationDefinitionNode]
  }
}

