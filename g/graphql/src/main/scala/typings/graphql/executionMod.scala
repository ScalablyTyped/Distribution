package typings.graphql

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.executionExecuteMod.ExecutionArgs
import typings.graphql.executionExecuteMod.ExecutionResult
import typings.graphql.jsutilsPromiseOrValueMod.PromiseOrValue
import typings.graphql.languageAstMod.DocumentNode
import typings.graphql.tsutilsMaybeMod.Maybe
import typings.graphql.typeDefinitionMod.GraphQLFieldResolver
import typings.graphql.typeDefinitionMod.ResponsePath
import typings.graphql.typeDirectivesMod.GraphQLDirective
import typings.graphql.typeSchemaMod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/execution", JSImport.Namespace)
@js.native
object executionMod extends js.Object {
  val defaultFieldResolver: GraphQLFieldResolver[js.Any, js.Any, StringDictionary[js.Any]] = js.native
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
  def getDirectiveValues(directiveDef: GraphQLDirective, node: Anon_Directives): js.UndefOr[StringDictionary[js.Any]] = js.native
  def getDirectiveValues(directiveDef: GraphQLDirective, node: Anon_Directives, variableValues: Maybe[StringDictionary[_]]): js.UndefOr[StringDictionary[js.Any]] = js.native
  def responsePathAsArray(path: ResponsePath): js.Array[String | Double] = js.native
}

