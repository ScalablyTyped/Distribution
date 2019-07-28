package typings.leafletDashDraw.leafletMod.EditToolbarNs

import typings.leaflet.leafletMod.Map
import typings.leafletDashDraw.leafletMod.Toolbar
import typings.leafletDashDraw.leafletMod.ToolbarOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("leaflet.EditToolbar.Delete")
@js.native
class Delete protected () extends Toolbar {
  def this(map: Map) = this()
  def this(map: Map, options: ToolbarOptions) = this()
  def removeAllLayers(): Unit = js.native
  def revertLayers(): Unit = js.native
  def save(): Unit = js.native
}

