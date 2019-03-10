package typings
package graphqlDashExtensionsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContextGraphqlResponse[TContext] extends js.Object {
  var context: TContext
  var graphqlResponse: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify GraphQLResponse */ js.Any
}

object Anon_ContextGraphqlResponse {
  @scala.inline
  def apply[TContext](
    context: TContext,
    graphqlResponse: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify GraphQLResponse */ js.Any
  ): Anon_ContextGraphqlResponse[TContext] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], graphqlResponse = graphqlResponse)
  
    __obj.asInstanceOf[Anon_ContextGraphqlResponse[TContext]]
  }
}

