package typings.graphql

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.executionExecuteMod.ExecutionResult
import typings.graphql.languageAstMod.DocumentNode
import typings.graphql.tsutilsMaybeMod.Maybe
import typings.graphql.typeDefinitionMod.GraphQLFieldResolver
import typings.graphql.typeSchemaMod.GraphQLSchema
import typings.std.AsyncIterable
import typings.std.AsyncIterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/subscription/subscribe", JSImport.Namespace)
@js.native
object subscriptionSubscribeMod extends js.Object {
  def createSourceEventStream[TData](schema: GraphQLSchema, document: DocumentNode): js.Promise[AsyncIterable[_] | ExecutionResult[TData]] = js.native
  def createSourceEventStream[TData](schema: GraphQLSchema, document: DocumentNode, rootValue: js.Any): js.Promise[AsyncIterable[_] | ExecutionResult[TData]] = js.native
  def createSourceEventStream[TData](schema: GraphQLSchema, document: DocumentNode, rootValue: js.Any, contextValue: js.Any): js.Promise[AsyncIterable[_] | ExecutionResult[TData]] = js.native
  def createSourceEventStream[TData](
    schema: GraphQLSchema,
    document: DocumentNode,
    rootValue: js.Any,
    contextValue: js.Any,
    variableValues: StringDictionary[js.Any]
  ): js.Promise[AsyncIterable[_] | ExecutionResult[TData]] = js.native
  def createSourceEventStream[TData](
    schema: GraphQLSchema,
    document: DocumentNode,
    rootValue: js.Any,
    contextValue: js.Any,
    variableValues: StringDictionary[js.Any],
    operationName: Maybe[String]
  ): js.Promise[AsyncIterable[_] | ExecutionResult[TData]] = js.native
  def createSourceEventStream[TData](
    schema: GraphQLSchema,
    document: DocumentNode,
    rootValue: js.Any,
    contextValue: js.Any,
    variableValues: StringDictionary[js.Any],
    operationName: Maybe[String],
    fieldResolver: Maybe[GraphQLFieldResolver[_, _, StringDictionary[_]]]
  ): js.Promise[AsyncIterable[_] | ExecutionResult[TData]] = js.native
  def subscribe[TData](args: Anon_ArgName): js.Promise[AsyncIterableIterator[ExecutionResult[TData]] | ExecutionResult[TData]] = js.native
  def subscribe[TData](
    schema: GraphQLSchema,
    document: DocumentNode,
    rootValue: js.UndefOr[js.Any],
    contextValue: js.UndefOr[js.Any],
    variableValues: js.UndefOr[Maybe[StringDictionary[_]]],
    operationName: js.UndefOr[Maybe[String]],
    fieldResolver: js.UndefOr[Maybe[GraphQLFieldResolver[_, _, StringDictionary[_]]]],
    subscribeFieldResolver: js.UndefOr[Maybe[GraphQLFieldResolver[_, _, StringDictionary[_]]]]
  ): js.Promise[AsyncIterableIterator[ExecutionResult[TData]] | ExecutionResult[TData]] = js.native
}

