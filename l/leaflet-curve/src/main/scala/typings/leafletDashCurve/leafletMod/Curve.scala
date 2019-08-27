package typings.leafletDashCurve.leafletMod

import typings.leaflet.leafletMod.LatLng
import typings.leaflet.leafletMod.LatLngBounds
import typings.leaflet.leafletMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("leaflet.Curve")
@js.native
class Curve () extends Path {
  /*
    * Get bounds
    */
  def getBounds(): LatLngBounds = js.native
  /*
    * Get center
    */
  def getCenter(): LatLng = js.native
  /*
    * Return path
    */
  def getPath(): js.Array[String | js.Array[js.Array[js.Any]]] = js.native
  /*
    * Set path
    */
  def setPath(): Curve = js.native
}

