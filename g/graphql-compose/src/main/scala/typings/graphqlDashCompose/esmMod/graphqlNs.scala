package typings.graphqlDashCompose.esmMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.Anon_Directives
import typings.graphql.Anon_MaxErrors
import typings.graphql.errorFormatErrorMod.GraphQLFormattedError
import typings.graphql.executionExecuteMod.ExecutionArgs
import typings.graphql.executionExecuteMod.ExecutionResult
import typings.graphql.graphqlGraphqlMod.GraphQLArgs
import typings.graphql.jsutilsPathMod.Path
import typings.graphql.jsutilsPromiseOrValueMod.PromiseOrValue
import typings.graphql.languageAstMod.ASTKindToNode
import typings.graphql.languageAstMod.ASTNode
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
import typings.graphql.languageAstMod.TypeNode
import typings.graphql.languageAstMod.UnionTypeDefinitionNode
import typings.graphql.languageAstMod.UnionTypeExtensionNode
import typings.graphql.languageAstMod.ValueNode
import typings.graphql.languageAstMod.VariableDefinitionNode
import typings.graphql.languageAstMod.VariableNode
import typings.graphql.languageDirectiveLocationMod._DirectiveLocation
import typings.graphql.languageKindsMod._Kind
import typings.graphql.languageLexerMod.Lexer
import typings.graphql.languageLocationMod.SourceLocation
import typings.graphql.languageParserMod.ParseOptions
import typings.graphql.languageSourceMod.Location
import typings.graphql.languageTokenKindMod._TokenKind
import typings.graphql.languageVisitorMod.VisitFn
import typings.graphql.languageVisitorMod.Visitor
import typings.graphql.languageVisitorMod.VisitorKeyMap
import typings.graphql.subscriptionSubscribeMod.SubscriptionArgs
import typings.graphql.tsutilsMaybeMod.Maybe
import typings.graphql.typeDefinitionMod.GraphQLAbstractType
import typings.graphql.typeDefinitionMod.GraphQLArgument
import typings.graphql.typeDefinitionMod.GraphQLCompositeType
import typings.graphql.typeDefinitionMod.GraphQLEnumTypeConfig
import typings.graphql.typeDefinitionMod.GraphQLField
import typings.graphql.typeDefinitionMod.GraphQLFieldResolver
import typings.graphql.typeDefinitionMod.GraphQLInputField
import typings.graphql.typeDefinitionMod.GraphQLInputObjectTypeConfig
import typings.graphql.typeDefinitionMod.GraphQLInputType
import typings.graphql.typeDefinitionMod.GraphQLInterfaceTypeConfig
import typings.graphql.typeDefinitionMod.GraphQLLeafType
import typings.graphql.typeDefinitionMod.GraphQLNamedType
import typings.graphql.typeDefinitionMod.GraphQLNullableType
import typings.graphql.typeDefinitionMod.GraphQLObjectTypeConfig
import typings.graphql.typeDefinitionMod.GraphQLOutputType
import typings.graphql.typeDefinitionMod.GraphQLScalarTypeConfig
import typings.graphql.typeDefinitionMod.GraphQLType
import typings.graphql.typeDefinitionMod.GraphQLTypeResolver
import typings.graphql.typeDefinitionMod.GraphQLUnionTypeConfig
import typings.graphql.typeDefinitionMod.GraphQLWrappingType
import typings.graphql.typeDefinitionMod._GraphQLList
import typings.graphql.typeDefinitionMod._GraphQLNonNull
import typings.graphql.typeDirectivesMod.GraphQLDirectiveConfig
import typings.graphql.typeSchemaMod.GraphQLSchemaConfig
import typings.graphql.utilitiesBuildASTSchemaMod.BuildSchemaOptions
import typings.graphql.utilitiesBuildClientSchemaMod.Options
import typings.graphql.utilitiesCoerceInputValueMod.OnErrorCB
import typings.graphql.utilitiesCoerceValueMod.CoercedValue
import typings.graphql.utilitiesFindBreakingChangesMod.BreakingChange
import typings.graphql.utilitiesFindBreakingChangesMod.DangerousChange
import typings.graphql.utilitiesFindBreakingChangesMod._BreakingChangeType
import typings.graphql.utilitiesFindBreakingChangesMod._DangerousChangeType
import typings.graphql.utilitiesIntrospectionQueryMod.IntrospectionOptions
import typings.graphql.utilitiesIntrospectionQueryMod.IntrospectionQuery
import typings.graphql.utilitiesTypeInfoMod.getFieldDef
import typings.graphql.validationValidationContextMod.ValidationRule
import typings.graphqlDashCompose.graphqlDashComposeStrings.`No longer supported`
import typings.std.AsyncIterable
import typings.std.AsyncIterableIterator
import typings.std.Error
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose/esm", "graphql")
@js.native
object graphqlNs extends js.Object {
  @js.native
  class GraphQLDirective protected ()
    extends typings.graphqlDashCompose.esmGraphqlMod.GraphQLDirective {
    def this(config: GraphQLDirectiveConfig) = this()
  }
  
  @js.native
  class GraphQLEnumType protected ()
    extends typings.graphqlDashCompose.esmGraphqlMod.GraphQLEnumType {
    def this(config: GraphQLEnumTypeConfig) = this()
  }
  
  @js.native
  class GraphQLError protected ()
    extends typings.graphqlDashCompose.esmGraphqlMod.GraphQLError {
    def this(
      message: String,
      nodes: js.UndefOr[ASTNode | js.Array[ASTNode]],
      source: js.UndefOr[Maybe[typings.graphql.languageSourceMod.Source]],
      positions: js.UndefOr[Maybe[js.Array[Double]]],
      path: js.UndefOr[Maybe[js.Array[Double | String]]],
      originalError: js.UndefOr[Maybe[Error]],
      extensions: js.UndefOr[Maybe[StringDictionary[_]]]
    ) = this()
  }
  
  @js.native
  class GraphQLInputObjectType protected ()
    extends typings.graphqlDashCompose.esmGraphqlMod.GraphQLInputObjectType {
    def this(config: GraphQLInputObjectTypeConfig) = this()
  }
  
