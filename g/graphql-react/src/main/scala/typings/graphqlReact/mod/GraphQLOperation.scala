package typings.graphqlReact.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  query  :string} & V extends undefined ? {} : {  variables  :V} */
trait GraphQLOperation[V] extends js.Object {
  var query: String
  var variables: V
}

object GraphQLOperation {
  @scala.inline
  def apply[V](query: String, variables: V): GraphQLOperation[V] = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GraphQLOperation[V]]
  }
}

