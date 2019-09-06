package typings.kendoDashUi.kendoNs

import typings.kendoDashUi.Anon_Calendar
import typings.kendoDashUi.JQuery
import typings.kendoDashUi.JQueryPromise
import typings.kendoDashUi.TypeofClassWidget
import typings.kendoDashUi.Typeofui
import typings.kendoDashUi.TypeofuiActionSheet
import typings.kendoDashUi.TypeofuiArcGauge
import typings.kendoDashUi.kendoNs.dataNs.Model
import typings.kendoDashUi.kendoNs.dataNs.ObservableArray
import typings.kendoDashUi.kendoNs.dataNs.ObservableObject
import typings.kendoDashUi.kendoNs.uiNs.Widget
import typings.std.Date
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo")
@js.native
object ^ extends js.Object {
  var history: History = js.native
  var ns: String = js.native
  var version: String = js.native
  def alert(text: String): Unit = js.native
  def antiForgeryTokens(): js.Any = js.native
  def bind(element: String, viewModel: js.Any): Unit = js.native
  def bind(element: String, viewModel: js.Any, namespace: js.Any): Unit = js.native
  def bind(element: String, viewModel: ObservableObject): Unit = js.native
  def bind(element: String, viewModel: ObservableObject, namespace: js.Any): Unit = js.native
  def bind(element: JQuery, viewModel: js.Any): Unit = js.native
  def bind(element: JQuery, viewModel: js.Any, namespace: js.Any): Unit = js.native
  def bind(element: JQuery, viewModel: ObservableObject): Unit = js.native
  def bind(element: JQuery, viewModel: ObservableObject, namespace: js.Any): Unit = js.native
  def bind(element: Element, viewModel: js.Any): Unit = js.native
  def bind(element: Element, viewModel: js.Any, namespace: js.Any): Unit = js.native
  def bind(element: Element, viewModel: ObservableObject): Unit = js.native
  def bind(element: Element, viewModel: ObservableObject, namespace: js.Any): Unit = js.native
  def confirm(text: String): JQueryPromise[_] = js.native
  def culture(): Anon_Calendar = js.native
  def culture(culture: String): Unit = js.native
  def destroy(element: String): Unit = js.native
  def destroy(element: JQuery): Unit = js.native
  def destroy(element: Element): Unit = js.native
  def format(format: String, values: js.Any*): String = js.native
  def fx(element: JQuery): typings.kendoDashUi.kendoNs.effectsNs.Element = js.native
  def fx(element: Element): typings.kendoDashUi.kendoNs.effectsNs.Element = js.native
  def fx(selector: String): typings.kendoDashUi.kendoNs.effectsNs.Element = js.native
  def guid(): String = js.native
  def htmlEncode(value: String): String = js.native
  def init(element: JQuery, namespaces: js.Any*): Unit = js.native
  def init(element: Element, namespaces: js.Any*): Unit = js.native
  def init(selector: String, namespaces: js.Any*): Unit = js.native
  def notify(widget: TypeofClassWidget): Unit = js.native
  def notify(widget: TypeofClassWidget, namespace: Typeofui): Unit = js.native
  def notify(widget: TypeofClassWidget, namespace: TypeofuiActionSheet): Unit = js.native
  def notify(widget: TypeofClassWidget, namespace: TypeofuiArcGauge): Unit = js.native
  def observable(data: js.Any): ObservableObject = js.native
  def observableHierarchy(array: js.Any): Unit = js.native
  def observableHierarchy(array: js.Array[_]): ObservableArray = js.native
  def parseColor(color: String, noerror: Boolean): Color = js.native
  def parseDate(value: String): Date = js.native
  def parseDate(value: String, formats: String): Date = js.native
  def parseDate(value: String, formats: String, culture: String): Date = js.native
  def parseDate(value: String, formats: js.Any): Date = js.native
  def parseDate(value: String, formats: js.Any, culture: String): Date = js.native
  def parseExactDate(value: String): Date = js.native
  def parseExactDate(value: String, formats: String): Date = js.native
  def parseExactDate(value: String, formats: String, culture: String): Date = js.native
  def parseExactDate(value: String, formats: js.Any): Date = js.native
  def parseExactDate(value: String, formats: js.Any, culture: String): Date = js.native
  def parseFloat(value: String): Double = js.native
  def parseFloat(value: String, culture: String): Double = js.native
  def parseInt(value: String): Double = js.native
  def parseInt(value: String, culture: String): Double = js.native
  def prompt(text: String, defaultValue: String): JQueryPromise[_] = js.native
  def proxyModelSetters(): Unit = js.native
  def proxyModelSetters(data: Model): Unit = js.native
  def render(template: js.Function1[/* data */ js.Any, String], data: js.Array[_]): String = js.native
  def resize(element: String, force: Boolean): Unit = js.native
  def resize(element: JQuery, force: Boolean): Unit = js.native
  def resize(element: Element, force: Boolean): Unit = js.native
  def saveAs(options: js.Any): Unit = js.native
  def stringify(value: js.Any): String = js.native
  def template(template: String): js.Function1[/* data */ js.Any, String] = js.native
  def template(template: String, options: TemplateOptions): js.Function1[/* data */ js.Any, String] = js.native
  def throttle(fn: js.Function, timeout: Double): js.Function = js.native
  def toString(value: Double, format: String): String = js.native
  def toString(value: Double, format: String, culture: String): String = js.native
  def toString(value: Date, format: String): String = js.native
  def toString(value: Date, format: String, culture: String): String = js.native
  def touchScroller(element: String): Unit = js.native
  def touchScroller(element: JQuery): Unit = js.native
  def touchScroller(element: Element): Unit = js.native
  def unbind(element: String): Unit = js.native
  def unbind(element: JQuery): Unit = js.native
  def unbind(element: Element): Unit = js.native
  def widgetInstance(element: JQuery): Widget = js.native
  def widgetInstance(element: JQuery, suite: Typeofui): Widget = js.native
  def widgetInstance(element: JQuery, suite: TypeofuiActionSheet): Widget = js.native
  def widgetInstance(element: JQuery, suite: TypeofuiArcGauge): Widget = js.native
}

