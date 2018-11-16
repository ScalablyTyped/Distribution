package typings
package kendoDashUiLib.kendoNs.datavizNs.diagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.diagram.Connection")
@js.native
class Connection ()
  extends kendoDashUiLib.kendoNs.Observable {
  def this(options: ConnectionOptions) = this()
  var dataItem: js.Any = js.native
  var from: Shape = js.native
  var options: ConnectionOptions = js.native
  var sourceConnector: Connector = js.native
  var targetConnector: Connector = js.native
  var to: Shape = js.native
  def allPoints(): js.Any = js.native
  def points(): js.Any = js.native
  def redraw(): scala.Unit = js.native
  def redraw(options: js.Any): scala.Unit = js.native
  def select(value: scala.Boolean): scala.Unit = js.native
  def source(): js.Any = js.native
  def source(source: Connector): scala.Unit = js.native
  def source(source: Point): scala.Unit = js.native
  def source(source: Shape): scala.Unit = js.native
  def sourcePoint(): Point = js.native
  def target(): js.Any = js.native
  def target(target: Connector): scala.Unit = js.native
  def target(target: Point): scala.Unit = js.native
  def target(target: Shape): scala.Unit = js.native
  def targetPoint(): Point = js.native
  def `type`(): scala.Unit = js.native
  def `type`(value: java.lang.String): scala.Unit = js.native
}

