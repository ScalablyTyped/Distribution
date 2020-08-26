package typings.graphql.astMod

import typings.graphql.graphqlStrings.DirectiveDefinition
import typings.graphql.graphqlStrings.EnumTypeDefinition
import typings.graphql.graphqlStrings.EnumTypeExtension
import typings.graphql.graphqlStrings.FragmentDefinition
import typings.graphql.graphqlStrings.InputObjectTypeDefinition
import typings.graphql.graphqlStrings.InputObjectTypeExtension
import typings.graphql.graphqlStrings.InterfaceTypeDefinition
import typings.graphql.graphqlStrings.InterfaceTypeExtension
import typings.graphql.graphqlStrings.ObjectTypeDefinition
import typings.graphql.graphqlStrings.ObjectTypeExtension
import typings.graphql.graphqlStrings.OperationDefinition
import typings.graphql.graphqlStrings.ScalarTypeDefinition
import typings.graphql.graphqlStrings.ScalarTypeExtension
import typings.graphql.graphqlStrings.SchemaDefinition
import typings.graphql.graphqlStrings.SchemaExtension
import typings.graphql.graphqlStrings.UnionTypeDefinition
import typings.graphql.graphqlStrings.UnionTypeExtension
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.graphql.astMod.ExecutableDefinitionNode
  - typings.graphql.astMod.TypeSystemDefinitionNode
  - typings.graphql.astMod.TypeSystemExtensionNode
*/
trait DefinitionNode extends js.Object

object DefinitionNode {
  @scala.inline
  def InputObjectTypeDefinitionNode(kind: InputObjectTypeDefinition, name: NameNode): DefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionNode]
  }
  @scala.inline
  def ScalarTypeDefinitionNode(kind: ScalarTypeDefinition, name: NameNode): DefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionNode]
  }
  @scala.inline
  def SchemaDefinitionNode(kind: SchemaDefinition, operationTypes: js.Array[OperationTypeDefinitionNode]): DefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], operationTypes = operationTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionNode]
  }
  @scala.inline
  def ObjectTypeDefinitionNode(kind: ObjectTypeDefinition, name: NameNode): DefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionNode]
  }
  @scala.inline
  def UnionTypeDefinitionNode(kind: UnionTypeDefinition, name: NameNode): DefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionNode]
  }
  @scala.inline
  def OperationDefinitionNode(kind: OperationDefinition, operation: OperationTypeNode, selectionSet: SelectionSetNode): DefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], selectionSet = selectionSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionNode]
  }
  @scala.inline
  def EnumTypeExtensionNode(kind: EnumTypeExtension, name: NameNode): DefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionNode]
  }
  @scala.inline
  def ScalarTypeExtensionNode(kind: ScalarTypeExtension, name: NameNode): DefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionNode]
  }
  @scala.inline
  def EnumTypeDefinitionNode(kind: EnumTypeDefinition, name: NameNode): DefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionNode]
  }
  @scala.inline
  def ObjectTypeExtensionNode(kind: ObjectTypeExtension, name: NameNode): DefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionNode]
  }
  @scala.inline
  def InterfaceTypeExtensionNode(kind: InterfaceTypeExtension, name: NameNode): DefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionNode]
  }
  @scala.inline
  def InputObjectTypeExtensionNode(kind: InputObjectTypeExtension, name: NameNode): DefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionNode]
  }
  @scala.inline
  def UnionTypeExtensionNode(kind: UnionTypeExtension, name: NameNode): DefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionNode]
  }
  @scala.inline
  def SchemaExtensionNode(kind: SchemaExtension): DefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionNode]
  }
  @scala.inline
  def InterfaceTypeDefinitionNode(kind: InterfaceTypeDefinition, name: NameNode): DefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionNode]
  }
  @scala.inline
  def FragmentDefinitionNode(
    kind: FragmentDefinition,
    name: NameNode,
    selectionSet: SelectionSetNode,
    typeCondition: NamedTypeNode
  ): DefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selectionSet = selectionSet.asInstanceOf[js.Any], typeCondition = typeCondition.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionNode]
  }
  @scala.inline
  def DirectiveDefinitionNode(kind: DirectiveDefinition, locations: js.Array[NameNode], name: NameNode, repeatable: Boolean): DefinitionNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], locations = locations.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], repeatable = repeatable.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionNode]
  }
}

