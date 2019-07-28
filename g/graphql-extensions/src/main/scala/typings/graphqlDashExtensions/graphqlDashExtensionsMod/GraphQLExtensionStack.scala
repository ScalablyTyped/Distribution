package typings.graphqlDashExtensions.graphqlDashExtensionsMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.graphqlMod.GraphQLError
import typings.graphql.typeDefinitionMod.GraphQLFieldResolver
import typings.graphql.typeDefinitionMod.GraphQLResolveInfo
import typings.graphqlDashExtensions.Anon_ContextExtensions
import typings.graphqlDashExtensions.Anon_ContextGraphqlResponse
import typings.graphqlDashExtensions.Anon_ExecutionArgs
import typings.graphqlDashExtensions.Anon_QueryString
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-extensions", "GraphQLExtensionStack")
@js.native
class GraphQLExtensionStack[TContext] protected () extends js.Object {
  def this(extensions: js.Array[GraphQLExtension[TContext]]) = this()
  var extensions: js.Any = js.native
  var fieldResolver: js.UndefOr[GraphQLFieldResolver[_, _, StringDictionary[_]]] = js.native
  var handleDidStart: js.Any = js.native
  def didEncounterErrors(errors: js.Array[GraphQLError]): Unit = js.native
  def executionDidStart(o: Anon_ExecutionArgs): EndHandler = js.native
  def format(): js.Object = js.native
  def parsingDidStart(o: Anon_QueryString): EndHandler = js.native
  def requestDidStart(o: Anon_ContextExtensions[TContext]): EndHandler = js.native
  def validationDidStart(): EndHandler = js.native
  def willResolveField(source: js.Any, args: StringDictionary[js.Any], context: TContext, info: GraphQLResolveInfo): js.Function2[/* error */ Error | Null, /* result */ js.UndefOr[js.Any], Unit] = js.native
  def willSendResponse(o: Anon_ContextGraphqlResponse[TContext]): Anon_ContextGraphqlResponse[TContext] = js.native
}

