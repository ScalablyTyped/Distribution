package typings.googleapis.prodTtSasportalV1alpha1Mod.prodTtSasportalV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSasPortalFrequencyRange extends StObject {
  
  /**
    * The highest frequency of the frequency range in MHz.
    */
  var highFrequencyMhz: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The lowest frequency of the frequency range in MHz.
    */
  var lowFrequencyMhz: js.UndefOr[Double | Null] = js.undefined
}
object SchemaSasPortalFrequencyRange {
  
  inline def apply(): SchemaSasPortalFrequencyRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSasPortalFrequencyRange]
  }
  
  extension [Self <: SchemaSasPortalFrequencyRange](x: Self) {
    
    inline def setHighFrequencyMhz(value: Double): Self = StObject.set(x, "highFrequencyMhz", value.asInstanceOf[js.Any])
    
    inline def setHighFrequencyMhzNull: Self = StObject.set(x, "highFrequencyMhz", null)
    
    inline def setHighFrequencyMhzUndefined: Self = StObject.set(x, "highFrequencyMhz", js.undefined)
    
    inline def setLowFrequencyMhz(value: Double): Self = StObject.set(x, "lowFrequencyMhz", value.asInstanceOf[js.Any])
    
    inline def setLowFrequencyMhzNull: Self = StObject.set(x, "lowFrequencyMhz", null)
    
    inline def setLowFrequencyMhzUndefined: Self = StObject.set(x, "lowFrequencyMhz", js.undefined)
  }
}
