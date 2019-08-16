package typings.leafletDashDraw.leafletMod.DrawNs

import typings.leaflet.leafletMod.Class
import typings.leaflet.leafletMod.LatLng
import typings.leafletDashDraw.Anon_Subtext
import typings.leafletDashDraw.leafletMod.DrawMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("leaflet.Draw.Tooltip")
@js.native
class Tooltip protected () extends Class {
  def this(map: DrawMap) = this()
  def dispose(): Unit = js.native
  def removeError(): Tooltip = js.native
  def showAsError(): Tooltip = js.native
  def updateContent(): Tooltip = js.native
  def updateContent(labelText: Anon_Subtext): Tooltip = js.native
  def updatePosition(latlng: LatLng): Tooltip = js.native
}

