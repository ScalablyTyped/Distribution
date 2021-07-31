package typings.googlepay.google.payments.api

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Intermediate version of payment data.
  *
  * Contains limited user information for developer callbacks.
  */
trait IntermediatePaymentData extends StObject {
  
  /**
    * Indicate the changing field that triggers the callback.
    */
  var callbackTrigger: js.Array[CallbackTrigger]
  
  /**
    * Contains limited data for user selected card information.
    */
  var paymentMethodData: IntermediatePaymentMethodData
  
  /**
    * Contains limited data for user selected shipping address information.
    */
  var shippingAddress: js.UndefOr[IntermediateAddress] = js.undefined
  
  /**
    * Contains the data for shipping option selected by the user.
    */
  var shippingOptionData: js.UndefOr[SelectionOptionData] = js.undefined
}
object IntermediatePaymentData {
  
  @scala.inline
  def apply(callbackTrigger: js.Array[CallbackTrigger], paymentMethodData: IntermediatePaymentMethodData): IntermediatePaymentData = {
    val __obj = js.Dynamic.literal(callbackTrigger = callbackTrigger.asInstanceOf[js.Any], paymentMethodData = paymentMethodData.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntermediatePaymentData]
  }
  
  @scala.inline
  implicit class IntermediatePaymentDataMutableBuilder[Self <: IntermediatePaymentData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallbackTrigger(value: js.Array[CallbackTrigger]): Self = StObject.set(x, "callbackTrigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallbackTriggerVarargs(value: CallbackTrigger*): Self = StObject.set(x, "callbackTrigger", js.Array(value :_*))
    
    @scala.inline
    def setPaymentMethodData(value: IntermediatePaymentMethodData): Self = StObject.set(x, "paymentMethodData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShippingAddress(value: IntermediateAddress): Self = StObject.set(x, "shippingAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShippingAddressUndefined: Self = StObject.set(x, "shippingAddress", js.undefined)
    
    @scala.inline
    def setShippingOptionData(value: SelectionOptionData): Self = StObject.set(x, "shippingOptionData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShippingOptionDataUndefined: Self = StObject.set(x, "shippingOptionData", js.undefined)
  }
}
