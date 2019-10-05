package typings.graphql.graphqlMod

import typings.graphql.languageAstMod.ASTKindToNode
import typings.graphql.languageAstMod.ArgumentNode
import typings.graphql.languageAstMod.BooleanValueNode
import typings.graphql.languageAstMod.DirectiveDefinitionNode
import typings.graphql.languageAstMod.DirectiveNode
import typings.graphql.languageAstMod.DocumentNode
import typings.graphql.languageAstMod.EnumTypeDefinitionNode
import typings.graphql.languageAstMod.EnumTypeExtensionNode
import typings.graphql.languageAstMod.EnumValueDefinitionNode
import typings.graphql.languageAstMod.EnumValueNode
import typings.graphql.languageAstMod.FieldDefinitionNode
import typings.graphql.languageAstMod.FieldNode
import typings.graphql.languageAstMod.FloatValueNode
import typings.graphql.languageAstMod.FragmentDefinitionNode
import typings.graphql.languageAstMod.FragmentSpreadNode
import typings.graphql.languageAstMod.InlineFragmentNode
import typings.graphql.languageAstMod.InputObjectTypeDefinitionNode
import typings.graphql.languageAstMod.InputObjectTypeExtensionNode
import typings.graphql.languageAstMod.InputValueDefinitionNode
import typings.graphql.languageAstMod.IntValueNode
import typings.graphql.languageAstMod.InterfaceTypeDefinitionNode
import typings.graphql.languageAstMod.InterfaceTypeExtensionNode
import typings.graphql.languageAstMod.ListTypeNode
import typings.graphql.languageAstMod.ListValueNode
import typings.graphql.languageAstMod.NameNode
import typings.graphql.languageAstMod.NamedTypeNode
import typings.graphql.languageAstMod.NonNullTypeNode
import typings.graphql.languageAstMod.NullValueNode
import typings.graphql.languageAstMod.ObjectFieldNode
import typings.graphql.languageAstMod.ObjectTypeDefinitionNode
import typings.graphql.languageAstMod.ObjectTypeExtensionNode
import typings.graphql.languageAstMod.ObjectValueNode
import typings.graphql.languageAstMod.OperationDefinitionNode
import typings.graphql.languageAstMod.OperationTypeDefinitionNode
import typings.graphql.languageAstMod.ScalarTypeDefinitionNode
import typings.graphql.languageAstMod.ScalarTypeExtensionNode
import typings.graphql.languageAstMod.SchemaDefinitionNode
import typings.graphql.languageAstMod.SchemaExtensionNode
import typings.graphql.languageAstMod.SelectionSetNode
import typings.graphql.languageAstMod.StringValueNode
import typings.graphql.languageAstMod.UnionTypeDefinitionNode
import typings.graphql.languageAstMod.UnionTypeExtensionNode
import typings.graphql.languageAstMod.VariableDefinitionNode
import typings.graphql.languageAstMod.VariableNode
import typings.graphql.languageVisitorMod.Visitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "visitWithTypeInfo")
@js.native
object visitWithTypeInfo extends js.Object {
  def apply(
    typeInfo: typings.graphql.utilitiesTypeInfoMod.TypeInfo,
    visitor: Visitor[
      ASTKindToNode, 
      UnionTypeDefinitionNode | FragmentSpreadNode | OperationDefinitionNode | EnumTypeDefinitionNode | StringValueNode | ArgumentNode | BooleanValueNode | NameNode | FieldDefinitionNode | ObjectTypeDefinitionNode | EnumValueDefinitionNode | FloatValueNode | NullValueNode | DirectiveNode | VariableNode | ScalarTypeExtensionNode | IntValueNode | SchemaExtensionNode | DirectiveDefinitionNode | InputObjectTypeExtensionNode | ScalarTypeDefinitionNode | UnionTypeExtensionNode | FragmentDefinitionNode | SelectionSetNode | NamedTypeNode | VariableDefinitionNode | EnumTypeExtensionNode | ObjectValueNode | OperationTypeDefinitionNode | EnumValueNode | ObjectFieldNode | FieldNode | InputObjectTypeDefinitionNode | InputValueDefinitionNode | NonNullTypeNode | InlineFragmentNode | InterfaceTypeDefinitionNode | ListTypeNode | InterfaceTypeExtensionNode | ListValueNode | SchemaDefinitionNode | ObjectTypeExtensionNode | DocumentNode
    ]
  ): Visitor[
    ASTKindToNode, 
    UnionTypeDefinitionNode | FragmentSpreadNode | OperationDefinitionNode | EnumTypeDefinitionNode | StringValueNode | ArgumentNode | BooleanValueNode | NameNode | FieldDefinitionNode | ObjectTypeDefinitionNode | EnumValueDefinitionNode | FloatValueNode | NullValueNode | DirectiveNode | VariableNode | ScalarTypeExtensionNode | IntValueNode | SchemaExtensionNode | DirectiveDefinitionNode | InputObjectTypeExtensionNode | ScalarTypeDefinitionNode | UnionTypeExtensionNode | FragmentDefinitionNode | SelectionSetNode | NamedTypeNode | VariableDefinitionNode | EnumTypeExtensionNode | ObjectValueNode | OperationTypeDefinitionNode | EnumValueNode | ObjectFieldNode | FieldNode | InputObjectTypeDefinitionNode | InputValueDefinitionNode | NonNullTypeNode | InlineFragmentNode | InterfaceTypeDefinitionNode | ListTypeNode | InterfaceTypeExtensionNode | ListValueNode | SchemaDefinitionNode | ObjectTypeExtensionNode | DocumentNode
  ] = js.native
}

