package typings.graphqlCompose.mod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.anon.Description
import typings.graphql.anon.Directives
import typings.graphql.anon.MaxErrors
import typings.graphql.anon.VisitorKeyMapASTKindToNod
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
import typings.graphql.astMod.TypeNode
import typings.graphql.astMod.UnionTypeDefinitionNode
import typings.graphql.astMod.UnionTypeExtensionNode
import typings.graphql.astMod.ValueNode
import typings.graphql.astMod.VariableDefinitionNode
import typings.graphql.astMod.VariableNode
import typings.graphql.buildASTSchemaMod.BuildSchemaOptions
import typings.graphql.buildClientSchemaMod.Options
import typings.graphql.coerceInputValueMod.OnErrorCB
import typings.graphql.coerceValueMod.CoercedValue
import typings.graphql.definitionMod.GraphQLAbstractType
import typings.graphql.definitionMod.GraphQLArgument
import typings.graphql.definitionMod.GraphQLCompositeType
import typings.graphql.definitionMod.GraphQLEnumTypeConfig
import typings.graphql.definitionMod.GraphQLField
import typings.graphql.definitionMod.GraphQLFieldResolver
import typings.graphql.definitionMod.GraphQLInputField
import typings.graphql.definitionMod.GraphQLInputObjectTypeConfig
import typings.graphql.definitionMod.GraphQLInputType
import typings.graphql.definitionMod.GraphQLInterfaceTypeConfig
import typings.graphql.definitionMod.GraphQLLeafType
import typings.graphql.definitionMod.GraphQLNamedType
import typings.graphql.definitionMod.GraphQLNullableType
import typings.graphql.definitionMod.GraphQLObjectTypeConfig
import typings.graphql.definitionMod.GraphQLOutputType
import typings.graphql.definitionMod.GraphQLScalarTypeConfig
import typings.graphql.definitionMod.GraphQLType
import typings.graphql.definitionMod.GraphQLTypeResolver
import typings.graphql.definitionMod.GraphQLUnionTypeConfig
import typings.graphql.definitionMod.GraphQLWrappingType
import typings.graphql.definitionMod._GraphQLList
import typings.graphql.definitionMod._GraphQLNonNull
import typings.graphql.directivesMod.GraphQLDirectiveConfig
import typings.graphql.executeMod.ExecutionArgs
import typings.graphql.executeMod.ExecutionResult
import typings.graphql.findBreakingChangesMod.BreakingChange
import typings.graphql.findBreakingChangesMod.DangerousChange
import typings.graphql.findBreakingChangesMod._BreakingChangeType
import typings.graphql.findBreakingChangesMod._DangerousChangeType
import typings.graphql.formatErrorMod.GraphQLFormattedError
import typings.graphql.graphqlMod.GraphQLArgs
import typings.graphql.introspectionQueryMod.IntrospectionOptions
import typings.graphql.introspectionQueryMod.IntrospectionQuery_
import typings.graphql.kindsMod._Kind
import typings.graphql.lexerMod.Lexer
import typings.graphql.locationMod.SourceLocation
import typings.graphql.maybeMod.Maybe
import typings.graphql.parserMod.ParseOptions
import typings.graphql.pathMod.Path
import typings.graphql.promiseOrValueMod.PromiseOrValue
import typings.graphql.schemaMod.GraphQLSchemaConfig
import typings.graphql.sourceMod.Location
import typings.graphql.subscribeMod.SubscriptionArgs
import typings.graphql.tokenKindMod._TokenKind
import typings.graphql.typeInfoMod.getFieldDef
import typings.graphql.validationContextMod.ValidationRule
import typings.graphql.visitorMod.VisitFn
import typings.graphql.visitorMod.Visitor
import typings.graphqlCompose.graphqlComposeStrings.`No longer supported`
import typings.std.AsyncIterable
import typings.std.AsyncIterableIterator
import typings.std.Error
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose", "graphql")
@js.native
object graphql extends js.Object {
  @js.native
  class GraphQLDirective protected ()
    extends typings.graphqlCompose.graphqlMod.GraphQLDirective {
    def this(config: GraphQLDirectiveConfig) = this()
  }
  
  @js.native
  class GraphQLEnumType protected ()
    extends typings.graphqlCompose.graphqlMod.GraphQLEnumType {
    def this(config: GraphQLEnumTypeConfig) = this()
  }
  
  @js.native
  class GraphQLError protected ()
    extends typings.graphqlCompose.graphqlMod.GraphQLError {
    def this(
      message: String,
      nodes: js.UndefOr[ASTNode | js.Array[ASTNode]],
      source: js.UndefOr[Maybe[typings.graphql.sourceMod.Source]],
      positions: js.UndefOr[Maybe[js.Array[Double]]],
      path: js.UndefOr[Maybe[js.Array[Double | String]]],
      originalError: js.UndefOr[Maybe[Error]],
      extensions: js.UndefOr[Maybe[StringDictionary[_]]]
    ) = this()
  }
  
