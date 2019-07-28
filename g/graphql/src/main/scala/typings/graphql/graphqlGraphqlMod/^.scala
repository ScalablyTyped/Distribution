package typings.graphql.graphqlGraphqlMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.executionExecuteMod.ExecutionResult
import typings.graphql.languageSourceMod.Source
import typings.graphql.tsutilsMaybeMod.Maybe
import typings.graphql.typeDefinitionMod.GraphQLFieldResolver
import typings.graphql.typeSchemaMod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/graphql", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def graphql[TData](args: GraphQLArgs): js.Promise[ExecutionResult[TData]] = js.native
  def graphql[TData](schema: GraphQLSchema, source: String): js.Promise[ExecutionResult[TData]] = js.native
  def graphql[TData](schema: GraphQLSchema, source: String, rootValue: js.Any): js.Promise[ExecutionResult[TData]] = js.native
  def graphql[TData](schema: GraphQLSchema, source: String, rootValue: js.Any, contextValue: js.Any): js.Promise[ExecutionResult[TData]] = js.native
  def graphql[TData](
    schema: GraphQLSchema,
    source: String,
    rootValue: js.Any,
    contextValue: js.Any,
    variableValues: Maybe[StringDictionary[_]]
  ): js.Promise[ExecutionResult[TData]] = js.native
  def graphql[TData](
    schema: GraphQLSchema,
    source: String,
    rootValue: js.Any,
    contextValue: js.Any,
    variableValues: Maybe[StringDictionary[_]],
    operationName: Maybe[String]
  ): js.Promise[ExecutionResult[TData]] = js.native
  def graphql[TData](
    schema: GraphQLSchema,
    source: String,
    rootValue: js.Any,
    contextValue: js.Any,
    variableValues: Maybe[StringDictionary[_]],
    operationName: Maybe[String],
    fieldResolver: Maybe[GraphQLFieldResolver[_, _, StringDictionary[_]]]
  ): js.Promise[ExecutionResult[TData]] = js.native
  def graphql[TData](schema: GraphQLSchema, source: Source): js.Promise[ExecutionResult[TData]] = js.native
  def graphql[TData](schema: GraphQLSchema, source: Source, rootValue: js.Any): js.Promise[ExecutionResult[TData]] = js.native
  def graphql[TData](schema: GraphQLSchema, source: Source, rootValue: js.Any, contextValue: js.Any): js.Promise[ExecutionResult[TData]] = js.native
  def graphql[TData](
    schema: GraphQLSchema,
    source: Source,
    rootValue: js.Any,
    contextValue: js.Any,
    variableValues: Maybe[StringDictionary[_]]
  ): js.Promise[ExecutionResult[TData]] = js.native
  def graphql[TData](
    schema: GraphQLSchema,
    source: Source,
    rootValue: js.Any,
    contextValue: js.Any,
    variableValues: Maybe[StringDictionary[_]],
    operationName: Maybe[String]
  ): js.Promise[ExecutionResult[TData]] = js.native
  def graphql[TData](
    schema: GraphQLSchema,
    source: Source,
    rootValue: js.Any,
    contextValue: js.Any,
    variableValues: Maybe[StringDictionary[_]],
    operationName: Maybe[String],
    fieldResolver: Maybe[GraphQLFieldResolver[_, _, StringDictionary[_]]]
  ): js.Promise[ExecutionResult[TData]] = js.native
  def graphqlSync[TData](args: GraphQLArgs): ExecutionResult[TData] = js.native
  def graphqlSync[TData](schema: GraphQLSchema, source: String): ExecutionResult[TData] = js.native
  def graphqlSync[TData](schema: GraphQLSchema, source: String, rootValue: js.Any): ExecutionResult[TData] = js.native
  def graphqlSync[TData](schema: GraphQLSchema, source: String, rootValue: js.Any, contextValue: js.Any): ExecutionResult[TData] = js.native
  def graphqlSync[TData](
    schema: GraphQLSchema,
    source: String,
    rootValue: js.Any,
    contextValue: js.Any,
    variableValues: Maybe[StringDictionary[_]]
  ): ExecutionResult[TData] = js.native
  def graphqlSync[TData](
    schema: GraphQLSchema,
    source: String,
    rootValue: js.Any,
    contextValue: js.Any,
    variableValues: Maybe[StringDictionary[_]],
    operationName: Maybe[String]
  ): ExecutionResult[TData] = js.native
  def graphqlSync[TData](
    schema: GraphQLSchema,
    source: String,
    rootValue: js.Any,
    contextValue: js.Any,
    variableValues: Maybe[StringDictionary[_]],
    operationName: Maybe[String],
    fieldResolver: Maybe[GraphQLFieldResolver[_, _, StringDictionary[_]]]
  ): ExecutionResult[TData] = js.native
  def graphqlSync[TData](schema: GraphQLSchema, source: Source): ExecutionResult[TData] = js.native
  def graphqlSync[TData](schema: GraphQLSchema, source: Source, rootValue: js.Any): ExecutionResult[TData] = js.native
  def graphqlSync[TData](schema: GraphQLSchema, source: Source, rootValue: js.Any, contextValue: js.Any): ExecutionResult[TData] = js.native
  def graphqlSync[TData](
    schema: GraphQLSchema,
    source: Source,
    rootValue: js.Any,
    contextValue: js.Any,
    variableValues: Maybe[StringDictionary[_]]
  ): ExecutionResult[TData] = js.native
  def graphqlSync[TData](
    schema: GraphQLSchema,
    source: Source,
    rootValue: js.Any,
    contextValue: js.Any,
    variableValues: Maybe[StringDictionary[_]],
    operationName: Maybe[String]
  ): ExecutionResult[TData] = js.native
  def graphqlSync[TData](
    schema: GraphQLSchema,
    source: Source,
    rootValue: js.Any,
    contextValue: js.Any,
    variableValues: Maybe[StringDictionary[_]],
    operationName: Maybe[String],
    fieldResolver: Maybe[GraphQLFieldResolver[_, _, StringDictionary[_]]]
  ): ExecutionResult[TData] = js.native
}

