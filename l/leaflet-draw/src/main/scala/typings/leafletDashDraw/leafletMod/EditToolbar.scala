package typings.leafletDashDraw.leafletMod

import typings.leaflet.leafletMod.Map
import typings.leafletDashDraw.leafletMod.ControlNs.DrawConstructorOptions
import typings.leafletDashDraw.leafletMod.DrawNs.Feature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("leaflet.EditToolbar")
@js.native
class EditToolbar () extends Toolbar {
  def getActions(handler: Feature): js.Array[ToolbarAction] = js.native
  def getModeHandlers(map: Map): js.Array[ToolbarModeHandler] = js.native
  def setOptions(options: DrawConstructorOptions): Unit = js.native
}

