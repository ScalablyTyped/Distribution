package typings.graphql.subscriptionSubscribeMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.executionExecuteMod.ExecutionResult
import typings.graphql.languageAstMod.DocumentNode
import typings.graphql.tsutilsMaybeMod.Maybe
import typings.graphql.typeDefinitionMod.GraphQLFieldResolver
import typings.graphql.typeSchemaMod.GraphQLSchema
import typings.std.AsyncIterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/subscription/subscribe", "subscribe")
@js.native
object subscribe extends js.Object {
  def apply[TData](args: SubscriptionArgs): js.Promise[AsyncIterableIterator[ExecutionResult[TData]] | ExecutionResult[TData]] = js.native
  def apply[TData](
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

