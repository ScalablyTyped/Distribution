package typings.ipp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FinishingFolding extends StObject {
  
  var `folding-direction`: js.UndefOr[FoldingDirection] = js.undefined
  
  var `folding-offset`: js.UndefOr[Double] = js.undefined
  
  var `folding-reference-edge`: js.UndefOr[ReferenceEdge] = js.undefined
}
object FinishingFolding {
  
  @scala.inline
  def apply(): FinishingFolding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FinishingFolding]
  }
  
  @scala.inline
  implicit class FinishingFoldingMutableBuilder[Self <: FinishingFolding] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setFolding-direction`(value: FoldingDirection): Self = StObject.set(x, "folding-direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFolding-directionUndefined`: Self = StObject.set(x, "folding-direction", js.undefined)
    
    @scala.inline
    def `setFolding-offset`(value: Double): Self = StObject.set(x, "folding-offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFolding-offsetUndefined`: Self = StObject.set(x, "folding-offset", js.undefined)
    
    @scala.inline
    def `setFolding-reference-edge`(value: ReferenceEdge): Self = StObject.set(x, "folding-reference-edge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFolding-reference-edgeUndefined`: Self = StObject.set(x, "folding-reference-edge", js.undefined)
  }
}
