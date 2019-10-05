package typings.graphql.graphqlMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.executionExecuteMod.ExecutionArgs
import typings.graphql.executionExecuteMod.ExecutionResult
import typings.graphql.jsutilsPromiseOrValueMod.PromiseOrValue
import typings.graphql.languageAstMod.DocumentNode
import typings.graphql.tsutilsMaybeMod.Maybe
import typings.graphql.typeDefinitionMod.GraphQLFieldResolver
import typings.graphql.typeDefinitionMod.GraphQLTypeResolver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql", "execute")
@js.native
object execute extends js.Object {
  def apply[TData](args: ExecutionArgs): PromiseOrValue[ExecutionResult[TData]] = js.native
  def apply[TData](
    schema: typings.graphql.typeSchemaMod.GraphQLSchema,
    document: DocumentNode,
    rootValue: js.UndefOr[js.Any],
    contextValue: js.UndefOr[js.Any],
    variableValues: js.UndefOr[Maybe[StringDictionary[_]]],
    operationName: js.UndefOr[Maybe[String]],
    fieldResolver: js.UndefOr[Maybe[GraphQLFieldResolver[_, _, StringDictionary[_]]]],
    typeResolver: js.UndefOr[Maybe[GraphQLTypeResolver[_, _, StringDictionary[_]]]]
  ): PromiseOrValue[ExecutionResult[TData]] = js.native
}

