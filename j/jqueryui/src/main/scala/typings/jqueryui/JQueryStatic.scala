package typings.jqueryui

import typings.jqueryui.JQueryUI.AccordionOptions
import typings.jqueryui.JQueryUI.Datepicker
import typings.jqueryui.JQueryUI.UI
import typings.jqueryui.JQueryUI.Widget
import typings.jqueryui.JQueryUI.WidgetCommonProperties
import typings.jqueryui.JQueryUI.WidgetOptions
import typings.std.ThisType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQueryStatic extends js.Object {
  @JSName("Widget")
  var Widget_Original: Widget = js.native
  @JSName("datepicker")
  var datepicker_Original: Datepicker = js.native
  var ui: UI = js.native
  @JSName("widget")
  var widget_Original: Widget = js.native
  def Widget(methodName: String): JQuery = js.native
  def Widget(optionLiteral: String, optionName: String): js.Any = js.native
  def Widget(optionLiteral: String, optionName: String, optionValue: js.Any): JQuery = js.native
  def Widget(optionLiteral: String, options: WidgetOptions): js.Any = js.native
  def Widget(options: AccordionOptions): JQuery = js.native
  def Widget(options: WidgetOptions): JQuery = js.native
  def Widget[T](name: String, base: js.Function, prototype: T with (ThisType[T with WidgetCommonProperties])): JQuery = js.native
  def Widget[T](name: String, prototype: T with (ThisType[T with WidgetCommonProperties])): JQuery = js.native
  def datepicker(methodName: String): JQuery = js.native
  def datepicker(optionLiteral: String, optionName: String): js.Any = js.native
  def datepicker(optionLiteral: String, optionName: String, optionValue: js.Any): JQuery = js.native
  def datepicker(optionLiteral: String, options: WidgetOptions): js.Any = js.native
  def datepicker(options: AccordionOptions): JQuery = js.native
  def datepicker(options: WidgetOptions): JQuery = js.native
  def datepicker[T](name: String, base: js.Function, prototype: T with (ThisType[T with WidgetCommonProperties])): JQuery = js.native
  def datepicker[T](name: String, prototype: T with (ThisType[T with WidgetCommonProperties])): JQuery = js.native
  def widget(methodName: String): JQuery = js.native
  def widget(optionLiteral: String, optionName: String): js.Any = js.native
  def widget(optionLiteral: String, optionName: String, optionValue: js.Any): JQuery = js.native
  def widget(optionLiteral: String, options: WidgetOptions): js.Any = js.native
  def widget(options: AccordionOptions): JQuery = js.native
  def widget(options: WidgetOptions): JQuery = js.native
  def widget[T](name: String, base: js.Function, prototype: T with (ThisType[T with WidgetCommonProperties])): JQuery = js.native
  def widget[T](name: String, prototype: T with (ThisType[T with WidgetCommonProperties])): JQuery = js.native
}

