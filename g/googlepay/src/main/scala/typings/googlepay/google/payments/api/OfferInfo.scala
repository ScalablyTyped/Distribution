package typings.googlepay.google.payments.api

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Definition of merchant provided offers that may be applicable to the
  * current order.
  */
trait OfferInfo extends StObject {
  
  /**
    * List of merchant provided offers applicable to the current order.
    */
  var offers: js.Array[OfferDetail]
}
object OfferInfo {
  
  inline def apply(offers: js.Array[OfferDetail]): OfferInfo = {
    val __obj = js.Dynamic.literal(offers = offers.asInstanceOf[js.Any])
    __obj.asInstanceOf[OfferInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OfferInfo] (val x: Self) extends AnyVal {
    
    inline def setOffers(value: js.Array[OfferDetail]): Self = StObject.set(x, "offers", value.asInstanceOf[js.Any])
    
    inline def setOffersVarargs(value: OfferDetail*): Self = StObject.set(x, "offers", js.Array(value*))
  }
}
