package typings.googlepay.google.payments.api

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Data for a [[PaymentMethodType|`PaymentMethodType.CARD`]] payment
  * method.
  */
trait CardInfo extends StObject {
  
  /*
    *  AssuranceDetails
    *
    *  This object provides information about what validation
    *  has been performed on the returned payment credentials
    *  so that appropriate instrument risk checks can be applied.
    *
    *  To receive this object, set assuranceDetailsRequired: true inside CardParameters
    */
  var assuranceDetails: js.UndefOr[AssuranceDetails] = js.undefined
  
  /**
    * The billing address associated with the card.
    *
    * Note this billing address will only be populated when billing address
    * is set as required through
    * [[CardParameters.billingAddressRequired|`CardParameters.billingAddressRequired`]].
    */
  var billingAddress: js.UndefOr[Address] = js.undefined
  
  /**
    * The details about the card.
    *
    * This value will be generally the last 4 digits of the card.
    *
    * These details **should not** be displayed to the buyer,
    * but can be used when the details of a buyer's card are needed. An
    * example would be for customer support to help the buyer identify the
    * card used for this transaction. For a user-visible description, use
    * [[PaymentMethodData.description|`PaymentMethodData.description`]]
    * instead.
    */
  var cardDetails: String
  
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
object CardInfo {
  
  inline def apply(cardDetails: String, cardNetwork: CardNetwork): CardInfo = {
    val __obj = js.Dynamic.literal(cardDetails = cardDetails.asInstanceOf[js.Any], cardNetwork = cardNetwork.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CardInfo] (val x: Self) extends AnyVal {
    
    inline def setAssuranceDetails(value: AssuranceDetails): Self = StObject.set(x, "assuranceDetails", value.asInstanceOf[js.Any])
    
    inline def setAssuranceDetailsUndefined: Self = StObject.set(x, "assuranceDetails", js.undefined)
    
    inline def setBillingAddress(value: Address): Self = StObject.set(x, "billingAddress", value.asInstanceOf[js.Any])
    
    inline def setBillingAddressUndefined: Self = StObject.set(x, "billingAddress", js.undefined)
    
    inline def setCardDetails(value: String): Self = StObject.set(x, "cardDetails", value.asInstanceOf[js.Any])
    
    inline def setCardNetwork(value: CardNetwork): Self = StObject.set(x, "cardNetwork", value.asInstanceOf[js.Any])
  }
}
