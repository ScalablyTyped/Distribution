package typings.luxon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DurationOptions extends StObject {
  
  var conversionAccuracy: js.UndefOr[ConversionAccuracy] = js.undefined
  
  var locale: js.UndefOr[String] = js.undefined
  
  var numberingSystem: js.UndefOr[NumberingSystem] = js.undefined
}
object DurationOptions {
  
  inline def apply(): DurationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DurationOptions]
  }
  
  extension [Self <: DurationOptions](x: Self) {
    
    inline def setConversionAccuracy(value: ConversionAccuracy): Self = StObject.set(x, "conversionAccuracy", value.asInstanceOf[js.Any])
    
    inline def setConversionAccuracyUndefined: Self = StObject.set(x, "conversionAccuracy", js.undefined)
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setNumberingSystem(value: NumberingSystem): Self = StObject.set(x, "numberingSystem", value.asInstanceOf[js.Any])
    
    inline def setNumberingSystemUndefined: Self = StObject.set(x, "numberingSystem", js.undefined)
  }
}
