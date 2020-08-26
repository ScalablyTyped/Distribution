package typings.graphqlCompose.mod.graphql

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.definitionMod.GraphQLFieldResolver
import typings.graphql.definitionMod.GraphQLTypeResolver
import typings.graphql.executeMod.ExecutionResult
import typings.graphql.graphqlMod.GraphQLArgs
import typings.graphql.maybeMod.Maybe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose", "graphql.graphql")
@js.native
object graphql extends js.Object {
  def apply(args: GraphQLArgs): js.Promise[ExecutionResult[StringDictionary[_], StringDictionary[_]]] = js.native
  def apply(
    schema: typings.graphql.schemaMod.GraphQLSchema,
    source: typings.graphql.sourceMod.Source | String,
    rootValue: js.UndefOr[js.Any],
    contextValue: js.UndefOr[js.Any],
    variableValues: js.UndefOr[Maybe[StringDictionary[_]]],
    operationName: js.UndefOr[Maybe[String]],
    fieldResolver: js.UndefOr[Maybe[GraphQLFieldResolver[_, _, StringDictionary[_]]]],
    typeResolver: js.UndefOr[Maybe[GraphQLTypeResolver[_, _]]]
  ): js.Promise[ExecutionResult[StringDictionary[_], StringDictionary[_]]] = js.native
}

