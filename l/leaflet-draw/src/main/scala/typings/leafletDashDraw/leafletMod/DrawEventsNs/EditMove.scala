package typings.leafletDashDraw.leafletMod.DrawEventsNs

import typings.leaflet.leafletMod.Layer
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditMove extends Event {
  /**
    * Layer that was just moved.
    */
  var layer: Layer = js.native
}

