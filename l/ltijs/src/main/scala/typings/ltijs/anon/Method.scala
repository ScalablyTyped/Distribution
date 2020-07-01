package typings.ltijs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Method extends js.Object {
  var method: String
  var route: String
}

object Method {
  @scala.inline
  def apply(method: String, route: String): Method = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[Method]
  }
}

