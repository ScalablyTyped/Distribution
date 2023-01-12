package typings.lokijs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<lokijs.CheckIndexOptions> */
trait PartialCheckIndexOptions extends StObject {
  
  var randomSampling: js.UndefOr[Boolean] = js.undefined
  
  var randomSamplingFactor: js.UndefOr[Double] = js.undefined
  
  var repair: js.UndefOr[Boolean] = js.undefined
}
object PartialCheckIndexOptions {
  
  inline def apply(): PartialCheckIndexOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCheckIndexOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialCheckIndexOptions] (val x: Self) extends AnyVal {
    
    inline def setRandomSampling(value: Boolean): Self = StObject.set(x, "randomSampling", value.asInstanceOf[js.Any])
    
    inline def setRandomSamplingFactor(value: Double): Self = StObject.set(x, "randomSamplingFactor", value.asInstanceOf[js.Any])
    
    inline def setRandomSamplingFactorUndefined: Self = StObject.set(x, "randomSamplingFactor", js.undefined)
    
    inline def setRandomSamplingUndefined: Self = StObject.set(x, "randomSampling", js.undefined)
    
    inline def setRepair(value: Boolean): Self = StObject.set(x, "repair", value.asInstanceOf[js.Any])
    
    inline def setRepairUndefined: Self = StObject.set(x, "repair", js.undefined)
  }
}
