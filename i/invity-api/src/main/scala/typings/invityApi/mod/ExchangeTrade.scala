package typings.invityApi.mod

import typings.invityApi.invityApiStrings.bestRate
import typings.invityApi.invityApiStrings.favorite
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExchangeTrade extends StObject {
  
  // hash of tx from exchange to user
  var cid: js.UndefOr[String] = js.native
  
  // state of trade after confirmTrade
  var error: js.UndefOr[String] = js.native
  
  // rate identificator for fixed rate exchanges
  var exchange: js.UndefOr[String] = js.native
  
  // fox.exchange only
  var extraField: js.UndefOr[String] = js.native
  
  // payments to user wallet extra field (payout)
  var extraFieldDescription: js.UndefOr[CoinExtraField] = js.native
  
  var fee: js.UndefOr[ExchangeFee] = js.native
  
  // 0.001
  var max: js.UndefOr[ExchangeMaximum] = js.native
  
  // 100
  var min: js.UndefOr[Double] = js.native
  
  // google clientID
  var offerReferenceId: js.UndefOr[String] = js.native
  
  // locally used fields
  var offerType: js.UndefOr[bestRate | favorite] = js.native
  
  // Evercoin only, passed from createTrade response to confirmTrade request
  var orderId: js.UndefOr[String] = js.native
  
  var partnerPaymentExtraId: js.UndefOr[String] = js.native
  
  // which exchange this trade belongs to, used for discrimination in ExchangeService
  var quoteToken: js.UndefOr[String] = js.native
  
  // users address for receive tx
  var rate: js.UndefOr[Double] = js.native
  
  // coinswitch only
  var rateIdentificator: js.UndefOr[String] = js.native
  
  // exchange address for send tx
  var receive: js.UndefOr[String] = js.native
  
  // 1
  var receiveAddress: js.UndefOr[String] = js.native
  
  // LTC
  var receiveStringAmount: js.UndefOr[String] = js.native
  
  // something went wrong after confirmTrade
  var receiveTxHash: js.UndefOr[String] = js.native
  
  var send: js.UndefOr[String] = js.native
  
  // 0.01
  var sendAddress: js.UndefOr[String] = js.native
  
  // BTC
  var sendStringAmount: js.UndefOr[String] = js.native
  
  // Extra ID for payments to exchange for networks that require it
  var signature: js.UndefOr[String] = js.native
  
  // internal URL + ID assigned to the trade by the exchange to check status
  var status: js.UndefOr[ExchangeTradeStatus] = js.native
  
  // internal ID assigned to the trade by the exchange
  var statusUrl: js.UndefOr[String] = js.native
}
object ExchangeTrade {
  
  @scala.inline
  def apply(): ExchangeTrade = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExchangeTrade]
  }
  
  @scala.inline
  implicit class ExchangeTradeMutableBuilder[Self <: ExchangeTrade] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCid(value: String): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCidUndefined: Self = StObject.set(x, "cid", js.undefined)
    
    @scala.inline
    def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setExchange(value: String): Self = StObject.set(x, "exchange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExchangeUndefined: Self = StObject.set(x, "exchange", js.undefined)
    
    @scala.inline
    def setExtraField(value: String): Self = StObject.set(x, "extraField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraFieldDescription(value: CoinExtraField): Self = StObject.set(x, "extraFieldDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraFieldDescriptionUndefined: Self = StObject.set(x, "extraFieldDescription", js.undefined)
    
    @scala.inline
    def setExtraFieldUndefined: Self = StObject.set(x, "extraField", js.undefined)
    
    @scala.inline
    def setFee(value: ExchangeFee): Self = StObject.set(x, "fee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeeUndefined: Self = StObject.set(x, "fee", js.undefined)
    
    @scala.inline
    def setMax(value: ExchangeMaximum): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    @scala.inline
    def setOfferReferenceId(value: String): Self = StObject.set(x, "offerReferenceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfferReferenceIdUndefined: Self = StObject.set(x, "offerReferenceId", js.undefined)
    
    @scala.inline
    def setOfferType(value: bestRate | favorite): Self = StObject.set(x, "offerType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfferTypeUndefined: Self = StObject.set(x, "offerType", js.undefined)
    
    @scala.inline
    def setOrderId(value: String): Self = StObject.set(x, "orderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderIdUndefined: Self = StObject.set(x, "orderId", js.undefined)
    
    @scala.inline
    def setPartnerPaymentExtraId(value: String): Self = StObject.set(x, "partnerPaymentExtraId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartnerPaymentExtraIdUndefined: Self = StObject.set(x, "partnerPaymentExtraId", js.undefined)
    
    @scala.inline
    def setQuoteToken(value: String): Self = StObject.set(x, "quoteToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuoteTokenUndefined: Self = StObject.set(x, "quoteToken", js.undefined)
    
    @scala.inline
    def setRate(value: Double): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRateIdentificator(value: String): Self = StObject.set(x, "rateIdentificator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRateIdentificatorUndefined: Self = StObject.set(x, "rateIdentificator", js.undefined)
    
    @scala.inline
    def setRateUndefined: Self = StObject.set(x, "rate", js.undefined)
    
    @scala.inline
    def setReceive(value: String): Self = StObject.set(x, "receive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceiveAddress(value: String): Self = StObject.set(x, "receiveAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceiveAddressUndefined: Self = StObject.set(x, "receiveAddress", js.undefined)
    
    @scala.inline
    def setReceiveStringAmount(value: String): Self = StObject.set(x, "receiveStringAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceiveStringAmountUndefined: Self = StObject.set(x, "receiveStringAmount", js.undefined)
    
    @scala.inline
    def setReceiveTxHash(value: String): Self = StObject.set(x, "receiveTxHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceiveTxHashUndefined: Self = StObject.set(x, "receiveTxHash", js.undefined)
    
    @scala.inline
    def setReceiveUndefined: Self = StObject.set(x, "receive", js.undefined)
    
    @scala.inline
    def setSend(value: String): Self = StObject.set(x, "send", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendAddress(value: String): Self = StObject.set(x, "sendAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendAddressUndefined: Self = StObject.set(x, "sendAddress", js.undefined)
    
    @scala.inline
    def setSendStringAmount(value: String): Self = StObject.set(x, "sendStringAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendStringAmountUndefined: Self = StObject.set(x, "sendStringAmount", js.undefined)
    
    @scala.inline
    def setSendUndefined: Self = StObject.set(x, "send", js.undefined)
    
    @scala.inline
    def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
    
    @scala.inline
    def setStatus(value: ExchangeTradeStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setStatusUrl(value: String): Self = StObject.set(x, "statusUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUrlUndefined: Self = StObject.set(x, "statusUrl", js.undefined)
  }
}
