package typings.graphql

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.anon.CommentDescriptions
import typings.graphql.anon.Description
import typings.graphql.astMod.ASTKindToNode
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
import typings.graphql.astMod.ValueNode
import typings.graphql.astMod.VariableDefinitionNode
import typings.graphql.astMod.VariableNode
import typings.graphql.buildASTSchemaMod.BuildSchemaOptions
import typings.graphql.coerceInputValueMod.OnErrorCB
import typings.graphql.definitionMod.GraphQLCompositeType
import typings.graphql.definitionMod.GraphQLInputType
import typings.graphql.definitionMod.GraphQLList
import typings.graphql.definitionMod.GraphQLNamedType
import typings.graphql.definitionMod.GraphQLNonNull
import typings.graphql.definitionMod.GraphQLObjectType
import typings.graphql.definitionMod.GraphQLType
import typings.graphql.extendSchemaMod.Options
import typings.graphql.findBreakingChangesMod.BreakingChange
import typings.graphql.findBreakingChangesMod.DangerousChange
import typings.graphql.getIntrospectionQueryMod.IntrospectionOptions
import typings.graphql.getIntrospectionQueryMod.IntrospectionQuery
import typings.graphql.graphQLErrorMod.GraphQLError
import typings.graphql.maybeMod.Maybe
import typings.graphql.parserMod.ParseOptions
import typings.graphql.schemaMod.GraphQLSchema
import typings.graphql.schemaMod.GraphQLSchemaValidationOptions
import typings.graphql.sourceMod.Source
import typings.graphql.typeInfoMod.getFieldDef
import typings.graphql.visitorMod.Visitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/utilities", JSImport.Namespace)
@js.native
object utilitiesMod extends js.Object {
  @js.native
  class TypeInfo protected ()
    extends typings.graphql.typeInfoMod.TypeInfo {
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
  }
  
