package typings.graphql

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.anon.Directives
import typings.graphql.astMod.DocumentNode
import typings.graphql.definitionMod.GraphQLFieldResolver
import typings.graphql.definitionMod.GraphQLTypeResolver
import typings.graphql.directivesMod.GraphQLDirective
import typings.graphql.executeMod.ExecutionArgs
import typings.graphql.executeMod.ExecutionResult
import typings.graphql.maybeMod.Maybe
import typings.graphql.pathMod.Path
import typings.graphql.promiseOrValueMod.PromiseOrValue
import typings.graphql.schemaMod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/execution", JSImport.Namespace)
@js.native
object executionMod extends js.Object {
  val defaultFieldResolver: GraphQLFieldResolver[js.Any, js.Any, StringDictionary[js.Any]] = js.native
  val defaultTypeResolver: GraphQLTypeResolver[js.Any, js.Any] = js.native
  def execute(args: ExecutionArgs): PromiseOrValue[ExecutionResult[StringDictionary[_], StringDictionary[_]]] = js.native
  def execute(
    schema: GraphQLSchema,
    document: DocumentNode,
    rootValue: js.UndefOr[js.Any],
    contextValue: js.UndefOr[js.Any],
    variableValues: js.UndefOr[Maybe[StringDictionary[_]]],
    operationName: js.UndefOr[Maybe[String]],
    fieldResolver: js.UndefOr[Maybe[GraphQLFieldResolver[_, _, StringDictionary[_]]]],
    typeResolver: js.UndefOr[Maybe[GraphQLTypeResolver[_, _]]]
  ): PromiseOrValue[ExecutionResult[StringDictionary[_], StringDictionary[_]]] = js.native
  def executeSync(args: ExecutionArgs): ExecutionResult[StringDictionary[_], StringDictionary[_]] = js.native
  def getDirectiveValues(directiveDef: GraphQLDirective, node: Directives): js.UndefOr[StringDictionary[js.Any]] = js.native
  def getDirectiveValues(directiveDef: GraphQLDirective, node: Directives, variableValues: Maybe[StringDictionary[_]]): js.UndefOr[StringDictionary[js.Any]] = js.native
  def responsePathAsArray(path: Path): js.Array[String | Double] = js.native
}

