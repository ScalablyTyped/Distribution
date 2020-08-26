package typings.graphql.mod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.astMod.DocumentNode
import typings.graphql.definitionMod.GraphQLFieldResolver
import typings.graphql.definitionMod.GraphQLTypeResolver
import typings.graphql.executeMod.ExecutionArgs
import typings.graphql.executeMod.ExecutionResult
import typings.graphql.maybeMod.Maybe
import typings.graphql.promiseOrValueMod.PromiseOrValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "execute")
@js.native
object execute extends js.Object {
  def apply(args: ExecutionArgs): PromiseOrValue[ExecutionResult[StringDictionary[_], StringDictionary[_]]] = js.native
  def apply(
    schema: typings.graphql.schemaMod.GraphQLSchema,
    document: DocumentNode,
    rootValue: js.UndefOr[js.Any],
    contextValue: js.UndefOr[js.Any],
    variableValues: js.UndefOr[Maybe[StringDictionary[_]]],
    operationName: js.UndefOr[Maybe[String]],
    fieldResolver: js.UndefOr[Maybe[GraphQLFieldResolver[_, _, StringDictionary[_]]]],
    typeResolver: js.UndefOr[Maybe[GraphQLTypeResolver[_, _]]]
  ): PromiseOrValue[ExecutionResult[StringDictionary[_], StringDictionary[_]]] = js.native
}

