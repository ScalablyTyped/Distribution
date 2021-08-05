package typings.ipp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PPScanRegions extends StObject {
  
  var `x-dimension`: js.UndefOr[Double] = js.undefined
  
  var `x-origin`: js.UndefOr[Double] = js.undefined
  
  var `y-dimension`: js.UndefOr[Double] = js.undefined
  
  var `y-origin`: js.UndefOr[Double] = js.undefined
}
object PPScanRegions {
  
  inline def apply(): PPScanRegions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PPScanRegions]
  }
  
  extension [Self <: PPScanRegions](x: Self) {
    
    inline def `setX-dimension`(value: Double): Self = StObject.set(x, "x-dimension", value.asInstanceOf[js.Any])
    
    inline def `setX-dimensionUndefined`: Self = StObject.set(x, "x-dimension", js.undefined)
    
    inline def `setX-origin`(value: Double): Self = StObject.set(x, "x-origin", value.asInstanceOf[js.Any])
    
    inline def `setX-originUndefined`: Self = StObject.set(x, "x-origin", js.undefined)
    
    inline def `setY-dimension`(value: Double): Self = StObject.set(x, "y-dimension", value.asInstanceOf[js.Any])
    
    inline def `setY-dimensionUndefined`: Self = StObject.set(x, "y-dimension", js.undefined)
    
    inline def `setY-origin`(value: Double): Self = StObject.set(x, "y-origin", value.asInstanceOf[js.Any])
    
    inline def `setY-originUndefined`: Self = StObject.set(x, "y-origin", js.undefined)
  }
}
