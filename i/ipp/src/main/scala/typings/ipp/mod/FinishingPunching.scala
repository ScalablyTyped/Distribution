package typings.ipp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FinishingPunching extends StObject {
  
  var `punching-locations`: js.UndefOr[js.Array[Double]] = js.undefined
  
  var `punching-offset`: js.UndefOr[Double] = js.undefined
  
  var `punching-reference-edge`: js.UndefOr[ReferenceEdge] = js.undefined
}
object FinishingPunching {
  
  inline def apply(): FinishingPunching = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FinishingPunching]
  }
  
  extension [Self <: FinishingPunching](x: Self) {
    
    inline def `setPunching-locations`(value: js.Array[Double]): Self = StObject.set(x, "punching-locations", value.asInstanceOf[js.Any])
    
    inline def `setPunching-locationsUndefined`: Self = StObject.set(x, "punching-locations", js.undefined)
    
    inline def `setPunching-locationsVarargs`(value: Double*): Self = StObject.set(x, "punching-locations", js.Array(value :_*))
    
    inline def `setPunching-offset`(value: Double): Self = StObject.set(x, "punching-offset", value.asInstanceOf[js.Any])
    
    inline def `setPunching-offsetUndefined`: Self = StObject.set(x, "punching-offset", js.undefined)
    
    inline def `setPunching-reference-edge`(value: ReferenceEdge): Self = StObject.set(x, "punching-reference-edge", value.asInstanceOf[js.Any])
    
    inline def `setPunching-reference-edgeUndefined`: Self = StObject.set(x, "punching-reference-edge", js.undefined)
  }
}
