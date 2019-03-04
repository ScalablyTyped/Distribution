package typings
package leafletDashGpxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ParseElements extends js.Object {
  var parseElements: js.Tuple3[
    leafletDashGpxLib.leafletDashGpxLibStrings.track, 
    leafletDashGpxLib.leafletDashGpxLibStrings.route, 
    leafletDashGpxLib.leafletDashGpxLibStrings.waypoint
  ]
}

object Anon_ParseElements {
  @scala.inline
  def apply(
    parseElements: js.Tuple3[
      leafletDashGpxLib.leafletDashGpxLibStrings.track, 
      leafletDashGpxLib.leafletDashGpxLibStrings.route, 
      leafletDashGpxLib.leafletDashGpxLibStrings.waypoint
    ]
  ): Anon_ParseElements = {
    val __obj = js.Dynamic.literal(parseElements = parseElements)
  
    __obj.asInstanceOf[Anon_ParseElements]
  }
}

