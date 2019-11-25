package typings.leafletDashGpx

import typings.leafletDashGpx.leafletDashGpxStrings.route
import typings.leafletDashGpx.leafletDashGpxStrings.track
import typings.leafletDashGpx.leafletDashGpxStrings.waypoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ParseElements extends js.Object {
  var parseElements: js.Tuple3[track, route, waypoint]
}

object Anon_ParseElements {
  @scala.inline
  def apply(parseElements: js.Tuple3[track, route, waypoint]): Anon_ParseElements = {
    val __obj = js.Dynamic.literal(parseElements = parseElements.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ParseElements]
  }
}

