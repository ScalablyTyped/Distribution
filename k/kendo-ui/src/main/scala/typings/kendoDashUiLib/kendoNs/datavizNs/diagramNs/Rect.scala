package typings
package kendoDashUiLib.kendoNs.datavizNs.diagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.diagram.Rect")
@js.native
class Rect ()
  extends kendoDashUiLib.kendoNs.Observable {
  def this(options: RectOptions) = this()
  var options: RectOptions = js.native
  def position(): scala.Unit = js.native
  def position(offset: Point): scala.Unit = js.native
  def rotate(angle: scala.Double, center: Point): scala.Unit = js.native
  def visible(): scala.Boolean = js.native
  def visible(visible: scala.Boolean): scala.Unit = js.native
}

