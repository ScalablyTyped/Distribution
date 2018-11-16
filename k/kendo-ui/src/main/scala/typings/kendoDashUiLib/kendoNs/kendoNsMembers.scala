package typings
package kendoDashUiLib.kendoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("kendo")
@js.native
object kendoNsMembers extends js.Object {
  var history: History = js.native
  var keys: kendoDashUiLib.Anon_NUMPADPLUS = js.native
  var ns: java.lang.String = js.native
  var support: kendoDashUiLib.Anon_Touch = js.native
  var version: java.lang.String = js.native
  def alert(text: java.lang.String): scala.Unit = js.native
  def antiForgeryTokens(): js.Any = js.native
  def bind(element: java.lang.String, viewModel: js.Any): scala.Unit = js.native
  def bind(element: java.lang.String, viewModel: js.Any, namespace: js.Any): scala.Unit = js.native
  def bind(element: java.lang.String, viewModel: kendoDashUiLib.kendoNs.dataNs.ObservableObject): scala.Unit = js.native
  def bind(
    element: java.lang.String,
    viewModel: kendoDashUiLib.kendoNs.dataNs.ObservableObject,
    namespace: js.Any
  ): scala.Unit = js.native
  def bind(element: kendoDashUiLib.JQuery, viewModel: js.Any): scala.Unit = js.native
  def bind(element: kendoDashUiLib.JQuery, viewModel: js.Any, namespace: js.Any): scala.Unit = js.native
  def bind(element: kendoDashUiLib.JQuery, viewModel: kendoDashUiLib.kendoNs.dataNs.ObservableObject): scala.Unit = js.native
  def bind(
    element: kendoDashUiLib.JQuery,
    viewModel: kendoDashUiLib.kendoNs.dataNs.ObservableObject,
    namespace: js.Any
  ): scala.Unit = js.native
  def bind(element: stdLib.Element, viewModel: js.Any): scala.Unit = js.native
  def bind(element: stdLib.Element, viewModel: js.Any, namespace: js.Any): scala.Unit = js.native
  def bind(element: stdLib.Element, viewModel: kendoDashUiLib.kendoNs.dataNs.ObservableObject): scala.Unit = js.native
  def bind(
    element: stdLib.Element,
    viewModel: kendoDashUiLib.kendoNs.dataNs.ObservableObject,
    namespace: js.Any
  ): scala.Unit = js.native
  def confirm(text: java.lang.String): kendoDashUiLib.JQueryPromise[_] = js.native
  def culture(): kendoDashUiLib.Anon_NameCalendarCalendars = js.native
  def culture(culture: java.lang.String): scala.Unit = js.native
  def destroy(element: java.lang.String): scala.Unit = js.native
  def destroy(element: kendoDashUiLib.JQuery): scala.Unit = js.native
  def destroy(element: stdLib.Element): scala.Unit = js.native
  def format(format: java.lang.String, values: js.Any*): java.lang.String = js.native
  def fx(element: kendoDashUiLib.JQuery): kendoDashUiLib.kendoNs.effectsNs.Element = js.native
  def fx(element: stdLib.Element): kendoDashUiLib.kendoNs.effectsNs.Element = js.native
  def fx(selector: java.lang.String): kendoDashUiLib.kendoNs.effectsNs.Element = js.native
  def guid(): java.lang.String = js.native
  def htmlEncode(value: java.lang.String): java.lang.String = js.native
  def init(element: kendoDashUiLib.JQuery, namespaces: js.Any*): scala.Unit = js.native
  def init(element: stdLib.Element, namespaces: js.Any*): scala.Unit = js.native
  def init(selector: java.lang.String, namespaces: js.Any*): scala.Unit = js.native
  def observable(data: js.Any): kendoDashUiLib.kendoNs.dataNs.ObservableObject = js.native
  def observableHierarchy(array: js.Any): scala.Unit = js.native
  def observableHierarchy(array: js.Array[_]): kendoDashUiLib.kendoNs.dataNs.ObservableArray = js.native
  def parseColor(color: java.lang.String, noerror: scala.Boolean): Color = js.native
  def parseDate(value: java.lang.String): stdLib.Date = js.native
  def parseDate(value: java.lang.String, formats: java.lang.String): stdLib.Date = js.native
  def parseDate(value: java.lang.String, formats: java.lang.String, culture: java.lang.String): stdLib.Date = js.native
  def parseDate(value: java.lang.String, formats: js.Any): stdLib.Date = js.native
  def parseDate(value: java.lang.String, formats: js.Any, culture: java.lang.String): stdLib.Date = js.native
  def parseExactDate(value: java.lang.String): stdLib.Date = js.native
  def parseExactDate(value: java.lang.String, formats: java.lang.String): stdLib.Date = js.native
  def parseExactDate(value: java.lang.String, formats: java.lang.String, culture: java.lang.String): stdLib.Date = js.native
  def parseExactDate(value: java.lang.String, formats: js.Any): stdLib.Date = js.native
  def parseExactDate(value: java.lang.String, formats: js.Any, culture: java.lang.String): stdLib.Date = js.native
  def parseFloat(value: java.lang.String): scala.Double = js.native
  def parseFloat(value: java.lang.String, culture: java.lang.String): scala.Double = js.native
  def parseInt(value: java.lang.String): scala.Double = js.native
  def parseInt(value: java.lang.String, culture: java.lang.String): scala.Double = js.native
  def prompt(text: java.lang.String, defaultValue: java.lang.String): kendoDashUiLib.JQueryPromise[_] = js.native
  def proxyModelSetters(): scala.Unit = js.native
  def proxyModelSetters(data: kendoDashUiLib.kendoNs.dataNs.Model): scala.Unit = js.native
  def render(template: js.Function1[/* data */ js.Any, java.lang.String], data: js.Array[_]): java.lang.String = js.native
  def resize(element: java.lang.String, force: scala.Boolean): scala.Unit = js.native
  def resize(element: kendoDashUiLib.JQuery, force: scala.Boolean): scala.Unit = js.native
  def resize(element: stdLib.Element, force: scala.Boolean): scala.Unit = js.native
  def saveAs(options: js.Any): scala.Unit = js.native
  def stringify(value: js.Any): java.lang.String = js.native
  def template(template: java.lang.String): js.Function1[/* data */ js.Any, java.lang.String] = js.native
  def template(template: java.lang.String, options: TemplateOptions): js.Function1[/* data */ js.Any, java.lang.String] = js.native
  def throttle(fn: js.Function, timeout: scala.Double): js.Function = js.native
  def toString(value: scala.Double, format: java.lang.String): java.lang.String = js.native
  def toString(value: scala.Double, format: java.lang.String, culture: java.lang.String): java.lang.String = js.native
  def toString(value: stdLib.Date, format: java.lang.String): java.lang.String = js.native
  def toString(value: stdLib.Date, format: java.lang.String, culture: java.lang.String): java.lang.String = js.native
  def touchScroller(element: java.lang.String): scala.Unit = js.native
  def touchScroller(element: kendoDashUiLib.JQuery): scala.Unit = js.native
  def touchScroller(element: stdLib.Element): scala.Unit = js.native
  def unbind(element: java.lang.String): scala.Unit = js.native
  def unbind(element: kendoDashUiLib.JQuery): scala.Unit = js.native
  def unbind(element: stdLib.Element): scala.Unit = js.native
  def widgetInstance(element: kendoDashUiLib.JQuery): kendoDashUiLib.kendoNs.uiNs.Widget = js.native
  def widgetInstance(element: kendoDashUiLib.JQuery, suite: kendoDashUiLib.Anon_ListView): kendoDashUiLib.kendoNs.uiNs.Widget = js.native
  def widgetInstance(element: kendoDashUiLib.JQuery, suite: kendoDashUiLib.Anon_Plugin): kendoDashUiLib.kendoNs.uiNs.Widget = js.native
  def widgetInstance(element: kendoDashUiLib.JQuery, suite: kendoDashUiLib.Anon_PluginWidget): kendoDashUiLib.kendoNs.uiNs.Widget = js.native
}

