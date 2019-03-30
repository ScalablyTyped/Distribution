package typings
package graphqlLib.executionExecuteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/execution/execute", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val defaultFieldResolver: graphqlLib.typeDefinitionMod.GraphQLFieldResolver[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]] = js.native
  def addPath(prev: graphqlLib.typeDefinitionMod.ResponsePath, key: java.lang.String): graphqlLib.Anon_Key = js.native
  def addPath(prev: graphqlLib.typeDefinitionMod.ResponsePath, key: scala.Double): graphqlLib.Anon_Key = js.native
  def addPath(prev: js.UndefOr[scala.Nothing], key: java.lang.String): graphqlLib.Anon_Key = js.native
  def addPath(prev: js.UndefOr[scala.Nothing], key: scala.Double): graphqlLib.Anon_Key = js.native
  def assertValidExecutionArguments(
    schema: graphqlLib.typeSchemaMod.GraphQLSchema,
    document: graphqlLib.languageAstMod.DocumentNode,
    rawVariableValues: graphqlLib.tsutilsMaybeMod.Maybe[org.scalablytyped.runtime.StringDictionary[_]]
  ): scala.Unit = js.native
  def buildExecutionContext(
    schema: graphqlLib.typeSchemaMod.GraphQLSchema,
    document: graphqlLib.languageAstMod.DocumentNode,
    rootValue: js.Any,
    contextValue: js.Any,
    rawVariableValues: graphqlLib.tsutilsMaybeMod.Maybe[org.scalablytyped.runtime.StringDictionary[_]],
    operationName: graphqlLib.tsutilsMaybeMod.Maybe[java.lang.String],
    fieldResolver: graphqlLib.tsutilsMaybeMod.Maybe[
      graphqlLib.typeDefinitionMod.GraphQLFieldResolver[_, _, org.scalablytyped.runtime.StringDictionary[_]]
    ]
  ): js.Array[graphqlLib.errorMod.GraphQLError] | ExecutionContext = js.native
  def buildResolveInfo(
    exeContext: ExecutionContext,
    fieldDef: graphqlLib.typeDefinitionMod.GraphQLField[_, _, org.scalablytyped.runtime.StringDictionary[_]],
    fieldNodes: js.Array[graphqlLib.languageAstMod.FieldNode],
    parentType: graphqlLib.typeDefinitionMod.GraphQLObjectType[_, _, org.scalablytyped.runtime.StringDictionary[_]],
    path: graphqlLib.typeDefinitionMod.ResponsePath
  ): graphqlLib.typeDefinitionMod.GraphQLResolveInfo = js.native
  def collectFields(
    exeContext: ExecutionContext,
    runtimeType: graphqlLib.typeDefinitionMod.GraphQLObjectType[_, _, org.scalablytyped.runtime.StringDictionary[_]],
    selectionSet: graphqlLib.languageAstMod.SelectionSetNode,
    fields: org.scalablytyped.runtime.StringDictionary[js.Array[graphqlLib.languageAstMod.FieldNode]],
    visitedFragmentNames: org.scalablytyped.runtime.StringDictionary[scala.Boolean]
  ): org.scalablytyped.runtime.StringDictionary[js.Array[graphqlLib.languageAstMod.FieldNode]] = js.native
  def execute[TData](args: ExecutionArgs): graphqlLib.jsutilsPromiseOrValueMod.PromiseOrValue[ExecutionResult[TData]] = js.native
  def execute[TData](schema: graphqlLib.typeSchemaMod.GraphQLSchema, document: graphqlLib.languageAstMod.DocumentNode): graphqlLib.jsutilsPromiseOrValueMod.PromiseOrValue[ExecutionResult[TData]] = js.native
  def execute[TData](
    schema: graphqlLib.typeSchemaMod.GraphQLSchema,
    document: graphqlLib.languageAstMod.DocumentNode,
    rootValue: js.Any
  ): graphqlLib.jsutilsPromiseOrValueMod.PromiseOrValue[ExecutionResult[TData]] = js.native
  def execute[TData](
    schema: graphqlLib.typeSchemaMod.GraphQLSchema,
    document: graphqlLib.languageAstMod.DocumentNode,
    rootValue: js.Any,
    contextValue: js.Any
  ): graphqlLib.jsutilsPromiseOrValueMod.PromiseOrValue[ExecutionResult[TData]] = js.native
  def execute[TData](
    schema: graphqlLib.typeSchemaMod.GraphQLSchema,
    document: graphqlLib.languageAstMod.DocumentNode,
    rootValue: js.Any,
    contextValue: js.Any,
    variableValues: graphqlLib.tsutilsMaybeMod.Maybe[org.scalablytyped.runtime.StringDictionary[_]]
  ): graphqlLib.jsutilsPromiseOrValueMod.PromiseOrValue[ExecutionResult[TData]] = js.native
  def execute[TData](
    schema: graphqlLib.typeSchemaMod.GraphQLSchema,
    document: graphqlLib.languageAstMod.DocumentNode,
    rootValue: js.Any,
    contextValue: js.Any,
    variableValues: graphqlLib.tsutilsMaybeMod.Maybe[org.scalablytyped.runtime.StringDictionary[_]],
    operationName: graphqlLib.tsutilsMaybeMod.Maybe[java.lang.String]
  ): graphqlLib.jsutilsPromiseOrValueMod.PromiseOrValue[ExecutionResult[TData]] = js.native
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
  ): graphqlLib.jsutilsPromiseOrValueMod.PromiseOrValue[ExecutionResult[TData]] = js.native
  def getFieldDef(
    schema: graphqlLib.typeSchemaMod.GraphQLSchema,
    parentType: graphqlLib.typeDefinitionMod.GraphQLObjectType[_, _, org.scalablytyped.runtime.StringDictionary[_]],
    fieldName: java.lang.String
  ): graphqlLib.tsutilsMaybeMod.Maybe[
    graphqlLib.typeDefinitionMod.GraphQLField[_, _, org.scalablytyped.runtime.StringDictionary[_]]
  ] = js.native
  def resolveFieldValueOrError[TSource](
    exeContext: ExecutionContext,
    fieldDef: graphqlLib.typeDefinitionMod.GraphQLField[TSource, _, org.scalablytyped.runtime.StringDictionary[_]],
    fieldNodes: js.Array[graphqlLib.languageAstMod.FieldNode],
    resolveFn: graphqlLib.typeDefinitionMod.GraphQLFieldResolver[TSource, _, org.scalablytyped.runtime.StringDictionary[_]],
    source: TSource,
    info: graphqlLib.typeDefinitionMod.GraphQLResolveInfo
  ): stdLib.Error | js.Any = js.native
  def responsePathAsArray(path: graphqlLib.typeDefinitionMod.ResponsePath): js.Array[java.lang.String | scala.Double] = js.native
}

