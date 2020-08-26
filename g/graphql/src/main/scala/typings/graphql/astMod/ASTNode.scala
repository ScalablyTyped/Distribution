package typings.graphql.astMod

import typings.graphql.graphqlStrings.Argument
import typings.graphql.graphqlStrings.BooleanValue
import typings.graphql.graphqlStrings.Directive
import typings.graphql.graphqlStrings.DirectiveDefinition
import typings.graphql.graphqlStrings.Document
import typings.graphql.graphqlStrings.EnumTypeDefinition
import typings.graphql.graphqlStrings.EnumTypeExtension
import typings.graphql.graphqlStrings.EnumValue
import typings.graphql.graphqlStrings.EnumValueDefinition
import typings.graphql.graphqlStrings.FieldDefinition
import typings.graphql.graphqlStrings.Field_
import typings.graphql.graphqlStrings.FloatValue
import typings.graphql.graphqlStrings.FragmentDefinition
import typings.graphql.graphqlStrings.FragmentSpread
import typings.graphql.graphqlStrings.InlineFragment
import typings.graphql.graphqlStrings.InputObjectTypeDefinition
import typings.graphql.graphqlStrings.InputObjectTypeExtension
import typings.graphql.graphqlStrings.InputValueDefinition
import typings.graphql.graphqlStrings.IntValue
import typings.graphql.graphqlStrings.InterfaceTypeDefinition
import typings.graphql.graphqlStrings.InterfaceTypeExtension
import typings.graphql.graphqlStrings.ListType
import typings.graphql.graphqlStrings.ListValue
import typings.graphql.graphqlStrings.Name
import typings.graphql.graphqlStrings.NamedType
import typings.graphql.graphqlStrings.NonNullType
import typings.graphql.graphqlStrings.NullValue
import typings.graphql.graphqlStrings.ObjectField
import typings.graphql.graphqlStrings.ObjectTypeDefinition
import typings.graphql.graphqlStrings.ObjectTypeExtension
import typings.graphql.graphqlStrings.ObjectValue
import typings.graphql.graphqlStrings.OperationDefinition
import typings.graphql.graphqlStrings.OperationTypeDefinition
import typings.graphql.graphqlStrings.ScalarTypeDefinition
import typings.graphql.graphqlStrings.ScalarTypeExtension
import typings.graphql.graphqlStrings.SchemaDefinition
import typings.graphql.graphqlStrings.SchemaExtension
import typings.graphql.graphqlStrings.SelectionSet
import typings.graphql.graphqlStrings.StringValue
import typings.graphql.graphqlStrings.UnionTypeDefinition
import typings.graphql.graphqlStrings.UnionTypeExtension
import typings.graphql.graphqlStrings.Variable
import typings.graphql.graphqlStrings.VariableDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.graphql.astMod.NameNode
  - typings.graphql.astMod.DocumentNode
  - typings.graphql.astMod.OperationDefinitionNode
  - typings.graphql.astMod.VariableDefinitionNode
  - typings.graphql.astMod.VariableNode
  - typings.graphql.astMod.SelectionSetNode
  - typings.graphql.astMod.FieldNode
  - typings.graphql.astMod.ArgumentNode
  - typings.graphql.astMod.FragmentSpreadNode
  - typings.graphql.astMod.InlineFragmentNode
  - typings.graphql.astMod.FragmentDefinitionNode
  - typings.graphql.astMod.IntValueNode
  - typings.graphql.astMod.FloatValueNode
  - typings.graphql.astMod.StringValueNode
  - typings.graphql.astMod.BooleanValueNode
  - typings.graphql.astMod.NullValueNode
  - typings.graphql.astMod.EnumValueNode
  - typings.graphql.astMod.ListValueNode
  - typings.graphql.astMod.ObjectValueNode
  - typings.graphql.astMod.ObjectFieldNode
  - typings.graphql.astMod.DirectiveNode
  - typings.graphql.astMod.NamedTypeNode
  - typings.graphql.astMod.ListTypeNode
  - typings.graphql.astMod.NonNullTypeNode
  - typings.graphql.astMod.SchemaDefinitionNode
  - typings.graphql.astMod.OperationTypeDefinitionNode
  - typings.graphql.astMod.ScalarTypeDefinitionNode
  - typings.graphql.astMod.ObjectTypeDefinitionNode
  - typings.graphql.astMod.FieldDefinitionNode
  - typings.graphql.astMod.InputValueDefinitionNode
  - typings.graphql.astMod.InterfaceTypeDefinitionNode
  - typings.graphql.astMod.UnionTypeDefinitionNode
  - typings.graphql.astMod.EnumTypeDefinitionNode
  - typings.graphql.astMod.EnumValueDefinitionNode
  - typings.graphql.astMod.InputObjectTypeDefinitionNode
  - typings.graphql.astMod.DirectiveDefinitionNode
  - typings.graphql.astMod.SchemaExtensionNode
  - typings.graphql.astMod.ScalarTypeExtensionNode
  - typings.graphql.astMod.ObjectTypeExtensionNode
  - typings.graphql.astMod.InterfaceTypeExtensionNode
  - typings.graphql.astMod.UnionTypeExtensionNode
  - typings.graphql.astMod.EnumTypeExtensionNode
  - typings.graphql.astMod.InputObjectTypeExtensionNode
