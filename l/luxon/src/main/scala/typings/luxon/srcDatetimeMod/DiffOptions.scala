package typings.luxon.srcDatetimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiffOptions extends StObject {
  
  /**
    * @default 'casual'
    */
  var conversionAccuracy: js.UndefOr[ConversionAccuracy] = js.undefined
}
object DiffOptions {
  
  inline def apply(): DiffOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiffOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DiffOptions] (val x: Self) extends AnyVal {
    
    inline def setConversionAccuracy(value: ConversionAccuracy): Self = StObject.set(x, "conversionAccuracy", value.asInstanceOf[js.Any])
    
    inline def setConversionAccuracyUndefined: Self = StObject.set(x, "conversionAccuracy", js.undefined)
  }
}
