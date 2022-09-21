package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSettlementTransactionAmount extends StObject {
  
  var commission: js.UndefOr[SchemaSettlementTransactionAmountCommission] = js.undefined
  
  /**
    * The description of the event. Acceptable values are: - "`taxWithhold`" - "`principal`" - "`principalAdjustment`" - "`shippingFee`" - "`merchantRemittedSalesTax`" - "`googleRemittedSalesTax`" - "`merchantCoupon`" - "`merchantCouponTax`" - "`merchantRemittedDisposalTax`" - "`googleRemittedDisposalTax`" - "`merchantRemittedRedemptionFee`" - "`googleRemittedRedemptionFee`" - "`eeeEcoFee`" - "`furnitureEcoFee`" - "`copyPrivateFee`" - "`eeeEcoFeeCommission`" - "`furnitureEcoFeeCommission`" - "`copyPrivateFeeCommission`" - "`principalRefund`" - "`principalRefundTax`" - "`itemCommission`" - "`adjustmentCommission`" - "`shippingFeeCommission`" - "`commissionRefund`" - "`damaged`" - "`damagedOrDefectiveItem`" - "`expiredItem`" - "`faultyItem`" - "`incorrectItemReceived`" - "`itemMissing`" - "`qualityNotExpected`" - "`receivedTooLate`" - "`storePackageMissing`" - "`transitPackageMissing`" - "`unsuccessfulDeliveryUndeliverable`" - "`wrongChargeInStore`" - "`wrongItem`" - "`returns`" - "`undeliverable`" - "`issueRelatedRefundAndReplacementAmountDescription`" - "`refundFromMerchant`" - "`returnLabelShippingFee`" - "`lumpSumCorrection`" - "`pspFee`" - "`principalRefundDoesNotFit`" - "`principalRefundOrderedWrongItem`" - "`principalRefundQualityNotExpected`" - "`principalRefundBetterPriceFound`" - "`principalRefundNoLongerNeeded`" - "`principalRefundChangedMind`" - "`principalRefundReceivedTooLate`" - "`principalRefundIncorrectItemReceived`" - "`principalRefundDamagedOrDefectiveItem`" - "`principalRefundDidNotMatchDescription`" - "`principalRefundExpiredItem`"
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The amount that contributes to the line item price.
    */
  var transactionAmount: js.UndefOr[SchemaPrice] = js.undefined
  
  /**
    * The type of the amount. Acceptable values are: - "`itemPrice`" - "`orderPrice`" - "`refund`" - "`earlyRefund`" - "`courtesyRefund`" - "`returnRefund`" - "`returnLabelShippingFeeAmount`" - "`lumpSumCorrectionAmount`"
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaSettlementTransactionAmount {
  
  inline def apply(): SchemaSettlementTransactionAmount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSettlementTransactionAmount]
  }
  
  extension [Self <: SchemaSettlementTransactionAmount](x: Self) {
    
    inline def setCommission(value: SchemaSettlementTransactionAmountCommission): Self = StObject.set(x, "commission", value.asInstanceOf[js.Any])
    
    inline def setCommissionUndefined: Self = StObject.set(x, "commission", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setTransactionAmount(value: SchemaPrice): Self = StObject.set(x, "transactionAmount", value.asInstanceOf[js.Any])
    
    inline def setTransactionAmountUndefined: Self = StObject.set(x, "transactionAmount", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
