package typings.luxon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DurationOptions extends StObject {
  
  var conversionAccuracy: js.UndefOr[ConversionAccuracy] = js.native
  
  var locale: js.UndefOr[String] = js.native
  
  var numberingSystem: js.UndefOr[NumberingSystem] = js.native
}
object DurationOptions {
  
  @scala.inline
  def apply(): DurationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DurationOptions]
  }
  
  @scala.inline
  implicit class DurationOptionsMutableBuilder[Self <: DurationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConversionAccuracy(value: ConversionAccuracy): Self = StObject.set(x, "conversionAccuracy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConversionAccuracyUndefined: Self = StObject.set(x, "conversionAccuracy", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setNumberingSystem(value: NumberingSystem): Self = StObject.set(x, "numberingSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberingSystemUndefined: Self = StObject.set(x, "numberingSystem", js.undefined)
  }
}
