package typings
package graphqlDashExtensionsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_RequestContext[TContext] extends js.Object {
  var requestContext: apolloDashServerDashCoreLib.distRequestPipelineAPIMod.GraphQLRequestContext[TContext]
}

object Anon_RequestContext {
  @scala.inline
  def apply[TContext](
    requestContext: apolloDashServerDashCoreLib.distRequestPipelineAPIMod.GraphQLRequestContext[TContext]
  ): Anon_RequestContext[TContext] = {
    val __obj = js.Dynamic.literal(requestContext = requestContext)
  
    __obj.asInstanceOf[Anon_RequestContext[TContext]]
  }
}

