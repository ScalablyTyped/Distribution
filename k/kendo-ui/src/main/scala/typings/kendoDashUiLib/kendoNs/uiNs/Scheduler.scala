package typings
package kendoDashUiLib.kendoNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo.ui.Scheduler")
@js.native
class Scheduler protected () extends Widget {
  def this(element: stdLib.Element) = this()
  def this(element: stdLib.Element, options: SchedulerOptions) = this()
  var calendar: Calendar = js.native
  var dataSource: kendoDashUiLib.kendoNs.dataNs.DataSource = js.native
  @JSName("options")
  var options_Scheduler: SchedulerOptions = js.native
  var resources: js.Any = js.native
  var wrapper: kendoDashUiLib.JQuery = js.native
  def addEvent(data: js.Any): scala.Unit = js.native
  def cancelEvent(): scala.Unit = js.native
  def data(): scala.Unit = js.native
  def date(): stdLib.Date = js.native
  def date(value: stdLib.Date): scala.Unit = js.native
  @JSName("date")
  def date_Unit(): scala.Unit = js.native
  def editEvent(event: java.lang.String): scala.Unit = js.native
  def editEvent(event: kendoDashUiLib.kendoNs.dataNs.SchedulerEvent): scala.Unit = js.native
  def items(): js.Any = js.native
  def occurrenceByUid(uid: java.lang.String): kendoDashUiLib.kendoNs.dataNs.SchedulerEvent = js.native
  def occurrencesInRange(start: stdLib.Date, end: stdLib.Date): js.Any = js.native
  def refresh(): scala.Unit = js.native
  def removeEvent(event: java.lang.String): scala.Unit = js.native
  def removeEvent(event: kendoDashUiLib.kendoNs.dataNs.SchedulerEvent): scala.Unit = js.native
  def resourcesBySlot(slot: js.Any): js.Any = js.native
  def saveAsPDF(): kendoDashUiLib.JQueryPromise[_] = js.native
  def saveEvent(): scala.Unit = js.native
  def select(): scala.Unit = js.native
  def select(events: js.Any, options: js.Any): scala.Unit = js.native
  def setDataSource(dataSource: kendoDashUiLib.kendoNs.dataNs.SchedulerDataSource): scala.Unit = js.native
  def slotByElement(element: kendoDashUiLib.JQuery): js.Any = js.native
  def slotByElement(element: stdLib.Element): js.Any = js.native
  def slotByPosition(xPosition: scala.Double, yPosition: scala.Double): js.Any = js.native
  def view(): SchedulerView = js.native
  def view(`type`: java.lang.String): scala.Unit = js.native
  def viewName(): java.lang.String = js.native
  @JSName("view")
  def view_Unit(): scala.Unit = js.native
}

/* static members */
@JSGlobal("kendo.ui.Scheduler")
@js.native
object Scheduler extends js.Object {
  var fn: kendoDashUiLib.kendoNs.uiNs.Scheduler = js.native
  def extend(proto: js.Object): kendoDashUiLib.kendoNs.uiNs.Scheduler = js.native
}

