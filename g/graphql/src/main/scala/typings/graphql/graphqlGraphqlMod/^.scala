package typings.graphql.graphqlGraphqlMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.executionExecuteMod.ExecutionResult
import typings.graphql.languageSourceMod.Source
import typings.graphql.tsutilsMaybeMod.Maybe
import typings.graphql.typeDefinitionMod.GraphQLFieldResolver
import typings.graphql.typeDefinitionMod.GraphQLTypeResolver
import typings.graphql.typeSchemaMod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/graphql", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def graphql[TData](args: GraphQLArgs): js.Promise[ExecutionResult[TData]] = js.native
  def graphql[TData](
    schema: GraphQLSchema,
    source: String,
    rootValue: js.UndefOr[js.Any],
    contextValue: js.UndefOr[js.Any],
    variableValues: js.UndefOr[Maybe[StringDictionary[_]]],
    operationName: js.UndefOr[Maybe[String]],
    fieldResolver: js.UndefOr[Maybe[GraphQLFieldResolver[_, _, StringDictionary[_]]]],
    typeResolver: js.UndefOr[Maybe[GraphQLTypeResolver[_, _, StringDictionary[_]]]]
  ): js.Promise[ExecutionResult[TData]] = js.native
  def graphql[TData](
    schema: GraphQLSchema,
    source: Source,
    rootValue: js.UndefOr[js.Any],
    contextValue: js.UndefOr[js.Any],
    variableValues: js.UndefOr[Maybe[StringDictionary[_]]],
    operationName: js.UndefOr[Maybe[String]],
    fieldResolver: js.UndefOr[Maybe[GraphQLFieldResolver[_, _, StringDictionary[_]]]],
    typeResolver: js.UndefOr[Maybe[GraphQLTypeResolver[_, _, StringDictionary[_]]]]
  ): js.Promise[ExecutionResult[TData]] = js.native
  def graphqlSync[TData](args: GraphQLArgs): ExecutionResult[TData] = js.native
  def graphqlSync[TData](
    schema: GraphQLSchema,
    source: String,
    rootValue: js.UndefOr[js.Any],
    contextValue: js.UndefOr[js.Any],
    variableValues: js.UndefOr[Maybe[StringDictionary[_]]],
    operationName: js.UndefOr[Maybe[String]],
    fieldResolver: js.UndefOr[Maybe[GraphQLFieldResolver[_, _, StringDictionary[_]]]],
    typeResolver: js.UndefOr[Maybe[GraphQLTypeResolver[_, _, StringDictionary[_]]]]
  ): ExecutionResult[TData] = js.native
  def graphqlSync[TData](
    schema: GraphQLSchema,
    source: Source,
    rootValue: js.UndefOr[js.Any],
    contextValue: js.UndefOr[js.Any],
    variableValues: js.UndefOr[Maybe[StringDictionary[_]]],
    operationName: js.UndefOr[Maybe[String]],
    fieldResolver: js.UndefOr[Maybe[GraphQLFieldResolver[_, _, StringDictionary[_]]]],
    typeResolver: js.UndefOr[Maybe[GraphQLTypeResolver[_, _, StringDictionary[_]]]]
  ): ExecutionResult[TData] = js.native
}

