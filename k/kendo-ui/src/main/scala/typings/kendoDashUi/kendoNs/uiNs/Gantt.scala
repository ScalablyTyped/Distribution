package typings.kendoDashUi.kendoNs.uiNs

import typings.kendoDashUi.JQuery
import typings.kendoDashUi.JQueryPromise
import typings.kendoDashUi.kendoNs.dataNs.DataSource
import typings.kendoDashUi.kendoNs.dataNs.GanttDataSource
import typings.kendoDashUi.kendoNs.dataNs.GanttDependency
import typings.kendoDashUi.kendoNs.dataNs.GanttDependencyDataSource
import typings.kendoDashUi.kendoNs.dataNs.GanttTask
import typings.std.Date
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.Gantt")
@js.native
class Gantt protected () extends Widget {
  def this(element: Element) = this()
  def this(element: Element, options: GanttOptions) = this()
  var dataSource: DataSource = js.native
  var dependencies: GanttDependencyDataSource = js.native
  @JSName("options")
  var options_Gantt: GanttOptions = js.native
  var wrapper: JQuery = js.native
  def clearSelection(): Unit = js.native
  def dataItem(row: String): GanttTask = js.native
  def dataItem(row: JQuery): GanttTask = js.native
  def dataItem(row: Element): GanttTask = js.native
  def date(): Date = js.native
  def date(date: Date): Date = js.native
  def range(): js.Any = js.native
  def range(range: js.Any): js.Any = js.native
  def refresh(): Unit = js.native
  def refreshDependencies(): Unit = js.native
  def removeDependency(dependency: String): Unit = js.native
  def removeDependency(dependency: GanttDependency): Unit = js.native
  def removeTask(task: String): Unit = js.native
  def removeTask(task: GanttTask): Unit = js.native
  def saveAsPDF(): JQueryPromise[_] = js.native
  def select(): JQuery = js.native
  def select(row: String): Unit = js.native
  def select(row: JQuery): Unit = js.native
  def select(row: Element): Unit = js.native
  def setDataSource(dataSource: GanttDataSource): Unit = js.native
  def setDependenciesDataSource(dataSource: GanttDependencyDataSource): Unit = js.native
  def view(): GanttView = js.native
  def view(`type`: String): Unit = js.native
  @JSName("view")
  def view_Unit(): Unit = js.native
}

/* static members */
@JSGlobal("kendo.ui.Gantt")
@js.native
object Gantt extends js.Object {
  var fn: Gantt = js.native
  def extend(proto: js.Object): Gantt = js.native
}

