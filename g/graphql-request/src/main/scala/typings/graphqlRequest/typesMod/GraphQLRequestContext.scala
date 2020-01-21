package typings.graphqlRequest.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLRequestContext extends js.Object {
  var query: String
  var variables: js.UndefOr[Variables] = js.undefined
}

object GraphQLRequestContext {
  @scala.inline
  def apply(query: String, variables: Variables = null): GraphQLRequestContext = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLRequestContext]
  }
}

