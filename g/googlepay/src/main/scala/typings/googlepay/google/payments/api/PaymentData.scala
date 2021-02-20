package typings.googlepay.google.payments.api

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Payment data.
  *
  * Contains the payment data requested in
  * [[PaymentDataRequest|`PaymentDataRequest`]]
  */
@js.native
trait PaymentData extends StObject {
  
  /**
    * Major API version.
    *
    * This value will match what was set in
    * [[PaymentDataRequest.apiVersion|`PaymentDataRequest.apiVersion`]].
    */
  var apiVersion: Double = js.native
  
  /**
    * Minor API version.
    *
    * This value will match what was set in
    * [[PaymentDataRequest.apiVersionMinor|`PaymentDataRequest.apiVersionMinor`]].
    */
  var apiVersionMinor: Double = js.native
  
  /**
    * The buyer's email.
    *
    * This value will only be set if
    * [[PaymentDataRequest.emailRequired|`PaymentDataRequest.emailRequired`]]
    * was set to `true`.
    */
  var email: js.UndefOr[String] = js.native
  
  /**
    * Data about the selected payment method.
    */
  var paymentMethodData: PaymentMethodData = js.native
  
  /**
    * The shipping address.
    *
    * This object will only be returned if
    * [[PaymentDataRequest.shippingAddressRequired|`PaymentDataRequest.shippingAddressRequired`]]
    * was set to `true`.
    */
  var shippingAddress: js.UndefOr[Address] = js.native
  
  /**
    * Contains the data for shipping option selected by the user.
    */
  var shippingOptionData: js.UndefOr[SelectionOptionData] = js.native
}
object PaymentData {
  
  @scala.inline
  def apply(apiVersion: Double, apiVersionMinor: Double, paymentMethodData: PaymentMethodData): PaymentData = {
    val __obj = js.Dynamic.literal(apiVersion = apiVersion.asInstanceOf[js.Any], apiVersionMinor = apiVersionMinor.asInstanceOf[js.Any], paymentMethodData = paymentMethodData.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentData]
  }
  
  @scala.inline
  implicit class PaymentDataMutableBuilder[Self <: PaymentData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiVersion(value: Double): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiVersionMinor(value: Double): Self = StObject.set(x, "apiVersionMinor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setPaymentMethodData(value: PaymentMethodData): Self = StObject.set(x, "paymentMethodData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShippingAddress(value: Address): Self = StObject.set(x, "shippingAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShippingAddressUndefined: Self = StObject.set(x, "shippingAddress", js.undefined)
    
    @scala.inline
    def setShippingOptionData(value: SelectionOptionData): Self = StObject.set(x, "shippingOptionData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShippingOptionDataUndefined: Self = StObject.set(x, "shippingOptionData", js.undefined)
  }
}
