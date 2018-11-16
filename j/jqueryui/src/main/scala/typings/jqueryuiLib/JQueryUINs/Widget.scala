package typings
package jqueryuiLib.JQueryUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Widget extends js.Object {
  def apply(methodName: java.lang.String): jqueryuiLib.JQuery = js.native
  def apply(optionLiteral: java.lang.String, optionName: java.lang.String): js.Any = js.native
  def apply(optionLiteral: java.lang.String, optionName: java.lang.String, optionValue: js.Any): jqueryuiLib.JQuery = js.native
  def apply(optionLiteral: java.lang.String, options: WidgetOptions): js.Any = js.native
  def apply(options: AccordionOptions): jqueryuiLib.JQuery = js.native
  def apply(options: WidgetOptions): jqueryuiLib.JQuery = js.native
  def apply[T](
    name: java.lang.String,
    base: js.Function,
    prototype: T with (stdLib.ThisType[T with WidgetCommonProperties])
  ): jqueryuiLib.JQuery = js.native
  def apply[T](name: java.lang.String, prototype: T with (stdLib.ThisType[T with WidgetCommonProperties])): jqueryuiLib.JQuery = js.native
}

