package typings.luxon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiffOptions extends StObject {
  
  var conversionAccuracy: js.UndefOr[ConversionAccuracy] = js.native
}
object DiffOptions {
  
  @scala.inline
  def apply(): DiffOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiffOptions]
  }
  
  @scala.inline
  implicit class DiffOptionsMutableBuilder[Self <: DiffOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConversionAccuracy(value: ConversionAccuracy): Self = StObject.set(x, "conversionAccuracy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConversionAccuracyUndefined: Self = StObject.set(x, "conversionAccuracy", js.undefined)
  }
}
