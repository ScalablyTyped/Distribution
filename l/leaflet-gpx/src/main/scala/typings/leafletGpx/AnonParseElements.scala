package typings.leafletGpx

import typings.leafletGpx.leafletGpxStrings.route
import typings.leafletGpx.leafletGpxStrings.track
import typings.leafletGpx.leafletGpxStrings.waypoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonParseElements extends js.Object {
  var parseElements: js.Tuple3[track, route, waypoint]
}

object AnonParseElements {
  @scala.inline
  def apply(parseElements: js.Tuple3[track, route, waypoint]): AnonParseElements = {
    val __obj = js.Dynamic.literal(parseElements = parseElements.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonParseElements]
  }
}

