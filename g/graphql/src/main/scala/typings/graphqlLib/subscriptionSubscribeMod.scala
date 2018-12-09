package typings
package graphqlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/subscription/subscribe", JSImport.Namespace)
@js.native
object subscriptionSubscribeMod extends js.Object {
  def createSourceEventStream[TData](schema: graphqlLib.typeSchemaMod.GraphQLSchema, document: graphqlLib.languageAstMod.DocumentNode): js.Promise[stdLib.AsyncIterable[_] | graphqlLib.executionExecuteMod.ExecutionResult[TData]] = js.native
  def createSourceEventStream[TData](
    schema: graphqlLib.typeSchemaMod.GraphQLSchema,
    document: graphqlLib.languageAstMod.DocumentNode,
    rootValue: js.Any
  ): js.Promise[stdLib.AsyncIterable[_] | graphqlLib.executionExecuteMod.ExecutionResult[TData]] = js.native
  def createSourceEventStream[TData](
    schema: graphqlLib.typeSchemaMod.GraphQLSchema,
    document: graphqlLib.languageAstMod.DocumentNode,
    rootValue: js.Any,
    contextValue: js.Any
  ): js.Promise[stdLib.AsyncIterable[_] | graphqlLib.executionExecuteMod.ExecutionResult[TData]] = js.native
  def createSourceEventStream[TData](
    schema: graphqlLib.typeSchemaMod.GraphQLSchema,
    document: graphqlLib.languageAstMod.DocumentNode,
    rootValue: js.Any,
    contextValue: js.Any,
    variableValues: ScalablyTyped.runtime.StringDictionary[js.Any]
  ): js.Promise[stdLib.AsyncIterable[_] | graphqlLib.executionExecuteMod.ExecutionResult[TData]] = js.native
  def createSourceEventStream[TData](
    schema: graphqlLib.typeSchemaMod.GraphQLSchema,
    document: graphqlLib.languageAstMod.DocumentNode,
    rootValue: js.Any,
    contextValue: js.Any,
    variableValues: ScalablyTyped.runtime.StringDictionary[js.Any],
    operationName: graphqlLib.tsutilsMaybeMod.Maybe[java.lang.String]
  ): js.Promise[stdLib.AsyncIterable[_] | graphqlLib.executionExecuteMod.ExecutionResult[TData]] = js.native
  def createSourceEventStream[TData](
    schema: graphqlLib.typeSchemaMod.GraphQLSchema,
    document: graphqlLib.languageAstMod.DocumentNode,
    rootValue: js.Any,
    contextValue: js.Any,
    variableValues: ScalablyTyped.runtime.StringDictionary[js.Any],
    operationName: graphqlLib.tsutilsMaybeMod.Maybe[java.lang.String],
    fieldResolver: graphqlLib.tsutilsMaybeMod.Maybe[
      graphqlLib.typeDefinitionMod.GraphQLFieldResolver[_, _, ScalablyTyped.runtime.StringDictionary[_]]
    ]
  ): js.Promise[stdLib.AsyncIterable[_] | graphqlLib.executionExecuteMod.ExecutionResult[TData]] = js.native
  def subscribe[TData](args: graphqlLib.Anon_FieldResolver): js.Promise[
    stdLib.AsyncIterator[graphqlLib.executionExecuteMod.ExecutionResult[TData]] | graphqlLib.executionExecuteMod.ExecutionResult[TData]
  ] = js.native
  def subscribe[TData](
    schema: graphqlLib.typeSchemaMod.GraphQLSchema,
    document: graphqlLib.languageAstMod.DocumentNode,
    rootValue: js.UndefOr[js.Any],
    contextValue: js.UndefOr[js.Any],
    variableValues: js.UndefOr[graphqlLib.tsutilsMaybeMod.Maybe[ScalablyTyped.runtime.StringDictionary[_]]],
    operationName: js.UndefOr[graphqlLib.tsutilsMaybeMod.Maybe[java.lang.String]],
    fieldResolver: js.UndefOr[
      graphqlLib.tsutilsMaybeMod.Maybe[
        graphqlLib.typeDefinitionMod.GraphQLFieldResolver[_, _, ScalablyTyped.runtime.StringDictionary[_]]
      ]
    ],
    subscribeFieldResolver: js.UndefOr[
      graphqlLib.tsutilsMaybeMod.Maybe[
        graphqlLib.typeDefinitionMod.GraphQLFieldResolver[_, _, ScalablyTyped.runtime.StringDictionary[_]]
      ]
    ]
  ): js.Promise[
    stdLib.AsyncIterator[graphqlLib.executionExecuteMod.ExecutionResult[TData]] | graphqlLib.executionExecuteMod.ExecutionResult[TData]
  ] = js.native
}