  @js.native
  class GraphQLInterfaceType protected ()
    extends typings.graphqlDashCompose.esmGraphqlMod.GraphQLInterfaceType {
    def this(config: GraphQLInterfaceTypeConfig[_, _, StringDictionary[_]]) = this()
  }
  
  @js.native
  class GraphQLListCls protected ()
    extends typings.graphqlDashCompose.esmGraphqlMod.GraphQLListCls {
    def this(`type`: GraphQLType) = this()
  }
  
  @js.native
  class GraphQLNonNullCls protected ()
    extends typings.graphqlDashCompose.esmGraphqlMod.GraphQLNonNullCls {
    def this(`type`: GraphQLNullableType) = this()
  }
  
  @js.native
  class GraphQLObjectType[TSource, TContext, TArgs] protected ()
    extends typings.graphqlDashCompose.esmGraphqlMod.GraphQLObjectType[TSource, TContext, TArgs] {
    def this(config: GraphQLObjectTypeConfig[TSource, TContext, TArgs]) = this()
  }
  
  @js.native
  class GraphQLScalarType protected ()
    extends typings.graphqlDashCompose.esmGraphqlMod.GraphQLScalarType {
    def this(config: GraphQLScalarTypeConfig[_, _]) = this()
  }
  
  @js.native
  class GraphQLSchema protected ()
    extends typings.graphqlDashCompose.esmGraphqlMod.GraphQLSchema {
    def this(config: GraphQLSchemaConfig) = this()
  }
  
  @js.native
  class GraphQLUnionType protected ()
    extends typings.graphqlDashCompose.esmGraphqlMod.GraphQLUnionType {
    def this(config: GraphQLUnionTypeConfig[_, _]) = this()
  }
  
  @js.native
  class Source protected ()
    extends typings.graphqlDashCompose.esmGraphqlMod.Source {
    def this(body: String) = this()
    def this(body: String, name: String) = this()
    def this(body: String, name: String, locationOffset: Location) = this()
  }
  
  @js.native
  class TypeInfo protected ()
    extends typings.graphqlDashCompose.esmGraphqlMod.TypeInfo {
    def this(schema: typings.graphql.typeSchemaMod.GraphQLSchema) = this()
    def this(
      schema: typings.graphql.typeSchemaMod.GraphQLSchema,
      // NOTE: this experimental optional second parameter is only needed in order
    // to support non-spec-compliant codebases. You should never need to use it.
    // It may disappear in the future.
    getFieldDefFn: getFieldDef
    ) = this()
    def this(
      schema: typings.graphql.typeSchemaMod.GraphQLSchema,
      // NOTE: this experimental optional second parameter is only needed in order
    // to support non-spec-compliant codebases. You should never need to use it.
    // It may disappear in the future.
    getFieldDefFn: getFieldDef,
      // Initial type may be provided in rare cases to facilitate traversals
    // beginning somewhere other than documents.
    initialType: GraphQLType
    ) = this()
  }
  
  @js.native
  class ValidationContext protected ()
    extends typings.graphqlDashCompose.esmGraphqlMod.ValidationContext {
    def this(
      schema: typings.graphql.typeSchemaMod.GraphQLSchema,
      ast: DocumentNode,
      typeInfo: typings.graphql.utilitiesTypeInfoMod.TypeInfo
    ) = this()
    def this(
      schema: typings.graphql.typeSchemaMod.GraphQLSchema,
      ast: DocumentNode,
      typeInfo: typings.graphql.utilitiesTypeInfoMod.TypeInfo,
      onError: js.Function1[/* err */ typings.graphql.errorGraphQLErrorMod.GraphQLError, Unit]
    ) = this()
  }
  
