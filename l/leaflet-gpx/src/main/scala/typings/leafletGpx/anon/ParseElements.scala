package typings.leafletGpx.anon

import typings.leafletGpx.leafletGpxStrings.route
import typings.leafletGpx.leafletGpxStrings.track
import typings.leafletGpx.leafletGpxStrings.waypoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseElements extends js.Object {
  var parseElements: js.Tuple3[track, route, waypoint]
}

object ParseElements {
  @scala.inline
  def apply(parseElements: js.Tuple3[track, route, waypoint]): ParseElements = {
    val __obj = js.Dynamic.literal(parseElements = parseElements.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParseElements]
  }
}

