package typings.invityApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuyTrade extends StObject {
  
  // timestamp in ISO format of offer validity
  var cid: js.UndefOr[String] = js.undefined
  
  // state of trade after confirmTrade
  var error: js.UndefOr[String] = js.undefined
  
  // hash of tx from exchange to user
  var exchange: js.UndefOr[String] = js.undefined
  
  // 1000
  var fiatCurrency: js.UndefOr[String] = js.undefined
  
  var fiatStringAmount: js.UndefOr[String] = js.undefined
  
  var infoNote: js.UndefOr[String] = js.undefined
  
  var maxCrypto: js.UndefOr[Double] = js.undefined
  
  var maxFiat: js.UndefOr[Double] = js.undefined
  
  var minCrypto: js.UndefOr[Double] = js.undefined
  
  // google clientID
  var minFiat: js.UndefOr[Double] = js.undefined
  
  // ID of the quote assigned by exchange
  var orderId: js.UndefOr[String] = js.undefined
  
  // ID of the order assigned by us
  var originalPaymentId: js.UndefOr[String] = js.undefined
  
  var partnerData: js.UndefOr[String] = js.undefined
  
  // ID of the payment assigned by us and later changed by the partner
  var paymentId: js.UndefOr[String] = js.undefined
  
  var paymentMethod: js.UndefOr[BuyCryptoPaymentMethod] = js.undefined
  
  // 100
  var quoteId: js.UndefOr[String] = js.undefined
  
  // users address for receive tx
  var rate: js.UndefOr[Double] = js.undefined
  
  // 0.12345
  var receiveAddress: js.UndefOr[String] = js.undefined
  
  // EUR
  var receiveCurrency: js.UndefOr[String] = js.undefined
  
  // BTC
  var receiveStringAmount: js.UndefOr[String] = js.undefined
  
  // something went wrong after confirmTrade
  var receiveTxHash: js.UndefOr[String] = js.undefined
  
  // ID of the payment assigned by us or by partner
  var status: js.UndefOr[BuyTradeStatus] = js.undefined
  
  // arbitrary data specific for the partner
  var tags: js.UndefOr[js.Array[BuyTradeTag]] = js.undefined
  
  // locally used data types
  var tradeForm: js.UndefOr[BuyTradeFormResponse] = js.undefined
  
  // which exchange this trade belongs to, used for discrimination in ExchangeService
  var validUntil: js.UndefOr[String] = js.undefined
}
object BuyTrade {
  
  @scala.inline
  def apply(): BuyTrade = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuyTrade]
  }
  
  @scala.inline
  implicit class BuyTradeMutableBuilder[Self <: BuyTrade] (val x: Self) extends AnyVal {
    
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
    def setFiatCurrency(value: String): Self = StObject.set(x, "fiatCurrency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiatCurrencyUndefined: Self = StObject.set(x, "fiatCurrency", js.undefined)
    
    @scala.inline
    def setFiatStringAmount(value: String): Self = StObject.set(x, "fiatStringAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiatStringAmountUndefined: Self = StObject.set(x, "fiatStringAmount", js.undefined)
    
    @scala.inline
    def setInfoNote(value: String): Self = StObject.set(x, "infoNote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoNoteUndefined: Self = StObject.set(x, "infoNote", js.undefined)
    
    @scala.inline
    def setMaxCrypto(value: Double): Self = StObject.set(x, "maxCrypto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxCryptoUndefined: Self = StObject.set(x, "maxCrypto", js.undefined)
    
    @scala.inline
    def setMaxFiat(value: Double): Self = StObject.set(x, "maxFiat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxFiatUndefined: Self = StObject.set(x, "maxFiat", js.undefined)
    
    @scala.inline
    def setMinCrypto(value: Double): Self = StObject.set(x, "minCrypto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinCryptoUndefined: Self = StObject.set(x, "minCrypto", js.undefined)
    
    @scala.inline
    def setMinFiat(value: Double): Self = StObject.set(x, "minFiat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinFiatUndefined: Self = StObject.set(x, "minFiat", js.undefined)
    
    @scala.inline
    def setOrderId(value: String): Self = StObject.set(x, "orderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderIdUndefined: Self = StObject.set(x, "orderId", js.undefined)
    
    @scala.inline
    def setOriginalPaymentId(value: String): Self = StObject.set(x, "originalPaymentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalPaymentIdUndefined: Self = StObject.set(x, "originalPaymentId", js.undefined)
    
    @scala.inline
    def setPartnerData(value: String): Self = StObject.set(x, "partnerData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartnerDataUndefined: Self = StObject.set(x, "partnerData", js.undefined)
    
    @scala.inline
    def setPaymentId(value: String): Self = StObject.set(x, "paymentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaymentIdUndefined: Self = StObject.set(x, "paymentId", js.undefined)
    
    @scala.inline
    def setPaymentMethod(value: BuyCryptoPaymentMethod): Self = StObject.set(x, "paymentMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaymentMethodUndefined: Self = StObject.set(x, "paymentMethod", js.undefined)
    
    @scala.inline
    def setQuoteId(value: String): Self = StObject.set(x, "quoteId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuoteIdUndefined: Self = StObject.set(x, "quoteId", js.undefined)
    
    @scala.inline
    def setRate(value: Double): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRateUndefined: Self = StObject.set(x, "rate", js.undefined)
    
    @scala.inline
    def setReceiveAddress(value: String): Self = StObject.set(x, "receiveAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceiveAddressUndefined: Self = StObject.set(x, "receiveAddress", js.undefined)
    
    @scala.inline
    def setReceiveCurrency(value: String): Self = StObject.set(x, "receiveCurrency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceiveCurrencyUndefined: Self = StObject.set(x, "receiveCurrency", js.undefined)
    
    @scala.inline
    def setReceiveStringAmount(value: String): Self = StObject.set(x, "receiveStringAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceiveStringAmountUndefined: Self = StObject.set(x, "receiveStringAmount", js.undefined)
    
    @scala.inline
    def setReceiveTxHash(value: String): Self = StObject.set(x, "receiveTxHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceiveTxHashUndefined: Self = StObject.set(x, "receiveTxHash", js.undefined)
    
    @scala.inline
    def setStatus(value: BuyTradeStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setTags(value: js.Array[BuyTradeTag]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: BuyTradeTag*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    @scala.inline
    def setTradeForm(value: BuyTradeFormResponse): Self = StObject.set(x, "tradeForm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTradeFormUndefined: Self = StObject.set(x, "tradeForm", js.undefined)
    
    @scala.inline
    def setValidUntil(value: String): Self = StObject.set(x, "validUntil", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidUntilUndefined: Self = StObject.set(x, "validUntil", js.undefined)
  }
}
