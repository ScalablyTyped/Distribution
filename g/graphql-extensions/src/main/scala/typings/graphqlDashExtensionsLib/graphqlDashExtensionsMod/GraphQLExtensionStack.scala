package typings
package graphqlDashExtensionsLib.graphqlDashExtensionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-extensions", "GraphQLExtensionStack")
@js.native
class GraphQLExtensionStack[TContext] protected () extends js.Object {
  def this(extensions: js.Array[GraphQLExtension[TContext]]) = this()
  var extensions: js.Any = js.native
  var fieldResolver: js.UndefOr[
    graphqlLib.typeDefinitionMod.GraphQLFieldResolver[_, _, org.scalablytyped.runtime.StringDictionary[_]]
  ] = js.native
  var handleDidStart: js.Any = js.native
  def didEncounterErrors(errors: js.Array[graphqlLib.graphqlMod.GraphQLError]): scala.Unit = js.native
  def didResolveOperation(o: graphqlDashExtensionsLib.Anon_RequestContext[TContext]): scala.Unit = js.native
  def executionDidStart(o: graphqlDashExtensionsLib.Anon_ExecutionArgs): EndHandler = js.native
  def format(): js.Object = js.native
  def parsingDidStart(o: graphqlDashExtensionsLib.Anon_QueryString): EndHandler = js.native
  def requestDidStart(o: graphqlDashExtensionsLib.Anon_ContextExtensions[TContext]): EndHandler = js.native
  def validationDidStart(): EndHandler = js.native
  def willResolveField(
    source: js.Any,
    args: org.scalablytyped.runtime.StringDictionary[js.Any],
    context: TContext,
    info: graphqlLib.typeDefinitionMod.GraphQLResolveInfo
  ): js.Function2[/* error */ stdLib.Error | scala.Null, /* result */ js.UndefOr[js.Any], scala.Unit] = js.native
  def willSendResponse(o: graphqlDashExtensionsLib.Anon_ContextGraphqlResponse[TContext]): graphqlDashExtensionsLib.Anon_ContextGraphqlResponse[TContext] = js.native
}

