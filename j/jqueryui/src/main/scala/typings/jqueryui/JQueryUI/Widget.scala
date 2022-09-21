package typings.jqueryui.JQueryUI

import typings.jqueryui.JQuery
import typings.std.ThisType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Widget extends StObject {
  
  def apply(methodName: String): JQuery = js.native
  def apply(optionLiteral: String, optionName: String): Any = js.native
  def apply(optionLiteral: String, optionName: String, optionValue: Any): JQuery = js.native
  def apply(optionLiteral: String, options: WidgetOptions): Any = js.native
  def apply(options: AccordionOptions): JQuery = js.native
  def apply(options: WidgetOptions): JQuery = js.native
  def apply[T](name: String, base: js.Function, prototype: T & (ThisType[T & WidgetCommonProperties])): JQuery = js.native
  def apply[T](name: String, prototype: T & (ThisType[T & WidgetCommonProperties])): JQuery = js.native
}
