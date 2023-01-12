package typings.intlifyCoreBase.mod

import typings.intlifyCoreBase.intlifyCoreBaseStrings.currency
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CurrencyNumberFormatOptions
  extends StObject
     with typings.std.Intl.NumberFormatOptions
     with _NumberFormatOptions {
  
  @JSName("currencyDisplay")
  var currencyDisplay_CurrencyNumberFormatOptions: js.UndefOr[CurrencyDisplay] = js.undefined
  
  @JSName("currency")
  var currency_CurrencyNumberFormatOptions: String
  
  var formatMatcher: js.UndefOr[FormatMatcher] = js.undefined
  
  @JSName("localeMatcher")
  var localeMatcher_CurrencyNumberFormatOptions: js.UndefOr[LocaleMatcher] = js.undefined
  
  @JSName("style")
  var style_CurrencyNumberFormatOptions: currency
}
object CurrencyNumberFormatOptions {
  
  inline def apply(currency: String): CurrencyNumberFormatOptions = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], style = "currency")
    __obj.asInstanceOf[CurrencyNumberFormatOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CurrencyNumberFormatOptions] (val x: Self) extends AnyVal {
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setCurrencyDisplay(value: CurrencyDisplay): Self = StObject.set(x, "currencyDisplay", value.asInstanceOf[js.Any])
    
    inline def setCurrencyDisplayUndefined: Self = StObject.set(x, "currencyDisplay", js.undefined)
    
    inline def setFormatMatcher(value: FormatMatcher): Self = StObject.set(x, "formatMatcher", value.asInstanceOf[js.Any])
    
    inline def setFormatMatcherUndefined: Self = StObject.set(x, "formatMatcher", js.undefined)
    
    inline def setLocaleMatcher(value: LocaleMatcher): Self = StObject.set(x, "localeMatcher", value.asInstanceOf[js.Any])
    
    inline def setLocaleMatcherUndefined: Self = StObject.set(x, "localeMatcher", js.undefined)
    
    inline def setStyle(value: currency): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
  }
}
