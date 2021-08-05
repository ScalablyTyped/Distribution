package typings.luxon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToRelativeOptions extends StObject {
  
  /** The DateTime to use as the basis to which this time is compared. Defaults to now. */
  var base: js.UndefOr[DateTime] = js.undefined
  
  var locale: js.UndefOr[String] = js.undefined
  
  /** The Intl system may choose not to honor this */
  var numberingSystem: js.UndefOr[NumberingSystem] = js.undefined
  
  /**
    * Padding in milliseconds. This allows you to round up the result if it fits inside the threshold.
    * Don't use in combination with {round: false} because the decimal output will include the padding.
    * Defaults to 0.
    */
  var padding: js.UndefOr[Double] = js.undefined
  
  /** Defaults to `true`. */
  var round: js.UndefOr[Boolean] = js.undefined
  
  var style: js.UndefOr[StringUnitLength] = js.undefined
  
  /** If omitted, the method will pick the unit. */
  var unit: js.UndefOr[ToRelativeUnit] = js.undefined
}
object ToRelativeOptions {
  
  inline def apply(): ToRelativeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToRelativeOptions]
  }
  
  extension [Self <: ToRelativeOptions](x: Self) {
    
    inline def setBase(value: DateTime): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    inline def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setNumberingSystem(value: NumberingSystem): Self = StObject.set(x, "numberingSystem", value.asInstanceOf[js.Any])
    
    inline def setNumberingSystemUndefined: Self = StObject.set(x, "numberingSystem", js.undefined)
    
    inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setRound(value: Boolean): Self = StObject.set(x, "round", value.asInstanceOf[js.Any])
    
    inline def setRoundUndefined: Self = StObject.set(x, "round", js.undefined)
    
    inline def setStyle(value: StringUnitLength): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setUnit(value: ToRelativeUnit): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
  }
}
