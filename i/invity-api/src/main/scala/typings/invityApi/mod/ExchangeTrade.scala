package typings.invityApi.mod

import typings.invityApi.anon.Data
import typings.invityApi.invityApiStrings.bestRate
import typings.invityApi.invityApiStrings.favorite
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExchangeTrade extends StObject {
  
  var approvalGasEstimate: js.UndefOr[Double] = js.undefined
  
  //  amount to approve
  var approvalSendTxHash: js.UndefOr[String] = js.undefined
  
  //  amount that was already approved
  var approvalStringAmount: js.UndefOr[String] = js.undefined
  
  // gas estimate of the approval transaction
  var approvalType: js.UndefOr[DexApprovalType] = js.undefined
  
  // hash of tx from exchange to user or DEX swap
  var cid: js.UndefOr[String] = js.undefined
  
  // swap slippage in percent, for example "1.5"
  var dexTx: js.UndefOr[Data] = js.undefined
  
  // state of trade after confirmTrade
  var error: js.UndefOr[String] = js.undefined
  
  // rate identificator for fixed rate exchanges
  var exchange: js.UndefOr[String] = js.undefined
  
  // fox.exchange only
  var extraField: js.UndefOr[String] = js.undefined
  
  // payments to user wallet extra field (payout)
  var extraFieldDescription: js.UndefOr[CoinExtraField] = js.undefined
  
  var fee: js.UndefOr[ExchangeFee] = js.undefined
  
  // "0.01"
  var fromAddress: js.UndefOr[String] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  // internal DB id
  var infoNote: js.UndefOr[String] = js.undefined
  
  // DEX extra fields
  var isDex: js.UndefOr[Boolean] = js.undefined
  
  // 0.001
  var max: js.UndefOr[ExchangeMaximum] = js.undefined
  
  // 100
  var min: js.UndefOr[Double] = js.undefined
  
  // google clientID
  var offerReferenceId: js.UndefOr[String] = js.undefined
  
  // locally used fields
  var offerType: js.UndefOr[bestRate | favorite] = js.undefined
  
  // Evercoin only, passed from createTrade response to confirmTrade request
  var orderId: js.UndefOr[String] = js.undefined
  
  var partnerPaymentExtraId: js.UndefOr[String] = js.undefined
  
  var preapprovedStringAmount: js.UndefOr[String] = js.undefined
  
  // which exchange this trade belongs to, used for discrimination in ExchangeService
  var quoteToken: js.UndefOr[String] = js.undefined
  
  // user's address for receive tx
  var rate: js.UndefOr[Double] = js.undefined
  
  // coinswitch only
  var rateIdentificator: js.UndefOr[String] = js.undefined
  
  // exchange address for send tx
  var receive: js.UndefOr[String] = js.undefined
  
  // user's address from which the tx is sent - used in DEX
  var receiveAddress: js.UndefOr[String] = js.undefined
  
  // LTC
  var receiveStringAmount: js.UndefOr[String] = js.undefined
  
  // something went wrong after confirmTrade
  var receiveTxHash: js.UndefOr[String] = js.undefined
  
  var send: js.UndefOr[String] = js.undefined
  
  // "0.01"
  var sendAddress: js.UndefOr[String] = js.undefined
  
  // BTC
  var sendStringAmount: js.UndefOr[String] = js.undefined
  
  // Extra ID for payments to exchange for networks that require it (destinationTag)
  var signature: js.UndefOr[String] = js.undefined
  
  // internal URL + ID assigned to the trade by the exchange to check status
  var status: js.UndefOr[ExchangeTradeStatus] = js.undefined
  
  // internal ID assigned to the trade by the exchange
  var statusUrl: js.UndefOr[String] = js.undefined
  
  // txid of approval transaction
  var swapGasEstimate: js.UndefOr[Double] = js.undefined
  
  // gas estimate of the swap transaction
  var swapSlippage: js.UndefOr[String] = js.undefined
  
  var tags: js.UndefOr[js.Array[ExchangeTradeTag]] = js.undefined
}
object ExchangeTrade {
  
