package typings.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SynthPatchEQFilter extends StObject {
  
  /**
    * Filter Q. Defaults to 1. Lower numbers mean a wider bell.
    */
  var Q: js.UndefOr[Double] = js.undefined
  
  /**
    * Filter frequency.
    */
  var frequency: js.UndefOr[Double] = js.undefined
  
  /**
    * Filter gain. Defaults to 0.
    */
  var gain: js.UndefOr[Double] = js.undefined
}
object SynthPatchEQFilter {
  
  inline def apply(): SynthPatchEQFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SynthPatchEQFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SynthPatchEQFilter] (val x: Self) extends AnyVal {
    
    inline def setFrequency(value: Double): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
    
    inline def setFrequencyUndefined: Self = StObject.set(x, "frequency", js.undefined)
    
    inline def setGain(value: Double): Self = StObject.set(x, "gain", value.asInstanceOf[js.Any])
    
    inline def setGainUndefined: Self = StObject.set(x, "gain", js.undefined)
    
    inline def setQ(value: Double): Self = StObject.set(x, "Q", value.asInstanceOf[js.Any])
    
    inline def setQUndefined: Self = StObject.set(x, "Q", js.undefined)
  }
}
