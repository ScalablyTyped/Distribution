package typings.intlifyCoreBase.mod

import typings.intlifyCoreBase.intlifyCoreBaseStrings.decimal
import typings.intlifyCoreBase.intlifyCoreBaseStrings.percent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpecificNumberFormatOptions
  extends StObject
     with typings.std.Intl.NumberFormatOptions
     with _NumberFormatOptions {
  
  @JSName("currencyDisplay")
  var currencyDisplay_SpecificNumberFormatOptions: js.UndefOr[CurrencyDisplay] = js.undefined
  
  var formatMatcher: js.UndefOr[FormatMatcher] = js.undefined
  
  @JSName("localeMatcher")
  var localeMatcher_SpecificNumberFormatOptions: js.UndefOr[LocaleMatcher] = js.undefined
  
  @JSName("style")
  var style_SpecificNumberFormatOptions: js.UndefOr[decimal | percent] = js.undefined
}
object SpecificNumberFormatOptions {
  
  inline def apply(): SpecificNumberFormatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpecificNumberFormatOptions]
  }
  
  extension [Self <: SpecificNumberFormatOptions](x: Self) {
    
    inline def setCurrencyDisplay(value: CurrencyDisplay): Self = StObject.set(x, "currencyDisplay", value.asInstanceOf[js.Any])
    
    inline def setCurrencyDisplayUndefined: Self = StObject.set(x, "currencyDisplay", js.undefined)
    
    inline def setFormatMatcher(value: FormatMatcher): Self = StObject.set(x, "formatMatcher", value.asInstanceOf[js.Any])
    
    inline def setFormatMatcherUndefined: Self = StObject.set(x, "formatMatcher", js.undefined)
    
    inline def setLocaleMatcher(value: LocaleMatcher): Self = StObject.set(x, "localeMatcher", value.asInstanceOf[js.Any])
    
    inline def setLocaleMatcherUndefined: Self = StObject.set(x, "localeMatcher", js.undefined)
    
    inline def setStyle(value: decimal | percent): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
