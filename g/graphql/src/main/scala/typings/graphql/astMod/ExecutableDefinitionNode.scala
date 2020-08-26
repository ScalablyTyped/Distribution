package typings.graphql.astMod

import typings.graphql.graphqlStrings.FragmentDefinition
import typings.graphql.graphqlStrings.OperationDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.graphql.astMod.OperationDefinitionNode
  - typings.graphql.astMod.FragmentDefinitionNode
*/
trait ExecutableDefinitionNode extends DefinitionNode

object ExecutableDefinitionNode {
  @scala.inline
  def OperationDefinitionNode(kind: OperationDefinition, operation: OperationTypeNode, selectionSet: SelectionSetNode): ExecutableDefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], selectionSet = selectionSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecutableDefinitionNode]
  }
  @scala.inline
  def FragmentDefinitionNode(
    kind: FragmentDefinition,
    name: NameNode,
    selectionSet: SelectionSetNode,
    typeCondition: NamedTypeNode
  ): ExecutableDefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selectionSet = selectionSet.asInstanceOf[js.Any], typeCondition = typeCondition.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecutableDefinitionNode]
  }
}

