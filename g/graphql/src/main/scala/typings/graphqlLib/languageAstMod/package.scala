package typings
package graphqlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object languageAstMod {
  type ASTNode = NameNode | DocumentNode | OperationDefinitionNode | VariableDefinitionNode | VariableNode | SelectionSetNode | FieldNode | ArgumentNode | FragmentSpreadNode | InlineFragmentNode | FragmentDefinitionNode | IntValueNode | FloatValueNode | StringValueNode | BooleanValueNode | NullValueNode | EnumValueNode | ListValueNode | ObjectValueNode | ObjectFieldNode | DirectiveNode | NamedTypeNode | ListTypeNode | NonNullTypeNode | SchemaDefinitionNode | OperationTypeDefinitionNode | ScalarTypeDefinitionNode | ObjectTypeDefinitionNode | FieldDefinitionNode | InputValueDefinitionNode | InterfaceTypeDefinitionNode | UnionTypeDefinitionNode | EnumTypeDefinitionNode | EnumValueDefinitionNode | InputObjectTypeDefinitionNode | DirectiveDefinitionNode | SchemaExtensionNode | ScalarTypeExtensionNode | ObjectTypeExtensionNode | InterfaceTypeExtensionNode | UnionTypeExtensionNode | EnumTypeExtensionNode | InputObjectTypeExtensionNode
  type DefinitionNode = ExecutableDefinitionNode | TypeSystemDefinitionNode | TypeSystemExtensionNode
  type ExecutableDefinitionNode = OperationDefinitionNode | FragmentDefinitionNode
  type OperationTypeNode = graphqlLib.graphqlLibStrings.query | graphqlLib.graphqlLibStrings.mutation | graphqlLib.graphqlLibStrings.subscription
  type SelectionNode = FieldNode | FragmentSpreadNode | InlineFragmentNode
  type TypeDefinitionNode = ScalarTypeDefinitionNode | ObjectTypeDefinitionNode | InterfaceTypeDefinitionNode | UnionTypeDefinitionNode | EnumTypeDefinitionNode | InputObjectTypeDefinitionNode
  type TypeExtensionNode = ScalarTypeExtensionNode | ObjectTypeExtensionNode | InterfaceTypeExtensionNode | UnionTypeExtensionNode | EnumTypeExtensionNode | InputObjectTypeExtensionNode
  type TypeNode = NamedTypeNode | ListTypeNode | NonNullTypeNode
  type TypeSystemDefinitionNode = SchemaDefinitionNode | TypeDefinitionNode | DirectiveDefinitionNode
  type TypeSystemExtensionNode = SchemaExtensionNode | TypeExtensionNode
  type ValueNode = VariableNode | IntValueNode | FloatValueNode | StringValueNode | BooleanValueNode | NullValueNode | EnumValueNode | ListValueNode | ObjectValueNode
}
