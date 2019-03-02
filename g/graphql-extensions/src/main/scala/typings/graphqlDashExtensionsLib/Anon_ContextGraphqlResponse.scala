package typings
package graphqlDashExtensionsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContextGraphqlResponse[TContext] extends js.Object {
  var context: TContext
  var graphqlResponse: apolloDashServerDashCoreLib.distRequestPipelineAPIMod.GraphQLResponse
}

object Anon_ContextGraphqlResponse {
  @scala.inline
  def apply[TContext](
    context: TContext,
    graphqlResponse: apolloDashServerDashCoreLib.distRequestPipelineAPIMod.GraphQLResponse
  ): Anon_ContextGraphqlResponse[TContext] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    __obj.updateDynamic("graphqlResponse")(graphqlResponse)
    __obj.asInstanceOf[Anon_ContextGraphqlResponse[TContext]]
  }
}

