package typings.hapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRoute extends js.Object {
  /** routes preferences: */
  var route: AnonPrefix
}

object AnonRoute {
  @scala.inline
  def apply(route: AnonPrefix): AnonRoute = {
    val __obj = js.Dynamic.literal(route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRoute]
  }
}

