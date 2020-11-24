package typings.maximMazurokGapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SettlementTransactionAmount extends js.Object {
  
  var commission: js.UndefOr[SettlementTransactionAmountCommission] = js.native
  
  /**
    * The description of the event. Acceptable values are: - "`taxWithhold`" - "`principal`" - "`principalAdjustment`" - "`shippingFee`" - "`merchantRemittedSalesTax`" -
    * "`googleRemittedSalesTax`" - "`merchantCoupon`" - "`merchantCouponTax`" - "`merchantRemittedDisposalTax`" - "`googleRemittedDisposalTax`" - "`merchantRemittedRedemptionFee`" -
    * "`googleRemittedRedemptionFee`" - "`eeeEcoFee`" - "`furnitureEcoFee`" - "`copyPrivateFee`" - "`eeeEcoFeeCommission`" - "`furnitureEcoFeeCommission`" - "`copyPrivateFeeCommission`" -
    * "`principalRefund`" - "`principalRefundTax`" - "`itemCommission`" - "`adjustmentCommission`" - "`shippingFeeCommission`" - "`commissionRefund`" - "`damaged`" -
    * "`damagedOrDefectiveItem`" - "`expiredItem`" - "`faultyItem`" - "`incorrectItemReceived`" - "`itemMissing`" - "`qualityNotExpected`" - "`receivedTooLate`" - "`storePackageMissing`"
    * - "`transitPackageMissing`" - "`unsuccessfulDeliveryUndeliverable`" - "`wrongChargeInStore`" - "`wrongItem`" - "`returns`" - "`undeliverable`" - "`refundFromMerchant`" -
    * "`returnLabelShippingFee`"
    */
  var description: js.UndefOr[String] = js.native
  
  /** The amount that contributes to the line item price. */
  var transactionAmount: js.UndefOr[Price] = js.native
  
  /**
    * The type of the amount. Acceptable values are: - "`itemPrice`" - "`orderPrice`" - "`refund`" - "`earlyRefund`" - "`courtesyRefund`" - "`returnRefund`" -
    * "`returnLabelShippingFeeAmount`"
    */
  var `type`: js.UndefOr[String] = js.native
}
object SettlementTransactionAmount {
  
  @scala.inline
  def apply(): SettlementTransactionAmount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SettlementTransactionAmount]
  }
  
  @scala.inline
  implicit class SettlementTransactionAmountOps[Self <: SettlementTransactionAmount] (val x: Self) extends AnyVal {
    
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
    def setCommission(value: SettlementTransactionAmountCommission): Self = this.set("commission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommission: Self = this.set("commission", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setTransactionAmount(value: Price): Self = this.set("transactionAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransactionAmount: Self = this.set("transactionAmount", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
