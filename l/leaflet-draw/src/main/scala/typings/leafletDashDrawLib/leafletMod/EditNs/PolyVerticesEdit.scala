package typings
package leafletDashDrawLib.leafletMod.EditNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("leaflet.Edit.PolyVerticesEdit")
@js.native
class PolyVerticesEdit protected ()
  extends leafletLib.leafletMod.Handler {
  def this(poly: Poly, latlngs: js.Array[leafletLib.leafletMod.LatLngExpression]) = this()
  def this(poly: Poly, latlngs: js.Array[leafletLib.leafletMod.LatLngExpression], options: leafletDashDrawLib.leafletMod.EditOptionsNs.EditPolyVerticesEditOptions) = this()
  def updateMarkers(): scala.Unit = js.native
}

