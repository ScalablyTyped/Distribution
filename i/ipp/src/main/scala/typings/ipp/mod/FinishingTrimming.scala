package typings.ipp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FinishingTrimming extends StObject {
  
  var `trimming-offset`: js.UndefOr[Double] = js.undefined
  
  var `trimming-reference-edge`: js.UndefOr[ReferenceEdge] = js.undefined
  
  var `trimming-type`: js.UndefOr[TrimmingType] = js.undefined
  
  var `trimming-when`: js.UndefOr[String] = js.undefined
}
object FinishingTrimming {
  
  @scala.inline
  def apply(): FinishingTrimming = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FinishingTrimming]
  }
  
  @scala.inline
  implicit class FinishingTrimmingMutableBuilder[Self <: FinishingTrimming] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setTrimming-offset`(value: Double): Self = StObject.set(x, "trimming-offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setTrimming-offsetUndefined`: Self = StObject.set(x, "trimming-offset", js.undefined)
    
    @scala.inline
    def `setTrimming-reference-edge`(value: ReferenceEdge): Self = StObject.set(x, "trimming-reference-edge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setTrimming-reference-edgeUndefined`: Self = StObject.set(x, "trimming-reference-edge", js.undefined)
    
    @scala.inline
    def `setTrimming-type`(value: TrimmingType): Self = StObject.set(x, "trimming-type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setTrimming-typeUndefined`: Self = StObject.set(x, "trimming-type", js.undefined)
    
    @scala.inline
    def `setTrimming-when`(value: String): Self = StObject.set(x, "trimming-when", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setTrimming-whenUndefined`: Self = StObject.set(x, "trimming-when", js.undefined)
  }
}
