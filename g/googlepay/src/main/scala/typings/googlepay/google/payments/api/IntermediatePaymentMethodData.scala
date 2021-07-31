package typings.googlepay.google.payments.api

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Limited data for a payment method for developer callbacks.
  */
trait IntermediatePaymentMethodData extends StObject {
  
  /**
    * Payment method information.
    *
    * The definition of this field depends
    * on which payment method type was set in
    * [[PaymentMethodData.type|`PaymentMethodData.type`]].
    *
    * - For [[PaymentMethodType|`PaymentMethodType.CARD`]], this field
    *   will be an object conforming to
    *   [[IntermediateCardInfo|`IntermediateCardInfo`]].
    */
  var info: js.UndefOr[IntermediateCardInfo] = js.undefined
  
  /**
    * Type of payment method.
    */
  var `type`: PaymentMethodType
}
object IntermediatePaymentMethodData {
  
  @scala.inline
  def apply(`type`: PaymentMethodType): IntermediatePaymentMethodData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntermediatePaymentMethodData]
  }
  
  @scala.inline
  implicit class IntermediatePaymentMethodDataMutableBuilder[Self <: IntermediatePaymentMethodData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInfo(value: IntermediateCardInfo): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
    
    @scala.inline
    def setType(value: PaymentMethodType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
