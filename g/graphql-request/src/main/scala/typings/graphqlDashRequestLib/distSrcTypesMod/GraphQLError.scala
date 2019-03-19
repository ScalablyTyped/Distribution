package typings
package graphqlDashRequestLib.distSrcTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLError extends js.Object {
  var locations: js.Array[graphqlDashRequestLib.Anon_Column]
  var message: java.lang.String
  var path: js.Array[java.lang.String]
}

object GraphQLError {
  @scala.inline
  def apply(
    locations: js.Array[graphqlDashRequestLib.Anon_Column],
    message: java.lang.String,
    path: js.Array[java.lang.String]
  ): GraphQLError = {
    val __obj = js.Dynamic.literal(locations = locations, message = message, path = path)
  
    __obj.asInstanceOf[GraphQLError]
  }
}

