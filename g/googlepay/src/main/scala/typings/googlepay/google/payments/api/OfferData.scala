package typings.googlepay.google.payments.api

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Definition for each offer to be applied to this payment request.
  */
trait OfferData extends StObject {
  
  /**
    * Redemption codes of the offers applied by the user.
    */
  var redemptionCodes: js.Array[String]
}
object OfferData {
  
  inline def apply(redemptionCodes: js.Array[String]): OfferData = {
    val __obj = js.Dynamic.literal(redemptionCodes = redemptionCodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[OfferData]
  }
  
  extension [Self <: OfferData](x: Self) {
    
    inline def setRedemptionCodes(value: js.Array[String]): Self = StObject.set(x, "redemptionCodes", value.asInstanceOf[js.Any])
    
    inline def setRedemptionCodesVarargs(value: String*): Self = StObject.set(x, "redemptionCodes", js.Array(value*))
  }
}
