package typings.kendoUi.kendo.dataviz.diagram

import typings.kendoUi.kendo.Observable_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.dataviz.diagram.Connection")
@js.native
class Connection () extends Observable_ {
  def this(options: ConnectionOptions) = this()
  var dataItem: js.Any = js.native
  var from: Shape = js.native
  var options: ConnectionOptions = js.native
  var sourceConnector: Connector = js.native
  var targetConnector: Connector = js.native
  var to: Shape = js.native
  def allPoints(): js.Any = js.native
  def points(): js.Any = js.native
  def redraw(): Unit = js.native
  def redraw(options: js.Any): Unit = js.native
  def select(value: Boolean): Unit = js.native
  def source(): js.Any = js.native
  def source(source: Connector): Unit = js.native
  def source(source: Point): Unit = js.native
  def source(source: Shape): Unit = js.native
  def sourcePoint(): Point = js.native
  def target(): js.Any = js.native
  def target(target: Connector): Unit = js.native
  def target(target: Point): Unit = js.native
  def target(target: Shape): Unit = js.native
  def targetPoint(): Point = js.native
  def `type`(): Unit = js.native
  def `type`(value: String): Unit = js.native
}

