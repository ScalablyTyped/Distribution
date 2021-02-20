package typings.jqueryui.JQueryUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatepickerFormatDateOptions extends StObject {
  
  var dayNames: js.UndefOr[js.Array[String]] = js.native
  
  var dayNamesShort: js.UndefOr[js.Array[String]] = js.native
  
  var monthNames: js.UndefOr[js.Array[String]] = js.native
  
  var monthNamesShort: js.UndefOr[js.Array[String]] = js.native
}
object DatepickerFormatDateOptions {
  
  @scala.inline
  def apply(): DatepickerFormatDateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatepickerFormatDateOptions]
  }
  
  @scala.inline
  implicit class DatepickerFormatDateOptionsMutableBuilder[Self <: DatepickerFormatDateOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDayNames(value: js.Array[String]): Self = StObject.set(x, "dayNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDayNamesShort(value: js.Array[String]): Self = StObject.set(x, "dayNamesShort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDayNamesShortUndefined: Self = StObject.set(x, "dayNamesShort", js.undefined)
    
    @scala.inline
    def setDayNamesShortVarargs(value: String*): Self = StObject.set(x, "dayNamesShort", js.Array(value :_*))
    
    @scala.inline
    def setDayNamesUndefined: Self = StObject.set(x, "dayNames", js.undefined)
    
    @scala.inline
    def setDayNamesVarargs(value: String*): Self = StObject.set(x, "dayNames", js.Array(value :_*))
    
    @scala.inline
    def setMonthNames(value: js.Array[String]): Self = StObject.set(x, "monthNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonthNamesShort(value: js.Array[String]): Self = StObject.set(x, "monthNamesShort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonthNamesShortUndefined: Self = StObject.set(x, "monthNamesShort", js.undefined)
    
    @scala.inline
    def setMonthNamesShortVarargs(value: String*): Self = StObject.set(x, "monthNamesShort", js.Array(value :_*))
    
    @scala.inline
    def setMonthNamesUndefined: Self = StObject.set(x, "monthNames", js.undefined)
    
    @scala.inline
    def setMonthNamesVarargs(value: String*): Self = StObject.set(x, "monthNames", js.Array(value :_*))
  }
}
