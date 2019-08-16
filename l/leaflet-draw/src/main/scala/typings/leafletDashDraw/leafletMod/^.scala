package typings.leafletDashDraw.leafletMod

import typings.leafletDashDraw.leafletMod.LocalizationNs.DrawLocal
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("leaflet")
@js.native
object ^ extends js.Object {
  val drawLocal: DrawLocal = js.native
  val drawVersion: String = js.native
  def map(element: String | HTMLElement): DrawMap = js.native
  def map(element: String | HTMLElement, options: typings.leaflet.leafletMod.MapOptions): DrawMap = js.native
}

