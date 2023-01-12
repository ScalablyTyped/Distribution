package typings.googlepay.google.payments.api

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Definition for each offer to be applied to this Payment Request.
  */
trait OfferDetail extends StObject {
  
  /**
    * Description for the offer visible to the user to inform them about
    * the offer. The description is displayed in buyflow and should be less
    * than 60 characters long.
    */
  var description: String
  
  /**
    * Redemption code available for this transaction. This is used to
    * identify the offer when the user decides to apply the offer.
    */
  var redemptionCode: String
}
object OfferDetail {
  
  inline def apply(description: String, redemptionCode: String): OfferDetail = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], redemptionCode = redemptionCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[OfferDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OfferDetail] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setRedemptionCode(value: String): Self = StObject.set(x, "redemptionCode", value.asInstanceOf[js.Any])
  }
}
