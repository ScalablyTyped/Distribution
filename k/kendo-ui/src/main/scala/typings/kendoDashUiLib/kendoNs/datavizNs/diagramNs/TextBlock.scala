package typings
package kendoDashUiLib.kendoNs.datavizNs.diagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.diagram.TextBlock")
@js.native
class TextBlock ()
  extends kendoDashUiLib.kendoNs.Observable {
  def this(options: TextBlockOptions) = this()
  var drawingElement: kendoDashUiLib.kendoNs.drawingNs.Text = js.native
  var options: TextBlockOptions = js.native
  def content(): java.lang.String = js.native
  def content(content: java.lang.String): scala.Unit = js.native
  def position(): scala.Unit = js.native
  def position(offset: Point): scala.Unit = js.native
  def rotate(angle: scala.Double, center: Point): scala.Unit = js.native
  def visible(): scala.Boolean = js.native
  def visible(visible: scala.Boolean): scala.Unit = js.native
}

