package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SettlementTransactionAmount extends StObject {
  
  var commission: js.UndefOr[SettlementTransactionAmountCommission] = js.undefined
  
  /**
    * The description of the event. Acceptable values are: - "`taxWithhold`" - "`principal`" - "`principalAdjustment`" - "`shippingFee`" - "`merchantRemittedSalesTax`" -
    * "`googleRemittedSalesTax`" - "`merchantCoupon`" - "`merchantCouponTax`" - "`merchantRemittedDisposalTax`" - "`googleRemittedDisposalTax`" - "`merchantRemittedRedemptionFee`" -
    * "`googleRemittedRedemptionFee`" - "`eeeEcoFee`" - "`furnitureEcoFee`" - "`copyPrivateFee`" - "`eeeEcoFeeCommission`" - "`furnitureEcoFeeCommission`" - "`copyPrivateFeeCommission`" -
    * "`principalRefund`" - "`principalRefundTax`" - "`itemCommission`" - "`adjustmentCommission`" - "`shippingFeeCommission`" - "`commissionRefund`" - "`damaged`" -
    * "`damagedOrDefectiveItem`" - "`expiredItem`" - "`faultyItem`" - "`incorrectItemReceived`" - "`itemMissing`" - "`qualityNotExpected`" - "`receivedTooLate`" - "`storePackageMissing`"
    * - "`transitPackageMissing`" - "`unsuccessfulDeliveryUndeliverable`" - "`wrongChargeInStore`" - "`wrongItem`" - "`returns`" - "`undeliverable`" - "`refundFromMerchant`" -
    * "`returnLabelShippingFee`"
    */
  var description: js.UndefOr[String] = js.undefined
  
  /** The amount that contributes to the line item price. */
  var transactionAmount: js.UndefOr[Price] = js.undefined
  
  /**
    * The type of the amount. Acceptable values are: - "`itemPrice`" - "`orderPrice`" - "`refund`" - "`earlyRefund`" - "`courtesyRefund`" - "`returnRefund`" -
    * "`returnLabelShippingFeeAmount`"
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object SettlementTransactionAmount {
  
  @scala.inline
  def apply(): SettlementTransactionAmount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SettlementTransactionAmount]
  }
  
  @scala.inline
  implicit class SettlementTransactionAmountMutableBuilder[Self <: SettlementTransactionAmount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommission(value: SettlementTransactionAmountCommission): Self = StObject.set(x, "commission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommissionUndefined: Self = StObject.set(x, "commission", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setTransactionAmount(value: Price): Self = StObject.set(x, "transactionAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionAmountUndefined: Self = StObject.set(x, "transactionAmount", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
