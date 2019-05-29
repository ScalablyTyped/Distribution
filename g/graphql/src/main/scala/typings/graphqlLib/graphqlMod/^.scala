package typings
package graphqlLib.graphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val BREAK: js.Any = js.native
  val BreakingChangeType: graphqlLib.utilitiesFindBreakingChangesMod._BreakingChangeType = js.native
  val DEFAULT_DEPRECATION_REASON: graphqlLib.graphqlLibStrings.`No longer supported` = js.native
  val DangerousChangeType: graphqlLib.utilitiesFindBreakingChangesMod._DangerousChangeType = js.native
  val DirectiveLocation: graphqlLib.languageDirectiveLocationMod._DirectiveLocation = js.native
  val GraphQLBoolean: graphqlLib.typeDefinitionMod.GraphQLScalarType = js.native
  val GraphQLDeprecatedDirective: graphqlLib.typeDirectivesMod.GraphQLDirective = js.native
  val GraphQLFloat: graphqlLib.typeDefinitionMod.GraphQLScalarType = js.native
  val GraphQLID: graphqlLib.typeDefinitionMod.GraphQLScalarType = js.native
  val GraphQLIncludeDirective: graphqlLib.typeDirectivesMod.GraphQLDirective = js.native
  val GraphQLInt: graphqlLib.typeDefinitionMod.GraphQLScalarType = js.native
  val GraphQLList: graphqlLib.typeDefinitionMod._GraphQLList[graphqlLib.typeDefinitionMod.GraphQLType] = js.native
  val GraphQLNonNull: graphqlLib.typeDefinitionMod._GraphQLNonNull[graphqlLib.typeDefinitionMod.GraphQLNullableType] = js.native
  val GraphQLSkipDirective: graphqlLib.typeDirectivesMod.GraphQLDirective = js.native
  val GraphQLString: graphqlLib.typeDefinitionMod.GraphQLScalarType = js.native
  val Kind: graphqlLib.languageKindsMod._Kind = js.native
  val SchemaMetaFieldDef: graphqlLib.typeDefinitionMod.GraphQLField[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]] = js.native
  val TokenKind: graphqlLib.languageLexerMod._TokenKind = js.native
  val TypeMetaFieldDef: graphqlLib.typeDefinitionMod.GraphQLField[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]] = js.native
  val TypeNameMetaFieldDef: graphqlLib.typeDefinitionMod.GraphQLField[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]] = js.native
  val __Directive: graphqlLib.typeDefinitionMod.GraphQLObjectType[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]] = js.native
  val __DirectiveLocation: graphqlLib.typeDefinitionMod.GraphQLEnumType = js.native
  val __EnumValue: graphqlLib.typeDefinitionMod.GraphQLObjectType[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]] = js.native
  val __Field: graphqlLib.typeDefinitionMod.GraphQLObjectType[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]] = js.native
  val __InputValue: graphqlLib.typeDefinitionMod.GraphQLObjectType[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]] = js.native
  val __Schema: graphqlLib.typeDefinitionMod.GraphQLObjectType[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]] = js.native
  val __Type: graphqlLib.typeDefinitionMod.GraphQLObjectType[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]] = js.native
  val __TypeKind: graphqlLib.typeDefinitionMod.GraphQLEnumType = js.native
  val defaultFieldResolver: graphqlLib.typeDefinitionMod.GraphQLFieldResolver[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]] = js.native
  val introspectionQuery: java.lang.String = js.native
  val introspectionTypes: js.Array[js.Any] = js.native
  val specifiedDirectives: js.Array[graphqlLib.typeDirectivesMod.GraphQLDirective] = js.native
  val specifiedRules: js.Array[graphqlLib.validationValidationContextMod.ValidationRule] = js.native
  val specifiedScalarTypes: js.Array[graphqlLib.typeDefinitionMod.GraphQLScalarType] = js.native
  def assertAbstractType(`type`: js.Any): graphqlLib.typeDefinitionMod.GraphQLAbstractType = js.native
  def assertCompositeType(`type`: js.Any): graphqlLib.typeDefinitionMod.GraphQLCompositeType = js.native
  def assertEnumType(`type`: js.Any): graphqlLib.typeDefinitionMod.GraphQLEnumType = js.native
  def assertInputObjectType(`type`: js.Any): graphqlLib.typeDefinitionMod.GraphQLInputObjectType = js.native
  def assertInputType(`type`: js.Any): graphqlLib.typeDefinitionMod.GraphQLInputType = js.native
  def assertInterfaceType(`type`: js.Any): graphqlLib.typeDefinitionMod.GraphQLInterfaceType = js.native
  def assertLeafType(`type`: js.Any): graphqlLib.typeDefinitionMod.GraphQLLeafType = js.native
  def assertListType(`type`: js.Any): graphqlLib.typeDefinitionMod.GraphQLList[_] = js.native
  def assertNamedType(`type`: js.Any): graphqlLib.typeDefinitionMod.GraphQLNamedType = js.native
  def assertNonNullType(`type`: js.Any): graphqlLib.typeDefinitionMod.GraphQLNonNull[_] = js.native
  def assertNullableType(`type`: js.Any): graphqlLib.typeDefinitionMod.GraphQLNullableType = js.native
  def assertObjectType(`type`: js.Any): graphqlLib.typeDefinitionMod.GraphQLObjectType[_, _, org.scalablytyped.runtime.StringDictionary[_]] = js.native
  def assertOutputType(`type`: js.Any): graphqlLib.typeDefinitionMod.GraphQLOutputType = js.native
  def assertScalarType(`type`: js.Any): graphqlLib.typeDefinitionMod.GraphQLScalarType = js.native
  def assertType(`type`: js.Any): graphqlLib.typeDefinitionMod.GraphQLType = js.native
  def assertUnionType(`type`: js.Any): graphqlLib.typeDefinitionMod.GraphQLUnionType = js.native
  def assertValidName(name: java.lang.String): java.lang.String = js.native
  def assertValidSchema(schema: graphqlLib.typeSchemaMod.GraphQLSchema): scala.Unit = js.native
  def assertWrappingType(`type`: js.Any): graphqlLib.typeDefinitionMod.GraphQLWrappingType = js.native
  def astFromValue(value: js.Any, `type`: graphqlLib.typeDefinitionMod.GraphQLInputType): graphqlLib.tsutilsMaybeMod.Maybe[graphqlLib.languageAstMod.ValueNode] = js.native
  def buildASTSchema(documentAST: graphqlLib.languageAstMod.DocumentNode): graphqlLib.typeSchemaMod.GraphQLSchema = js.native
  def buildASTSchema(
    documentAST: graphqlLib.languageAstMod.DocumentNode,
    options: graphqlLib.utilitiesBuildASTSchemaMod.BuildSchemaOptions
  ): graphqlLib.typeSchemaMod.GraphQLSchema = js.native
  def buildClientSchema(introspection: graphqlLib.utilitiesIntrospectionQueryMod.IntrospectionQuery): graphqlLib.typeSchemaMod.GraphQLSchema = js.native
  def buildClientSchema(
    introspection: graphqlLib.utilitiesIntrospectionQueryMod.IntrospectionQuery,
    options: graphqlLib.utilitiesBuildClientSchemaMod.Options
  ): graphqlLib.typeSchemaMod.GraphQLSchema = js.native
  def buildSchema(source: graphqlLib.languageSourceMod.Source): graphqlLib.typeSchemaMod.GraphQLSchema = js.native
  def buildSchema(
    source: graphqlLib.languageSourceMod.Source,
    options: graphqlLib.utilitiesBuildASTSchemaMod.BuildSchemaOptions with graphqlLib.languageParserMod.ParseOptions
  ): graphqlLib.typeSchemaMod.GraphQLSchema = js.native
  def buildSchema(source: java.lang.String): graphqlLib.typeSchemaMod.GraphQLSchema = js.native
  def buildSchema(
    source: java.lang.String,
    options: graphqlLib.utilitiesBuildASTSchemaMod.BuildSchemaOptions with graphqlLib.languageParserMod.ParseOptions
  ): graphqlLib.typeSchemaMod.GraphQLSchema = js.native
  def coerceValue(value: js.Any, `type`: graphqlLib.typeDefinitionMod.GraphQLInputType): graphqlLib.utilitiesCoerceValueMod.CoercedValue = js.native
  def coerceValue(
    value: js.Any,
    `type`: graphqlLib.typeDefinitionMod.GraphQLInputType,
    blameNode: graphqlLib.languageAstMod.ASTNode
  ): graphqlLib.utilitiesCoerceValueMod.CoercedValue = js.native
  def coerceValue(
    value: js.Any,
    `type`: graphqlLib.typeDefinitionMod.GraphQLInputType,
    blameNode: graphqlLib.languageAstMod.ASTNode,
    path: graphqlLib.utilitiesCoerceValueMod.Path
  ): graphqlLib.utilitiesCoerceValueMod.CoercedValue = js.native
  def concatAST(asts: js.Array[graphqlLib.languageAstMod.DocumentNode]): graphqlLib.languageAstMod.DocumentNode = js.native
  def createSourceEventStream[TData](schema: graphqlLib.typeSchemaMod.GraphQLSchema, document: graphqlLib.languageAstMod.DocumentNode): js.Promise[stdLib.AsyncIterable[_] | graphqlLib.executionExecuteMod.ExecutionResult[TData]] = js.native
  def createSourceEventStream[TData](
    schema: graphqlLib.typeSchemaMod.GraphQLSchema,
    document: graphqlLib.languageAstMod.DocumentNode,
    rootValue: js.Any
  ): js.Promise[stdLib.AsyncIterable[_] | graphqlLib.executionExecuteMod.ExecutionResult[TData]] = js.native
  def createSourceEventStream[TData](
    schema: graphqlLib.typeSchemaMod.GraphQLSchema,
    document: graphqlLib.languageAstMod.DocumentNode,
    rootValue: js.Any,
    contextValue: js.Any
  ): js.Promise[stdLib.AsyncIterable[_] | graphqlLib.executionExecuteMod.ExecutionResult[TData]] = js.native
  def createSourceEventStream[TData](
    schema: graphqlLib.typeSchemaMod.GraphQLSchema,
    document: graphqlLib.languageAstMod.DocumentNode,
    rootValue: js.Any,
    contextValue: js.Any,
    variableValues: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): js.Promise[stdLib.AsyncIterable[_] | graphqlLib.executionExecuteMod.ExecutionResult[TData]] = js.native
  def createSourceEventStream[TData](
    schema: graphqlLib.typeSchemaMod.GraphQLSchema,
    document: graphqlLib.languageAstMod.DocumentNode,
    rootValue: js.Any,
    contextValue: js.Any,
    variableValues: org.scalablytyped.runtime.StringDictionary[js.Any],
    operationName: graphqlLib.tsutilsMaybeMod.Maybe[java.lang.String]
  ): js.Promise[stdLib.AsyncIterable[_] | graphqlLib.executionExecuteMod.ExecutionResult[TData]] = js.native
  def createSourceEventStream[TData](
    schema: graphqlLib.typeSchemaMod.GraphQLSchema,
    document: graphqlLib.languageAstMod.DocumentNode,
    rootValue: js.Any,
    contextValue: js.Any,
    variableValues: org.scalablytyped.runtime.StringDictionary[js.Any],
    operationName: graphqlLib.tsutilsMaybeMod.Maybe[java.lang.String],
    fieldResolver: graphqlLib.tsutilsMaybeMod.Maybe[
      graphqlLib.typeDefinitionMod.GraphQLFieldResolver[_, _, org.scalablytyped.runtime.StringDictionary[_]]
    ]
  ): js.Promise[stdLib.AsyncIterable[_] | graphqlLib.executionExecuteMod.ExecutionResult[TData]] = js.native
  def doTypesOverlap(
    schema: graphqlLib.typeSchemaMod.GraphQLSchema,
    typeA: graphqlLib.typeDefinitionMod.GraphQLCompositeType,
    typeB: graphqlLib.typeDefinitionMod.GraphQLCompositeType
  ): scala.Boolean = js.native
  def execute[TData](args: graphqlLib.executionExecuteMod.ExecutionArgs): graphqlLib.jsutilsPromiseOrValueMod.PromiseOrValue[graphqlLib.executionExecuteMod.ExecutionResult[TData]] = js.native
  def execute[TData](schema: graphqlLib.typeSchemaMod.GraphQLSchema, document: graphqlLib.languageAstMod.DocumentNode): graphqlLib.jsutilsPromiseOrValueMod.PromiseOrValue[graphqlLib.executionExecuteMod.ExecutionResult[TData]] = js.native
  def execute[TData](
    schema: graphqlLib.typeSchemaMod.GraphQLSchema,
    document: graphqlLib.languageAstMod.DocumentNode,
    rootValue: js.Any
  ): graphqlLib.jsutilsPromiseOrValueMod.PromiseOrValue[graphqlLib.executionExecuteMod.ExecutionResult[TData]] = js.native
  def execute[TData](
    schema: graphqlLib.typeSchemaMod.GraphQLSchema,
    document: graphqlLib.languageAstMod.DocumentNode,
    rootValue: js.Any,
    contextValue: js.Any
  ): graphqlLib.jsutilsPromiseOrValueMod.PromiseOrValue[graphqlLib.executionExecuteMod.ExecutionResult[TData]] = js.native
  def execute[TData](
    schema: graphqlLib.typeSchemaMod.GraphQLSchema,
    document: graphqlLib.languageAstMod.DocumentNode,
    rootValue: js.Any,
    contextValue: js.Any,
    variableValues: graphqlLib.tsutilsMaybeMod.Maybe[org.scalablytyped.runtime.StringDictionary[_]]
  ): graphqlLib.jsutilsPromiseOrValueMod.PromiseOrValue[graphqlLib.executionExecuteMod.ExecutionResult[TData]] = js.native
  def execute[TData](
    schema: graphqlLib.typeSchemaMod.GraphQLSchema,
    document: graphqlLib.languageAstMod.DocumentNode,
    rootValue: js.Any,
    contextValue: js.Any,
    variableValues: graphqlLib.tsutilsMaybeMod.Maybe[org.scalablytyped.runtime.StringDictionary[_]],
    operationName: graphqlLib.tsutilsMaybeMod.Maybe[java.lang.String]
  ): graphqlLib.jsutilsPromiseOrValueMod.PromiseOrValue[graphqlLib.executionExecuteMod.ExecutionResult[TData]] = js.native
  def execute[TData](
    schema: graphqlLib.typeSchemaMod.GraphQLSchema,
    document: graphqlLib.languageAstMod.DocumentNode,
    rootValue: js.Any,
    contextValue: js.Any,
    variableValues: graphqlLib.tsutilsMaybeMod.Maybe[org.scalablytyped.runtime.StringDictionary[_]],
    operationName: graphqlLib.tsutilsMaybeMod.Maybe[java.lang.String],
    fieldResolver: graphqlLib.tsutilsMaybeMod.Maybe[
      graphqlLib.typeDefinitionMod.GraphQLFieldResolver[_, _, org.scalablytyped.runtime.StringDictionary[_]]
    ]
  ): graphqlLib.jsutilsPromiseOrValueMod.PromiseOrValue[graphqlLib.executionExecuteMod.ExecutionResult[TData]] = js.native
  def extendSchema(
    schema: graphqlLib.typeSchemaMod.GraphQLSchema,
    documentAST: graphqlLib.languageAstMod.DocumentNode
  ): graphqlLib.typeSchemaMod.GraphQLSchema = js.native
  def extendSchema(
    schema: graphqlLib.typeSchemaMod.GraphQLSchema,
    documentAST: graphqlLib.languageAstMod.DocumentNode,
    options: graphqlLib.utilitiesExtendSchemaMod.Options
  ): graphqlLib.typeSchemaMod.GraphQLSchema = js.native
  def findBreakingChanges(
    oldSchema: graphqlLib.typeSchemaMod.GraphQLSchema,
    newSchema: graphqlLib.typeSchemaMod.GraphQLSchema
  ): js.Array[graphqlLib.utilitiesFindBreakingChangesMod.BreakingChange] = js.native
  def findDangerousChanges(
    oldSchema: graphqlLib.typeSchemaMod.GraphQLSchema,
    newSchema: graphqlLib.typeSchemaMod.GraphQLSchema
  ): js.Array[graphqlLib.utilitiesFindBreakingChangesMod.DangerousChange] = js.native
  def findDeprecatedUsages(schema: graphqlLib.typeSchemaMod.GraphQLSchema, ast: graphqlLib.languageAstMod.DocumentNode): js.Array[graphqlLib.errorGraphQLErrorMod.GraphQLError] = js.native
  def formatError(error: graphqlLib.errorGraphQLErrorMod.GraphQLError): graphqlLib.errorFormatErrorMod.GraphQLFormattedError = js.native
  def getDescription(
    node: graphqlLib.Anon_Description,
    options: graphqlLib.tsutilsMaybeMod.Maybe[graphqlLib.utilitiesBuildASTSchemaMod.BuildSchemaOptions]
  ): js.UndefOr[java.lang.String] = js.native
  def getDirectiveValues(directiveDef: graphqlLib.typeDirectivesMod.GraphQLDirective, node: graphqlLib.Anon_Directives): js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.native
  def getDirectiveValues(
    directiveDef: graphqlLib.typeDirectivesMod.GraphQLDirective,
    node: graphqlLib.Anon_Directives,
    variableValues: graphqlLib.tsutilsMaybeMod.Maybe[org.scalablytyped.runtime.StringDictionary[_]]
  ): js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.native
  def getIntrospectionQuery(): java.lang.String = js.native
  def getIntrospectionQuery(options: graphqlLib.utilitiesIntrospectionQueryMod.IntrospectionOptions): java.lang.String = js.native
  def getLocation(source: graphqlLib.languageSourceMod.Source, position: scala.Double): graphqlLib.languageLocationMod.SourceLocation = js.native
  def getNamedType(`type`: graphqlLib.typeDefinitionMod.GraphQLType): graphqlLib.typeDefinitionMod.GraphQLNamedType = js.native
  def getNamedType(`type`: scala.Unit): js.UndefOr[scala.Nothing] = js.native
  def getNullableType(`type`: graphqlLib.typeDefinitionMod.GraphQLEnumType): graphqlLib.typeDefinitionMod.GraphQLEnumType = js.native
  def getNullableType(`type`: graphqlLib.typeDefinitionMod.GraphQLInputObjectType): graphqlLib.typeDefinitionMod.GraphQLInputObjectType = js.native
  def getNullableType(`type`: graphqlLib.typeDefinitionMod.GraphQLInterfaceType): graphqlLib.typeDefinitionMod.GraphQLInterfaceType = js.native
  def getNullableType(`type`: graphqlLib.typeDefinitionMod.GraphQLScalarType): graphqlLib.typeDefinitionMod.GraphQLScalarType = js.native
  def getNullableType(`type`: graphqlLib.typeDefinitionMod.GraphQLUnionType): graphqlLib.typeDefinitionMod.GraphQLUnionType = js.native
  def getNullableType(`type`: scala.Unit): js.UndefOr[scala.Nothing] = js.native
  def getNullableType[T /* <: (graphqlLib.typeDefinitionMod.GraphQLObjectType[_, _, org.scalablytyped.runtime.StringDictionary[_]]) | graphqlLib.typeDefinitionMod.GraphQLList[_] */](`type`: T): T = js.native
  def getNullableType[T /* <: graphqlLib.typeDefinitionMod.GraphQLNullableType */](`type`: graphqlLib.typeDefinitionMod.GraphQLNonNull[T]): T = js.native
  def getOperationAST(
    documentAST: graphqlLib.languageAstMod.DocumentNode,
    operationName: graphqlLib.tsutilsMaybeMod.Maybe[java.lang.String]
  ): graphqlLib.tsutilsMaybeMod.Maybe[graphqlLib.languageAstMod.OperationDefinitionNode] = js.native
  def getOperationRootType(
    schema: graphqlLib.typeSchemaMod.GraphQLSchema,
    operation: graphqlLib.languageAstMod.OperationDefinitionNode
  ): graphqlLib.typeDefinitionMod.GraphQLObjectType[_, _, org.scalablytyped.runtime.StringDictionary[_]] = js.native
  def getOperationRootType(
    schema: graphqlLib.typeSchemaMod.GraphQLSchema,
    operation: graphqlLib.languageAstMod.OperationTypeDefinitionNode
  ): graphqlLib.typeDefinitionMod.GraphQLObjectType[_, _, org.scalablytyped.runtime.StringDictionary[_]] = js.native
  def getVisitFn(
    visitor: graphqlLib.languageVisitorMod.Visitor[
      _, 
      /* import warning: ImportType.apply Failed type conversion: any[keyof any] */ js.Any
    ],
    kind: java.lang.String,
    isLeaving: scala.Boolean
  ): graphqlLib.tsutilsMaybeMod.Maybe[graphqlLib.languageVisitorMod.VisitFn[_, _]] = js.native
  def graphql[TData](args: graphqlLib.graphqlGraphqlMod.GraphQLArgs): js.Promise[graphqlLib.executionExecuteMod.ExecutionResult[TData]] = js.native
  def graphql[TData](schema: graphqlLib.typeSchemaMod.GraphQLSchema, source: graphqlLib.languageSourceMod.Source): js.Promise[graphqlLib.executionExecuteMod.ExecutionResult[TData]] = js.native
  def graphql[TData](
    schema: graphqlLib.typeSchemaMod.GraphQLSchema,
    source: graphqlLib.languageSourceMod.Source,
    rootValue: js.Any
  ): js.Promise[graphqlLib.executionExecuteMod.ExecutionResult[TData]] = js.native
  def graphql[TData](
    schema: graphqlLib.typeSchemaMod.GraphQLSchema,
    source: graphqlLib.languageSourceMod.Source,
    rootValue: js.Any,
    contextValue: js.Any
  ): js.Promise[graphqlLib.executionExecuteMod.ExecutionResult[TData]] = js.native
  def graphql[TData](
    schema: graphqlLib.typeSchemaMod.GraphQLSchema,
    source: graphqlLib.languageSourceMod.Source,
    rootValue: js.Any,
    contextValue: js.Any,
    variableValues: graphqlLib.tsutilsMaybeMod.Maybe[org.scalablytyped.runtime.StringDictionary[_]]
  ): js.Promise[graphqlLib.executionExecuteMod.ExecutionResult[TData]] = js.native
  def graphql[TData](
    schema: graphqlLib.typeSchemaMod.GraphQLSchema,
    source: graphqlLib.languageSourceMod.Source,
    rootValue: js.Any,
    contextValue: js.Any,
    variableValues: graphqlLib.tsutilsMaybeMod.Maybe[org.scalablytyped.runtime.StringDictionary[_]],
    operationName: graphqlLib.tsutilsMaybeMod.Maybe[java.lang.String]
  ): js.Promise[graphqlLib.executionExecuteMod.ExecutionResult[TData]] = js.native
  def graphql[TData](
    schema: graphqlLib.typeSchemaMod.GraphQLSchema,
    source: graphqlLib.languageSourceMod.Source,
    rootValue: js.Any,
    contextValue: js.Any,
    variableValues: graphqlLib.tsutilsMaybeMod.Maybe[org.scalablytyped.runtime.StringDictionary[_]],
    operationName: graphqlLib.tsutilsMaybeMod.Maybe[java.lang.String],
    fieldResolver: graphqlLib.tsutilsMaybeMod.Maybe[
      graphqlLib.typeDefinitionMod.GraphQLFieldResolver[_, _, org.scalablytyped.runtime.StringDictionary[_]]
    ]
  ): js.Promise[graphqlLib.executionExecuteMod.ExecutionResult[TData]] = js.native
  def graphql[TData](schema: graphqlLib.typeSchemaMod.GraphQLSchema, source: java.lang.String): js.Promise[graphqlLib.executionExecuteMod.ExecutionResult[TData]] = js.native
  def graphql[TData](schema: graphqlLib.typeSchemaMod.GraphQLSchema, source: java.lang.String, rootValue: js.Any): js.Promise[graphqlLib.executionExecuteMod.ExecutionResult[TData]] = js.native
  def graphql[TData](
    schema: graphqlLib.typeSchemaMod.GraphQLSchema,
    source: java.lang.String,
    rootValue: js.Any,
    contextValue: js.Any
  ): js.Promise[graphqlLib.executionExecuteMod.ExecutionResult[TData]] = js.native
  def graphql[TData](
    schema: graphqlLib.typeSchemaMod.GraphQLSchema,
    source: java.lang.String,
    rootValue: js.Any,
    contextValue: js.Any,
    variableValues: graphqlLib.tsutilsMaybeMod.Maybe[org.scalablytyped.runtime.StringDictionary[_]]
  ): js.Promise[graphqlLib.executionExecuteMod.ExecutionResult[TData]] = js.native
  def graphql[TData](
    schema: graphqlLib.typeSchemaMod.GraphQLSchema,
    source: java.lang.String,
    rootValue: js.Any,
    contextValue: js.Any,
    variableValues: graphqlLib.tsutilsMaybeMod.Maybe[org.scalablytyped.runtime.StringDictionary[_]],
    operationName: graphqlLib.tsutilsMaybeMod.Maybe[java.lang.String]
  ): js.Promise[graphqlLib.executionExecuteMod.ExecutionResult[TData]] = js.native
  def graphql[TData](
    schema: graphqlLib.typeSchemaMod.GraphQLSchema,
    source: java.lang.String,
    rootValue: js.Any,
    contextValue: js.Any,
    variableValues: graphqlLib.tsutilsMaybeMod.Maybe[org.scalablytyped.runtime.StringDictionary[_]],
    operationName: graphqlLib.tsutilsMaybeMod.Maybe[java.lang.String],
    fieldResolver: graphqlLib.tsutilsMaybeMod.Maybe[
      graphqlLib.typeDefinitionMod.GraphQLFieldResolver[_, _, org.scalablytyped.runtime.StringDictionary[_]]
    ]
  ): js.Promise[graphqlLib.executionExecuteMod.ExecutionResult[TData]] = js.native
  def graphqlSync[TData](args: graphqlLib.graphqlGraphqlMod.GraphQLArgs): graphqlLib.executionExecuteMod.ExecutionResult[TData] = js.native
  def graphqlSync[TData](schema: graphqlLib.typeSchemaMod.GraphQLSchema, source: graphqlLib.languageSourceMod.Source): graphqlLib.executionExecuteMod.ExecutionResult[TData] = js.native
  def graphqlSync[TData](
    schema: graphqlLib.typeSchemaMod.GraphQLSchema,
    source: graphqlLib.languageSourceMod.Source,
    rootValue: js.Any
  ): graphqlLib.executionExecuteMod.ExecutionResult[TData] = js.native
  def graphqlSync[TData](
    schema: graphqlLib.typeSchemaMod.GraphQLSchema,
    source: graphqlLib.languageSourceMod.Source,
    rootValue: js.Any,
    contextValue: js.Any
  ): graphqlLib.executionExecuteMod.ExecutionResult[TData] = js.native
  def graphqlSync[TData](
    schema: graphqlLib.typeSchemaMod.GraphQLSchema,
    source: graphqlLib.languageSourceMod.Source,
    rootValue: js.Any,
    contextValue: js.Any,
    variableValues: graphqlLib.tsutilsMaybeMod.Maybe[org.scalablytyped.runtime.StringDictionary[_]]
  ): graphqlLib.executionExecuteMod.ExecutionResult[TData] = js.native
  def graphqlSync[TData](
    schema: graphqlLib.typeSchemaMod.GraphQLSchema,
    source: graphqlLib.languageSourceMod.Source,
    rootValue: js.Any,
    contextValue: js.Any,
    variableValues: graphqlLib.tsutilsMaybeMod.Maybe[org.scalablytyped.runtime.StringDictionary[_]],
    operationName: graphqlLib.tsutilsMaybeMod.Maybe[java.lang.String]
  ): graphqlLib.executionExecuteMod.ExecutionResult[TData] = js.native
  def graphqlSync[TData](
    schema: graphqlLib.typeSchemaMod.GraphQLSchema,
    source: graphqlLib.languageSourceMod.Source,
    rootValue: js.Any,
    contextValue: js.Any,
    variableValues: graphqlLib.tsutilsMaybeMod.Maybe[org.scalablytyped.runtime.StringDictionary[_]],
    operationName: graphqlLib.tsutilsMaybeMod.Maybe[java.lang.String],
    fieldResolver: graphqlLib.tsutilsMaybeMod.Maybe[
      graphqlLib.typeDefinitionMod.GraphQLFieldResolver[_, _, org.scalablytyped.runtime.StringDictionary[_]]
    ]
  ): graphqlLib.executionExecuteMod.ExecutionResult[TData] = js.native
  def graphqlSync[TData](schema: graphqlLib.typeSchemaMod.GraphQLSchema, source: java.lang.String): graphqlLib.executionExecuteMod.ExecutionResult[TData] = js.native
  def graphqlSync[TData](schema: graphqlLib.typeSchemaMod.GraphQLSchema, source: java.lang.String, rootValue: js.Any): graphqlLib.executionExecuteMod.ExecutionResult[TData] = js.native
  def graphqlSync[TData](
    schema: graphqlLib.typeSchemaMod.GraphQLSchema,
    source: java.lang.String,
    rootValue: js.Any,
    contextValue: js.Any
  ): graphqlLib.executionExecuteMod.ExecutionResult[TData] = js.native
  def graphqlSync[TData](
    schema: graphqlLib.typeSchemaMod.GraphQLSchema,
    source: java.lang.String,
    rootValue: js.Any,
    contextValue: js.Any,
    variableValues: graphqlLib.tsutilsMaybeMod.Maybe[org.scalablytyped.runtime.StringDictionary[_]]
  ): graphqlLib.executionExecuteMod.ExecutionResult[TData] = js.native
  def graphqlSync[TData](
    schema: graphqlLib.typeSchemaMod.GraphQLSchema,
    source: java.lang.String,
    rootValue: js.Any,
    contextValue: js.Any,
    variableValues: graphqlLib.tsutilsMaybeMod.Maybe[org.scalablytyped.runtime.StringDictionary[_]],
    operationName: graphqlLib.tsutilsMaybeMod.Maybe[java.lang.String]
  ): graphqlLib.executionExecuteMod.ExecutionResult[TData] = js.native
  def graphqlSync[TData](
    schema: graphqlLib.typeSchemaMod.GraphQLSchema,
    source: java.lang.String,
    rootValue: js.Any,
    contextValue: js.Any,
    variableValues: graphqlLib.tsutilsMaybeMod.Maybe[org.scalablytyped.runtime.StringDictionary[_]],
    operationName: graphqlLib.tsutilsMaybeMod.Maybe[java.lang.String],
    fieldResolver: graphqlLib.tsutilsMaybeMod.Maybe[
      graphqlLib.typeDefinitionMod.GraphQLFieldResolver[_, _, org.scalablytyped.runtime.StringDictionary[_]]
    ]
  ): graphqlLib.executionExecuteMod.ExecutionResult[TData] = js.native
  def introspectionFromSchema(schema: graphqlLib.typeSchemaMod.GraphQLSchema): graphqlLib.utilitiesIntrospectionQueryMod.IntrospectionQuery = js.native
  def introspectionFromSchema(
    schema: graphqlLib.typeSchemaMod.GraphQLSchema,
    options: graphqlLib.utilitiesIntrospectionQueryMod.IntrospectionOptions
  ): graphqlLib.utilitiesIntrospectionQueryMod.IntrospectionQuery = js.native
  def isAbstractType(`type`: js.Any): /* is graphql.graphql/type/definition.GraphQLAbstractType */ scala.Boolean = js.native
  def isCompositeType(`type`: js.Any): /* is graphql.graphql/type/definition.GraphQLCompositeType */ scala.Boolean = js.native
  def isDefinitionNode(node: graphqlLib.languageAstMod.ASTNode): /* is graphql.graphql/language/ast.DefinitionNode */ scala.Boolean = js.native
  def isDirective(directive: js.Any): /* is graphql.graphql/type/directives.GraphQLDirective */ scala.Boolean = js.native
  def isEnumType(`type`: js.Any): /* is graphql.graphql/type/definition.GraphQLEnumType */ scala.Boolean = js.native
  def isEqualType(typeA: graphqlLib.typeDefinitionMod.GraphQLType, typeB: graphqlLib.typeDefinitionMod.GraphQLType): scala.Boolean = js.native
  def isExecutableDefinitionNode(node: graphqlLib.languageAstMod.ASTNode): /* is graphql.graphql/language/ast.ExecutableDefinitionNode */ scala.Boolean = js.native
  def isInputObjectType(`type`: js.Any): /* is graphql.graphql/type/definition.GraphQLInputObjectType */ scala.Boolean = js.native
  def isInputType(`type`: js.Any): /* is graphql.graphql/type/definition.GraphQLInputType */ scala.Boolean = js.native
  def isInterfaceType(`type`: js.Any): /* is graphql.graphql/type/definition.GraphQLInterfaceType */ scala.Boolean = js.native
  def isIntrospectionType(`type`: js.Any): scala.Boolean = js.native
  def isLeafType(`type`: js.Any): /* is graphql.graphql/type/definition.GraphQLLeafType */ scala.Boolean = js.native
  def isListType(`type`: js.Any): /* is graphql.graphql/type/definition.GraphQLList<any> */ scala.Boolean = js.native
  def isNamedType(`type`: js.Any): /* is graphql.graphql/type/definition.GraphQLNamedType */ scala.Boolean = js.native
  def isNonNullType(`type`: js.Any): /* is graphql.graphql/type/definition.GraphQLNonNull<any> */ scala.Boolean = js.native
  def isNullableType(`type`: js.Any): /* is graphql.graphql/type/definition.GraphQLNullableType */ scala.Boolean = js.native
  def isObjectType(`type`: js.Any): /* is graphql.graphql/type/definition.GraphQLObjectType<any, any, {[key: string] : any}> */ scala.Boolean = js.native
  def isOutputType(`type`: js.Any): /* is graphql.graphql/type/definition.GraphQLOutputType */ scala.Boolean = js.native
  def isRequiredArgument(arg: graphqlLib.typeDefinitionMod.GraphQLArgument): scala.Boolean = js.native
  def isRequiredInputField(field: graphqlLib.typeDefinitionMod.GraphQLInputField): scala.Boolean = js.native
  def isScalarType(`type`: js.Any): /* is graphql.graphql/type/definition.GraphQLScalarType */ scala.Boolean = js.native
  def isSchema(schema: js.Any): /* is graphql.graphql/type/schema.GraphQLSchema */ scala.Boolean = js.native
  def isSelectionNode(node: graphqlLib.languageAstMod.ASTNode): /* is graphql.graphql/language/ast.SelectionNode */ scala.Boolean = js.native
  def isSpecifiedDirective(directive: graphqlLib.typeDirectivesMod.GraphQLDirective): scala.Boolean = js.native
  def isSpecifiedScalarType(`type`: graphqlLib.typeDefinitionMod.GraphQLScalarType): scala.Boolean = js.native
  def isType(`type`: js.Any): /* is graphql.graphql/type/definition.GraphQLType */ scala.Boolean = js.native
  def isTypeDefinitionNode(node: graphqlLib.languageAstMod.ASTNode): /* is graphql.graphql/language/ast.TypeDefinitionNode */ scala.Boolean = js.native
  def isTypeExtensionNode(node: graphqlLib.languageAstMod.ASTNode): /* is graphql.graphql/language/ast.TypeExtensionNode */ scala.Boolean = js.native
  def isTypeNode(node: graphqlLib.languageAstMod.ASTNode): /* is graphql.graphql/language/ast.TypeNode */ scala.Boolean = js.native
  def isTypeSubTypeOf(
    schema: graphqlLib.typeSchemaMod.GraphQLSchema,
    maybeSubType: graphqlLib.typeDefinitionMod.GraphQLType,
    superType: graphqlLib.typeDefinitionMod.GraphQLType
  ): scala.Boolean = js.native
  def isTypeSystemDefinitionNode(node: graphqlLib.languageAstMod.ASTNode): /* is graphql.graphql/language/ast.TypeSystemDefinitionNode */ scala.Boolean = js.native
  def isTypeSystemExtensionNode(node: graphqlLib.languageAstMod.ASTNode): /* is graphql.graphql/language/ast.TypeSystemExtensionNode */ scala.Boolean = js.native
  def isUnionType(`type`: js.Any): /* is graphql.graphql/type/definition.GraphQLUnionType */ scala.Boolean = js.native
  def isValidJSValue(value: js.Any, `type`: graphqlLib.typeDefinitionMod.GraphQLInputType): js.Array[java.lang.String] = js.native
  def isValidLiteralValue(
    `type`: graphqlLib.typeDefinitionMod.GraphQLInputType,
    valueNode: graphqlLib.languageAstMod.ValueNode
  ): js.Array[graphqlLib.errorGraphQLErrorMod.GraphQLError] = js.native
  def isValidNameError(name: java.lang.String): js.UndefOr[graphqlLib.errorGraphQLErrorMod.GraphQLError] = js.native
  def isValidNameError(name: java.lang.String, node: graphqlLib.languageAstMod.ASTNode): js.UndefOr[graphqlLib.errorGraphQLErrorMod.GraphQLError] = js.native
  def isValueNode(node: graphqlLib.languageAstMod.ASTNode): /* is graphql.graphql/language/ast.ValueNode */ scala.Boolean = js.native
  def isWrappingType(`type`: js.Any): /* is graphql.graphql/type/definition.GraphQLWrappingType */ scala.Boolean = js.native
  def lexicographicSortSchema(schema: graphqlLib.typeSchemaMod.GraphQLSchema): graphqlLib.typeSchemaMod.GraphQLSchema = js.native
  def parse(source: graphqlLib.languageSourceMod.Source): graphqlLib.languageAstMod.DocumentNode = js.native
  def parse(source: graphqlLib.languageSourceMod.Source, options: graphqlLib.languageParserMod.ParseOptions): graphqlLib.languageAstMod.DocumentNode = js.native
  def parse(source: java.lang.String): graphqlLib.languageAstMod.DocumentNode = js.native
  def parse(source: java.lang.String, options: graphqlLib.languageParserMod.ParseOptions): graphqlLib.languageAstMod.DocumentNode = js.native
  def parseType(source: graphqlLib.languageSourceMod.Source): graphqlLib.languageAstMod.TypeNode = js.native
  def parseType(source: graphqlLib.languageSourceMod.Source, options: graphqlLib.languageParserMod.ParseOptions): graphqlLib.languageAstMod.TypeNode = js.native
  def parseType(source: java.lang.String): graphqlLib.languageAstMod.TypeNode = js.native
  def parseType(source: java.lang.String, options: graphqlLib.languageParserMod.ParseOptions): graphqlLib.languageAstMod.TypeNode = js.native
  def parseValue(source: graphqlLib.languageSourceMod.Source): graphqlLib.languageAstMod.ValueNode = js.native
  def parseValue(source: graphqlLib.languageSourceMod.Source, options: graphqlLib.languageParserMod.ParseOptions): graphqlLib.languageAstMod.ValueNode = js.native
  def parseValue(source: java.lang.String): graphqlLib.languageAstMod.ValueNode = js.native
  def parseValue(source: java.lang.String, options: graphqlLib.languageParserMod.ParseOptions): graphqlLib.languageAstMod.ValueNode = js.native
  def print(ast: graphqlLib.languageAstMod.ASTNode): java.lang.String = js.native
  def printError(error: graphqlLib.errorGraphQLErrorMod.GraphQLError): java.lang.String = js.native
  def printIntrospectionSchema(schema: graphqlLib.typeSchemaMod.GraphQLSchema): java.lang.String = js.native
  def printIntrospectionSchema(
    schema: graphqlLib.typeSchemaMod.GraphQLSchema,
    options: graphqlLib.utilitiesSchemaPrinterMod.Options
  ): java.lang.String = js.native
  def printSchema(schema: graphqlLib.typeSchemaMod.GraphQLSchema): java.lang.String = js.native
  def printSchema(
    schema: graphqlLib.typeSchemaMod.GraphQLSchema,
    options: graphqlLib.utilitiesSchemaPrinterMod.Options
  ): java.lang.String = js.native
  def printType(`type`: graphqlLib.typeDefinitionMod.GraphQLNamedType): java.lang.String = js.native
  def printType(
    `type`: graphqlLib.typeDefinitionMod.GraphQLNamedType,
    options: graphqlLib.utilitiesSchemaPrinterMod.Options
  ): java.lang.String = js.native
  def responsePathAsArray(path: graphqlLib.typeDefinitionMod.ResponsePath): js.Array[java.lang.String | scala.Double] = js.native
  def separateOperations(documentAST: graphqlLib.languageAstMod.DocumentNode): org.scalablytyped.runtime.StringDictionary[graphqlLib.languageAstMod.DocumentNode] = js.native
  def subscribe[TData](args: graphqlLib.Anon_ArgName): js.Promise[
    stdLib.AsyncIterator[graphqlLib.executionExecuteMod.ExecutionResult[TData]] | graphqlLib.executionExecuteMod.ExecutionResult[TData]
  ] = js.native
  def subscribe[TData](
    schema: graphqlLib.typeSchemaMod.GraphQLSchema,
    document: graphqlLib.languageAstMod.DocumentNode,
    rootValue: js.UndefOr[js.Any],
    contextValue: js.UndefOr[js.Any],
    variableValues: js.UndefOr[graphqlLib.tsutilsMaybeMod.Maybe[org.scalablytyped.runtime.StringDictionary[_]]],
    operationName: js.UndefOr[graphqlLib.tsutilsMaybeMod.Maybe[java.lang.String]],
    fieldResolver: js.UndefOr[
      graphqlLib.tsutilsMaybeMod.Maybe[
        graphqlLib.typeDefinitionMod.GraphQLFieldResolver[_, _, org.scalablytyped.runtime.StringDictionary[_]]
      ]
    ],
    subscribeFieldResolver: js.UndefOr[
      graphqlLib.tsutilsMaybeMod.Maybe[
        graphqlLib.typeDefinitionMod.GraphQLFieldResolver[_, _, org.scalablytyped.runtime.StringDictionary[_]]
      ]
    ]
  ): js.Promise[
    stdLib.AsyncIterator[graphqlLib.executionExecuteMod.ExecutionResult[TData]] | graphqlLib.executionExecuteMod.ExecutionResult[TData]
  ] = js.native
  def typeFromAST(schema: graphqlLib.typeSchemaMod.GraphQLSchema, typeNode: graphqlLib.languageAstMod.ListTypeNode): js.UndefOr[graphqlLib.typeDefinitionMod.GraphQLList[_]] = js.native
  def typeFromAST(schema: graphqlLib.typeSchemaMod.GraphQLSchema, typeNode: graphqlLib.languageAstMod.NamedTypeNode): js.UndefOr[graphqlLib.typeDefinitionMod.GraphQLNamedType] = js.native
  def typeFromAST(
    schema: graphqlLib.typeSchemaMod.GraphQLSchema,
    typeNode: graphqlLib.languageAstMod.NonNullTypeNode
  ): js.UndefOr[graphqlLib.typeDefinitionMod.GraphQLNonNull[_]] = js.native
  def validate(
    schema: graphqlLib.typeSchemaMod.GraphQLSchema,
    documentAST: graphqlLib.languageAstMod.DocumentNode
  ): js.Array[graphqlLib.errorMod.GraphQLError] = js.native
  def validate(
    schema: graphqlLib.typeSchemaMod.GraphQLSchema,
    documentAST: graphqlLib.languageAstMod.DocumentNode,
    rules: js.Array[graphqlLib.validationValidationContextMod.ValidationRule]
  ): js.Array[graphqlLib.errorMod.GraphQLError] = js.native
  def validate(
    schema: graphqlLib.typeSchemaMod.GraphQLSchema,
    documentAST: graphqlLib.languageAstMod.DocumentNode,
    rules: js.Array[graphqlLib.validationValidationContextMod.ValidationRule],
    typeInfo: graphqlLib.utilitiesTypeInfoMod.TypeInfo
  ): js.Array[graphqlLib.errorMod.GraphQLError] = js.native
  def validateSchema(schema: graphqlLib.typeSchemaMod.GraphQLSchema): js.Array[graphqlLib.errorGraphQLErrorMod.GraphQLError] = js.native
  def valueFromAST(
    valueNode: graphqlLib.tsutilsMaybeMod.Maybe[graphqlLib.languageAstMod.ValueNode],
    `type`: graphqlLib.typeDefinitionMod.GraphQLInputType
  ): js.Any = js.native
  def valueFromAST(
    valueNode: graphqlLib.tsutilsMaybeMod.Maybe[graphqlLib.languageAstMod.ValueNode],
    `type`: graphqlLib.typeDefinitionMod.GraphQLInputType,
    variables: graphqlLib.tsutilsMaybeMod.Maybe[org.scalablytyped.runtime.StringDictionary[_]]
  ): js.Any = js.native
  def valueFromASTUntyped(valueNode: graphqlLib.languageAstMod.ValueNode): js.Any = js.native
  def valueFromASTUntyped(
    valueNode: graphqlLib.languageAstMod.ValueNode,
    variables: graphqlLib.tsutilsMaybeMod.Maybe[org.scalablytyped.runtime.StringDictionary[_]]
  ): js.Any = js.native
  def visit(
    root: graphqlLib.languageAstMod.ASTNode,
    visitor: graphqlLib.languageVisitorMod.Visitor[
      graphqlLib.languageAstMod.ASTKindToNode, 
      graphqlLib.languageAstMod.UnionTypeDefinitionNode | graphqlLib.languageAstMod.FragmentSpreadNode | graphqlLib.languageAstMod.OperationDefinitionNode | graphqlLib.languageAstMod.EnumTypeDefinitionNode | graphqlLib.languageAstMod.StringValueNode | graphqlLib.languageAstMod.ArgumentNode | graphqlLib.languageAstMod.BooleanValueNode | graphqlLib.languageAstMod.NameNode | graphqlLib.languageAstMod.FieldDefinitionNode | graphqlLib.languageAstMod.ObjectTypeDefinitionNode | graphqlLib.languageAstMod.EnumValueDefinitionNode | graphqlLib.languageAstMod.FloatValueNode | graphqlLib.languageAstMod.NullValueNode | graphqlLib.languageAstMod.DirectiveNode | graphqlLib.languageAstMod.VariableNode | graphqlLib.languageAstMod.ScalarTypeExtensionNode | graphqlLib.languageAstMod.IntValueNode | graphqlLib.languageAstMod.SchemaExtensionNode | graphqlLib.languageAstMod.DirectiveDefinitionNode | graphqlLib.languageAstMod.InputObjectTypeExtensionNode | graphqlLib.languageAstMod.ScalarTypeDefinitionNode | graphqlLib.languageAstMod.UnionTypeExtensionNode | graphqlLib.languageAstMod.FragmentDefinitionNode | graphqlLib.languageAstMod.SelectionSetNode | graphqlLib.languageAstMod.NamedTypeNode | graphqlLib.languageAstMod.VariableDefinitionNode | graphqlLib.languageAstMod.EnumTypeExtensionNode | graphqlLib.languageAstMod.ObjectValueNode | graphqlLib.languageAstMod.OperationTypeDefinitionNode | graphqlLib.languageAstMod.EnumValueNode | graphqlLib.languageAstMod.ObjectFieldNode | graphqlLib.languageAstMod.FieldNode | graphqlLib.languageAstMod.InputObjectTypeDefinitionNode | graphqlLib.languageAstMod.InputValueDefinitionNode | graphqlLib.languageAstMod.NonNullTypeNode | graphqlLib.languageAstMod.InlineFragmentNode | graphqlLib.languageAstMod.InterfaceTypeDefinitionNode | graphqlLib.languageAstMod.ListTypeNode | graphqlLib.languageAstMod.InterfaceTypeExtensionNode | graphqlLib.languageAstMod.ListValueNode | graphqlLib.languageAstMod.SchemaDefinitionNode | graphqlLib.languageAstMod.ObjectTypeExtensionNode | graphqlLib.languageAstMod.DocumentNode
    ]
  ): js.Any = js.native
  def visit(
    root: graphqlLib.languageAstMod.ASTNode,
    visitor: graphqlLib.languageVisitorMod.Visitor[
      graphqlLib.languageAstMod.ASTKindToNode, 
      graphqlLib.languageAstMod.UnionTypeDefinitionNode | graphqlLib.languageAstMod.FragmentSpreadNode | graphqlLib.languageAstMod.OperationDefinitionNode | graphqlLib.languageAstMod.EnumTypeDefinitionNode | graphqlLib.languageAstMod.StringValueNode | graphqlLib.languageAstMod.ArgumentNode | graphqlLib.languageAstMod.BooleanValueNode | graphqlLib.languageAstMod.NameNode | graphqlLib.languageAstMod.FieldDefinitionNode | graphqlLib.languageAstMod.ObjectTypeDefinitionNode | graphqlLib.languageAstMod.EnumValueDefinitionNode | graphqlLib.languageAstMod.FloatValueNode | graphqlLib.languageAstMod.NullValueNode | graphqlLib.languageAstMod.DirectiveNode | graphqlLib.languageAstMod.VariableNode | graphqlLib.languageAstMod.ScalarTypeExtensionNode | graphqlLib.languageAstMod.IntValueNode | graphqlLib.languageAstMod.SchemaExtensionNode | graphqlLib.languageAstMod.DirectiveDefinitionNode | graphqlLib.languageAstMod.InputObjectTypeExtensionNode | graphqlLib.languageAstMod.ScalarTypeDefinitionNode | graphqlLib.languageAstMod.UnionTypeExtensionNode | graphqlLib.languageAstMod.FragmentDefinitionNode | graphqlLib.languageAstMod.SelectionSetNode | graphqlLib.languageAstMod.NamedTypeNode | graphqlLib.languageAstMod.VariableDefinitionNode | graphqlLib.languageAstMod.EnumTypeExtensionNode | graphqlLib.languageAstMod.ObjectValueNode | graphqlLib.languageAstMod.OperationTypeDefinitionNode | graphqlLib.languageAstMod.EnumValueNode | graphqlLib.languageAstMod.ObjectFieldNode | graphqlLib.languageAstMod.FieldNode | graphqlLib.languageAstMod.InputObjectTypeDefinitionNode | graphqlLib.languageAstMod.InputValueDefinitionNode | graphqlLib.languageAstMod.NonNullTypeNode | graphqlLib.languageAstMod.InlineFragmentNode | graphqlLib.languageAstMod.InterfaceTypeDefinitionNode | graphqlLib.languageAstMod.ListTypeNode | graphqlLib.languageAstMod.InterfaceTypeExtensionNode | graphqlLib.languageAstMod.ListValueNode | graphqlLib.languageAstMod.SchemaDefinitionNode | graphqlLib.languageAstMod.ObjectTypeExtensionNode | graphqlLib.languageAstMod.DocumentNode
    ],
    visitorKeys: graphqlLib.languageVisitorMod.VisitorKeyMap[graphqlLib.languageAstMod.ASTKindToNode]
  ): js.Any = js.native
  def visitInParallel(
    visitors: js.Array[
      graphqlLib.languageVisitorMod.Visitor[
        graphqlLib.languageAstMod.ASTKindToNode, 
        graphqlLib.languageAstMod.UnionTypeDefinitionNode | graphqlLib.languageAstMod.FragmentSpreadNode | graphqlLib.languageAstMod.OperationDefinitionNode | graphqlLib.languageAstMod.EnumTypeDefinitionNode | graphqlLib.languageAstMod.StringValueNode | graphqlLib.languageAstMod.ArgumentNode | graphqlLib.languageAstMod.BooleanValueNode | graphqlLib.languageAstMod.NameNode | graphqlLib.languageAstMod.FieldDefinitionNode | graphqlLib.languageAstMod.ObjectTypeDefinitionNode | graphqlLib.languageAstMod.EnumValueDefinitionNode | graphqlLib.languageAstMod.FloatValueNode | graphqlLib.languageAstMod.NullValueNode | graphqlLib.languageAstMod.DirectiveNode | graphqlLib.languageAstMod.VariableNode | graphqlLib.languageAstMod.ScalarTypeExtensionNode | graphqlLib.languageAstMod.IntValueNode | graphqlLib.languageAstMod.SchemaExtensionNode | graphqlLib.languageAstMod.DirectiveDefinitionNode | graphqlLib.languageAstMod.InputObjectTypeExtensionNode | graphqlLib.languageAstMod.ScalarTypeDefinitionNode | graphqlLib.languageAstMod.UnionTypeExtensionNode | graphqlLib.languageAstMod.FragmentDefinitionNode | graphqlLib.languageAstMod.SelectionSetNode | graphqlLib.languageAstMod.NamedTypeNode | graphqlLib.languageAstMod.VariableDefinitionNode | graphqlLib.languageAstMod.EnumTypeExtensionNode | graphqlLib.languageAstMod.ObjectValueNode | graphqlLib.languageAstMod.OperationTypeDefinitionNode | graphqlLib.languageAstMod.EnumValueNode | graphqlLib.languageAstMod.ObjectFieldNode | graphqlLib.languageAstMod.FieldNode | graphqlLib.languageAstMod.InputObjectTypeDefinitionNode | graphqlLib.languageAstMod.InputValueDefinitionNode | graphqlLib.languageAstMod.NonNullTypeNode | graphqlLib.languageAstMod.InlineFragmentNode | graphqlLib.languageAstMod.InterfaceTypeDefinitionNode | graphqlLib.languageAstMod.ListTypeNode | graphqlLib.languageAstMod.InterfaceTypeExtensionNode | graphqlLib.languageAstMod.ListValueNode | graphqlLib.languageAstMod.SchemaDefinitionNode | graphqlLib.languageAstMod.ObjectTypeExtensionNode | graphqlLib.languageAstMod.DocumentNode
      ]
    ]
  ): graphqlLib.languageVisitorMod.Visitor[
    graphqlLib.languageAstMod.ASTKindToNode, 
    graphqlLib.languageAstMod.UnionTypeDefinitionNode | graphqlLib.languageAstMod.FragmentSpreadNode | graphqlLib.languageAstMod.OperationDefinitionNode | graphqlLib.languageAstMod.EnumTypeDefinitionNode | graphqlLib.languageAstMod.StringValueNode | graphqlLib.languageAstMod.ArgumentNode | graphqlLib.languageAstMod.BooleanValueNode | graphqlLib.languageAstMod.NameNode | graphqlLib.languageAstMod.FieldDefinitionNode | graphqlLib.languageAstMod.ObjectTypeDefinitionNode | graphqlLib.languageAstMod.EnumValueDefinitionNode | graphqlLib.languageAstMod.FloatValueNode | graphqlLib.languageAstMod.NullValueNode | graphqlLib.languageAstMod.DirectiveNode | graphqlLib.languageAstMod.VariableNode | graphqlLib.languageAstMod.ScalarTypeExtensionNode | graphqlLib.languageAstMod.IntValueNode | graphqlLib.languageAstMod.SchemaExtensionNode | graphqlLib.languageAstMod.DirectiveDefinitionNode | graphqlLib.languageAstMod.InputObjectTypeExtensionNode | graphqlLib.languageAstMod.ScalarTypeDefinitionNode | graphqlLib.languageAstMod.UnionTypeExtensionNode | graphqlLib.languageAstMod.FragmentDefinitionNode | graphqlLib.languageAstMod.SelectionSetNode | graphqlLib.languageAstMod.NamedTypeNode | graphqlLib.languageAstMod.VariableDefinitionNode | graphqlLib.languageAstMod.EnumTypeExtensionNode | graphqlLib.languageAstMod.ObjectValueNode | graphqlLib.languageAstMod.OperationTypeDefinitionNode | graphqlLib.languageAstMod.EnumValueNode | graphqlLib.languageAstMod.ObjectFieldNode | graphqlLib.languageAstMod.FieldNode | graphqlLib.languageAstMod.InputObjectTypeDefinitionNode | graphqlLib.languageAstMod.InputValueDefinitionNode | graphqlLib.languageAstMod.NonNullTypeNode | graphqlLib.languageAstMod.InlineFragmentNode | graphqlLib.languageAstMod.InterfaceTypeDefinitionNode | graphqlLib.languageAstMod.ListTypeNode | graphqlLib.languageAstMod.InterfaceTypeExtensionNode | graphqlLib.languageAstMod.ListValueNode | graphqlLib.languageAstMod.SchemaDefinitionNode | graphqlLib.languageAstMod.ObjectTypeExtensionNode | graphqlLib.languageAstMod.DocumentNode
  ] = js.native
  def visitWithTypeInfo(
    typeInfo: graphqlLib.utilitiesTypeInfoMod.TypeInfo,
    visitor: graphqlLib.languageVisitorMod.Visitor[
      graphqlLib.languageAstMod.ASTKindToNode, 
      graphqlLib.languageAstMod.UnionTypeDefinitionNode | graphqlLib.languageAstMod.FragmentSpreadNode | graphqlLib.languageAstMod.OperationDefinitionNode | graphqlLib.languageAstMod.EnumTypeDefinitionNode | graphqlLib.languageAstMod.StringValueNode | graphqlLib.languageAstMod.ArgumentNode | graphqlLib.languageAstMod.BooleanValueNode | graphqlLib.languageAstMod.NameNode | graphqlLib.languageAstMod.FieldDefinitionNode | graphqlLib.languageAstMod.ObjectTypeDefinitionNode | graphqlLib.languageAstMod.EnumValueDefinitionNode | graphqlLib.languageAstMod.FloatValueNode | graphqlLib.languageAstMod.NullValueNode | graphqlLib.languageAstMod.DirectiveNode | graphqlLib.languageAstMod.VariableNode | graphqlLib.languageAstMod.ScalarTypeExtensionNode | graphqlLib.languageAstMod.IntValueNode | graphqlLib.languageAstMod.SchemaExtensionNode | graphqlLib.languageAstMod.DirectiveDefinitionNode | graphqlLib.languageAstMod.InputObjectTypeExtensionNode | graphqlLib.languageAstMod.ScalarTypeDefinitionNode | graphqlLib.languageAstMod.UnionTypeExtensionNode | graphqlLib.languageAstMod.FragmentDefinitionNode | graphqlLib.languageAstMod.SelectionSetNode | graphqlLib.languageAstMod.NamedTypeNode | graphqlLib.languageAstMod.VariableDefinitionNode | graphqlLib.languageAstMod.EnumTypeExtensionNode | graphqlLib.languageAstMod.ObjectValueNode | graphqlLib.languageAstMod.OperationTypeDefinitionNode | graphqlLib.languageAstMod.EnumValueNode | graphqlLib.languageAstMod.ObjectFieldNode | graphqlLib.languageAstMod.FieldNode | graphqlLib.languageAstMod.InputObjectTypeDefinitionNode | graphqlLib.languageAstMod.InputValueDefinitionNode | graphqlLib.languageAstMod.NonNullTypeNode | graphqlLib.languageAstMod.InlineFragmentNode | graphqlLib.languageAstMod.InterfaceTypeDefinitionNode | graphqlLib.languageAstMod.ListTypeNode | graphqlLib.languageAstMod.InterfaceTypeExtensionNode | graphqlLib.languageAstMod.ListValueNode | graphqlLib.languageAstMod.SchemaDefinitionNode | graphqlLib.languageAstMod.ObjectTypeExtensionNode | graphqlLib.languageAstMod.DocumentNode
    ]
  ): graphqlLib.languageVisitorMod.Visitor[
    graphqlLib.languageAstMod.ASTKindToNode, 
    graphqlLib.languageAstMod.UnionTypeDefinitionNode | graphqlLib.languageAstMod.FragmentSpreadNode | graphqlLib.languageAstMod.OperationDefinitionNode | graphqlLib.languageAstMod.EnumTypeDefinitionNode | graphqlLib.languageAstMod.StringValueNode | graphqlLib.languageAstMod.ArgumentNode | graphqlLib.languageAstMod.BooleanValueNode | graphqlLib.languageAstMod.NameNode | graphqlLib.languageAstMod.FieldDefinitionNode | graphqlLib.languageAstMod.ObjectTypeDefinitionNode | graphqlLib.languageAstMod.EnumValueDefinitionNode | graphqlLib.languageAstMod.FloatValueNode | graphqlLib.languageAstMod.NullValueNode | graphqlLib.languageAstMod.DirectiveNode | graphqlLib.languageAstMod.VariableNode | graphqlLib.languageAstMod.ScalarTypeExtensionNode | graphqlLib.languageAstMod.IntValueNode | graphqlLib.languageAstMod.SchemaExtensionNode | graphqlLib.languageAstMod.DirectiveDefinitionNode | graphqlLib.languageAstMod.InputObjectTypeExtensionNode | graphqlLib.languageAstMod.ScalarTypeDefinitionNode | graphqlLib.languageAstMod.UnionTypeExtensionNode | graphqlLib.languageAstMod.FragmentDefinitionNode | graphqlLib.languageAstMod.SelectionSetNode | graphqlLib.languageAstMod.NamedTypeNode | graphqlLib.languageAstMod.VariableDefinitionNode | graphqlLib.languageAstMod.EnumTypeExtensionNode | graphqlLib.languageAstMod.ObjectValueNode | graphqlLib.languageAstMod.OperationTypeDefinitionNode | graphqlLib.languageAstMod.EnumValueNode | graphqlLib.languageAstMod.ObjectFieldNode | graphqlLib.languageAstMod.FieldNode | graphqlLib.languageAstMod.InputObjectTypeDefinitionNode | graphqlLib.languageAstMod.InputValueDefinitionNode | graphqlLib.languageAstMod.NonNullTypeNode | graphqlLib.languageAstMod.InlineFragmentNode | graphqlLib.languageAstMod.InterfaceTypeDefinitionNode | graphqlLib.languageAstMod.ListTypeNode | graphqlLib.languageAstMod.InterfaceTypeExtensionNode | graphqlLib.languageAstMod.ListValueNode | graphqlLib.languageAstMod.SchemaDefinitionNode | graphqlLib.languageAstMod.ObjectTypeExtensionNode | graphqlLib.languageAstMod.DocumentNode
  ] = js.native
}

