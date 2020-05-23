package typings.graphqlExtensions.anon

import typings.apolloServerTypes.mod.GraphQLResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphqlResponse[TContext] extends js.Object {
  var context: TContext
  var graphqlResponse: GraphQLResponse
}

object GraphqlResponse {
  @scala.inline
  def apply[TContext](context: TContext, graphqlResponse: GraphQLResponse): GraphqlResponse[TContext] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], graphqlResponse = graphqlResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphqlResponse[TContext]]
  }
}

