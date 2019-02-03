package typings
package kendoDashUiLib.kendoNs.geometryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.geometry.Size")
@js.native
class Size ()
  extends kendoDashUiLib.kendoNs.Observable {
  var height: scala.Double = js.native
  var options: SizeOptions = js.native
  var width: scala.Double = js.native
  def equals(other: Size): scala.Boolean = js.native
  def getHeight(): scala.Double = js.native
  def getWidth(): scala.Double = js.native
  def setHeight(value: scala.Double): Size = js.native
  def setWidth(value: scala.Double): Size = js.native
}

/* static members */
@JSGlobal("kendo.geometry.Size")
@js.native
object Size extends js.Object {
  def create(width: js.Any, height: scala.Double): kendoDashUiLib.kendoNs.geometryNs.Size = js.native
  def create(width: kendoDashUiLib.kendoNs.geometryNs.Size, height: scala.Double): kendoDashUiLib.kendoNs.geometryNs.Size = js.native
  def create(width: scala.Double, height: scala.Double): kendoDashUiLib.kendoNs.geometryNs.Size = js.native
}

