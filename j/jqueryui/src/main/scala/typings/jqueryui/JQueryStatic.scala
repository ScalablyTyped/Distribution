package typings.jqueryui

import typings.jqueryui.JQueryUI.AccordionOptions
import typings.jqueryui.JQueryUI.Datepicker
import typings.jqueryui.JQueryUI.UI
import typings.jqueryui.JQueryUI.Widget
import typings.jqueryui.JQueryUI.WidgetCommonProperties
import typings.jqueryui.JQueryUI.WidgetOptions
import typings.std.ThisType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQueryStatic extends StObject {
  
  def Widget(methodName: String): JQuery
  def Widget(optionLiteral: String, optionName: String): Any
  def Widget(optionLiteral: String, optionName: String, optionValue: Any): JQuery
  def Widget(optionLiteral: String, options: WidgetOptions): Any
  def Widget(options: AccordionOptions): JQuery
  def Widget(options: WidgetOptions): JQuery
  def Widget[T](name: String, base: js.Function, prototype: T & (ThisType[T & WidgetCommonProperties])): JQuery
  def Widget[T](name: String, prototype: T & (ThisType[T & WidgetCommonProperties])): JQuery
  @JSName("Widget")
  var Widget_Original: Widget
  
  def datepicker(methodName: String): JQuery
  def datepicker(optionLiteral: String, optionName: String): Any
  def datepicker(optionLiteral: String, optionName: String, optionValue: Any): JQuery
  def datepicker(optionLiteral: String, options: WidgetOptions): Any
  def datepicker(options: AccordionOptions): JQuery
  def datepicker(options: WidgetOptions): JQuery
  def datepicker[T](name: String, base: js.Function, prototype: T & (ThisType[T & WidgetCommonProperties])): JQuery
  def datepicker[T](name: String, prototype: T & (ThisType[T & WidgetCommonProperties])): JQuery
  @JSName("datepicker")
  var datepicker_Original: Datepicker
  
  var ui: UI
  
  def widget(methodName: String): JQuery
  def widget(optionLiteral: String, optionName: String): Any
  def widget(optionLiteral: String, optionName: String, optionValue: Any): JQuery
  def widget(optionLiteral: String, options: WidgetOptions): Any
  def widget(options: AccordionOptions): JQuery
  def widget(options: WidgetOptions): JQuery
  def widget[T](name: String, base: js.Function, prototype: T & (ThisType[T & WidgetCommonProperties])): JQuery
  def widget[T](name: String, prototype: T & (ThisType[T & WidgetCommonProperties])): JQuery
  @JSName("widget")
  var widget_Original: Widget
}
object JQueryStatic {
  
  inline def apply(Widget: Widget, datepicker: Datepicker, ui: UI, widget: Widget): JQueryStatic = {
    val __obj = js.Dynamic.literal(Widget = Widget.asInstanceOf[js.Any], datepicker = datepicker.asInstanceOf[js.Any], ui = ui.asInstanceOf[js.Any], widget = widget.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryStatic]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JQueryStatic] (val x: Self) extends AnyVal {
    
    inline def setDatepicker(value: Datepicker): Self = StObject.set(x, "datepicker", value.asInstanceOf[js.Any])
    
    inline def setUi(value: UI): Self = StObject.set(x, "ui", value.asInstanceOf[js.Any])
    
    inline def setWidget(value: Widget): Self = StObject.set(x, "Widget", value.asInstanceOf[js.Any])
  }
}
