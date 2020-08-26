package typings.graphql.mod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.astMod.DocumentNode
import typings.graphql.definitionMod.GraphQLFieldResolver
import typings.graphql.executeMod.ExecutionResult
import typings.graphql.maybeMod.Maybe
import typings.graphql.subscribeMod.SubscriptionArgs
import typings.std.AsyncIterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "subscribe")
@js.native
object subscribe extends js.Object {
  def apply(args: SubscriptionArgs): js.Promise[
    (AsyncIterableIterator[ExecutionResult[StringDictionary[_], StringDictionary[_]]]) | (ExecutionResult[StringDictionary[_], StringDictionary[_]])
  ] = js.native
  def apply(
    schema: typings.graphql.schemaMod.GraphQLSchema,
    document: DocumentNode,
    rootValue: js.UndefOr[js.Any],
    contextValue: js.UndefOr[js.Any],
    variableValues: js.UndefOr[Maybe[StringDictionary[_]]],
    operationName: js.UndefOr[Maybe[String]],
    fieldResolver: js.UndefOr[Maybe[GraphQLFieldResolver[_, _, StringDictionary[_]]]],
    subscribeFieldResolver: js.UndefOr[Maybe[GraphQLFieldResolver[_, _, StringDictionary[_]]]]
  ): js.Promise[
    (AsyncIterableIterator[ExecutionResult[StringDictionary[_], StringDictionary[_]]]) | (ExecutionResult[StringDictionary[_], StringDictionary[_]])
  ] = js.native
}

