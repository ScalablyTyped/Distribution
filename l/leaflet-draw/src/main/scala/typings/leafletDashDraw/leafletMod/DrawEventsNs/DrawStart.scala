package typings.leafletDashDraw.leafletMod.DrawEventsNs

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DrawStart extends Event {
  /**
  			 * The type of layer this is. One of: polyline, polygon, rectangle, circle, marker
  			 */
  var layerType: String = js.native
}

