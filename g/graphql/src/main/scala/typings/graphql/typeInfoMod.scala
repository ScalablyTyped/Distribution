package typings.graphql

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.astMod.ASTKindToNode
import typings.graphql.astMod.ASTNode
import typings.graphql.astMod.ArgumentNode
import typings.graphql.astMod.BooleanValueNode
import typings.graphql.astMod.DirectiveDefinitionNode
import typings.graphql.astMod.DirectiveNode
import typings.graphql.astMod.DocumentNode
import typings.graphql.astMod.EnumTypeDefinitionNode
import typings.graphql.astMod.EnumTypeExtensionNode
import typings.graphql.astMod.EnumValueDefinitionNode
import typings.graphql.astMod.EnumValueNode
import typings.graphql.astMod.FieldDefinitionNode
import typings.graphql.astMod.FieldNode
import typings.graphql.astMod.FloatValueNode
import typings.graphql.astMod.FragmentDefinitionNode
import typings.graphql.astMod.FragmentSpreadNode
import typings.graphql.astMod.InlineFragmentNode
import typings.graphql.astMod.InputObjectTypeDefinitionNode
import typings.graphql.astMod.InputObjectTypeExtensionNode
import typings.graphql.astMod.InputValueDefinitionNode
import typings.graphql.astMod.IntValueNode
import typings.graphql.astMod.InterfaceTypeDefinitionNode
import typings.graphql.astMod.InterfaceTypeExtensionNode
import typings.graphql.astMod.ListTypeNode
import typings.graphql.astMod.ListValueNode
import typings.graphql.astMod.NameNode
import typings.graphql.astMod.NamedTypeNode
import typings.graphql.astMod.NonNullTypeNode
import typings.graphql.astMod.NullValueNode
import typings.graphql.astMod.ObjectFieldNode
import typings.graphql.astMod.ObjectTypeDefinitionNode
import typings.graphql.astMod.ObjectTypeExtensionNode
import typings.graphql.astMod.ObjectValueNode
import typings.graphql.astMod.OperationDefinitionNode
import typings.graphql.astMod.OperationTypeDefinitionNode
import typings.graphql.astMod.ScalarTypeDefinitionNode
import typings.graphql.astMod.ScalarTypeExtensionNode
import typings.graphql.astMod.SchemaDefinitionNode
import typings.graphql.astMod.SchemaExtensionNode
import typings.graphql.astMod.SelectionSetNode
import typings.graphql.astMod.StringValueNode
import typings.graphql.astMod.UnionTypeDefinitionNode
import typings.graphql.astMod.UnionTypeExtensionNode
import typings.graphql.astMod.VariableDefinitionNode
import typings.graphql.astMod.VariableNode
import typings.graphql.definitionMod.GraphQLArgument
import typings.graphql.definitionMod.GraphQLCompositeType
import typings.graphql.definitionMod.GraphQLEnumValue
import typings.graphql.definitionMod.GraphQLField
import typings.graphql.definitionMod.GraphQLInputType
import typings.graphql.definitionMod.GraphQLOutputType
import typings.graphql.definitionMod.GraphQLType
import typings.graphql.directivesMod.GraphQLDirective
import typings.graphql.maybeMod.Maybe
import typings.graphql.schemaMod.GraphQLSchema
import typings.graphql.visitorMod.Visitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/utilities/TypeInfo", JSImport.Namespace)
@js.native
object typeInfoMod extends js.Object {
  @js.native
  class TypeInfo protected () extends js.Object {
    def this(schema: GraphQLSchema) = this()
    def this(
      schema: GraphQLSchema,
      // NOTE: this experimental optional second parameter is only needed in order
    // to support non-spec-compliant code bases. You should never need to use it.
    // It may disappear in the future.
    getFieldDefFn: getFieldDef
    ) = this()
    def this(
      schema: GraphQLSchema,
      // NOTE: this experimental optional second parameter is only needed in order
    // to support non-spec-compliant code bases. You should never need to use it.
    // It may disappear in the future.
    getFieldDefFn: js.UndefOr[scala.Nothing],
      // Initial type may be provided in rare cases to facilitate traversals
    // beginning somewhere other than documents.
    initialType: GraphQLType
    ) = this()
    def this(
      schema: GraphQLSchema,
      // NOTE: this experimental optional second parameter is only needed in order
    // to support non-spec-compliant code bases. You should never need to use it.
    // It may disappear in the future.
    getFieldDefFn: getFieldDef,
      // Initial type may be provided in rare cases to facilitate traversals
    // beginning somewhere other than documents.
    initialType: GraphQLType
    ) = this()
    def enter(node: ASTNode): js.Any = js.native
    def getArgument(): Maybe[GraphQLArgument] = js.native
    def getDefaultValue(): Maybe[_] = js.native
    def getDirective(): Maybe[GraphQLDirective] = js.native
    def getEnumValue(): Maybe[GraphQLEnumValue] = js.native
    def getFieldDef(): GraphQLField[_, Maybe[_], StringDictionary[_]] = js.native
    def getInputType(): Maybe[GraphQLInputType] = js.native
    def getParentInputType(): Maybe[GraphQLInputType] = js.native
    def getParentType(): Maybe[GraphQLCompositeType] = js.native
    def getType(): Maybe[GraphQLOutputType] = js.native
    def leave(node: ASTNode): js.Any = js.native
  }
  
