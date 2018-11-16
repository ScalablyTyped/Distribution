package typings
package leafletDashDrawLib.leafletMod.DrawNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("leaflet.Draw.Tooltip")
@js.native
class Tooltip protected ()
  extends leafletLib.leafletMod.Class {
  def this(map: leafletLib.leafletMod.Map) = this()
  def dispose(): scala.Unit = js.native
  def removeError(): Tooltip = js.native
  def showAsError(): Tooltip = js.native
  def updateContent(): Tooltip = js.native
  def updateContent(labelText: leafletDashDrawLib.Anon_Text): Tooltip = js.native
  def updatePosition(latlng: leafletLib.leafletMod.LatLng): Tooltip = js.native
}

