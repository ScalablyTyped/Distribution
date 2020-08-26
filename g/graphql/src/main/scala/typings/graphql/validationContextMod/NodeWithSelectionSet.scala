package typings.graphql.validationContextMod

import typings.graphql.astMod.NameNode
import typings.graphql.astMod.NamedTypeNode
import typings.graphql.astMod.OperationTypeNode
import typings.graphql.astMod.SelectionSetNode
import typings.graphql.graphqlStrings.FragmentDefinition
import typings.graphql.graphqlStrings.OperationDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.graphql.astMod.OperationDefinitionNode
  - typings.graphql.astMod.FragmentDefinitionNode
*/
trait NodeWithSelectionSet extends js.Object

object NodeWithSelectionSet {
  @scala.inline
  def OperationDefinitionNode(kind: OperationDefinition, operation: OperationTypeNode, selectionSet: SelectionSetNode): NodeWithSelectionSet = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], selectionSet = selectionSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeWithSelectionSet]
  }
  @scala.inline
  def FragmentDefinitionNode(
    kind: FragmentDefinition,
    name: NameNode,
    selectionSet: SelectionSetNode,
    typeCondition: NamedTypeNode
  ): NodeWithSelectionSet = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selectionSet = selectionSet.asInstanceOf[js.Any], typeCondition = typeCondition.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeWithSelectionSet]
  }
}

