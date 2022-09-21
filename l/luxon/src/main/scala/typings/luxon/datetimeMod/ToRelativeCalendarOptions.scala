package typings.luxon.datetimeMod

import typings.luxon.miscMod.NumberingSystem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToRelativeCalendarOptions extends StObject {
  
  /**
    * The DateTime to use as the basis to which this time is compared
    * @default now
    */
  var base: js.UndefOr[DateTime] = js.undefined
  
  /**
    * Override the locale of this DateTime
    */
  var locale: js.UndefOr[String] = js.undefined
  
  /**
    * Override the numberingSystem of this DateTime.
    * The Intl system may choose not to honor this.
    */
  var numberingSystem: js.UndefOr[NumberingSystem] = js.undefined
  
  /** If omitted, the method will pick the unit. */
  var unit: js.UndefOr[ToRelativeUnit] = js.undefined
}
object ToRelativeCalendarOptions {
  
  inline def apply(): ToRelativeCalendarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToRelativeCalendarOptions]
  }
  
  extension [Self <: ToRelativeCalendarOptions](x: Self) {
    
    inline def setBase(value: DateTime): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    inline def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setNumberingSystem(value: NumberingSystem): Self = StObject.set(x, "numberingSystem", value.asInstanceOf[js.Any])
    
    inline def setNumberingSystemUndefined: Self = StObject.set(x, "numberingSystem", js.undefined)
    
    inline def setUnit(value: ToRelativeUnit): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
  }
}
