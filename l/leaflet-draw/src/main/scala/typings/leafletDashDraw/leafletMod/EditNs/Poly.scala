package typings.leafletDashDraw.leafletMod.EditNs

import typings.leaflet.leafletMod.Handler
import typings.leafletDashDraw.leafletMod.DrawNs.Polyline
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("leaflet.Edit.Poly")
@js.native
class Poly protected () extends Handler {
  def this(poly: Polyline) = this()
  def updateMarkers(): Unit = js.native
}

