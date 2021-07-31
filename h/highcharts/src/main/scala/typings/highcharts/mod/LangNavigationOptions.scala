package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LangNavigationOptions extends StObject {
  
  /**
    * (Highcharts, Highstock) Translations for all field names used in popup.
    */
  var popup: js.UndefOr[LangNavigationPopupOptions] = js.undefined
}
object LangNavigationOptions {
  
  @scala.inline
  def apply(): LangNavigationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LangNavigationOptions]
  }
  
  @scala.inline
  implicit class LangNavigationOptionsMutableBuilder[Self <: LangNavigationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPopup(value: LangNavigationPopupOptions): Self = StObject.set(x, "popup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopupUndefined: Self = StObject.set(x, "popup", js.undefined)
  }
}