*/
trait ASTNode extends js.Object

object ASTNode {
  @scala.inline
  def InputObjectTypeDefinitionNode(kind: InputObjectTypeDefinition, name: NameNode): ASTNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def ObjectValueNode(fields: js.Array[ObjectFieldNode], kind: ObjectValue): ASTNode = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def ListTypeNode(kind: ListType, `type`: TypeNode): ASTNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def ScalarTypeDefinitionNode(kind: ScalarTypeDefinition, name: NameNode): ASTNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def DirectiveNode(kind: Directive, name: NameNode): ASTNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def InputValueDefinitionNode(kind: InputValueDefinition, name: NameNode, `type`: TypeNode): ASTNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def SchemaDefinitionNode(kind: SchemaDefinition, operationTypes: js.Array[OperationTypeDefinitionNode]): ASTNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], operationTypes = operationTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def InlineFragmentNode(kind: InlineFragment, selectionSet: SelectionSetNode): ASTNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], selectionSet = selectionSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def ObjectFieldNode(kind: ObjectField, name: NameNode, value: ValueNode): ASTNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def ObjectTypeDefinitionNode(kind: ObjectTypeDefinition, name: NameNode): ASTNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def NamedTypeNode(kind: NamedType, name: NameNode): ASTNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def UnionTypeDefinitionNode(kind: UnionTypeDefinition, name: NameNode): ASTNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def OperationDefinitionNode(kind: OperationDefinition, operation: OperationTypeNode, selectionSet: SelectionSetNode): ASTNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], selectionSet = selectionSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def EnumTypeExtensionNode(kind: EnumTypeExtension, name: NameNode): ASTNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def NonNullTypeNode(kind: NonNullType, `type`: NamedTypeNode | ListTypeNode): ASTNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def EnumValueDefinitionNode(kind: EnumValueDefinition, name: NameNode): ASTNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def DocumentNode(definitions: js.Array[DefinitionNode], kind: Document): ASTNode = {
    val __obj = js.Dynamic.literal(definitions = definitions.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def ScalarTypeExtensionNode(kind: ScalarTypeExtension, name: NameNode): ASTNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def NameNode(kind: Name, value: String): ASTNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def FieldDefinitionNode(kind: FieldDefinition, name: NameNode, `type`: TypeNode): ASTNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def VariableDefinitionNode(kind: VariableDefinition, `type`: TypeNode, variable: VariableNode): ASTNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], variable = variable.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def SelectionSetNode(kind: SelectionSet, selections: js.Array[SelectionNode]): ASTNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def BooleanValueNode(kind: BooleanValue, value: Boolean): ASTNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def EnumTypeDefinitionNode(kind: EnumTypeDefinition, name: NameNode): ASTNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def ObjectTypeExtensionNode(kind: ObjectTypeExtension, name: NameNode): ASTNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def IntValueNode(kind: IntValue, value: String): ASTNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def InterfaceTypeExtensionNode(kind: InterfaceTypeExtension, name: NameNode): ASTNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def OperationTypeDefinitionNode(kind: OperationTypeDefinition, operation: OperationTypeNode, `type`: NamedTypeNode): ASTNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def InputObjectTypeExtensionNode(kind: InputObjectTypeExtension, name: NameNode): ASTNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def FieldNode(kind: Field_, name: NameNode): ASTNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def EnumValueNode(kind: EnumValue, value: String): ASTNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def ArgumentNode(kind: Argument, name: NameNode, value: ValueNode): ASTNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def VariableNode(kind: Variable, name: NameNode): ASTNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def FragmentSpreadNode(kind: FragmentSpread, name: NameNode): ASTNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def UnionTypeExtensionNode(kind: UnionTypeExtension, name: NameNode): ASTNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def NullValueNode(kind: NullValue): ASTNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def ListValueNode(kind: ListValue, values: js.Array[ValueNode]): ASTNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def FloatValueNode(kind: FloatValue, value: String): ASTNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def SchemaExtensionNode(kind: SchemaExtension): ASTNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def InterfaceTypeDefinitionNode(kind: InterfaceTypeDefinition, name: NameNode): ASTNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def FragmentDefinitionNode(
    kind: FragmentDefinition,
    name: NameNode,
    selectionSet: SelectionSetNode,
    typeCondition: NamedTypeNode
  ): ASTNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selectionSet = selectionSet.asInstanceOf[js.Any], typeCondition = typeCondition.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def DirectiveDefinitionNode(kind: DirectiveDefinition, locations: js.Array[NameNode], name: NameNode, repeatable: Boolean): ASTNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], locations = locations.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], repeatable = repeatable.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
  @scala.inline
  def StringValueNode(kind: StringValue, value: String): ASTNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTNode]
  }
}

