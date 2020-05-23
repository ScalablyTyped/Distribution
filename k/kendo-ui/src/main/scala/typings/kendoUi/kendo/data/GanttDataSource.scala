package typings.kendoUi.kendo.data

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GanttDataSource extends DataSource {
  def add(model: GanttTask): GanttTask = js.native
  def cancelChanges(model: GanttTask): Unit = js.native
  def indexOf(value: GanttTask): Double = js.native
  def insert(index: Double, model: GanttTask): GanttTask = js.native
  def remove(model: GanttTask): Unit = js.native
}

