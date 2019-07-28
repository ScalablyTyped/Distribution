package typings.graphqlDashExtensions

import org.scalablytyped.runtime.StringDictionary
import typings.apolloDashServerDashEnv.apolloDashServerDashEnvMod.Request
import typings.apolloDashServerDashTypes.apolloDashServerDashTypesMod.GraphQLRequestContext
import typings.graphql.languageAstMod.DocumentNode
import typings.graphqlDashExtensions.graphqlDashExtensionsStrings.headers
import typings.graphqlDashExtensions.graphqlDashExtensionsStrings.method
import typings.graphqlDashExtensions.graphqlDashExtensionsStrings.url
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Context[TContext] extends js.Object {
  var context: TContext
  var operationName: js.UndefOr[String] = js.undefined
  var parsedQuery: js.UndefOr[DocumentNode] = js.undefined
  var persistedQueryHit: js.UndefOr[Boolean] = js.undefined
  var persistedQueryRegister: js.UndefOr[Boolean] = js.undefined
  var queryString: js.UndefOr[String] = js.undefined
  var request: Pick[Request, url | method | headers]
  var requestContext: GraphQLRequestContext[TContext]
  var variables: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object Anon_Context {
  @scala.inline
  def apply[TContext](
    context: TContext,
    request: Pick[Request, url | method | headers],
    requestContext: GraphQLRequestContext[TContext],
    operationName: String = null,
    parsedQuery: DocumentNode = null,
    persistedQueryHit: js.UndefOr[Boolean] = js.undefined,
    persistedQueryRegister: js.UndefOr[Boolean] = js.undefined,
    queryString: String = null,
    variables: StringDictionary[js.Any] = null
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

