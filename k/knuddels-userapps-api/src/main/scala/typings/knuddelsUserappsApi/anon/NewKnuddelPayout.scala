package typings.knuddelsUserappsApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NewKnuddelPayout extends StObject {
  
  var newKnuddelPayout: js.UndefOr[Double] = js.undefined
  
  var newPriceCents: js.UndefOr[Double] = js.undefined
  
  var origKnuddelPayout: Double
  
  var origPriceCents: Double
  
  var productId: String
}
object NewKnuddelPayout {
  
  inline def apply(origKnuddelPayout: Double, origPriceCents: Double, productId: String): NewKnuddelPayout = {
    val __obj = js.Dynamic.literal(origKnuddelPayout = origKnuddelPayout.asInstanceOf[js.Any], origPriceCents = origPriceCents.asInstanceOf[js.Any], productId = productId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewKnuddelPayout]
  }
  
  extension [Self <: NewKnuddelPayout](x: Self) {
    
    inline def setNewKnuddelPayout(value: Double): Self = StObject.set(x, "newKnuddelPayout", value.asInstanceOf[js.Any])
    
    inline def setNewKnuddelPayoutUndefined: Self = StObject.set(x, "newKnuddelPayout", js.undefined)
    
    inline def setNewPriceCents(value: Double): Self = StObject.set(x, "newPriceCents", value.asInstanceOf[js.Any])
    
    inline def setNewPriceCentsUndefined: Self = StObject.set(x, "newPriceCents", js.undefined)
    
    inline def setOrigKnuddelPayout(value: Double): Self = StObject.set(x, "origKnuddelPayout", value.asInstanceOf[js.Any])
    
    inline def setOrigPriceCents(value: Double): Self = StObject.set(x, "origPriceCents", value.asInstanceOf[js.Any])
    
    inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
  }
}
