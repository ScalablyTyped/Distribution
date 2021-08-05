package typings.luxon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiffOptions extends StObject {
  
  var conversionAccuracy: js.UndefOr[ConversionAccuracy] = js.undefined
}
object DiffOptions {
  
  inline def apply(): DiffOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiffOptions]
  }
  
  extension [Self <: DiffOptions](x: Self) {
    
    inline def setConversionAccuracy(value: ConversionAccuracy): Self = StObject.set(x, "conversionAccuracy", value.asInstanceOf[js.Any])
    
    inline def setConversionAccuracyUndefined: Self = StObject.set(x, "conversionAccuracy", js.undefined)
  }
}
