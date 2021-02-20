package typings.ipp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FinishingPunching extends StObject {
  
  var `punching-locations`: js.UndefOr[js.Array[Double]] = js.native
  
  var `punching-offset`: js.UndefOr[Double] = js.native
  
  var `punching-reference-edge`: js.UndefOr[ReferenceEdge] = js.native
}
object FinishingPunching {
  
  @scala.inline
  def apply(): FinishingPunching = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FinishingPunching]
  }
  
  @scala.inline
  implicit class FinishingPunchingMutableBuilder[Self <: FinishingPunching] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setPunching-locations`(value: js.Array[Double]): Self = StObject.set(x, "punching-locations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPunching-locationsUndefined`: Self = StObject.set(x, "punching-locations", js.undefined)
    
    @scala.inline
    def `setPunching-locationsVarargs`(value: Double*): Self = StObject.set(x, "punching-locations", js.Array(value :_*))
    
    @scala.inline
    def `setPunching-offset`(value: Double): Self = StObject.set(x, "punching-offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPunching-offsetUndefined`: Self = StObject.set(x, "punching-offset", js.undefined)
    
    @scala.inline
    def `setPunching-reference-edge`(value: ReferenceEdge): Self = StObject.set(x, "punching-reference-edge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPunching-reference-edgeUndefined`: Self = StObject.set(x, "punching-reference-edge", js.undefined)
  }
}
