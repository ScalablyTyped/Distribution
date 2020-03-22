package typings.graphqlExtensions

import org.scalablytyped.runtime.StringDictionary
import typings.apolloServerTypes.mod.GraphQLRequestContext
import typings.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContext[TContext] extends js.Object {
  var context: TContext
  var operationName: js.UndefOr[String] = js.undefined
  var parsedQuery: js.UndefOr[DocumentNode] = js.undefined
  var persistedQueryHit: js.UndefOr[Boolean] = js.undefined
  var persistedQueryRegister: js.UndefOr[Boolean] = js.undefined
  var queryString: js.UndefOr[String] = js.undefined
  var request: PickRequesturlmethodheade
  var requestContext: GraphQLRequestContext[TContext]
  var variables: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object AnonContext {
  @scala.inline
  def apply[TContext](
    context: TContext,
    request: PickRequesturlmethodheade,
    requestContext: GraphQLRequestContext[TContext],
    operationName: String = null,
    parsedQuery: DocumentNode = null,
    persistedQueryHit: js.UndefOr[Boolean] = js.undefined,
    persistedQueryRegister: js.UndefOr[Boolean] = js.undefined,
    queryString: String = null,
    variables: StringDictionary[js.Any] = null
  ): AnonContext[TContext] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], requestContext = requestContext.asInstanceOf[js.Any])
    if (operationName != null) __obj.updateDynamic("operationName")(operationName.asInstanceOf[js.Any])
    if (parsedQuery != null) __obj.updateDynamic("parsedQuery")(parsedQuery.asInstanceOf[js.Any])
    if (!js.isUndefined(persistedQueryHit)) __obj.updateDynamic("persistedQueryHit")(persistedQueryHit.asInstanceOf[js.Any])
    if (!js.isUndefined(persistedQueryRegister)) __obj.updateDynamic("persistedQueryRegister")(persistedQueryRegister.asInstanceOf[js.Any])
    if (queryString != null) __obj.updateDynamic("queryString")(queryString.asInstanceOf[js.Any])
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContext[TContext]]
  }
}

