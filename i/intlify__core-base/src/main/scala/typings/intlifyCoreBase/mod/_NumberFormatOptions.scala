package typings.intlifyCoreBase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _NumberFormatOptions extends StObject
object _NumberFormatOptions {
  
  inline def CurrencyNumberFormatOptions(currency: String): typings.intlifyCoreBase.mod.CurrencyNumberFormatOptions = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], style = "currency")
    __obj.asInstanceOf[typings.intlifyCoreBase.mod.CurrencyNumberFormatOptions]
  }
  
  inline def SpecificNumberFormatOptions(): typings.intlifyCoreBase.mod.SpecificNumberFormatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typings.intlifyCoreBase.mod.SpecificNumberFormatOptions]
  }
}
