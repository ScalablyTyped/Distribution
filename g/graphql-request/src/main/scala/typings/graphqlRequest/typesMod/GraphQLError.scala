package typings.graphqlRequest.typesMod

import typings.graphqlRequest.AnonColumn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLError extends js.Object {
  var locations: js.Array[AnonColumn]
  var message: String
  var path: js.Array[String]
}

object GraphQLError {
  @scala.inline
  def apply(locations: js.Array[AnonColumn], message: String, path: js.Array[String]): GraphQLError = {
    val __obj = js.Dynamic.literal(locations = locations.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GraphQLError]
  }
}