  val BREAK: js.Any = js.native
  val BreakingChangeType: _BreakingChangeType = js.native
  val DEFAULT_DEPRECATION_REASON: `No longer supported` = js.native
  val DangerousChangeType: _DangerousChangeType = js.native
  val DirectiveLocation: _DirectiveLocation = js.native
  val GraphQLBoolean: typings.graphql.typeDefinitionMod.GraphQLScalarType = js.native
  val GraphQLDeprecatedDirective: typings.graphql.typeDirectivesMod.GraphQLDirective = js.native
  val GraphQLFloat: typings.graphql.typeDefinitionMod.GraphQLScalarType = js.native
  val GraphQLID: typings.graphql.typeDefinitionMod.GraphQLScalarType = js.native
  val GraphQLIncludeDirective: typings.graphql.typeDirectivesMod.GraphQLDirective = js.native
  val GraphQLInt: typings.graphql.typeDefinitionMod.GraphQLScalarType = js.native
  val GraphQLList: _GraphQLList[GraphQLType] = js.native
  val GraphQLNonNull: _GraphQLNonNull[GraphQLNullableType] = js.native
  val GraphQLSkipDirective: typings.graphql.typeDirectivesMod.GraphQLDirective = js.native
  val GraphQLString: typings.graphql.typeDefinitionMod.GraphQLScalarType = js.native
  val Kind: _Kind = js.native
  val SchemaMetaFieldDef: GraphQLField[js.Any, js.Any, StringDictionary[js.Any]] = js.native
  val TokenKind: _TokenKind = js.native
  val TypeMetaFieldDef: GraphQLField[js.Any, js.Any, StringDictionary[js.Any]] = js.native
  val TypeNameMetaFieldDef: GraphQLField[js.Any, js.Any, StringDictionary[js.Any]] = js.native
  val __Directive: typings.graphql.typeDefinitionMod.GraphQLObjectType[js.Any, js.Any, StringDictionary[js.Any]] = js.native
  val __DirectiveLocation: typings.graphql.typeDefinitionMod.GraphQLEnumType = js.native
  val __EnumValue: typings.graphql.typeDefinitionMod.GraphQLObjectType[js.Any, js.Any, StringDictionary[js.Any]] = js.native
  val __Field: typings.graphql.typeDefinitionMod.GraphQLObjectType[js.Any, js.Any, StringDictionary[js.Any]] = js.native
  val __InputValue: typings.graphql.typeDefinitionMod.GraphQLObjectType[js.Any, js.Any, StringDictionary[js.Any]] = js.native
  val __Schema: typings.graphql.typeDefinitionMod.GraphQLObjectType[js.Any, js.Any, StringDictionary[js.Any]] = js.native
  val __Type: typings.graphql.typeDefinitionMod.GraphQLObjectType[js.Any, js.Any, StringDictionary[js.Any]] = js.native
  val __TypeKind: typings.graphql.typeDefinitionMod.GraphQLEnumType = js.native
  val defaultFieldResolver: GraphQLFieldResolver[js.Any, js.Any, StringDictionary[js.Any]] = js.native
  val defaultTypeResolver: GraphQLTypeResolver[js.Any, js.Any, StringDictionary[js.Any]] = js.native
  val introspectionQuery: String = js.native
  val introspectionTypes: js.Array[GraphQLType] = js.native
  val specifiedDirectives: js.Array[typings.graphql.typeDirectivesMod.GraphQLDirective] = js.native
  val specifiedRules: js.Array[ValidationRule] = js.native
  val specifiedScalarTypes: js.Array[typings.graphql.typeDefinitionMod.GraphQLScalarType] = js.native
  val version: String = js.native
  def assertAbstractType(`type`: js.Any): GraphQLAbstractType = js.native
  def assertCompositeType(`type`: js.Any): GraphQLCompositeType = js.native
  def assertDirective(directive: js.Any): typings.graphql.typeDirectivesMod.GraphQLDirective = js.native
  def assertEnumType(`type`: js.Any): typings.graphql.typeDefinitionMod.GraphQLEnumType = js.native
  def assertInputObjectType(`type`: js.Any): typings.graphql.typeDefinitionMod.GraphQLInputObjectType = js.native
  def assertInputType(`type`: js.Any): GraphQLInputType = js.native
  def assertInterfaceType(`type`: js.Any): typings.graphql.typeDefinitionMod.GraphQLInterfaceType = js.native
  def assertLeafType(`type`: js.Any): GraphQLLeafType = js.native
  def assertListType(`type`: js.Any): typings.graphql.typeDefinitionMod.GraphQLList[_] = js.native
  def assertNamedType(`type`: js.Any): GraphQLNamedType = js.native
  def assertNonNullType(`type`: js.Any): typings.graphql.typeDefinitionMod.GraphQLNonNull[_] = js.native
  def assertNullableType(`type`: js.Any): GraphQLNullableType = js.native
  def assertObjectType(`type`: js.Any): typings.graphql.typeDefinitionMod.GraphQLObjectType[_, _, StringDictionary[_]] = js.native
  def assertOutputType(`type`: js.Any): GraphQLOutputType = js.native
  def assertScalarType(`type`: js.Any): typings.graphql.typeDefinitionMod.GraphQLScalarType = js.native
  def assertSchema(schema: js.Any): typings.graphql.typeSchemaMod.GraphQLSchema = js.native
  def assertType(`type`: js.Any): GraphQLType = js.native
  def assertUnionType(`type`: js.Any): typings.graphql.typeDefinitionMod.GraphQLUnionType = js.native
  def assertValidName(name: String): String = js.native
  def assertValidSchema(schema: typings.graphql.typeSchemaMod.GraphQLSchema): Unit = js.native
  def assertWrappingType(`type`: js.Any): GraphQLWrappingType = js.native
  def astFromValue(value: js.Any, `type`: GraphQLInputType): Maybe[ValueNode] = js.native
  def buildASTSchema(documentAST: DocumentNode): typings.graphql.typeSchemaMod.GraphQLSchema = js.native
  def buildASTSchema(documentAST: DocumentNode, options: BuildSchemaOptions): typings.graphql.typeSchemaMod.GraphQLSchema = js.native
  def buildClientSchema(introspection: IntrospectionQuery): typings.graphql.typeSchemaMod.GraphQLSchema = js.native
  def buildClientSchema(introspection: IntrospectionQuery, options: Options): typings.graphql.typeSchemaMod.GraphQLSchema = js.native
  def buildSchema(source: String): typings.graphql.typeSchemaMod.GraphQLSchema = js.native
  def buildSchema(source: String, options: BuildSchemaOptions with ParseOptions): typings.graphql.typeSchemaMod.GraphQLSchema = js.native
  def buildSchema(source: typings.graphql.languageSourceMod.Source): typings.graphql.typeSchemaMod.GraphQLSchema = js.native
  def buildSchema(source: typings.graphql.languageSourceMod.Source, options: BuildSchemaOptions with ParseOptions): typings.graphql.typeSchemaMod.GraphQLSchema = js.native
  def coerceInputValue(inputValue: js.Any, `type`: GraphQLInputType): js.Any = js.native
  def coerceInputValue(inputValue: js.Any, `type`: GraphQLInputType, onError: OnErrorCB): js.Any = js.native
  def coerceValue(inputValue: js.Any, `type`: GraphQLInputType): CoercedValue = js.native
  def coerceValue(inputValue: js.Any, `type`: GraphQLInputType, blameNode: ASTNode): CoercedValue = js.native
  def coerceValue(inputValue: js.Any, `type`: GraphQLInputType, blameNode: ASTNode, path: Path): CoercedValue = js.native
  def concatAST(asts: js.Array[DocumentNode]): DocumentNode = js.native
  def createLexer[TOptions](source: typings.graphql.languageSourceMod.Source, options: TOptions): Lexer[TOptions] = js.native
  def createSourceEventStream[TData](schema: typings.graphql.typeSchemaMod.GraphQLSchema, document: DocumentNode): js.Promise[AsyncIterable[_] | ExecutionResult[TData]] = js.native
  def createSourceEventStream[TData](schema: typings.graphql.typeSchemaMod.GraphQLSchema, document: DocumentNode, rootValue: js.Any): js.Promise[AsyncIterable[_] | ExecutionResult[TData]] = js.native
  def createSourceEventStream[TData](
    schema: typings.graphql.typeSchemaMod.GraphQLSchema,
    document: DocumentNode,
    rootValue: js.Any,
    contextValue: js.Any
  ): js.Promise[AsyncIterable[_] | ExecutionResult[TData]] = js.native
  def createSourceEventStream[TData](
    schema: typings.graphql.typeSchemaMod.GraphQLSchema,
    document: DocumentNode,
    rootValue: js.Any,
    contextValue: js.Any,
    variableValues: StringDictionary[js.Any]
  ): js.Promise[AsyncIterable[_] | ExecutionResult[TData]] = js.native
  def createSourceEventStream[TData](
    schema: typings.graphql.typeSchemaMod.GraphQLSchema,
    document: DocumentNode,
    rootValue: js.Any,
    contextValue: js.Any,
    variableValues: StringDictionary[js.Any],
    operationName: Maybe[String]
  ): js.Promise[AsyncIterable[_] | ExecutionResult[TData]] = js.native
  def createSourceEventStream[TData](
    schema: typings.graphql.typeSchemaMod.GraphQLSchema,
    document: DocumentNode,
    rootValue: js.Any,
    contextValue: js.Any,
    variableValues: StringDictionary[js.Any],
    operationName: Maybe[String],
    fieldResolver: Maybe[GraphQLFieldResolver[_, _, StringDictionary[_]]]
  ): js.Promise[AsyncIterable[_] | ExecutionResult[TData]] = js.native
  def doTypesOverlap(
    schema: typings.graphql.typeSchemaMod.GraphQLSchema,
    typeA: GraphQLCompositeType,
    typeB: GraphQLCompositeType
  ): Boolean = js.native
  def execute[TData](args: ExecutionArgs): PromiseOrValue[ExecutionResult[TData]] = js.native
  def execute[TData](
    schema: typings.graphql.typeSchemaMod.GraphQLSchema,
    document: DocumentNode,
    rootValue: js.UndefOr[js.Any],
    contextValue: js.UndefOr[js.Any],
    variableValues: js.UndefOr[Maybe[StringDictionary[_]]],
    operationName: js.UndefOr[Maybe[String]],
    fieldResolver: js.UndefOr[Maybe[GraphQLFieldResolver[_, _, StringDictionary[_]]]],
    typeResolver: js.UndefOr[Maybe[GraphQLTypeResolver[_, _, StringDictionary[_]]]]
  ): PromiseOrValue[ExecutionResult[TData]] = js.native
  def extendSchema(schema: typings.graphql.typeSchemaMod.GraphQLSchema, documentAST: DocumentNode): typings.graphql.typeSchemaMod.GraphQLSchema = js.native
  def extendSchema(
    schema: typings.graphql.typeSchemaMod.GraphQLSchema,
    documentAST: DocumentNode,
    options: typings.graphql.utilitiesExtendSchemaMod.Options
  ): typings.graphql.typeSchemaMod.GraphQLSchema = js.native
  def findBreakingChanges(
    oldSchema: typings.graphql.typeSchemaMod.GraphQLSchema,
    newSchema: typings.graphql.typeSchemaMod.GraphQLSchema
  ): js.Array[BreakingChange] = js.native
  def findDangerousChanges(
    oldSchema: typings.graphql.typeSchemaMod.GraphQLSchema,
    newSchema: typings.graphql.typeSchemaMod.GraphQLSchema
  ): js.Array[DangerousChange] = js.native
  def findDeprecatedUsages(schema: typings.graphql.typeSchemaMod.GraphQLSchema, ast: DocumentNode): js.Array[typings.graphql.errorGraphQLErrorMod.GraphQLError] = js.native
  def formatError(error: typings.graphql.errorGraphQLErrorMod.GraphQLError): GraphQLFormattedError[Record[String, _]] = js.native
  def getDescription(node: typings.graphql.Anon_Description, options: Maybe[BuildSchemaOptions]): js.UndefOr[String] = js.native
  def getDirectiveValues(directiveDef: typings.graphql.typeDirectivesMod.GraphQLDirective, node: Anon_Directives): js.UndefOr[StringDictionary[js.Any]] = js.native
  def getDirectiveValues(
    directiveDef: typings.graphql.typeDirectivesMod.GraphQLDirective,
    node: Anon_Directives,
    variableValues: Maybe[StringDictionary[_]]
  ): js.UndefOr[StringDictionary[js.Any]] = js.native
  def getIntrospectionQuery(): String = js.native
  def getIntrospectionQuery(options: IntrospectionOptions): String = js.native
  def getLocation(source: typings.graphql.languageSourceMod.Source, position: Double): SourceLocation = js.native
  def getNamedType(`type`: Unit): js.UndefOr[scala.Nothing] = js.native
  def getNamedType(`type`: GraphQLType): GraphQLNamedType = js.native
  def getNullableType(`type`: Unit): js.UndefOr[scala.Nothing] = js.native
  def getNullableType(`type`: typings.graphql.typeDefinitionMod.GraphQLEnumType): typings.graphql.typeDefinitionMod.GraphQLEnumType = js.native
  def getNullableType(`type`: typings.graphql.typeDefinitionMod.GraphQLInputObjectType): typings.graphql.typeDefinitionMod.GraphQLInputObjectType = js.native
  def getNullableType(`type`: typings.graphql.typeDefinitionMod.GraphQLInterfaceType): typings.graphql.typeDefinitionMod.GraphQLInterfaceType = js.native
  def getNullableType(`type`: typings.graphql.typeDefinitionMod.GraphQLScalarType): typings.graphql.typeDefinitionMod.GraphQLScalarType = js.native
  def getNullableType(`type`: typings.graphql.typeDefinitionMod.GraphQLUnionType): typings.graphql.typeDefinitionMod.GraphQLUnionType = js.native
  def getNullableType[T /* <: (typings.graphql.typeDefinitionMod.GraphQLObjectType[_, _, StringDictionary[_]]) | typings.graphql.typeDefinitionMod.GraphQLList[_] */](`type`: T): T = js.native
  def getNullableType[T /* <: GraphQLNullableType */](`type`: typings.graphql.typeDefinitionMod.GraphQLNonNull[T]): T = js.native
  def getOperationAST(documentAST: DocumentNode, operationName: Maybe[String]): Maybe[OperationDefinitionNode] = js.native
  def getOperationRootType(schema: typings.graphql.typeSchemaMod.GraphQLSchema, operation: OperationDefinitionNode): typings.graphql.typeDefinitionMod.GraphQLObjectType[_, _, StringDictionary[_]] = js.native
  def getOperationRootType(schema: typings.graphql.typeSchemaMod.GraphQLSchema, operation: OperationTypeDefinitionNode): typings.graphql.typeDefinitionMod.GraphQLObjectType[_, _, StringDictionary[_]] = js.native
  def getVisitFn(
    visitor: Visitor[
      _, 
      /* import warning: ImportType.apply Failed type conversion: any[keyof any] */ js.Any
    ],
    kind: String,
    isLeaving: Boolean
  ): Maybe[VisitFn[_, _]] = js.native
  def graphql[TData](args: GraphQLArgs): js.Promise[ExecutionResult[TData]] = js.native
  def graphql[TData](
    schema: typings.graphql.typeSchemaMod.GraphQLSchema,
    source: String,
    rootValue: js.UndefOr[js.Any],
    contextValue: js.UndefOr[js.Any],
    variableValues: js.UndefOr[Maybe[StringDictionary[_]]],
    operationName: js.UndefOr[Maybe[String]],
    fieldResolver: js.UndefOr[Maybe[GraphQLFieldResolver[_, _, StringDictionary[_]]]],
    typeResolver: js.UndefOr[Maybe[GraphQLTypeResolver[_, _, StringDictionary[_]]]]
  ): js.Promise[ExecutionResult[TData]] = js.native
  def graphql[TData](
    schema: typings.graphql.typeSchemaMod.GraphQLSchema,
    source: typings.graphql.languageSourceMod.Source,
    rootValue: js.UndefOr[js.Any],
    contextValue: js.UndefOr[js.Any],
    variableValues: js.UndefOr[Maybe[StringDictionary[_]]],
    operationName: js.UndefOr[Maybe[String]],
    fieldResolver: js.UndefOr[Maybe[GraphQLFieldResolver[_, _, StringDictionary[_]]]],
    typeResolver: js.UndefOr[Maybe[GraphQLTypeResolver[_, _, StringDictionary[_]]]]
  ): js.Promise[ExecutionResult[TData]] = js.native
  def graphqlSync[TData](args: GraphQLArgs): ExecutionResult[TData] = js.native
  def graphqlSync[TData](
    schema: typings.graphql.typeSchemaMod.GraphQLSchema,
    source: String,
    rootValue: js.UndefOr[js.Any],
    contextValue: js.UndefOr[js.Any],
    variableValues: js.UndefOr[Maybe[StringDictionary[_]]],
    operationName: js.UndefOr[Maybe[String]],
    fieldResolver: js.UndefOr[Maybe[GraphQLFieldResolver[_, _, StringDictionary[_]]]],
    typeResolver: js.UndefOr[Maybe[GraphQLTypeResolver[_, _, StringDictionary[_]]]]
  ): ExecutionResult[TData] = js.native
  def graphqlSync[TData](
    schema: typings.graphql.typeSchemaMod.GraphQLSchema,
    source: typings.graphql.languageSourceMod.Source,
    rootValue: js.UndefOr[js.Any],
    contextValue: js.UndefOr[js.Any],
    variableValues: js.UndefOr[Maybe[StringDictionary[_]]],
    operationName: js.UndefOr[Maybe[String]],
    fieldResolver: js.UndefOr[Maybe[GraphQLFieldResolver[_, _, StringDictionary[_]]]],
    typeResolver: js.UndefOr[Maybe[GraphQLTypeResolver[_, _, StringDictionary[_]]]]
  ): ExecutionResult[TData] = js.native
  def introspectionFromSchema(schema: typings.graphql.typeSchemaMod.GraphQLSchema): IntrospectionQuery = js.native
  def introspectionFromSchema(schema: typings.graphql.typeSchemaMod.GraphQLSchema, options: IntrospectionOptions): IntrospectionQuery = js.native
  def isAbstractType(`type`: js.Any): /* is graphql.graphql/type/definition.GraphQLAbstractType */ Boolean = js.native
  def isCompositeType(`type`: js.Any): /* is graphql.graphql/type/definition.GraphQLCompositeType */ Boolean = js.native
  def isDefinitionNode(node: ASTNode): /* is graphql.graphql/language/ast.DefinitionNode */ Boolean = js.native
  def isDirective(directive: js.Any): /* is graphql.graphql/type/directives.GraphQLDirective */ Boolean = js.native
  def isEnumType(`type`: js.Any): /* is graphql.graphql/type/definition.GraphQLEnumType */ Boolean = js.native
  def isEqualType(typeA: GraphQLType, typeB: GraphQLType): Boolean = js.native
  def isExecutableDefinitionNode(node: ASTNode): /* is graphql.graphql/language/ast.ExecutableDefinitionNode */ Boolean = js.native
  def isInputObjectType(`type`: js.Any): /* is graphql.graphql/type/definition.GraphQLInputObjectType */ Boolean = js.native
  def isInputType(`type`: js.Any): /* is graphql.graphql/type/definition.GraphQLInputType */ Boolean = js.native
  def isInterfaceType(`type`: js.Any): /* is graphql.graphql/type/definition.GraphQLInterfaceType */ Boolean = js.native
  def isIntrospectionType(`type`: js.Any): Boolean = js.native
  def isLeafType(`type`: js.Any): /* is graphql.graphql/type/definition.GraphQLLeafType */ Boolean = js.native
  def isListType(`type`: js.Any): /* is graphql.graphql/type/definition.GraphQLList<any> */ Boolean = js.native
  def isNamedType(`type`: js.Any): /* is graphql.graphql/type/definition.GraphQLNamedType */ Boolean = js.native
  def isNonNullType(`type`: js.Any): /* is graphql.graphql/type/definition.GraphQLNonNull<any> */ Boolean = js.native
  def isNullableType(`type`: js.Any): /* is graphql.graphql/type/definition.GraphQLNullableType */ Boolean = js.native
  def isObjectType(`type`: js.Any): /* is graphql.graphql/type/definition.GraphQLObjectType<any, any, {[key: string] : any}> */ Boolean = js.native
  def isOutputType(`type`: js.Any): /* is graphql.graphql/type/definition.GraphQLOutputType */ Boolean = js.native
  def isRequiredArgument(arg: GraphQLArgument): Boolean = js.native
  def isRequiredInputField(field: GraphQLInputField): Boolean = js.native
  def isScalarType(`type`: js.Any): /* is graphql.graphql/type/definition.GraphQLScalarType */ Boolean = js.native
  def isSchema(schema: js.Any): /* is graphql.graphql/type/schema.GraphQLSchema */ Boolean = js.native
  def isSelectionNode(node: ASTNode): /* is graphql.graphql/language/ast.SelectionNode */ Boolean = js.native
  def isSpecifiedDirective(directive: js.Any): Boolean = js.native
  def isSpecifiedScalarType(`type`: js.Any): Boolean = js.native
  def isType(`type`: js.Any): /* is graphql.graphql/type/definition.GraphQLType */ Boolean = js.native
  def isTypeDefinitionNode(node: ASTNode): /* is graphql.graphql/language/ast.TypeDefinitionNode */ Boolean = js.native
  def isTypeExtensionNode(node: ASTNode): /* is graphql.graphql/language/ast.TypeExtensionNode */ Boolean = js.native
  def isTypeNode(node: ASTNode): /* is graphql.graphql/language/ast.TypeNode */ Boolean = js.native
  def isTypeSubTypeOf(
    schema: typings.graphql.typeSchemaMod.GraphQLSchema,
    maybeSubType: GraphQLType,
    superType: GraphQLType
  ): Boolean = js.native
  def isTypeSystemDefinitionNode(node: ASTNode): /* is graphql.graphql/language/ast.TypeSystemDefinitionNode */ Boolean = js.native
  def isTypeSystemExtensionNode(node: ASTNode): /* is graphql.graphql/language/ast.TypeSystemExtensionNode */ Boolean = js.native
  def isUnionType(`type`: js.Any): /* is graphql.graphql/type/definition.GraphQLUnionType */ Boolean = js.native
  def isValidJSValue(value: js.Any, `type`: GraphQLInputType): js.Array[String] = js.native
  def isValidLiteralValue(`type`: GraphQLInputType, valueNode: ValueNode): js.Array[typings.graphql.errorGraphQLErrorMod.GraphQLError] = js.native
  def isValidNameError(name: String): js.UndefOr[typings.graphql.errorGraphQLErrorMod.GraphQLError] = js.native
  def isValidNameError(name: String, node: ASTNode): js.UndefOr[typings.graphql.errorGraphQLErrorMod.GraphQLError] = js.native
  def isValueNode(node: ASTNode): /* is graphql.graphql/language/ast.ValueNode */ Boolean = js.native
  def isWrappingType(`type`: js.Any): /* is graphql.graphql/type/definition.GraphQLWrappingType */ Boolean = js.native
  def lexicographicSortSchema(schema: typings.graphql.typeSchemaMod.GraphQLSchema): typings.graphql.typeSchemaMod.GraphQLSchema = js.native
  def locatedError(
    originalError: typings.graphql.errorGraphQLErrorMod.GraphQLError,
    nodes: js.Array[ASTNode],
    path: js.Array[String | Double]
  ): typings.graphql.errorGraphQLErrorMod.GraphQLError = js.native
  def locatedError(originalError: Error, nodes: js.Array[ASTNode], path: js.Array[String | Double]): typings.graphql.errorGraphQLErrorMod.GraphQLError = js.native
  def parse(source: String): DocumentNode = js.native
  def parse(source: String, options: ParseOptions): DocumentNode = js.native
  def parse(source: typings.graphql.languageSourceMod.Source): DocumentNode = js.native
  def parse(source: typings.graphql.languageSourceMod.Source, options: ParseOptions): DocumentNode = js.native
  def parseType(source: String): TypeNode = js.native
  def parseType(source: String, options: ParseOptions): TypeNode = js.native
  def parseType(source: typings.graphql.languageSourceMod.Source): TypeNode = js.native
  def parseType(source: typings.graphql.languageSourceMod.Source, options: ParseOptions): TypeNode = js.native
  def parseValue(source: String): ValueNode = js.native
  def parseValue(source: String, options: ParseOptions): ValueNode = js.native
  def parseValue(source: typings.graphql.languageSourceMod.Source): ValueNode = js.native
  def parseValue(source: typings.graphql.languageSourceMod.Source, options: ParseOptions): ValueNode = js.native
  def print(ast: ASTNode): String = js.native
  def printError(error: typings.graphql.errorGraphQLErrorMod.GraphQLError): String = js.native
  def printIntrospectionSchema(schema: typings.graphql.typeSchemaMod.GraphQLSchema): String = js.native
  def printIntrospectionSchema(
    schema: typings.graphql.typeSchemaMod.GraphQLSchema,
    options: typings.graphql.utilitiesSchemaPrinterMod.Options
  ): String = js.native
  def printLocation(location: typings.graphql.languageAstMod.Location): String = js.native
  def printSchema(schema: typings.graphql.typeSchemaMod.GraphQLSchema): String = js.native
  def printSchema(
    schema: typings.graphql.typeSchemaMod.GraphQLSchema,
    options: typings.graphql.utilitiesSchemaPrinterMod.Options
  ): String = js.native
  def printSourceLocation(source: typings.graphql.languageSourceMod.Source, sourceLocation: SourceLocation): String = js.native
  def printType(`type`: GraphQLNamedType): String = js.native
  def printType(`type`: GraphQLNamedType, options: typings.graphql.utilitiesSchemaPrinterMod.Options): String = js.native
  def separateOperations(documentAST: DocumentNode): StringDictionary[DocumentNode] = js.native
  def stripIgnoredCharacters(source: String): String = js.native
  def stripIgnoredCharacters(source: typings.graphql.languageSourceMod.Source): String = js.native
  def subscribe[TData](args: SubscriptionArgs): js.Promise[AsyncIterableIterator[ExecutionResult[TData]] | ExecutionResult[TData]] = js.native
  def subscribe[TData](
    schema: typings.graphql.typeSchemaMod.GraphQLSchema,
    document: DocumentNode,
    rootValue: js.UndefOr[js.Any],
    contextValue: js.UndefOr[js.Any],
    variableValues: js.UndefOr[Maybe[StringDictionary[_]]],
    operationName: js.UndefOr[Maybe[String]],
    fieldResolver: js.UndefOr[Maybe[GraphQLFieldResolver[_, _, StringDictionary[_]]]],
    subscribeFieldResolver: js.UndefOr[Maybe[GraphQLFieldResolver[_, _, StringDictionary[_]]]]
  ): js.Promise[AsyncIterableIterator[ExecutionResult[TData]] | ExecutionResult[TData]] = js.native
  def syntaxError(source: typings.graphql.languageSourceMod.Source, position: Double, description: String): typings.graphql.errorGraphQLErrorMod.GraphQLError = js.native
  def typeFromAST(schema: typings.graphql.typeSchemaMod.GraphQLSchema, typeNode: ListTypeNode): js.UndefOr[typings.graphql.typeDefinitionMod.GraphQLList[_]] = js.native
  def typeFromAST(schema: typings.graphql.typeSchemaMod.GraphQLSchema, typeNode: NamedTypeNode): js.UndefOr[GraphQLNamedType] = js.native
  def typeFromAST(schema: typings.graphql.typeSchemaMod.GraphQLSchema, typeNode: NonNullTypeNode): js.UndefOr[typings.graphql.typeDefinitionMod.GraphQLNonNull[_]] = js.native
  def validate(schema: typings.graphql.typeSchemaMod.GraphQLSchema, documentAST: DocumentNode): js.Array[typings.graphql.errorGraphQLErrorMod.GraphQLError] = js.native
  def validate(
    schema: typings.graphql.typeSchemaMod.GraphQLSchema,
    documentAST: DocumentNode,
    rules: js.Array[ValidationRule]
  ): js.Array[typings.graphql.errorGraphQLErrorMod.GraphQLError] = js.native
  def validate(
    schema: typings.graphql.typeSchemaMod.GraphQLSchema,
    documentAST: DocumentNode,
    rules: js.Array[ValidationRule],
    typeInfo: typings.graphql.utilitiesTypeInfoMod.TypeInfo
  ): js.Array[typings.graphql.errorGraphQLErrorMod.GraphQLError] = js.native
  def validate(
    schema: typings.graphql.typeSchemaMod.GraphQLSchema,
    documentAST: DocumentNode,
    rules: js.Array[ValidationRule],
    typeInfo: typings.graphql.utilitiesTypeInfoMod.TypeInfo,
    options: Anon_MaxErrors
  ): js.Array[typings.graphql.errorGraphQLErrorMod.GraphQLError] = js.native
  def validateSchema(schema: typings.graphql.typeSchemaMod.GraphQLSchema): js.Array[typings.graphql.errorGraphQLErrorMod.GraphQLError] = js.native
  def valueFromAST(valueNode: Maybe[ValueNode], `type`: GraphQLInputType): js.Any = js.native
  def valueFromAST(valueNode: Maybe[ValueNode], `type`: GraphQLInputType, variables: Maybe[StringDictionary[_]]): js.Any = js.native
  def valueFromASTUntyped(valueNode: ValueNode): js.Any = js.native
  def valueFromASTUntyped(valueNode: ValueNode, variables: Maybe[StringDictionary[_]]): js.Any = js.native
  def visit(
    root: ASTNode,
    visitor: Visitor[
      ASTKindToNode, 
      UnionTypeDefinitionNode | FragmentSpreadNode | OperationDefinitionNode | EnumTypeDefinitionNode | StringValueNode | ArgumentNode | BooleanValueNode | NameNode | FieldDefinitionNode | ObjectTypeDefinitionNode | EnumValueDefinitionNode | FloatValueNode | NullValueNode | DirectiveNode | VariableNode | ScalarTypeExtensionNode | IntValueNode | SchemaExtensionNode | DirectiveDefinitionNode | InputObjectTypeExtensionNode | ScalarTypeDefinitionNode | UnionTypeExtensionNode | FragmentDefinitionNode | SelectionSetNode | NamedTypeNode | VariableDefinitionNode | EnumTypeExtensionNode | ObjectValueNode | OperationTypeDefinitionNode | EnumValueNode | ObjectFieldNode | FieldNode | InputObjectTypeDefinitionNode | InputValueDefinitionNode | NonNullTypeNode | InlineFragmentNode | InterfaceTypeDefinitionNode | ListTypeNode | InterfaceTypeExtensionNode | ListValueNode | SchemaDefinitionNode | ObjectTypeExtensionNode | DocumentNode
    ]
  ): js.Any = js.native
  def visit(
    root: ASTNode,
    visitor: Visitor[
      ASTKindToNode, 
      UnionTypeDefinitionNode | FragmentSpreadNode | OperationDefinitionNode | EnumTypeDefinitionNode | StringValueNode | ArgumentNode | BooleanValueNode | NameNode | FieldDefinitionNode | ObjectTypeDefinitionNode | EnumValueDefinitionNode | FloatValueNode | NullValueNode | DirectiveNode | VariableNode | ScalarTypeExtensionNode | IntValueNode | SchemaExtensionNode | DirectiveDefinitionNode | InputObjectTypeExtensionNode | ScalarTypeDefinitionNode | UnionTypeExtensionNode | FragmentDefinitionNode | SelectionSetNode | NamedTypeNode | VariableDefinitionNode | EnumTypeExtensionNode | ObjectValueNode | OperationTypeDefinitionNode | EnumValueNode | ObjectFieldNode | FieldNode | InputObjectTypeDefinitionNode | InputValueDefinitionNode | NonNullTypeNode | InlineFragmentNode | InterfaceTypeDefinitionNode | ListTypeNode | InterfaceTypeExtensionNode | ListValueNode | SchemaDefinitionNode | ObjectTypeExtensionNode | DocumentNode
    ],
     // default: QueryDocumentKeys
  visitorKeys: VisitorKeyMap[ASTKindToNode]
  ): js.Any = js.native
  def visitInParallel(
    visitors: js.Array[
      Visitor[
        ASTKindToNode, 
        UnionTypeDefinitionNode | FragmentSpreadNode | OperationDefinitionNode | EnumTypeDefinitionNode | StringValueNode | ArgumentNode | BooleanValueNode | NameNode | FieldDefinitionNode | ObjectTypeDefinitionNode | EnumValueDefinitionNode | FloatValueNode | NullValueNode | DirectiveNode | VariableNode | ScalarTypeExtensionNode | IntValueNode | SchemaExtensionNode | DirectiveDefinitionNode | InputObjectTypeExtensionNode | ScalarTypeDefinitionNode | UnionTypeExtensionNode | FragmentDefinitionNode | SelectionSetNode | NamedTypeNode | VariableDefinitionNode | EnumTypeExtensionNode | ObjectValueNode | OperationTypeDefinitionNode | EnumValueNode | ObjectFieldNode | FieldNode | InputObjectTypeDefinitionNode | InputValueDefinitionNode | NonNullTypeNode | InlineFragmentNode | InterfaceTypeDefinitionNode | ListTypeNode | InterfaceTypeExtensionNode | ListValueNode | SchemaDefinitionNode | ObjectTypeExtensionNode | DocumentNode
      ]
    ]
  ): Visitor[
    ASTKindToNode, 
    UnionTypeDefinitionNode | FragmentSpreadNode | OperationDefinitionNode | EnumTypeDefinitionNode | StringValueNode | ArgumentNode | BooleanValueNode | NameNode | FieldDefinitionNode | ObjectTypeDefinitionNode | EnumValueDefinitionNode | FloatValueNode | NullValueNode | DirectiveNode | VariableNode | ScalarTypeExtensionNode | IntValueNode | SchemaExtensionNode | DirectiveDefinitionNode | InputObjectTypeExtensionNode | ScalarTypeDefinitionNode | UnionTypeExtensionNode | FragmentDefinitionNode | SelectionSetNode | NamedTypeNode | VariableDefinitionNode | EnumTypeExtensionNode | ObjectValueNode | OperationTypeDefinitionNode | EnumValueNode | ObjectFieldNode | FieldNode | InputObjectTypeDefinitionNode | InputValueDefinitionNode | NonNullTypeNode | InlineFragmentNode | InterfaceTypeDefinitionNode | ListTypeNode | InterfaceTypeExtensionNode | ListValueNode | SchemaDefinitionNode | ObjectTypeExtensionNode | DocumentNode
  ] = js.native
  def visitWithTypeInfo(
    typeInfo: typings.graphql.utilitiesTypeInfoMod.TypeInfo,
    visitor: Visitor[
      ASTKindToNode, 
      UnionTypeDefinitionNode | FragmentSpreadNode | OperationDefinitionNode | EnumTypeDefinitionNode | StringValueNode | ArgumentNode | BooleanValueNode | NameNode | FieldDefinitionNode | ObjectTypeDefinitionNode | EnumValueDefinitionNode | FloatValueNode | NullValueNode | DirectiveNode | VariableNode | ScalarTypeExtensionNode | IntValueNode | SchemaExtensionNode | DirectiveDefinitionNode | InputObjectTypeExtensionNode | ScalarTypeDefinitionNode | UnionTypeExtensionNode | FragmentDefinitionNode | SelectionSetNode | NamedTypeNode | VariableDefinitionNode | EnumTypeExtensionNode | ObjectValueNode | OperationTypeDefinitionNode | EnumValueNode | ObjectFieldNode | FieldNode | InputObjectTypeDefinitionNode | InputValueDefinitionNode | NonNullTypeNode | InlineFragmentNode | InterfaceTypeDefinitionNode | ListTypeNode | InterfaceTypeExtensionNode | ListValueNode | SchemaDefinitionNode | ObjectTypeExtensionNode | DocumentNode
    ]
  ): Visitor[
    ASTKindToNode, 
    UnionTypeDefinitionNode | FragmentSpreadNode | OperationDefinitionNode | EnumTypeDefinitionNode | StringValueNode | ArgumentNode | BooleanValueNode | NameNode | FieldDefinitionNode | ObjectTypeDefinitionNode | EnumValueDefinitionNode | FloatValueNode | NullValueNode | DirectiveNode | VariableNode | ScalarTypeExtensionNode | IntValueNode | SchemaExtensionNode | DirectiveDefinitionNode | InputObjectTypeExtensionNode | ScalarTypeDefinitionNode | UnionTypeExtensionNode | FragmentDefinitionNode | SelectionSetNode | NamedTypeNode | VariableDefinitionNode | EnumTypeExtensionNode | ObjectValueNode | OperationTypeDefinitionNode | EnumValueNode | ObjectFieldNode | FieldNode | InputObjectTypeDefinitionNode | InputValueDefinitionNode | NonNullTypeNode | InlineFragmentNode | InterfaceTypeDefinitionNode | ListTypeNode | InterfaceTypeExtensionNode | ListValueNode | SchemaDefinitionNode | ObjectTypeExtensionNode | DocumentNode
  ] = js.native
  @js.native
  object TypeKind extends js.Object {
    var ENUM: typings.graphqlDashCompose.graphqlDashComposeStrings.ENUM = js.native
    var INPUT_OBJECT: typings.graphqlDashCompose.graphqlDashComposeStrings.INPUT_OBJECT = js.native
    var INTERFACE: typings.graphqlDashCompose.graphqlDashComposeStrings.INTERFACE = js.native
    var LIST: typings.graphqlDashCompose.graphqlDashComposeStrings.LIST = js.native
    var NON_NULL: typings.graphqlDashCompose.graphqlDashComposeStrings.NON_NULL = js.native
    var OBJECT: typings.graphqlDashCompose.graphqlDashComposeStrings.OBJECT = js.native
    var SCALAR: typings.graphqlDashCompose.graphqlDashComposeStrings.SCALAR = js.native
    var UNION: typings.graphqlDashCompose.graphqlDashComposeStrings.UNION = js.native
  }
  
  @js.native
  object versionInfo extends js.Object {
    var major: Double = js.native
    var minor: Double = js.native
    var patch: Double = js.native
    var preReleaseTag: Double | Null = js.native
  }
  
}