  def assertValidName(name: String): String = js.native
  def astFromValue(value: js.Any, `type`: GraphQLInputType): Maybe[ValueNode] = js.native
  def buildASTSchema(documentAST: DocumentNode): GraphQLSchema = js.native
  def buildASTSchema(documentAST: DocumentNode, options: BuildSchemaOptions): GraphQLSchema = js.native
  def buildClientSchema(introspection: IntrospectionQuery): GraphQLSchema = js.native
  def buildClientSchema(introspection: IntrospectionQuery, options: GraphQLSchemaValidationOptions): GraphQLSchema = js.native
  def buildSchema(source: String): GraphQLSchema = js.native
  def buildSchema(source: String, options: BuildSchemaOptions with ParseOptions): GraphQLSchema = js.native
  def buildSchema(source: Source): GraphQLSchema = js.native
  def buildSchema(source: Source, options: BuildSchemaOptions with ParseOptions): GraphQLSchema = js.native
  def coerceInputValue(inputValue: js.Any, `type`: GraphQLInputType): js.Any = js.native
  def coerceInputValue(inputValue: js.Any, `type`: GraphQLInputType, onError: OnErrorCB): js.Any = js.native
  def concatAST(asts: js.Array[DocumentNode]): DocumentNode = js.native
  def doTypesOverlap(schema: GraphQLSchema, typeA: GraphQLCompositeType, typeB: GraphQLCompositeType): Boolean = js.native
  def extendSchema(schema: GraphQLSchema, documentAST: DocumentNode): GraphQLSchema = js.native
  def extendSchema(schema: GraphQLSchema, documentAST: DocumentNode, options: Options): GraphQLSchema = js.native
  def findBreakingChanges(oldSchema: GraphQLSchema, newSchema: GraphQLSchema): js.Array[BreakingChange] = js.native
  def findDangerousChanges(oldSchema: GraphQLSchema, newSchema: GraphQLSchema): js.Array[DangerousChange] = js.native
  def findDeprecatedUsages(schema: GraphQLSchema, ast: DocumentNode): js.Array[GraphQLError] = js.native
  def getDescription(node: Description): js.UndefOr[String] = js.native
  def getDescription(node: Description, options: Maybe[CommentDescriptions]): js.UndefOr[String] = js.native
  def getIntrospectionQuery(): String = js.native
  def getIntrospectionQuery(options: IntrospectionOptions): String = js.native
  def getOperationAST(documentAST: DocumentNode): Maybe[OperationDefinitionNode] = js.native
  def getOperationAST(documentAST: DocumentNode, operationName: Maybe[String]): Maybe[OperationDefinitionNode] = js.native
  def getOperationRootType(schema: GraphQLSchema, operation: OperationDefinitionNode): GraphQLObjectType[_, _] = js.native
  def getOperationRootType(schema: GraphQLSchema, operation: OperationTypeDefinitionNode): GraphQLObjectType[_, _] = js.native
  def introspectionFromSchema(schema: GraphQLSchema): IntrospectionQuery = js.native
  def introspectionFromSchema(schema: GraphQLSchema, options: IntrospectionOptions): IntrospectionQuery = js.native
  def isEqualType(typeA: GraphQLType, typeB: GraphQLType): Boolean = js.native
  def isTypeSubTypeOf(schema: GraphQLSchema, maybeSubType: GraphQLType, superType: GraphQLType): Boolean = js.native
  def isValidNameError(name: String): js.UndefOr[GraphQLError] = js.native
  def lexicographicSortSchema(schema: GraphQLSchema): GraphQLSchema = js.native
  def printIntrospectionSchema(schema: GraphQLSchema): String = js.native
  def printIntrospectionSchema(schema: GraphQLSchema, options: typings.graphql.printSchemaMod.Options): String = js.native
  def printSchema(schema: GraphQLSchema): String = js.native
  def printSchema(schema: GraphQLSchema, options: typings.graphql.printSchemaMod.Options): String = js.native
  def printType(`type`: GraphQLNamedType): String = js.native
  def printType(`type`: GraphQLNamedType, options: typings.graphql.printSchemaMod.Options): String = js.native
  def separateOperations(documentAST: DocumentNode): StringDictionary[DocumentNode] = js.native
  def stripIgnoredCharacters(source: String): String = js.native
  def stripIgnoredCharacters(source: Source): String = js.native
  def typeFromAST(schema: GraphQLSchema, typeNode: ListTypeNode): js.UndefOr[GraphQLList[_]] = js.native
  def typeFromAST(schema: GraphQLSchema, typeNode: NamedTypeNode): js.UndefOr[GraphQLNamedType] = js.native
  def typeFromAST(schema: GraphQLSchema, typeNode: NonNullTypeNode): js.UndefOr[GraphQLNonNull[_]] = js.native
  def valueFromAST(valueNode: Maybe[ValueNode], `type`: GraphQLInputType): js.Any = js.native
  def valueFromAST(valueNode: Maybe[ValueNode], `type`: GraphQLInputType, variables: Maybe[StringDictionary[_]]): js.Any = js.native
  def valueFromASTUntyped(valueNode: ValueNode): js.Any = js.native
  def valueFromASTUntyped(valueNode: ValueNode, variables: Maybe[StringDictionary[_]]): js.Any = js.native
  def visitWithTypeInfo(
    typeInfo: typings.graphql.typeInfoMod.TypeInfo,
    visitor: Visitor[
      ASTKindToNode, 
      EnumValueDefinitionNode | ObjectValueNode | FieldDefinitionNode | SchemaDefinitionNode | InputObjectTypeDefinitionNode | DocumentNode | DirectiveDefinitionNode | InputValueDefinitionNode | ListValueNode | ScalarTypeDefinitionNode | IntValueNode | OperationDefinitionNode | ArgumentNode | FragmentDefinitionNode | OperationTypeDefinitionNode | FieldNode | StringValueNode | NameNode | ObjectFieldNode | EnumValueNode | SchemaExtensionNode | UnionTypeExtensionNode | VariableDefinitionNode | VariableNode | ObjectTypeDefinitionNode | EnumTypeExtensionNode | InterfaceTypeDefinitionNode | FloatValueNode | NonNullTypeNode | DirectiveNode | SelectionSetNode | InputObjectTypeExtensionNode | ScalarTypeExtensionNode | UnionTypeDefinitionNode | NullValueNode | InterfaceTypeExtensionNode | InlineFragmentNode | EnumTypeDefinitionNode | NamedTypeNode | BooleanValueNode | ListTypeNode | ObjectTypeExtensionNode | FragmentSpreadNode
    ]
  ): Visitor[
    ASTKindToNode, 
    EnumValueDefinitionNode | ObjectValueNode | FieldDefinitionNode | SchemaDefinitionNode | InputObjectTypeDefinitionNode | DocumentNode | DirectiveDefinitionNode | InputValueDefinitionNode | ListValueNode | ScalarTypeDefinitionNode | IntValueNode | OperationDefinitionNode | ArgumentNode | FragmentDefinitionNode | OperationTypeDefinitionNode | FieldNode | StringValueNode | NameNode | ObjectFieldNode | EnumValueNode | SchemaExtensionNode | UnionTypeExtensionNode | VariableDefinitionNode | VariableNode | ObjectTypeDefinitionNode | EnumTypeExtensionNode | InterfaceTypeDefinitionNode | FloatValueNode | NonNullTypeNode | DirectiveNode | SelectionSetNode | InputObjectTypeExtensionNode | ScalarTypeExtensionNode | UnionTypeDefinitionNode | NullValueNode | InterfaceTypeExtensionNode | InlineFragmentNode | EnumTypeDefinitionNode | NamedTypeNode | BooleanValueNode | ListTypeNode | ObjectTypeExtensionNode | FragmentSpreadNode
  ] = js.native
  @js.native
  object BreakingChangeType extends js.Object {
    var ARG_CHANGED_KIND: typings.graphql.graphqlStrings.ARG_CHANGED_KIND = js.native
    var ARG_REMOVED: typings.graphql.graphqlStrings.ARG_REMOVED = js.native
    var DIRECTIVE_ARG_REMOVED: typings.graphql.graphqlStrings.DIRECTIVE_ARG_REMOVED = js.native
    var DIRECTIVE_LOCATION_REMOVED: typings.graphql.graphqlStrings.DIRECTIVE_LOCATION_REMOVED = js.native
    var DIRECTIVE_REMOVED: typings.graphql.graphqlStrings.DIRECTIVE_REMOVED = js.native
    var DIRECTIVE_REPEATABLE_REMOVED: typings.graphql.graphqlStrings.DIRECTIVE_REPEATABLE_REMOVED = js.native
    var FIELD_CHANGED_KIND: typings.graphql.graphqlStrings.FIELD_CHANGED_KIND = js.native
    var FIELD_REMOVED: typings.graphql.graphqlStrings.FIELD_REMOVED = js.native
    var IMPLEMENTED_INTERFACE_REMOVED: typings.graphql.graphqlStrings.IMPLEMENTED_INTERFACE_REMOVED = js.native
    var REQUIRED_ARG_ADDED: typings.graphql.graphqlStrings.REQUIRED_ARG_ADDED = js.native
    var REQUIRED_DIRECTIVE_ARG_ADDED: typings.graphql.graphqlStrings.REQUIRED_DIRECTIVE_ARG_ADDED = js.native
    var REQUIRED_INPUT_FIELD_ADDED: typings.graphql.graphqlStrings.REQUIRED_INPUT_FIELD_ADDED = js.native
    var TYPE_CHANGED_KIND: typings.graphql.graphqlStrings.TYPE_CHANGED_KIND = js.native
    var TYPE_REMOVED: typings.graphql.graphqlStrings.TYPE_REMOVED = js.native
    var TYPE_REMOVED_FROM_UNION: typings.graphql.graphqlStrings.TYPE_REMOVED_FROM_UNION = js.native
    var VALUE_REMOVED_FROM_ENUM: typings.graphql.graphqlStrings.VALUE_REMOVED_FROM_ENUM = js.native
  }
  
  @js.native
  object DangerousChangeType extends js.Object {
    var ARG_DEFAULT_VALUE_CHANGE: typings.graphql.graphqlStrings.ARG_DEFAULT_VALUE_CHANGE = js.native
    var IMPLEMENTED_INTERFACE_ADDED: typings.graphql.graphqlStrings.IMPLEMENTED_INTERFACE_ADDED = js.native
    var OPTIONAL_ARG_ADDED: typings.graphql.graphqlStrings.OPTIONAL_ARG_ADDED = js.native
    var OPTIONAL_INPUT_FIELD_ADDED: typings.graphql.graphqlStrings.OPTIONAL_INPUT_FIELD_ADDED = js.native
    var TYPE_ADDED_TO_UNION: typings.graphql.graphqlStrings.TYPE_ADDED_TO_UNION = js.native
    var VALUE_ADDED_TO_ENUM: typings.graphql.graphqlStrings.VALUE_ADDED_TO_ENUM = js.native
  }
  
}

