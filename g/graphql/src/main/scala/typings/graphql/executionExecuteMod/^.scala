package typings.graphql.executionExecuteMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.Anon_Key
import typings.graphql.errorMod.GraphQLError
import typings.graphql.jsutilsPromiseOrValueMod.PromiseOrValue
import typings.graphql.languageAstMod.DocumentNode
import typings.graphql.languageAstMod.FieldNode
import typings.graphql.languageAstMod.SelectionSetNode
import typings.graphql.tsutilsMaybeMod.Maybe
import typings.graphql.typeDefinitionMod.GraphQLField
import typings.graphql.typeDefinitionMod.GraphQLFieldResolver
import typings.graphql.typeDefinitionMod.GraphQLObjectType
import typings.graphql.typeDefinitionMod.GraphQLResolveInfo
import typings.graphql.typeDefinitionMod.ResponsePath
import typings.graphql.typeSchemaMod.GraphQLSchema
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/execution/execute", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val defaultFieldResolver: GraphQLFieldResolver[js.Any, js.Any, StringDictionary[js.Any]] = js.native
  def addPath(prev: js.UndefOr[scala.Nothing], key: String): Anon_Key = js.native
  def addPath(prev: js.UndefOr[scala.Nothing], key: Double): Anon_Key = js.native
  def addPath(prev: ResponsePath, key: String): Anon_Key = js.native
  def addPath(prev: ResponsePath, key: Double): Anon_Key = js.native
  def assertValidExecutionArguments(schema: GraphQLSchema, document: DocumentNode, rawVariableValues: Maybe[StringDictionary[_]]): Unit = js.native
  def buildExecutionContext(
    schema: GraphQLSchema,
    document: DocumentNode,
    rootValue: js.Any,
    contextValue: js.Any,
    rawVariableValues: Maybe[StringDictionary[_]],
    operationName: Maybe[String],
    fieldResolver: Maybe[GraphQLFieldResolver[_, _, StringDictionary[_]]]
  ): js.Array[GraphQLError] | ExecutionContext = js.native
  def buildResolveInfo(
    exeContext: ExecutionContext,
    fieldDef: GraphQLField[_, _, StringDictionary[_]],
    fieldNodes: js.Array[FieldNode],
    parentType: GraphQLObjectType[_, _, StringDictionary[_]],
    path: ResponsePath
  ): GraphQLResolveInfo = js.native
  def collectFields(
    exeContext: ExecutionContext,
    runtimeType: GraphQLObjectType[_, _, StringDictionary[_]],
    selectionSet: SelectionSetNode,
    fields: StringDictionary[js.Array[FieldNode]],
    visitedFragmentNames: StringDictionary[Boolean]
  ): StringDictionary[js.Array[FieldNode]] = js.native
  def execute[TData](args: ExecutionArgs): PromiseOrValue[ExecutionResult[TData]] = js.native
  def execute[TData](schema: GraphQLSchema, document: DocumentNode): PromiseOrValue[ExecutionResult[TData]] = js.native
  def execute[TData](schema: GraphQLSchema, document: DocumentNode, rootValue: js.Any): PromiseOrValue[ExecutionResult[TData]] = js.native
  def execute[TData](schema: GraphQLSchema, document: DocumentNode, rootValue: js.Any, contextValue: js.Any): PromiseOrValue[ExecutionResult[TData]] = js.native
  def execute[TData](
    schema: GraphQLSchema,
    document: DocumentNode,
    rootValue: js.Any,
    contextValue: js.Any,
    variableValues: Maybe[StringDictionary[_]]
  ): PromiseOrValue[ExecutionResult[TData]] = js.native
  def execute[TData](
    schema: GraphQLSchema,
    document: DocumentNode,
    rootValue: js.Any,
    contextValue: js.Any,
    variableValues: Maybe[StringDictionary[_]],
    operationName: Maybe[String]
  ): PromiseOrValue[ExecutionResult[TData]] = js.native
  def execute[TData](
    schema: GraphQLSchema,
    document: DocumentNode,
    rootValue: js.Any,
    contextValue: js.Any,
    variableValues: Maybe[StringDictionary[_]],
    operationName: Maybe[String],
    fieldResolver: Maybe[GraphQLFieldResolver[_, _, StringDictionary[_]]]
  ): PromiseOrValue[ExecutionResult[TData]] = js.native
  def getFieldDef(schema: GraphQLSchema, parentType: GraphQLObjectType[_, _, StringDictionary[_]], fieldName: String): Maybe[GraphQLField[_, _, StringDictionary[_]]] = js.native
  def resolveFieldValueOrError[TSource](
    exeContext: ExecutionContext,
    fieldDef: GraphQLField[TSource, _, StringDictionary[_]],
    fieldNodes: js.Array[FieldNode],
    resolveFn: GraphQLFieldResolver[TSource, _, StringDictionary[_]],
    source: TSource,
    info: GraphQLResolveInfo
  ): Error | js.Any = js.native
  def responsePathAsArray(path: ResponsePath): js.Array[String | Double] = js.native
}

