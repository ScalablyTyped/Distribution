package typings.graphqlExtensions.anon

import typings.apolloServerTypes.mod.GraphQLResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphqlResponse[TContext] extends js.Object {
  var context: TContext = js.native
  var graphqlResponse: GraphQLResponse = js.native
}

object GraphqlResponse {
  @scala.inline
  def apply[TContext](context: TContext, graphqlResponse: GraphQLResponse): GraphqlResponse[TContext] = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], graphqlResponse = graphqlResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphqlResponse[TContext]]
  }
  @scala.inline
  implicit class GraphqlResponseOps[Self <: GraphqlResponse[_], TContext] (val x: Self with GraphqlResponse[TContext]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setContext(value: TContext): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def setGraphqlResponse(value: GraphQLResponse): Self = this.set("graphqlResponse", value.asInstanceOf[js.Any])
  }
  
}

