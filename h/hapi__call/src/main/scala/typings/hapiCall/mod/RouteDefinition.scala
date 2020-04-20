package typings.hapiCall.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteDefinition extends js.Object {
  var method: String
  var path: String
}

object RouteDefinition {
  @scala.inline
  def apply(method: String, path: String): RouteDefinition = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteDefinition]
  }
}

