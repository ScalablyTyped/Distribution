package typings.maximMazurokGapiClientBooks.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LayerId extends StObject {
  
  var allowedCharacterCount: js.UndefOr[Double] = js.native
  
  var layerId: js.UndefOr[String] = js.native
  
  var limitType: js.UndefOr[String] = js.native
  
  var remainingCharacterCount: js.UndefOr[Double] = js.native
  
  var updated: js.UndefOr[String] = js.native
}
object LayerId {
  
  @scala.inline
  def apply(): LayerId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayerId]
  }
  
  @scala.inline
  implicit class LayerIdMutableBuilder[Self <: LayerId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowedCharacterCount(value: Double): Self = StObject.set(x, "allowedCharacterCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedCharacterCountUndefined: Self = StObject.set(x, "allowedCharacterCount", js.undefined)
    
    @scala.inline
    def setLayerId(value: String): Self = StObject.set(x, "layerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerIdUndefined: Self = StObject.set(x, "layerId", js.undefined)
    
    @scala.inline
    def setLimitType(value: String): Self = StObject.set(x, "limitType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitTypeUndefined: Self = StObject.set(x, "limitType", js.undefined)
    
    @scala.inline
    def setRemainingCharacterCount(value: Double): Self = StObject.set(x, "remainingCharacterCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemainingCharacterCountUndefined: Self = StObject.set(x, "remainingCharacterCount", js.undefined)
    
    @scala.inline
    def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
  }
}