  inline def apply(): ExchangeTrade = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExchangeTrade]
  }
  
  extension [Self <: ExchangeTrade](x: Self) {
    
    inline def setApprovalGasEstimate(value: Double): Self = StObject.set(x, "approvalGasEstimate", value.asInstanceOf[js.Any])
    
    inline def setApprovalGasEstimateUndefined: Self = StObject.set(x, "approvalGasEstimate", js.undefined)
    
    inline def setApprovalSendTxHash(value: String): Self = StObject.set(x, "approvalSendTxHash", value.asInstanceOf[js.Any])
    
    inline def setApprovalSendTxHashUndefined: Self = StObject.set(x, "approvalSendTxHash", js.undefined)
    
    inline def setApprovalStringAmount(value: String): Self = StObject.set(x, "approvalStringAmount", value.asInstanceOf[js.Any])
    
    inline def setApprovalStringAmountUndefined: Self = StObject.set(x, "approvalStringAmount", js.undefined)
    
    inline def setApprovalType(value: DexApprovalType): Self = StObject.set(x, "approvalType", value.asInstanceOf[js.Any])
    
    inline def setApprovalTypeUndefined: Self = StObject.set(x, "approvalType", js.undefined)
    
    inline def setCid(value: String): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
    
    inline def setCidUndefined: Self = StObject.set(x, "cid", js.undefined)
    
    inline def setDexTx(value: Data): Self = StObject.set(x, "dexTx", value.asInstanceOf[js.Any])
    
    inline def setDexTxUndefined: Self = StObject.set(x, "dexTx", js.undefined)
    
    inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setExchange(value: String): Self = StObject.set(x, "exchange", value.asInstanceOf[js.Any])
    
    inline def setExchangeUndefined: Self = StObject.set(x, "exchange", js.undefined)
    
    inline def setExtraField(value: String): Self = StObject.set(x, "extraField", value.asInstanceOf[js.Any])
    
    inline def setExtraFieldDescription(value: CoinExtraField): Self = StObject.set(x, "extraFieldDescription", value.asInstanceOf[js.Any])
    
    inline def setExtraFieldDescriptionUndefined: Self = StObject.set(x, "extraFieldDescription", js.undefined)
    
    inline def setExtraFieldUndefined: Self = StObject.set(x, "extraField", js.undefined)
    
    inline def setFee(value: ExchangeFee): Self = StObject.set(x, "fee", value.asInstanceOf[js.Any])
    
    inline def setFeeUndefined: Self = StObject.set(x, "fee", js.undefined)
    
    inline def setFromAddress(value: String): Self = StObject.set(x, "fromAddress", value.asInstanceOf[js.Any])
    
    inline def setFromAddressUndefined: Self = StObject.set(x, "fromAddress", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInfoNote(value: String): Self = StObject.set(x, "infoNote", value.asInstanceOf[js.Any])
    
    inline def setInfoNoteUndefined: Self = StObject.set(x, "infoNote", js.undefined)
    
    inline def setIsDex(value: Boolean): Self = StObject.set(x, "isDex", value.asInstanceOf[js.Any])
    
    inline def setIsDexUndefined: Self = StObject.set(x, "isDex", js.undefined)
    
    inline def setMax(value: ExchangeMaximum): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setOfferReferenceId(value: String): Self = StObject.set(x, "offerReferenceId", value.asInstanceOf[js.Any])
    
    inline def setOfferReferenceIdUndefined: Self = StObject.set(x, "offerReferenceId", js.undefined)
    
    inline def setOfferType(value: bestRate | favorite): Self = StObject.set(x, "offerType", value.asInstanceOf[js.Any])
    
    inline def setOfferTypeUndefined: Self = StObject.set(x, "offerType", js.undefined)
    
    inline def setOrderId(value: String): Self = StObject.set(x, "orderId", value.asInstanceOf[js.Any])
    
    inline def setOrderIdUndefined: Self = StObject.set(x, "orderId", js.undefined)
    
    inline def setPartnerPaymentExtraId(value: String): Self = StObject.set(x, "partnerPaymentExtraId", value.asInstanceOf[js.Any])
    
    inline def setPartnerPaymentExtraIdUndefined: Self = StObject.set(x, "partnerPaymentExtraId", js.undefined)
    
    inline def setPreapprovedStringAmount(value: String): Self = StObject.set(x, "preapprovedStringAmount", value.asInstanceOf[js.Any])
    
    inline def setPreapprovedStringAmountUndefined: Self = StObject.set(x, "preapprovedStringAmount", js.undefined)
    
    inline def setQuoteToken(value: String): Self = StObject.set(x, "quoteToken", value.asInstanceOf[js.Any])
    
    inline def setQuoteTokenUndefined: Self = StObject.set(x, "quoteToken", js.undefined)
    
    inline def setRate(value: Double): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
    
    inline def setRateIdentificator(value: String): Self = StObject.set(x, "rateIdentificator", value.asInstanceOf[js.Any])
    
    inline def setRateIdentificatorUndefined: Self = StObject.set(x, "rateIdentificator", js.undefined)
    
    inline def setRateUndefined: Self = StObject.set(x, "rate", js.undefined)
    
    inline def setReceive(value: String): Self = StObject.set(x, "receive", value.asInstanceOf[js.Any])
    
    inline def setReceiveAddress(value: String): Self = StObject.set(x, "receiveAddress", value.asInstanceOf[js.Any])
    
    inline def setReceiveAddressUndefined: Self = StObject.set(x, "receiveAddress", js.undefined)
    
    inline def setReceiveStringAmount(value: String): Self = StObject.set(x, "receiveStringAmount", value.asInstanceOf[js.Any])
    
    inline def setReceiveStringAmountUndefined: Self = StObject.set(x, "receiveStringAmount", js.undefined)
    
    inline def setReceiveTxHash(value: String): Self = StObject.set(x, "receiveTxHash", value.asInstanceOf[js.Any])
    
    inline def setReceiveTxHashUndefined: Self = StObject.set(x, "receiveTxHash", js.undefined)
    
    inline def setReceiveUndefined: Self = StObject.set(x, "receive", js.undefined)
    
    inline def setSend(value: String): Self = StObject.set(x, "send", value.asInstanceOf[js.Any])
    
    inline def setSendAddress(value: String): Self = StObject.set(x, "sendAddress", value.asInstanceOf[js.Any])
    
    inline def setSendAddressUndefined: Self = StObject.set(x, "sendAddress", js.undefined)
    
    inline def setSendStringAmount(value: String): Self = StObject.set(x, "sendStringAmount", value.asInstanceOf[js.Any])
    
    inline def setSendStringAmountUndefined: Self = StObject.set(x, "sendStringAmount", js.undefined)
    
    inline def setSendUndefined: Self = StObject.set(x, "send", js.undefined)
    
    inline def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    inline def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
    
    inline def setStatus(value: ExchangeTradeStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setStatusUrl(value: String): Self = StObject.set(x, "statusUrl", value.asInstanceOf[js.Any])
    
    inline def setStatusUrlUndefined: Self = StObject.set(x, "statusUrl", js.undefined)
    
    inline def setSwapGasEstimate(value: Double): Self = StObject.set(x, "swapGasEstimate", value.asInstanceOf[js.Any])
    
    inline def setSwapGasEstimateUndefined: Self = StObject.set(x, "swapGasEstimate", js.undefined)
    
    inline def setSwapSlippage(value: String): Self = StObject.set(x, "swapSlippage", value.asInstanceOf[js.Any])
    
    inline def setSwapSlippageUndefined: Self = StObject.set(x, "swapSlippage", js.undefined)
    
    inline def setTags(value: js.Array[ExchangeTradeTag]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: ExchangeTradeTag*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
