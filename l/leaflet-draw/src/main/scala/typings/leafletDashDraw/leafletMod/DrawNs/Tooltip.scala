package typings.leafletDashDraw.leafletMod.DrawNs

import typings.leaflet.leafletMod.Class
import typings.leaflet.leafletMod.LatLng
import typings.leaflet.leafletMod.Map
import typings.leafletDashDraw.Anon_Subtext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("leaflet.Draw.Tooltip")
@js.native
class Tooltip protected () extends Class {
  def this(map: Map) = this()
  def dispose(): Unit = js.native
  def removeError(): Tooltip = js.native
  def showAsError(): Tooltip = js.native
  def updateContent(): Tooltip = js.native
  def updateContent(labelText: Anon_Subtext): Tooltip = js.native
  def updatePosition(latlng: LatLng): Tooltip = js.native
}

