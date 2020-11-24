package typings.googlepay.google.payments.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Data for a payment method.
  */
@js.native
trait PaymentMethodData extends js.Object {
  
  /**
    * User-facing message to describe the payment method funding this
    * transaction.
    *
    * You are required to show this message to the buyer as confirmation of
    * their funding source. Please refer to the
    * [documentation](https://developers.google.com/pay/api/|documentation)
    * for more information.
    *
    * **IMPORTANT:** Do not attempt to parse the contents of this string as
    * the format, contents, and length may change at any time. If you need
    * additional details, see
    * [[PaymentMethodData.info|`PaymentMethodData.info`]].
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * Payment method information.
    *
    * The definition of this field depends
    * on which payment method type was set in
    * [[PaymentMethodData.type|`PaymentMethodData.type`]].
    *
    * - For [[PaymentMethodType|`CARD`]], this field
    *   will be an object conforming to [[CardInfo|`CardInfo`]].
    */
  var info: js.UndefOr[CardInfo] = js.native
  
  /**
    * Tokenization data for the payment method.
    */
  var tokenizationData: PaymentMethodTokenizationData = js.native
  
  /**
    * Type of payment method.
    */
  var `type`: PaymentMethodType = js.native
}
object PaymentMethodData {
  
  @scala.inline
  def apply(tokenizationData: PaymentMethodTokenizationData, `type`: PaymentMethodType): PaymentMethodData = {
    val __obj = js.Dynamic.literal(tokenizationData = tokenizationData.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentMethodData]
  }
  
  @scala.inline
  implicit class PaymentMethodDataOps[Self <: PaymentMethodData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTokenizationData(value: PaymentMethodTokenizationData): Self = this.set("tokenizationData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: PaymentMethodType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setInfo(value: CardInfo): Self = this.set("info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInfo: Self = this.set("info", js.undefined)
  }
}
