package typings
package graphqlDashExtensionsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContextExtensions[TContext] extends js.Object {
  var context: TContext
  var extensions: js.UndefOr[stdLib.Record[java.lang.String, _]] = js.undefined
  var operationName: js.UndefOr[java.lang.String] = js.undefined
  var parsedQuery: js.UndefOr[graphqlLib.languageAstMod.DocumentNode] = js.undefined
  var persistedQueryHit: js.UndefOr[scala.Boolean] = js.undefined
  var persistedQueryRegister: js.UndefOr[scala.Boolean] = js.undefined
  var queryString: js.UndefOr[java.lang.String] = js.undefined
  var request: stdLib.Pick[
    apolloDashServerDashEnvLib.apolloDashServerDashEnvMod.Request, 
    graphqlDashExtensionsLib.graphqlDashExtensionsLibStrings.url | graphqlDashExtensionsLib.graphqlDashExtensionsLibStrings.method | graphqlDashExtensionsLib.graphqlDashExtensionsLibStrings.headers
  ]
  var requestContext: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify GraphQLRequestContext<TContext> */ js.Any
  var variables: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
}

object Anon_ContextExtensions {
  @scala.inline
  def apply[TContext](
    context: TContext,
    request: stdLib.Pick[
      apolloDashServerDashEnvLib.apolloDashServerDashEnvMod.Request, 
      graphqlDashExtensionsLib.graphqlDashExtensionsLibStrings.url | graphqlDashExtensionsLib.graphqlDashExtensionsLibStrings.method | graphqlDashExtensionsLib.graphqlDashExtensionsLibStrings.headers
    ],
    requestContext: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify GraphQLRequestContext<TContext> */ js.Any,
    extensions: stdLib.Record[java.lang.String, _] = null,
    operationName: java.lang.String = null,
    parsedQuery: graphqlLib.languageAstMod.DocumentNode = null,
    persistedQueryHit: js.UndefOr[scala.Boolean] = js.undefined,
    persistedQueryRegister: js.UndefOr[scala.Boolean] = js.undefined,
    queryString: java.lang.String = null,
    variables: org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): Anon_ContextExtensions[TContext] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], request = request, requestContext = requestContext)
    if (extensions != null) __obj.updateDynamic("extensions")(extensions)
    if (operationName != null) __obj.updateDynamic("operationName")(operationName)
    if (parsedQuery != null) __obj.updateDynamic("parsedQuery")(parsedQuery)
    if (!js.isUndefined(persistedQueryHit)) __obj.updateDynamic("persistedQueryHit")(persistedQueryHit)
    if (!js.isUndefined(persistedQueryRegister)) __obj.updateDynamic("persistedQueryRegister")(persistedQueryRegister)
    if (queryString != null) __obj.updateDynamic("queryString")(queryString)
    if (variables != null) __obj.updateDynamic("variables")(variables)
    __obj.asInstanceOf[Anon_ContextExtensions[TContext]]
  }
}

