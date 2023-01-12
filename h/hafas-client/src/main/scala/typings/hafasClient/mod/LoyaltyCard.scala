package typings.hafasClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoyaltyCard extends StObject {
  
  var `class`: js.UndefOr[Double] = js.undefined
  
  var discount: js.UndefOr[Double] = js.undefined
  
  var `type`: String
}
object LoyaltyCard {
  
  inline def apply(`type`: String): LoyaltyCard = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoyaltyCard]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LoyaltyCard] (val x: Self) extends AnyVal {
    
    inline def setClass(value: Double): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
    
    inline def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
    
    inline def setDiscount(value: Double): Self = StObject.set(x, "discount", value.asInstanceOf[js.Any])
    
    inline def setDiscountUndefined: Self = StObject.set(x, "discount", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
