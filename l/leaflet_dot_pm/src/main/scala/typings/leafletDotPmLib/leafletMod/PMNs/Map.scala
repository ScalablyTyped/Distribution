package typings
package leafletDotPmLib.leafletMod.PMNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Map extends js.Object {
  var Draw: leafletDotPmLib.leafletMod.PMNs.Draw = js.native
  def addControls(): scala.Unit = js.native
  def addControls(options: ToolbarOptions): scala.Unit = js.native
  def disableDraw(shape: java.lang.String): scala.Unit = js.native
  def enableDraw(shape: java.lang.String): scala.Unit = js.native
  def enableDraw(shape: java.lang.String, options: DrawOptions): scala.Unit = js.native
  def globalEditEnabled(): scala.Boolean = js.native
  def setPathOptions(options: leafletLib.leafletMod.PathOptions): scala.Unit = js.native
  def toggleGlobalEditMode(): scala.Unit = js.native
  def toggleGlobalEditMode(options: EditOptions): scala.Unit = js.native
  def toggleRemoval(enabled: scala.Boolean): scala.Unit = js.native
}

