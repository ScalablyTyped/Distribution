package typings.ipp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FinishingStitching extends StObject {
  
  var `stitching-angle`: js.UndefOr[Double] = js.undefined
  
  var `stitching-locations`: js.UndefOr[js.Array[Double]] = js.undefined
  
  var `stitching-method`: js.UndefOr[StitchingMethod] = js.undefined
  
  var `stitching-offset`: js.UndefOr[Double] = js.undefined
  
  var `stitching-reference-edge`: js.UndefOr[ReferenceEdge] = js.undefined
}
object FinishingStitching {
  
  inline def apply(): FinishingStitching = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FinishingStitching]
  }
  
  extension [Self <: FinishingStitching](x: Self) {
    
    inline def `setStitching-angle`(value: Double): Self = StObject.set(x, "stitching-angle", value.asInstanceOf[js.Any])
    
    inline def `setStitching-angleUndefined`: Self = StObject.set(x, "stitching-angle", js.undefined)
    
    inline def `setStitching-locations`(value: js.Array[Double]): Self = StObject.set(x, "stitching-locations", value.asInstanceOf[js.Any])
    
    inline def `setStitching-locationsUndefined`: Self = StObject.set(x, "stitching-locations", js.undefined)
    
    inline def `setStitching-locationsVarargs`(value: Double*): Self = StObject.set(x, "stitching-locations", js.Array(value :_*))
    
    inline def `setStitching-method`(value: StitchingMethod): Self = StObject.set(x, "stitching-method", value.asInstanceOf[js.Any])
    
    inline def `setStitching-methodUndefined`: Self = StObject.set(x, "stitching-method", js.undefined)
    
    inline def `setStitching-offset`(value: Double): Self = StObject.set(x, "stitching-offset", value.asInstanceOf[js.Any])
    
    inline def `setStitching-offsetUndefined`: Self = StObject.set(x, "stitching-offset", js.undefined)
    
    inline def `setStitching-reference-edge`(value: ReferenceEdge): Self = StObject.set(x, "stitching-reference-edge", value.asInstanceOf[js.Any])
    
    inline def `setStitching-reference-edgeUndefined`: Self = StObject.set(x, "stitching-reference-edge", js.undefined)
  }
}
