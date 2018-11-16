package typings
package kendoDashUiLib.kendoNs.datavizNs.diagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.diagram.Shape")
@js.native
class Shape ()
  extends kendoDashUiLib.kendoNs.Observable {
  def this(options: ShapeOptions) = this()
  var connectors: js.Any = js.native
  var dataItem: js.Any = js.native
  var options: ShapeOptions = js.native
  var shapeVisual: js.Any = js.native
  var visual: Group = js.native
  def connections(`type`: java.lang.String): scala.Unit = js.native
  def getConnector(): scala.Unit = js.native
  def getPosition(side: java.lang.String): scala.Unit = js.native
  def position(): scala.Unit = js.native
  def position(point: Point): scala.Unit = js.native
  def redraw(options: js.Any): scala.Unit = js.native
  def redrawVisual(): scala.Unit = js.native
  def select(value: scala.Boolean): scala.Unit = js.native
}

