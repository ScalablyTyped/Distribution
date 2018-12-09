package typings
package graphqlLib.graphqlGraphqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/graphql", JSImport.Namespace)
@js.native
object graphqlGraphqlModMembers extends js.Object {
  def graphql[TData](args: GraphQLArgs): js.Promise[graphqlLib.executionExecuteMod.ExecutionResult[TData]] = js.native
  def graphql[TData](schema: graphqlLib.typeSchemaMod.GraphQLSchema, source: graphqlLib.languageSourceMod.Source): js.Promise[graphqlLib.executionExecuteMod.ExecutionResult[TData]] = js.native
  def graphql[TData](
    schema: graphqlLib.typeSchemaMod.GraphQLSchema,
    source: graphqlLib.languageSourceMod.Source,
    rootValue: js.Any
  ): js.Promise[graphqlLib.executionExecuteMod.ExecutionResult[TData]] = js.native
  def graphql[TData](
    schema: graphqlLib.typeSchemaMod.GraphQLSchema,
    source: graphqlLib.languageSourceMod.Source,
    rootValue: js.Any,
    contextValue: js.Any
  ): js.Promise[graphqlLib.executionExecuteMod.ExecutionResult[TData]] = js.native
  def graphql[TData](
    schema: graphqlLib.typeSchemaMod.GraphQLSchema,
    source: graphqlLib.languageSourceMod.Source,
    rootValue: js.Any,
    contextValue: js.Any,
    variableValues: graphqlLib.tsutilsMaybeMod.Maybe[ScalablyTyped.runtime.StringDictionary[_]]
  ): js.Promise[graphqlLib.executionExecuteMod.ExecutionResult[TData]] = js.native
  def graphql[TData](
    schema: graphqlLib.typeSchemaMod.GraphQLSchema,
    source: graphqlLib.languageSourceMod.Source,
    rootValue: js.Any,
    contextValue: js.Any,
    variableValues: graphqlLib.tsutilsMaybeMod.Maybe[ScalablyTyped.runtime.StringDictionary[_]],
    operationName: graphqlLib.tsutilsMaybeMod.Maybe[java.lang.String]
  ): js.Promise[graphqlLib.executionExecuteMod.ExecutionResult[TData]] = js.native
  def graphql[TData](
    schema: graphqlLib.typeSchemaMod.GraphQLSchema,
    source: graphqlLib.languageSourceMod.Source,
    rootValue: js.Any,
    contextValue: js.Any,
    variableValues: graphqlLib.tsutilsMaybeMod.Maybe[ScalablyTyped.runtime.StringDictionary[_]],
    operationName: graphqlLib.tsutilsMaybeMod.Maybe[java.lang.String],
    fieldResolver: graphqlLib.tsutilsMaybeMod.Maybe[
      graphqlLib.typeDefinitionMod.GraphQLFieldResolver[_, _, ScalablyTyped.runtime.StringDictionary[_]]
    ]
  ): js.Promise[graphqlLib.executionExecuteMod.ExecutionResult[TData]] = js.native
  def graphql[TData](schema: graphqlLib.typeSchemaMod.GraphQLSchema, source: java.lang.String): js.Promise[graphqlLib.executionExecuteMod.ExecutionResult[TData]] = js.native
  def graphql[TData](schema: graphqlLib.typeSchemaMod.GraphQLSchema, source: java.lang.String, rootValue: js.Any): js.Promise[graphqlLib.executionExecuteMod.ExecutionResult[TData]] = js.native
  def graphql[TData](
    schema: graphqlLib.typeSchemaMod.GraphQLSchema,
    source: java.lang.String,
    rootValue: js.Any,
    contextValue: js.Any
  ): js.Promise[graphqlLib.executionExecuteMod.ExecutionResult[TData]] = js.native
  def graphql[TData](
    schema: graphqlLib.typeSchemaMod.GraphQLSchema,
    source: java.lang.String,
    rootValue: js.Any,
    contextValue: js.Any,
    variableValues: graphqlLib.tsutilsMaybeMod.Maybe[ScalablyTyped.runtime.StringDictionary[_]]
  ): js.Promise[graphqlLib.executionExecuteMod.ExecutionResult[TData]] = js.native
  def graphql[TData](
    schema: graphqlLib.typeSchemaMod.GraphQLSchema,
    source: java.lang.String,
    rootValue: js.Any,
    contextValue: js.Any,
    variableValues: graphqlLib.tsutilsMaybeMod.Maybe[ScalablyTyped.runtime.StringDictionary[_]],
    operationName: graphqlLib.tsutilsMaybeMod.Maybe[java.lang.String]
  ): js.Promise[graphqlLib.executionExecuteMod.ExecutionResult[TData]] = js.native
  def graphql[TData](
    schema: graphqlLib.typeSchemaMod.GraphQLSchema,
    source: java.lang.String,
    rootValue: js.Any,
    contextValue: js.Any,
    variableValues: graphqlLib.tsutilsMaybeMod.Maybe[ScalablyTyped.runtime.StringDictionary[_]],
    operationName: graphqlLib.tsutilsMaybeMod.Maybe[java.lang.String],
    fieldResolver: graphqlLib.tsutilsMaybeMod.Maybe[
      graphqlLib.typeDefinitionMod.GraphQLFieldResolver[_, _, ScalablyTyped.runtime.StringDictionary[_]]
    ]
  ): js.Promise[graphqlLib.executionExecuteMod.ExecutionResult[TData]] = js.native
  def graphqlSync[TData](args: GraphQLArgs): graphqlLib.executionExecuteMod.ExecutionResult[TData] = js.native
  def graphqlSync[TData](schema: graphqlLib.typeSchemaMod.GraphQLSchema, source: graphqlLib.languageSourceMod.Source): graphqlLib.executionExecuteMod.ExecutionResult[TData] = js.native
  def graphqlSync[TData](
    schema: graphqlLib.typeSchemaMod.GraphQLSchema,
    source: graphqlLib.languageSourceMod.Source,
    rootValue: js.Any
  ): graphqlLib.executionExecuteMod.ExecutionResult[TData] = js.native
  def graphqlSync[TData](
    schema: graphqlLib.typeSchemaMod.GraphQLSchema,
    source: graphqlLib.languageSourceMod.Source,
    rootValue: js.Any,
    contextValue: js.Any
  ): graphqlLib.executionExecuteMod.ExecutionResult[TData] = js.native
  def graphqlSync[TData](
    schema: graphqlLib.typeSchemaMod.GraphQLSchema,
    source: graphqlLib.languageSourceMod.Source,
    rootValue: js.Any,
    contextValue: js.Any,
    variableValues: graphqlLib.tsutilsMaybeMod.Maybe[ScalablyTyped.runtime.StringDictionary[_]]
  ): graphqlLib.executionExecuteMod.ExecutionResult[TData] = js.native
  def graphqlSync[TData](
    schema: graphqlLib.typeSchemaMod.GraphQLSchema,
    source: graphqlLib.languageSourceMod.Source,
    rootValue: js.Any,
    contextValue: js.Any,
    variableValues: graphqlLib.tsutilsMaybeMod.Maybe[ScalablyTyped.runtime.StringDictionary[_]],
    operationName: graphqlLib.tsutilsMaybeMod.Maybe[java.lang.String]
  ): graphqlLib.executionExecuteMod.ExecutionResult[TData] = js.native
  def graphqlSync[TData](
    schema: graphqlLib.typeSchemaMod.GraphQLSchema,
    source: graphqlLib.languageSourceMod.Source,
    rootValue: js.Any,
    contextValue: js.Any,
    variableValues: graphqlLib.tsutilsMaybeMod.Maybe[ScalablyTyped.runtime.StringDictionary[_]],
    operationName: graphqlLib.tsutilsMaybeMod.Maybe[java.lang.String],
    fieldResolver: graphqlLib.tsutilsMaybeMod.Maybe[
      graphqlLib.typeDefinitionMod.GraphQLFieldResolver[_, _, ScalablyTyped.runtime.StringDictionary[_]]
    ]
  ): graphqlLib.executionExecuteMod.ExecutionResult[TData] = js.native
  def graphqlSync[TData](schema: graphqlLib.typeSchemaMod.GraphQLSchema, source: java.lang.String): graphqlLib.executionExecuteMod.ExecutionResult[TData] = js.native
  def graphqlSync[TData](schema: graphqlLib.typeSchemaMod.GraphQLSchema, source: java.lang.String, rootValue: js.Any): graphqlLib.executionExecuteMod.ExecutionResult[TData] = js.native
  def graphqlSync[TData](
    schema: graphqlLib.typeSchemaMod.GraphQLSchema,
    source: java.lang.String,
    rootValue: js.Any,
    contextValue: js.Any
  ): graphqlLib.executionExecuteMod.ExecutionResult[TData] = js.native
  def graphqlSync[TData](
    schema: graphqlLib.typeSchemaMod.GraphQLSchema,
    source: java.lang.String,
    rootValue: js.Any,
    contextValue: js.Any,
    variableValues: graphqlLib.tsutilsMaybeMod.Maybe[ScalablyTyped.runtime.StringDictionary[_]]
  ): graphqlLib.executionExecuteMod.ExecutionResult[TData] = js.native
  def graphqlSync[TData](
    schema: graphqlLib.typeSchemaMod.GraphQLSchema,
    source: java.lang.String,
    rootValue: js.Any,
    contextValue: js.Any,
    variableValues: graphqlLib.tsutilsMaybeMod.Maybe[ScalablyTyped.runtime.StringDictionary[_]],
    operationName: graphqlLib.tsutilsMaybeMod.Maybe[java.lang.String]
  ): graphqlLib.executionExecuteMod.ExecutionResult[TData] = js.native
  def graphqlSync[TData](
    schema: graphqlLib.typeSchemaMod.GraphQLSchema,
    source: java.lang.String,
    rootValue: js.Any,
    contextValue: js.Any,
    variableValues: graphqlLib.tsutilsMaybeMod.Maybe[ScalablyTyped.runtime.StringDictionary[_]],
    operationName: graphqlLib.tsutilsMaybeMod.Maybe[java.lang.String],
    fieldResolver: graphqlLib.tsutilsMaybeMod.Maybe[
      graphqlLib.typeDefinitionMod.GraphQLFieldResolver[_, _, ScalablyTyped.runtime.StringDictionary[_]]
    ]
  ): graphqlLib.executionExecuteMod.ExecutionResult[TData] = js.native
}

