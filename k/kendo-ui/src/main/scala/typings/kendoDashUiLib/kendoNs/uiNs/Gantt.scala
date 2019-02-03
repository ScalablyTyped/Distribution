package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.Gantt")
@js.native
class Gantt protected () extends Widget {
  def this(element: stdLib.Element) = this()
  def this(element: stdLib.Element, options: GanttOptions) = this()
  var dataSource: kendoDashUiLib.kendoNs.dataNs.DataSource = js.native
  var dependencies: kendoDashUiLib.kendoNs.dataNs.GanttDependencyDataSource = js.native
  @JSName("options")
  var options_Gantt: GanttOptions = js.native
  var wrapper: kendoDashUiLib.JQuery = js.native
  def clearSelection(): scala.Unit = js.native
  def dataItem(row: java.lang.String): kendoDashUiLib.kendoNs.dataNs.GanttTask = js.native
  def dataItem(row: kendoDashUiLib.JQuery): kendoDashUiLib.kendoNs.dataNs.GanttTask = js.native
  def dataItem(row: stdLib.Element): kendoDashUiLib.kendoNs.dataNs.GanttTask = js.native
  def date(): stdLib.Date = js.native
  def date(date: stdLib.Date): stdLib.Date = js.native
  def range(): js.Any = js.native
  def range(range: js.Any): js.Any = js.native
  def refresh(): scala.Unit = js.native
  def refreshDependencies(): scala.Unit = js.native
  def removeDependency(dependency: java.lang.String): scala.Unit = js.native
  def removeDependency(dependency: kendoDashUiLib.kendoNs.dataNs.GanttDependency): scala.Unit = js.native
  def removeTask(task: java.lang.String): scala.Unit = js.native
  def removeTask(task: kendoDashUiLib.kendoNs.dataNs.GanttTask): scala.Unit = js.native
  def saveAsPDF(): kendoDashUiLib.JQueryPromise[_] = js.native
  def select(): kendoDashUiLib.JQuery = js.native
  def select(row: java.lang.String): scala.Unit = js.native
  def select(row: kendoDashUiLib.JQuery): scala.Unit = js.native
  def select(row: stdLib.Element): scala.Unit = js.native
  def setDataSource(dataSource: kendoDashUiLib.kendoNs.dataNs.GanttDataSource): scala.Unit = js.native
  def setDependenciesDataSource(dataSource: kendoDashUiLib.kendoNs.dataNs.GanttDependencyDataSource): scala.Unit = js.native
  def view(): GanttView = js.native
  def view(`type`: java.lang.String): scala.Unit = js.native
  @JSName("view")
  def view_Unit(): scala.Unit = js.native
}

/* static members */
@JSGlobal("kendo.ui.Gantt")
@js.native
object Gantt extends js.Object {
  var fn: kendoDashUiLib.kendoNs.uiNs.Gantt = js.native
  def extend(proto: js.Object): kendoDashUiLib.kendoNs.uiNs.Gantt = js.native
}