  @js.native
  class GraphQLInputObjectType protected ()
    extends typings.graphqlCompose.graphqlMod.GraphQLInputObjectType {
    def this(config: GraphQLInputObjectTypeConfig) = this()
  }
  
  @js.native
  class GraphQLInterfaceType protected ()
    extends typings.graphqlCompose.graphqlMod.GraphQLInterfaceType {
    def this(config: GraphQLInterfaceTypeConfig[_, _, StringDictionary[_]]) = this()
  }
  
  @js.native
  class GraphQLListCls protected ()
    extends typings.graphqlCompose.graphqlMod.GraphQLListCls {
    def this(`type`: GraphQLType) = this()
  }
  
  @js.native
  class GraphQLNonNullCls protected ()
    extends typings.graphqlCompose.graphqlMod.GraphQLNonNullCls {
    def this(`type`: GraphQLNullableType) = this()
  }
  
  @js.native
  class GraphQLObjectType[TSource, TContext, TArgs] protected ()
    extends typings.graphqlCompose.graphqlMod.GraphQLObjectType[TSource, TContext, TArgs] {
    def this(config: GraphQLObjectTypeConfig[TSource, TContext, TArgs]) = this()
  }
  
  @js.native
  class GraphQLScalarType protected ()
    extends typings.graphqlCompose.graphqlMod.GraphQLScalarType {
    def this(config: GraphQLScalarTypeConfig[_, _]) = this()
  }
  
  @js.native
  class GraphQLSchema protected ()
    extends typings.graphqlCompose.graphqlMod.GraphQLSchema {
    def this(config: GraphQLSchemaConfig) = this()
  }
  
  @js.native
  class GraphQLUnionType protected ()
    extends typings.graphqlCompose.graphqlMod.GraphQLUnionType {
    def this(config: GraphQLUnionTypeConfig[_, _]) = this()
  }
  
  @js.native
  class Source protected ()
    extends typings.graphqlCompose.graphqlMod.Source {
    def this(body: String) = this()
    def this(body: String, name: String) = this()
    def this(body: String, name: String, locationOffset: Location) = this()
  }
  