  def visitWithTypeInfo(
    typeInfo: TypeInfo,
    visitor: Visitor[
      ASTKindToNode, 
      EnumValueDefinitionNode | ObjectValueNode | FieldDefinitionNode | SchemaDefinitionNode | InputObjectTypeDefinitionNode | DocumentNode | DirectiveDefinitionNode | InputValueDefinitionNode | ListValueNode | ScalarTypeDefinitionNode | IntValueNode | OperationDefinitionNode | ArgumentNode | FragmentDefinitionNode | OperationTypeDefinitionNode | FieldNode | StringValueNode | NameNode | ObjectFieldNode | EnumValueNode | SchemaExtensionNode | UnionTypeExtensionNode | VariableDefinitionNode | VariableNode | ObjectTypeDefinitionNode | EnumTypeExtensionNode | InterfaceTypeDefinitionNode | FloatValueNode | NonNullTypeNode | DirectiveNode | SelectionSetNode | InputObjectTypeExtensionNode | ScalarTypeExtensionNode | UnionTypeDefinitionNode | NullValueNode | InterfaceTypeExtensionNode | InlineFragmentNode | EnumTypeDefinitionNode | NamedTypeNode | BooleanValueNode | ListTypeNode | ObjectTypeExtensionNode | FragmentSpreadNode
    ]
  ): Visitor[
    ASTKindToNode, 
    EnumValueDefinitionNode | ObjectValueNode | FieldDefinitionNode | SchemaDefinitionNode | InputObjectTypeDefinitionNode | DocumentNode | DirectiveDefinitionNode | InputValueDefinitionNode | ListValueNode | ScalarTypeDefinitionNode | IntValueNode | OperationDefinitionNode | ArgumentNode | FragmentDefinitionNode | OperationTypeDefinitionNode | FieldNode | StringValueNode | NameNode | ObjectFieldNode | EnumValueNode | SchemaExtensionNode | UnionTypeExtensionNode | VariableDefinitionNode | VariableNode | ObjectTypeDefinitionNode | EnumTypeExtensionNode | InterfaceTypeDefinitionNode | FloatValueNode | NonNullTypeNode | DirectiveNode | SelectionSetNode | InputObjectTypeExtensionNode | ScalarTypeExtensionNode | UnionTypeDefinitionNode | NullValueNode | InterfaceTypeExtensionNode | InlineFragmentNode | EnumTypeDefinitionNode | NamedTypeNode | BooleanValueNode | ListTypeNode | ObjectTypeExtensionNode | FragmentSpreadNode
  ] = js.native
  type getFieldDef = js.Function3[
    /* schema */ GraphQLSchema, 
    /* parentType */ GraphQLType, 
    /* fieldNode */ FieldNode, 
    Maybe[GraphQLField[js.Any, js.Any, StringDictionary[js.Any]]]
  ]
}

