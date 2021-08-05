package typings.ipp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FinishingBinding extends StObject {
  
  var `binding-reference-edge`: js.UndefOr[ReferenceEdge] = js.undefined
  
  var `binding-type`: js.UndefOr[BindingType] = js.undefined
}
object FinishingBinding {
  
  inline def apply(): FinishingBinding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FinishingBinding]
  }
  
  extension [Self <: FinishingBinding](x: Self) {
    
    inline def `setBinding-reference-edge`(value: ReferenceEdge): Self = StObject.set(x, "binding-reference-edge", value.asInstanceOf[js.Any])
    
    inline def `setBinding-reference-edgeUndefined`: Self = StObject.set(x, "binding-reference-edge", js.undefined)
    
    inline def `setBinding-type`(value: BindingType): Self = StObject.set(x, "binding-type", value.asInstanceOf[js.Any])
    
    inline def `setBinding-typeUndefined`: Self = StObject.set(x, "binding-type", js.undefined)
  }
}