  @js.native
  class TypeInfo protected ()
    extends typings.graphqlCompose.graphqlMod.TypeInfo {
    def this(schema: typings.graphql.schemaMod.GraphQLSchema) = this()
    def this(
      schema: typings.graphql.schemaMod.GraphQLSchema,
      // NOTE: this experimental optional second parameter is only needed in order
    // to support non-spec-compliant codebases. You should never need to use it.
    // It may disappear in the future.
    getFieldDefFn: getFieldDef
    ) = this()
    def this(
      schema: typings.graphql.schemaMod.GraphQLSchema,
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
    extends typings.graphqlCompose.graphqlMod.ValidationContext {
    def this(
      schema: typings.graphql.schemaMod.GraphQLSchema,
      ast: DocumentNode,
      typeInfo: typings.graphql.typeInfoMod.TypeInfo
    ) = this()
    def this(
      schema: typings.graphql.schemaMod.GraphQLSchema,
      ast: DocumentNode,
      typeInfo: typings.graphql.typeInfoMod.TypeInfo,
      onError: js.Function1[/* err */ typings.graphql.graphQLErrorMod.GraphQLError, Unit]
    ) = this()
  }
  
  val BREAK: js.Any = js.native
  val BreakingChangeType: _BreakingChangeType = js.native
  val DEFAULT_DEPRECATION_REASON: `No longer supported` = js.native
  val DangerousChangeType: _DangerousChangeType = js.native
  @JSName("__Directive")
  val Directive: typings.graphql.definitionMod.GraphQLObjectType[js.Any, js.Any, StringDictionary[js.Any]] = js.native
  val DirectiveLocation: typings.graphql.directiveLocationMod._DirectiveLocation = js.native
  @JSName("__EnumValue")
  val EnumValue: typings.graphql.definitionMod.GraphQLObjectType[js.Any, js.Any, StringDictionary[js.Any]] = js.native
  @JSName("__Field")
  val Field: typings.graphql.definitionMod.GraphQLObjectType[js.Any, js.Any, StringDictionary[js.Any]] = js.native
  val GraphQLBoolean: typings.graphql.definitionMod.GraphQLScalarType = js.native
  val GraphQLDeprecatedDirective: typings.graphql.directivesMod.GraphQLDirective = js.native
  val GraphQLFloat: typings.graphql.definitionMod.GraphQLScalarType = js.native
  val GraphQLID: typings.graphql.definitionMod.GraphQLScalarType = js.native
  val GraphQLIncludeDirective: typings.graphql.directivesMod.GraphQLDirective = js.native
  val GraphQLInt: typings.graphql.definitionMod.GraphQLScalarType = js.native
  val GraphQLList: _GraphQLList[GraphQLType] = js.native
  val GraphQLNonNull: _GraphQLNonNull[GraphQLNullableType] = js.native
  val GraphQLSkipDirective: typings.graphql.directivesMod.GraphQLDirective = js.native
  val GraphQLString: typings.graphql.definitionMod.GraphQLScalarType = js.native
  @JSName("__InputValue")
  val InputValue: typings.graphql.definitionMod.GraphQLObjectType[js.Any, js.Any, StringDictionary[js.Any]] = js.native
  val Kind: _Kind = js.native
  @JSName("__Schema")
  val Schema: typings.graphql.definitionMod.GraphQLObjectType[js.Any, js.Any, StringDictionary[js.Any]] = js.native
  val SchemaMetaFieldDef: GraphQLField[js.Any, js.Any, StringDictionary[js.Any]] = js.native
  val TokenKind: _TokenKind = js.native
  @JSName("__Type")
  val Type: typings.graphql.definitionMod.GraphQLObjectType[js.Any, js.Any, StringDictionary[js.Any]] = js.native
  val TypeMetaFieldDef: GraphQLField[js.Any, js.Any, StringDictionary[js.Any]] = js.native
  val TypeNameMetaFieldDef: GraphQLField[js.Any, js.Any, StringDictionary[js.Any]] = js.native
  @JSName("__DirectiveLocation")
  val _DirectiveLocation: typings.graphql.definitionMod.GraphQLEnumType = js.native
  @JSName("__TypeKind")
  val _TypeKind: typings.graphql.definitionMod.GraphQLEnumType = js.native
  val defaultFieldResolver: GraphQLFieldResolver[js.Any, js.Any, StringDictionary[js.Any]] = js.native
  val defaultTypeResolver: GraphQLTypeResolver[js.Any, js.Any, StringDictionary[js.Any]] = js.native
  val introspectionQuery: String = js.native
  val introspectionTypes: js.Array[GraphQLType] = js.native
  val specifiedDirectives: js.Array[typings.graphql.directivesMod.GraphQLDirective] = js.native
  val specifiedRules: js.Array[ValidationRule] = js.native
  val specifiedScalarTypes: js.Array[typings.graphql.definitionMod.GraphQLScalarType] = js.native
  val version: String = js.native
  def assertAbstractType(`type`: js.Any): GraphQLAbstractType = js.native
  def assertCompositeType(`type`: js.Any): GraphQLCompositeType = js.native
  def assertDirective(directive: js.Any): typings.graphql.directivesMod.GraphQLDirective = js.native
  def assertEnumType(`type`: js.Any): typings.graphql.definitionMod.GraphQLEnumType = js.native
  def assertInputObjectType(`type`: js.Any): typings.graphql.definitionMod.GraphQLInputObjectType = js.native
  def assertInputType(`type`: js.Any): GraphQLInputType = js.native
  def assertInterfaceType(`type`: js.Any): typings.graphql.definitionMod.GraphQLInterfaceType = js.native
  def assertLeafType(`type`: js.Any): GraphQLLeafType = js.native
  def assertListType(`type`: js.Any): typings.graphql.definitionMod.GraphQLList[_] = js.native
  def assertNamedType(`type`: js.Any): GraphQLNamedType = js.native
  def assertNonNullType(`type`: js.Any): typings.graphql.definitionMod.GraphQLNonNull[_] = js.native
  def assertNullableType(`type`: js.Any): GraphQLNullableType = js.native
  def assertObjectType(`type`: js.Any): typings.graphql.definitionMod.GraphQLObjectType[_, _, StringDictionary[_]] = js.native
  def assertOutputType(`type`: js.Any): GraphQLOutputType = js.native
  def assertScalarType(`type`: js.Any): typings.graphql.definitionMod.GraphQLScalarType = js.native
  def assertSchema(schema: js.Any): typings.graphql.schemaMod.GraphQLSchema = js.native
  def assertType(`type`: js.Any): GraphQLType = js.native
  def assertUnionType(`type`: js.Any): typings.graphql.definitionMod.GraphQLUnionType = js.native
  def assertValidName(name: String): String = js.native
  def assertValidSchema(schema: typings.graphql.schemaMod.GraphQLSchema): Unit = js.native
  def assertWrappingType(`type`: js.Any): GraphQLWrappingType = js.native
  def astFromValue(value: js.Any, `type`: GraphQLInputType): Maybe[ValueNode] = js.native
  def buildASTSchema(documentAST: DocumentNode): typings.graphql.schemaMod.GraphQLSchema = js.native
  def buildASTSchema(documentAST: DocumentNode, options: BuildSchemaOptions): typings.graphql.schemaMod.GraphQLSchema = js.native
  def buildClientSchema(introspection: IntrospectionQuery_): typings.graphql.schemaMod.GraphQLSchema = js.native
  def buildClientSchema(introspection: IntrospectionQuery_, options: Options): typings.graphql.schemaMod.GraphQLSchema = js.native
  def buildSchema(source: String): typings.graphql.schemaMod.GraphQLSchema = js.native
  def buildSchema(source: String, options: BuildSchemaOptions with ParseOptions): typings.graphql.schemaMod.GraphQLSchema = js.native
  def buildSchema(source: typings.graphql.sourceMod.Source): typings.graphql.schemaMod.GraphQLSchema = js.native
  def buildSchema(source: typings.graphql.sourceMod.Source, options: BuildSchemaOptions with ParseOptions): typings.graphql.schemaMod.GraphQLSchema = js.native
  def coerceInputValue(inputValue: js.Any, `type`: GraphQLInputType): js.Any = js.native
  def coerceInputValue(inputValue: js.Any, `type`: GraphQLInputType, onError: OnErrorCB): js.Any = js.native
  def coerceValue(inputValue: js.Any, `type`: GraphQLInputType): CoercedValue = js.native
  def coerceValue(inputValue: js.Any, `type`: GraphQLInputType, blameNode: ASTNode): CoercedValue = js.native
  def coerceValue(inputValue: js.Any, `type`: GraphQLInputType, blameNode: ASTNode, path: Path): CoercedValue = js.native
  def concatAST(asts: js.Array[DocumentNode]): DocumentNode = js.native
  def createLexer[TOptions](source: typings.graphql.sourceMod.Source, options: TOptions): Lexer[TOptions] = js.native
  def createSourceEventStream[TData](schema: typings.graphql.schemaMod.GraphQLSchema, document: DocumentNode): js.Promise[AsyncIterable[_] | ExecutionResult[TData]] = js.native
  def createSourceEventStream[TData](schema: typings.graphql.schemaMod.GraphQLSchema, document: DocumentNode, rootValue: js.Any): js.Promise[AsyncIterable[_] | ExecutionResult[TData]] = js.native
  def createSourceEventStream[TData](
    schema: typings.graphql.schemaMod.GraphQLSchema,
    document: DocumentNode,
    rootValue: js.Any,
    contextValue: js.Any
  ): js.Promise[AsyncIterable[_] | ExecutionResult[TData]] = js.native
  def createSourceEventStream[TData](
    schema: typings.graphql.schemaMod.GraphQLSchema,
    document: DocumentNode,
    rootValue: js.Any,
    contextValue: js.Any,
    variableValues: StringDictionary[js.Any]
  ): js.Promise[AsyncIterable[_] | ExecutionResult[TData]] = js.native
  def createSourceEventStream[TData](
    schema: typings.graphql.schemaMod.GraphQLSchema,
    document: DocumentNode,
    rootValue: js.Any,
    contextValue: js.Any,
    variableValues: StringDictionary[js.Any],
    operationName: Maybe[String]
  ): js.Promise[AsyncIterable[_] | ExecutionResult[TData]] = js.native
  def createSourceEventStream[TData](
    schema: typings.graphql.schemaMod.GraphQLSchema,
    document: DocumentNode,
    rootValue: js.Any,
    contextValue: js.Any,
    variableValues: StringDictionary[js.Any],
    operationName: Maybe[String],
    fieldResolver: Maybe[GraphQLFieldResolver[_, _, StringDictionary[_]]]
  ): js.Promise[AsyncIterable[_] | ExecutionResult[TData]] = js.native
  def doTypesOverlap(
    schema: typings.graphql.schemaMod.GraphQLSchema,
    typeA: GraphQLCompositeType,
    typeB: GraphQLCompositeType
  ): Boolean = js.native
  def execute[TData](args: ExecutionArgs): PromiseOrValue[ExecutionResult[TData]] = js.native
  def execute[TData](
    schema: typings.graphql.schemaMod.GraphQLSchema,
    document: DocumentNode,
    rootValue: js.UndefOr[js.Any],
    contextValue: js.UndefOr[js.Any],
    variableValues: js.UndefOr[Maybe[StringDictionary[_]]],
    operationName: js.UndefOr[Maybe[String]],
    fieldResolver: js.UndefOr[Maybe[GraphQLFieldResolver[_, _, StringDictionary[_]]]],
    typeResolver: js.UndefOr[Maybe[GraphQLTypeResolver[_, _, StringDictionary[_]]]]
  ): PromiseOrValue[ExecutionResult[TData]] = js.native
  def extendSchema(schema: typings.graphql.schemaMod.GraphQLSchema, documentAST: DocumentNode): typings.graphql.schemaMod.GraphQLSchema = js.native
  def extendSchema(
    schema: typings.graphql.schemaMod.GraphQLSchema,
    documentAST: DocumentNode,
    options: typings.graphql.extendSchemaMod.Options
  ): typings.graphql.schemaMod.GraphQLSchema = js.native
  def findBreakingChanges(
    oldSchema: typings.graphql.schemaMod.GraphQLSchema,
    newSchema: typings.graphql.schemaMod.GraphQLSchema
  ): js.Array[BreakingChange] = js.native
  def findDangerousChanges(
    oldSchema: typings.graphql.schemaMod.GraphQLSchema,
    newSchema: typings.graphql.schemaMod.GraphQLSchema
  ): js.Array[DangerousChange] = js.native
  def findDeprecatedUsages(schema: typings.graphql.schemaMod.GraphQLSchema, ast: DocumentNode): js.Array[typings.graphql.graphQLErrorMod.GraphQLError] = js.native
  def formatError(error: typings.graphql.graphQLErrorMod.GraphQLError): GraphQLFormattedError[Record[String, _]] = js.native
  def getDescription(node: Description, options: Maybe[BuildSchemaOptions]): js.UndefOr[String] = js.native
  def getDirectiveValues(directiveDef: typings.graphql.directivesMod.GraphQLDirective, node: Directives): js.UndefOr[StringDictionary[js.Any]] = js.native
  def getDirectiveValues(
    directiveDef: typings.graphql.directivesMod.GraphQLDirective,
    node: Directives,
    variableValues: Maybe[StringDictionary[_]]
  ): js.UndefOr[StringDictionary[js.Any]] = js.native
  def getIntrospectionQuery(): String = js.native
  def getIntrospectionQuery(options: IntrospectionOptions): String = js.native
  def getLocation(source: typings.graphql.sourceMod.Source, position: Double): SourceLocation = js.native
  def getNamedType(`type`: Unit): js.UndefOr[scala.Nothing] = js.native
  def getNamedType(`type`: GraphQLType): GraphQLNamedType = js.native
  def getNullableType(`type`: Unit): js.UndefOr[scala.Nothing] = js.native
  def getNullableType(`type`: typings.graphql.definitionMod.GraphQLEnumType): typings.graphql.definitionMod.GraphQLEnumType = js.native
  def getNullableType(`type`: typings.graphql.definitionMod.GraphQLInputObjectType): typings.graphql.definitionMod.GraphQLInputObjectType = js.native
  def getNullableType(`type`: typings.graphql.definitionMod.GraphQLInterfaceType): typings.graphql.definitionMod.GraphQLInterfaceType = js.native
  def getNullableType(`type`: typings.graphql.definitionMod.GraphQLScalarType): typings.graphql.definitionMod.GraphQLScalarType = js.native
  def getNullableType(`type`: typings.graphql.definitionMod.GraphQLUnionType): typings.graphql.definitionMod.GraphQLUnionType = js.native
  def getNullableType[T /* <: (typings.graphql.definitionMod.GraphQLObjectType[_, _, StringDictionary[_]]) | typings.graphql.definitionMod.GraphQLList[_] */](`type`: T): T = js.native
  def getNullableType[T /* <: GraphQLNullableType */](`type`: typings.graphql.definitionMod.GraphQLNonNull[T]): T = js.native
  def getOperationAST(documentAST: DocumentNode, operationName: Maybe[String]): Maybe[OperationDefinitionNode] = js.native
  def getOperationRootType(schema: typings.graphql.schemaMod.GraphQLSchema, operation: OperationDefinitionNode): typings.graphql.definitionMod.GraphQLObjectType[_, _, StringDictionary[_]] = js.native
  def getOperationRootType(schema: typings.graphql.schemaMod.GraphQLSchema, operation: OperationTypeDefinitionNode): typings.graphql.definitionMod.GraphQLObjectType[_, _, StringDictionary[_]] = js.native
  def getVisitFn(
    visitor: Visitor[
      _, 
      /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any] */ js.Any
    ],
    kind: String,
    isLeaving: Boolean
  ): Maybe[VisitFn[_, _]] = js.native
  def graphql[TData](args: GraphQLArgs): js.Promise[ExecutionResult[TData]] = js.native
  def graphql[TData](
    schema: typings.graphql.schemaMod.GraphQLSchema,
    source: String,
    rootValue: js.UndefOr[js.Any],
    contextValue: js.UndefOr[js.Any],
    variableValues: js.UndefOr[Maybe[StringDictionary[_]]],
    operationName: js.UndefOr[Maybe[String]],
    fieldResolver: js.UndefOr[Maybe[GraphQLFieldResolver[_, _, StringDictionary[_]]]],
    typeResolver: js.UndefOr[Maybe[GraphQLTypeResolver[_, _, StringDictionary[_]]]]
  ): js.Promise[ExecutionResult[TData]] = js.native
  def graphql[TData](
    schema: typings.graphql.schemaMod.GraphQLSchema,
    source: typings.graphql.sourceMod.Source,
    rootValue: js.UndefOr[js.Any],
    contextValue: js.UndefOr[js.Any],
    variableValues: js.UndefOr[Maybe[StringDictionary[_]]],
    operationName: js.UndefOr[Maybe[String]],
    fieldResolver: js.UndefOr[Maybe[GraphQLFieldResolver[_, _, StringDictionary[_]]]],
    typeResolver: js.UndefOr[Maybe[GraphQLTypeResolver[_, _, StringDictionary[_]]]]
  ): js.Promise[ExecutionResult[TData]] = js.native
  def graphqlSync[TData](args: GraphQLArgs): ExecutionResult[TData] = js.native
  def graphqlSync[TData](
    schema: typings.graphql.schemaMod.GraphQLSchema,
    source: String,
    rootValue: js.UndefOr[js.Any],
    contextValue: js.UndefOr[js.Any],
    variableValues: js.UndefOr[Maybe[StringDictionary[_]]],
    operationName: js.UndefOr[Maybe[String]],
    fieldResolver: js.UndefOr[Maybe[GraphQLFieldResolver[_, _, StringDictionary[_]]]],
    typeResolver: js.UndefOr[Maybe[GraphQLTypeResolver[_, _, StringDictionary[_]]]]
  ): ExecutionResult[TData] = js.native
  def graphqlSync[TData](
    schema: typings.graphql.schemaMod.GraphQLSchema,
    source: typings.graphql.sourceMod.Source,
    rootValue: js.UndefOr[js.Any],
    contextValue: js.UndefOr[js.Any],
    variableValues: js.UndefOr[Maybe[StringDictionary[_]]],
    operationName: js.UndefOr[Maybe[String]],
    fieldResolver: js.UndefOr[Maybe[GraphQLFieldResolver[_, _, StringDictionary[_]]]],
    typeResolver: js.UndefOr[Maybe[GraphQLTypeResolver[_, _, StringDictionary[_]]]]
  ): ExecutionResult[TData] = js.native
  def introspectionFromSchema(schema: typings.graphql.schemaMod.GraphQLSchema): IntrospectionQuery_ = js.native
  def introspectionFromSchema(schema: typings.graphql.schemaMod.GraphQLSchema, options: IntrospectionOptions): IntrospectionQuery_ = js.native
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
  def isTypeSubTypeOf(schema: typings.graphql.schemaMod.GraphQLSchema, maybeSubType: GraphQLType, superType: GraphQLType): Boolean = js.native
  def isTypeSystemDefinitionNode(node: ASTNode): /* is graphql.graphql/language/ast.TypeSystemDefinitionNode */ Boolean = js.native
  def isTypeSystemExtensionNode(node: ASTNode): /* is graphql.graphql/language/ast.TypeSystemExtensionNode */ Boolean = js.native
  def isUnionType(`type`: js.Any): /* is graphql.graphql/type/definition.GraphQLUnionType */ Boolean = js.native
  def isValidJSValue(value: js.Any, `type`: GraphQLInputType): js.Array[String] = js.native
  def isValidLiteralValue(`type`: GraphQLInputType, valueNode: ValueNode): js.Array[typings.graphql.graphQLErrorMod.GraphQLError] = js.native
  def isValidNameError(name: String): js.UndefOr[typings.graphql.graphQLErrorMod.GraphQLError] = js.native
  def isValidNameError(name: String, node: ASTNode): js.UndefOr[typings.graphql.graphQLErrorMod.GraphQLError] = js.native
  def isValueNode(node: ASTNode): /* is graphql.graphql/language/ast.ValueNode */ Boolean = js.native
  def isWrappingType(`type`: js.Any): /* is graphql.graphql/type/definition.GraphQLWrappingType */ Boolean = js.native
  def lexicographicSortSchema(schema: typings.graphql.schemaMod.GraphQLSchema): typings.graphql.schemaMod.GraphQLSchema = js.native
  def locatedError(
    originalError: typings.graphql.graphQLErrorMod.GraphQLError,
    nodes: js.Array[ASTNode],
    path: js.Array[String | Double]
  ): typings.graphql.graphQLErrorMod.GraphQLError = js.native
  def locatedError(originalError: Error, nodes: js.Array[ASTNode], path: js.Array[String | Double]): typings.graphql.graphQLErrorMod.GraphQLError = js.native
  def parse(source: String): DocumentNode = js.native
  def parse(source: String, options: ParseOptions): DocumentNode = js.native
  def parse(source: typings.graphql.sourceMod.Source): DocumentNode = js.native
  def parse(source: typings.graphql.sourceMod.Source, options: ParseOptions): DocumentNode = js.native
  def parseType(source: String): TypeNode = js.native
  def parseType(source: String, options: ParseOptions): TypeNode = js.native
  def parseType(source: typings.graphql.sourceMod.Source): TypeNode = js.native
  def parseType(source: typings.graphql.sourceMod.Source, options: ParseOptions): TypeNode = js.native
  def parseValue(source: String): ValueNode = js.native
  def parseValue(source: String, options: ParseOptions): ValueNode = js.native
  def parseValue(source: typings.graphql.sourceMod.Source): ValueNode = js.native
  def parseValue(source: typings.graphql.sourceMod.Source, options: ParseOptions): ValueNode = js.native
  def print(ast: ASTNode): String = js.native
  def printError(error: typings.graphql.graphQLErrorMod.GraphQLError): String = js.native
  def printIntrospectionSchema(schema: typings.graphql.schemaMod.GraphQLSchema): String = js.native
  def printIntrospectionSchema(schema: typings.graphql.schemaMod.GraphQLSchema, options: typings.graphql.schemaPrinterMod.Options): String = js.native
  def printLocation(location: typings.graphql.astMod.Location): String = js.native
  def printSchema(schema: typings.graphql.schemaMod.GraphQLSchema): String = js.native
  def printSchema(schema: typings.graphql.schemaMod.GraphQLSchema, options: typings.graphql.schemaPrinterMod.Options): String = js.native
  def printSourceLocation(source: typings.graphql.sourceMod.Source, sourceLocation: SourceLocation): String = js.native
  def printType(`type`: GraphQLNamedType): String = js.native
  def printType(`type`: GraphQLNamedType, options: typings.graphql.schemaPrinterMod.Options): String = js.native
  def separateOperations(documentAST: DocumentNode): StringDictionary[DocumentNode] = js.native
  def stripIgnoredCharacters(source: String): String = js.native
  def stripIgnoredCharacters(source: typings.graphql.sourceMod.Source): String = js.native
  def subscribe[TData](args: SubscriptionArgs): js.Promise[AsyncIterableIterator[ExecutionResult[TData]] | ExecutionResult[TData]] = js.native
  def subscribe[TData](
    schema: typings.graphql.schemaMod.GraphQLSchema,
    document: DocumentNode,
    rootValue: js.UndefOr[js.Any],
    contextValue: js.UndefOr[js.Any],
    variableValues: js.UndefOr[Maybe[StringDictionary[_]]],
    operationName: js.UndefOr[Maybe[String]],
    fieldResolver: js.UndefOr[Maybe[GraphQLFieldResolver[_, _, StringDictionary[_]]]],
    subscribeFieldResolver: js.UndefOr[Maybe[GraphQLFieldResolver[_, _, StringDictionary[_]]]]
  ): js.Promise[AsyncIterableIterator[ExecutionResult[TData]] | ExecutionResult[TData]] = js.native
  def syntaxError(source: typings.graphql.sourceMod.Source, position: Double, description: String): typings.graphql.graphQLErrorMod.GraphQLError = js.native
  def typeFromAST(schema: typings.graphql.schemaMod.GraphQLSchema, typeNode: ListTypeNode): js.UndefOr[typings.graphql.definitionMod.GraphQLList[_]] = js.native
  def typeFromAST(schema: typings.graphql.schemaMod.GraphQLSchema, typeNode: NamedTypeNode): js.UndefOr[GraphQLNamedType] = js.native
  def typeFromAST(schema: typings.graphql.schemaMod.GraphQLSchema, typeNode: NonNullTypeNode): js.UndefOr[typings.graphql.definitionMod.GraphQLNonNull[_]] = js.native
  def validate(schema: typings.graphql.schemaMod.GraphQLSchema, documentAST: DocumentNode): js.Array[typings.graphql.graphQLErrorMod.GraphQLError] = js.native
  def validate(
    schema: typings.graphql.schemaMod.GraphQLSchema,
    documentAST: DocumentNode,
    rules: js.Array[ValidationRule]
  ): js.Array[typings.graphql.graphQLErrorMod.GraphQLError] = js.native
  def validate(
    schema: typings.graphql.schemaMod.GraphQLSchema,
    documentAST: DocumentNode,
    rules: js.Array[ValidationRule],
    typeInfo: typings.graphql.typeInfoMod.TypeInfo
  ): js.Array[typings.graphql.graphQLErrorMod.GraphQLError] = js.native
  def validate(
    schema: typings.graphql.schemaMod.GraphQLSchema,
    documentAST: DocumentNode,
    rules: js.Array[ValidationRule],
    typeInfo: typings.graphql.typeInfoMod.TypeInfo,
    options: MaxErrors
  ): js.Array[typings.graphql.graphQLErrorMod.GraphQLError] = js.native
  def validateSchema(schema: typings.graphql.schemaMod.GraphQLSchema): js.Array[typings.graphql.graphQLErrorMod.GraphQLError] = js.native
  def valueFromAST(valueNode: Maybe[ValueNode], `type`: GraphQLInputType): js.Any = js.native
  def valueFromAST(valueNode: Maybe[ValueNode], `type`: GraphQLInputType, variables: Maybe[StringDictionary[_]]): js.Any = js.native
  def valueFromASTUntyped(valueNode: ValueNode): js.Any = js.native
  def valueFromASTUntyped(valueNode: ValueNode, variables: Maybe[StringDictionary[_]]): js.Any = js.native
  def visit(
    root: ASTNode,
    visitor: Visitor[
      ASTKindToNode, 
      EnumValueDefinitionNode | ObjectValueNode | FieldDefinitionNode | SchemaDefinitionNode | InputObjectTypeDefinitionNode | DocumentNode | DirectiveDefinitionNode | InputValueDefinitionNode | ListValueNode | ScalarTypeDefinitionNode | IntValueNode | OperationDefinitionNode | ArgumentNode | FragmentDefinitionNode | OperationTypeDefinitionNode | FieldNode | StringValueNode | NameNode | ObjectFieldNode | EnumValueNode | SchemaExtensionNode | UnionTypeExtensionNode | VariableDefinitionNode | VariableNode | ObjectTypeDefinitionNode | EnumTypeExtensionNode | InterfaceTypeDefinitionNode | FloatValueNode | NonNullTypeNode | DirectiveNode | SelectionSetNode | InputObjectTypeExtensionNode | ScalarTypeExtensionNode | UnionTypeDefinitionNode | NullValueNode | InterfaceTypeExtensionNode | InlineFragmentNode | EnumTypeDefinitionNode | NamedTypeNode | BooleanValueNode | ListTypeNode | ObjectTypeExtensionNode | FragmentSpreadNode
    ]
  ): js.Any = js.native
  def visit(
    root: ASTNode,
    visitor: Visitor[
      ASTKindToNode, 
      EnumValueDefinitionNode | ObjectValueNode | FieldDefinitionNode | SchemaDefinitionNode | InputObjectTypeDefinitionNode | DocumentNode | DirectiveDefinitionNode | InputValueDefinitionNode | ListValueNode | ScalarTypeDefinitionNode | IntValueNode | OperationDefinitionNode | ArgumentNode | FragmentDefinitionNode | OperationTypeDefinitionNode | FieldNode | StringValueNode | NameNode | ObjectFieldNode | EnumValueNode | SchemaExtensionNode | UnionTypeExtensionNode | VariableDefinitionNode | VariableNode | ObjectTypeDefinitionNode | EnumTypeExtensionNode | InterfaceTypeDefinitionNode | FloatValueNode | NonNullTypeNode | DirectiveNode | SelectionSetNode | InputObjectTypeExtensionNode | ScalarTypeExtensionNode | UnionTypeDefinitionNode | NullValueNode | InterfaceTypeExtensionNode | InlineFragmentNode | EnumTypeDefinitionNode | NamedTypeNode | BooleanValueNode | ListTypeNode | ObjectTypeExtensionNode | FragmentSpreadNode
    ],
     // default: QueryDocumentKeys
  visitorKeys: VisitorKeyMapASTKindToNod
  ): js.Any = js.native
  def visitInParallel(
    visitors: js.Array[
      Visitor[
        ASTKindToNode, 
        EnumValueDefinitionNode | ObjectValueNode | FieldDefinitionNode | SchemaDefinitionNode | InputObjectTypeDefinitionNode | DocumentNode | DirectiveDefinitionNode | InputValueDefinitionNode | ListValueNode | ScalarTypeDefinitionNode | IntValueNode | OperationDefinitionNode | ArgumentNode | FragmentDefinitionNode | OperationTypeDefinitionNode | FieldNode | StringValueNode | NameNode | ObjectFieldNode | EnumValueNode | SchemaExtensionNode | UnionTypeExtensionNode | VariableDefinitionNode | VariableNode | ObjectTypeDefinitionNode | EnumTypeExtensionNode | InterfaceTypeDefinitionNode | FloatValueNode | NonNullTypeNode | DirectiveNode | SelectionSetNode | InputObjectTypeExtensionNode | ScalarTypeExtensionNode | UnionTypeDefinitionNode | NullValueNode | InterfaceTypeExtensionNode | InlineFragmentNode | EnumTypeDefinitionNode | NamedTypeNode | BooleanValueNode | ListTypeNode | ObjectTypeExtensionNode | FragmentSpreadNode
      ]
    ]
  ): Visitor[
    ASTKindToNode, 
    EnumValueDefinitionNode | ObjectValueNode | FieldDefinitionNode | SchemaDefinitionNode | InputObjectTypeDefinitionNode | DocumentNode | DirectiveDefinitionNode | InputValueDefinitionNode | ListValueNode | ScalarTypeDefinitionNode | IntValueNode | OperationDefinitionNode | ArgumentNode | FragmentDefinitionNode | OperationTypeDefinitionNode | FieldNode | StringValueNode | NameNode | ObjectFieldNode | EnumValueNode | SchemaExtensionNode | UnionTypeExtensionNode | VariableDefinitionNode | VariableNode | ObjectTypeDefinitionNode | EnumTypeExtensionNode | InterfaceTypeDefinitionNode | FloatValueNode | NonNullTypeNode | DirectiveNode | SelectionSetNode | InputObjectTypeExtensionNode | ScalarTypeExtensionNode | UnionTypeDefinitionNode | NullValueNode | InterfaceTypeExtensionNode | InlineFragmentNode | EnumTypeDefinitionNode | NamedTypeNode | BooleanValueNode | ListTypeNode | ObjectTypeExtensionNode | FragmentSpreadNode
  ] = js.native
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
  object TypeKind extends js.Object {
    var ENUM: typings.graphqlCompose.graphqlComposeStrings.ENUM = js.native
    var INPUT_OBJECT: typings.graphqlCompose.graphqlComposeStrings.INPUT_OBJECT = js.native
    var INTERFACE: typings.graphqlCompose.graphqlComposeStrings.INTERFACE = js.native
    var LIST: typings.graphqlCompose.graphqlComposeStrings.LIST = js.native
    var NON_NULL: typings.graphqlCompose.graphqlComposeStrings.NON_NULL = js.native
    var OBJECT: typings.graphqlCompose.graphqlComposeStrings.OBJECT = js.native
    var SCALAR: typings.graphqlCompose.graphqlComposeStrings.SCALAR = js.native
    var UNION: typings.graphqlCompose.graphqlComposeStrings.UNION = js.native
  }
  
  @js.native
  object versionInfo extends js.Object {
    var major: Double = js.native
    var minor: Double = js.native
    var patch: Double = js.native
    var preReleaseTag: Double | Null = js.native
  }
  
}

