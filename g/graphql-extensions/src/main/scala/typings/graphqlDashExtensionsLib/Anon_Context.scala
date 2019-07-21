package typings
package graphqlDashExtensionsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Context[TContext] extends js.Object {
  var context: TContext
  var operationName: js.UndefOr[java.lang.String] = js.undefined
  var parsedQuery: js.UndefOr[graphqlLib.languageAstMod.DocumentNode] = js.undefined
  var persistedQueryHit: js.UndefOr[scala.Boolean] = js.undefined
  var persistedQueryRegister: js.UndefOr[scala.Boolean] = js.undefined
  var queryString: js.UndefOr[java.lang.String] = js.undefined
  var request: stdLib.Pick[
    apolloDashServerDashEnvLib.apolloDashServerDashEnvMod.Request, 
    graphqlDashExtensionsLib.graphqlDashExtensionsLibStrings.url | graphqlDashExtensionsLib.graphqlDashExtensionsLibStrings.method | graphqlDashExtensionsLib.graphqlDashExtensionsLibStrings.headers
  ]
  var requestContext: apolloDashServerDashTypesLib.apolloDashServerDashTypesMod.GraphQLRequestContext[TContext]
  var variables: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
}

object Anon_Context {
  @scala.inline
  def apply[TContext](
    context: TContext,
    request: stdLib.Pick[
      apolloDashServerDashEnvLib.apolloDashServerDashEnvMod.Request, 
      graphqlDashExtensionsLib.graphqlDashExtensionsLibStrings.url | graphqlDashExtensionsLib.graphqlDashExtensionsLibStrings.method | graphqlDashExtensionsLib.graphqlDashExtensionsLibStrings.headers
    ],
    requestContext: apolloDashServerDashTypesLib.apolloDashServerDashTypesMod.GraphQLRequestContext[TContext],
    operationName: java.lang.String = null,
    parsedQuery: graphqlLib.languageAstMod.DocumentNode = null,
    persistedQueryHit: js.UndefOr[scala.Boolean] = js.undefined,
    persistedQueryRegister: js.UndefOr[scala.Boolean] = js.undefined,
    queryString: java.lang.String = null,
    variables: org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): Anon_Context[TContext] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], request = request, requestContext = requestContext)
    if (operationName != null) __obj.updateDynamic("operationName")(operationName)
    if (parsedQuery != null) __obj.updateDynamic("parsedQuery")(parsedQuery)
    if (!js.isUndefined(persistedQueryHit)) __obj.updateDynamic("persistedQueryHit")(persistedQueryHit)
    if (!js.isUndefined(persistedQueryRegister)) __obj.updateDynamic("persistedQueryRegister")(persistedQueryRegister)
    if (queryString != null) __obj.updateDynamic("queryString")(queryString)
    if (variables != null) __obj.updateDynamic("variables")(variables)
    __obj.asInstanceOf[Anon_Context[TContext]]
  }
}

