package typings.leafletDashDraw.leafletMod

import typings.leaflet.leafletMod.Class
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("leaflet.Toolbar")
@js.native
class Toolbar () extends Class {
  def this(options: ToolbarOptions) = this()
  def addToolbar(map: DrawMap): HTMLElement | Unit = js.native
  def removeToolbar(): Unit = js.native
}

