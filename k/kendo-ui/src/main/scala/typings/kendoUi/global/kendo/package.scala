package typings.kendoUi.global.kendo

import org.scalablytyped.runtime.Instantiable2
import typings.kendoUi.JQuery
import typings.kendoUi.JQueryPromise
import typings.kendoUi.anon.Calendar
import typings.kendoUi.anon.TypeofWidget
import typings.kendoUi.anon.Typeofui
import typings.kendoUi.anon.TypeofuiActionSheet
import typings.kendoUi.anon.TypeofuiArcGauge
import typings.kendoUi.global.kendo.^
import typings.kendoUi.kendo.History
import typings.kendoUi.kendo.MediaQueryHandler
import typings.kendoUi.kendo.TemplateOptions
import typings.kendoUi.kendo.data.Model
import typings.kendoUi.kendo.data.ObservableArray
import typings.kendoUi.kendo.data.ObservableObject
import typings.kendoUi.kendo.ui.Widget
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def alert(text: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("alert")(text.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def antiForgeryTokens(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("antiForgeryTokens")().asInstanceOf[Any]

inline def bind(element: String, viewModel: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(element.asInstanceOf[js.Any], viewModel.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def bind(element: String, viewModel: Any, namespace: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(element.asInstanceOf[js.Any], viewModel.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def bind(element: String, viewModel: ObservableObject): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(element.asInstanceOf[js.Any], viewModel.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def bind(element: String, viewModel: ObservableObject, namespace: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(element.asInstanceOf[js.Any], viewModel.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def bind(element: JQuery, viewModel: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(element.asInstanceOf[js.Any], viewModel.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def bind(element: JQuery, viewModel: Any, namespace: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(element.asInstanceOf[js.Any], viewModel.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def bind(element: JQuery, viewModel: ObservableObject): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(element.asInstanceOf[js.Any], viewModel.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def bind(element: JQuery, viewModel: ObservableObject, namespace: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(element.asInstanceOf[js.Any], viewModel.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def bind(element: Element, viewModel: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(element.asInstanceOf[js.Any], viewModel.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def bind(element: Element, viewModel: Any, namespace: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(element.asInstanceOf[js.Any], viewModel.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def bind(element: Element, viewModel: ObservableObject): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(element.asInstanceOf[js.Any], viewModel.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def bind(element: Element, viewModel: ObservableObject, namespace: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(element.asInstanceOf[js.Any], viewModel.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def confirm(text: String): JQueryPromise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("confirm")(text.asInstanceOf[js.Any]).asInstanceOf[JQueryPromise[Any]]

inline def culture(): Calendar = ^.asInstanceOf[js.Dynamic].applyDynamic("culture")().asInstanceOf[Calendar]
inline def culture(culture: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("culture")(culture.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def destroy(element: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("destroy")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def destroy(element: JQuery): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("destroy")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def destroy(element: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("destroy")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def format(format: String, values: Any*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(scala.List(format.asInstanceOf[js.Any]).`++`(values.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String]

inline def fx(element: JQuery): typings.kendoUi.kendo.effects.Element = ^.asInstanceOf[js.Dynamic].applyDynamic("fx")(element.asInstanceOf[js.Any]).asInstanceOf[typings.kendoUi.kendo.effects.Element]
inline def fx(element: Element): typings.kendoUi.kendo.effects.Element = ^.asInstanceOf[js.Dynamic].applyDynamic("fx")(element.asInstanceOf[js.Any]).asInstanceOf[typings.kendoUi.kendo.effects.Element]
inline def fx(selector: String): typings.kendoUi.kendo.effects.Element = ^.asInstanceOf[js.Dynamic].applyDynamic("fx")(selector.asInstanceOf[js.Any]).asInstanceOf[typings.kendoUi.kendo.effects.Element]

inline def guid(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("guid")().asInstanceOf[String]

inline def history: History = ^.asInstanceOf[js.Dynamic].selectDynamic("history").asInstanceOf[History]
inline def history_=(x: History): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("history")(x.asInstanceOf[js.Any])

inline def htmlEncode(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("htmlEncode")(value.asInstanceOf[js.Any]).asInstanceOf[String]

inline def init(element: JQuery, namespaces: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(scala.List(element.asInstanceOf[js.Any]).`++`(namespaces.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
inline def init(element: Element, namespaces: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(scala.List(element.asInstanceOf[js.Any]).`++`(namespaces.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
inline def init(selector: String, namespaces: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(scala.List(selector.asInstanceOf[js.Any]).`++`(namespaces.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]

inline def mediaQuery(query: String): MediaQueryHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("mediaQuery")(query.asInstanceOf[js.Any]).asInstanceOf[MediaQueryHandler]

inline def notify_(
  widget: TypeofWidget & (Instantiable2[/* element */ Element, /* options */ js.UndefOr[js.Object], Widget])
): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("notify")(widget.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def notify_(
  widget: TypeofWidget & (Instantiable2[/* element */ Element, /* options */ js.UndefOr[js.Object], Widget]),
  namespace: Typeofui
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notify")(widget.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def notify_(
  widget: TypeofWidget & (Instantiable2[/* element */ Element, /* options */ js.UndefOr[js.Object], Widget]),
  namespace: TypeofuiActionSheet
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notify")(widget.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def notify_(
  widget: TypeofWidget & (Instantiable2[/* element */ Element, /* options */ js.UndefOr[js.Object], Widget]),
  namespace: TypeofuiArcGauge
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("notify")(widget.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def ns: String = ^.asInstanceOf[js.Dynamic].selectDynamic("ns").asInstanceOf[String]
inline def ns_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ns")(x.asInstanceOf[js.Any])

inline def observable(data: Any): ObservableObject = ^.asInstanceOf[js.Dynamic].applyDynamic("observable")(data.asInstanceOf[js.Any]).asInstanceOf[ObservableObject]

inline def observableFileManagerData(array: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("observableFileManagerData")(array.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def observableHierarchy(array: js.Array[Any]): ObservableArray = ^.asInstanceOf[js.Dynamic].applyDynamic("observableHierarchy")(array.asInstanceOf[js.Any]).asInstanceOf[ObservableArray]
inline def observableHierarchy(array: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("observableHierarchy")(array.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def parseColor(color: String, noerror: Boolean): typings.kendoUi.kendo.Color = (^.asInstanceOf[js.Dynamic].applyDynamic("parseColor")(color.asInstanceOf[js.Any], noerror.asInstanceOf[js.Any])).asInstanceOf[typings.kendoUi.kendo.Color]

inline def parseDate(value: String): js.Date | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("parseDate")(value.asInstanceOf[js.Any]).asInstanceOf[js.Date | Null]
inline def parseDate(value: String, formats: String): js.Date | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("parseDate")(value.asInstanceOf[js.Any], formats.asInstanceOf[js.Any])).asInstanceOf[js.Date | Null]
inline def parseDate(value: String, formats: String, culture: String): js.Date | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("parseDate")(value.asInstanceOf[js.Any], formats.asInstanceOf[js.Any], culture.asInstanceOf[js.Any])).asInstanceOf[js.Date | Null]
inline def parseDate(value: String, formats: Any): js.Date | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("parseDate")(value.asInstanceOf[js.Any], formats.asInstanceOf[js.Any])).asInstanceOf[js.Date | Null]
inline def parseDate(value: String, formats: Any, culture: String): js.Date | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("parseDate")(value.asInstanceOf[js.Any], formats.asInstanceOf[js.Any], culture.asInstanceOf[js.Any])).asInstanceOf[js.Date | Null]
inline def parseDate(value: String, formats: Unit, culture: String): js.Date | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("parseDate")(value.asInstanceOf[js.Any], formats.asInstanceOf[js.Any], culture.asInstanceOf[js.Any])).asInstanceOf[js.Date | Null]

inline def parseExactDate(value: String): js.Date | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("parseExactDate")(value.asInstanceOf[js.Any]).asInstanceOf[js.Date | Null]
inline def parseExactDate(value: String, formats: String): js.Date | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("parseExactDate")(value.asInstanceOf[js.Any], formats.asInstanceOf[js.Any])).asInstanceOf[js.Date | Null]
inline def parseExactDate(value: String, formats: String, culture: String): js.Date | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("parseExactDate")(value.asInstanceOf[js.Any], formats.asInstanceOf[js.Any], culture.asInstanceOf[js.Any])).asInstanceOf[js.Date | Null]
inline def parseExactDate(value: String, formats: Any): js.Date | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("parseExactDate")(value.asInstanceOf[js.Any], formats.asInstanceOf[js.Any])).asInstanceOf[js.Date | Null]
inline def parseExactDate(value: String, formats: Any, culture: String): js.Date | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("parseExactDate")(value.asInstanceOf[js.Any], formats.asInstanceOf[js.Any], culture.asInstanceOf[js.Any])).asInstanceOf[js.Date | Null]
inline def parseExactDate(value: String, formats: Unit, culture: String): js.Date | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("parseExactDate")(value.asInstanceOf[js.Any], formats.asInstanceOf[js.Any], culture.asInstanceOf[js.Any])).asInstanceOf[js.Date | Null]

inline def parseFloat(value: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("parseFloat")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
inline def parseFloat(value: String, culture: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("parseFloat")(value.asInstanceOf[js.Any], culture.asInstanceOf[js.Any])).asInstanceOf[Double]

inline def parseInt(value: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("parseInt")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
inline def parseInt(value: String, culture: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("parseInt")(value.asInstanceOf[js.Any], culture.asInstanceOf[js.Any])).asInstanceOf[Double]

inline def prompt(text: String, defaultValue: String): JQueryPromise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("prompt")(text.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[JQueryPromise[Any]]

inline def proxyModelSetters(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("proxyModelSetters")().asInstanceOf[Unit]
inline def proxyModelSetters(data: Model): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("proxyModelSetters")(data.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def render(template: js.Function1[/* data */ Any, String], data: js.Array[Any]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(template.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[String]

inline def resize(element: String, force: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resize")(element.asInstanceOf[js.Any], force.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def resize(element: JQuery, force: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resize")(element.asInstanceOf[js.Any], force.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def resize(element: Element, force: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resize")(element.asInstanceOf[js.Any], force.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def saveAs(options: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("saveAs")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def stringify(value: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any]).asInstanceOf[String]

inline def template(template: String): js.Function1[/* data */ Any, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("template")(template.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* data */ Any, String]]
inline def template(template: String, options: TemplateOptions): js.Function1[/* data */ Any, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("template")(template.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* data */ Any, String]]

inline def throttle(fn: js.Function, timeout: Double): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("throttle")(fn.asInstanceOf[js.Any], timeout.asInstanceOf[js.Any])).asInstanceOf[js.Function]

inline def toString_(value: js.Date, format: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toString")(value.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
inline def toString_(value: js.Date, format: String, culture: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toString")(value.asInstanceOf[js.Any], format.asInstanceOf[js.Any], culture.asInstanceOf[js.Any])).asInstanceOf[String]
inline def toString_(value: Double, format: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toString")(value.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
inline def toString_(value: Double, format: String, culture: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toString")(value.asInstanceOf[js.Any], format.asInstanceOf[js.Any], culture.asInstanceOf[js.Any])).asInstanceOf[String]

inline def touchScroller(element: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("touchScroller")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def touchScroller(element: JQuery): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("touchScroller")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def touchScroller(element: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("touchScroller")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def unbind(element: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unbind")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def unbind(element: JQuery): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unbind")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
inline def unbind(element: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unbind")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def version: String = ^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[String]
inline def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])

inline def widgetInstance(element: JQuery): Widget = ^.asInstanceOf[js.Dynamic].applyDynamic("widgetInstance")(element.asInstanceOf[js.Any]).asInstanceOf[Widget]
inline def widgetInstance(element: JQuery, suite: Typeofui): Widget = (^.asInstanceOf[js.Dynamic].applyDynamic("widgetInstance")(element.asInstanceOf[js.Any], suite.asInstanceOf[js.Any])).asInstanceOf[Widget]
inline def widgetInstance(element: JQuery, suite: TypeofuiActionSheet): Widget = (^.asInstanceOf[js.Dynamic].applyDynamic("widgetInstance")(element.asInstanceOf[js.Any], suite.asInstanceOf[js.Any])).asInstanceOf[Widget]
inline def widgetInstance(element: JQuery, suite: TypeofuiArcGauge): Widget = (^.asInstanceOf[js.Dynamic].applyDynamic("widgetInstance")(element.asInstanceOf[js.Any], suite.asInstanceOf[js.Any])).asInstanceOf[Widget]
