package typings
package leafletDashDrawLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("leaflet.DrawToolbar")
@js.native
class DrawToolbar () extends Toolbar {
  def getActions(handler: leafletDashDrawLib.leafletMod.DrawNs.Feature): js.Array[ToolbarAction] = js.native
  def getModeHandlers(map: leafletLib.leafletMod.Map): js.Array[ToolbarModeHandler] = js.native
  def setOptions(options: leafletDashDrawLib.leafletMod.ControlNs.DrawConstructorOptions): scala.Unit = js.native
}

