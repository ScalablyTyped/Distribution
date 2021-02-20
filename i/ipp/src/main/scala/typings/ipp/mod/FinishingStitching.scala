package typings.ipp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FinishingStitching extends StObject {
  
  var `stitching-angle`: js.UndefOr[Double] = js.native
  
  var `stitching-locations`: js.UndefOr[js.Array[Double]] = js.native
  
  var `stitching-method`: js.UndefOr[StitchingMethod] = js.native
  
  var `stitching-offset`: js.UndefOr[Double] = js.native
  
  var `stitching-reference-edge`: js.UndefOr[ReferenceEdge] = js.native
}
object FinishingStitching {
  
  @scala.inline
  def apply(): FinishingStitching = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FinishingStitching]
  }
  
  @scala.inline
  implicit class FinishingStitchingMutableBuilder[Self <: FinishingStitching] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setStitching-angle`(value: Double): Self = StObject.set(x, "stitching-angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setStitching-angleUndefined`: Self = StObject.set(x, "stitching-angle", js.undefined)
    
    @scala.inline
    def `setStitching-locations`(value: js.Array[Double]): Self = StObject.set(x, "stitching-locations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setStitching-locationsUndefined`: Self = StObject.set(x, "stitching-locations", js.undefined)
    
    @scala.inline
    def `setStitching-locationsVarargs`(value: Double*): Self = StObject.set(x, "stitching-locations", js.Array(value :_*))
    
    @scala.inline
    def `setStitching-method`(value: StitchingMethod): Self = StObject.set(x, "stitching-method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setStitching-methodUndefined`: Self = StObject.set(x, "stitching-method", js.undefined)
    
    @scala.inline
    def `setStitching-offset`(value: Double): Self = StObject.set(x, "stitching-offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setStitching-offsetUndefined`: Self = StObject.set(x, "stitching-offset", js.undefined)
    
    @scala.inline
    def `setStitching-reference-edge`(value: ReferenceEdge): Self = StObject.set(x, "stitching-reference-edge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setStitching-reference-edgeUndefined`: Self = StObject.set(x, "stitching-reference-edge", js.undefined)
  }
}
