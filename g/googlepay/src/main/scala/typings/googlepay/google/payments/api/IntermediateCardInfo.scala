package typings.googlepay.google.payments.api

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Limited information for a
  * [[PaymentMethodType|`PaymentMethodType.CARD`]] payment method used for
  * developer callbacks.
  */
trait IntermediateCardInfo extends StObject {
  
  /**
    * The card network.
    *
    * This card network value **should not** be displayed to
    * the buyer, but can be used when the details of a buyer's card are
    * needed. An example would be for customer support to help the buyer
    * identify the card used for this transaction. For a user-visible
    * description, use
    * [[PaymentMethodData.description|`PaymentMethodData.description`]]
    * instead.
    */
  var cardNetwork: CardNetwork
}
object IntermediateCardInfo {
  
  inline def apply(cardNetwork: CardNetwork): IntermediateCardInfo = {
    val __obj = js.Dynamic.literal(cardNetwork = cardNetwork.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntermediateCardInfo]
  }
  
  extension [Self <: IntermediateCardInfo](x: Self) {
    
    inline def setCardNetwork(value: CardNetwork): Self = StObject.set(x, "cardNetwork", value.asInstanceOf[js.Any])
  }
}
