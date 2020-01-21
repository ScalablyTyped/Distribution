package typings.leafletPm.mod.PM

import typings.leaflet.mod.PathOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Map extends js.Object {
  var Draw: typings.leafletPm.mod.PM.Draw = js.native
  def addControls(): Unit = js.native
  def addControls(options: ToolbarOptions): Unit = js.native
  def disableDraw(shape: String): Unit = js.native
  def enableDraw(shape: String): Unit = js.native
  def enableDraw(shape: String, options: DrawOptions): Unit = js.native
  def globalEditEnabled(): Boolean = js.native
  def setPathOptions(options: PathOptions): Unit = js.native
  def toggleGlobalEditMode(): Unit = js.native
  def toggleGlobalEditMode(options: EditOptions): Unit = js.native
  def toggleRemoval(enabled: Boolean): Unit = js.native
}

