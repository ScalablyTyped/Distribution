package typings.invityApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuyTrade extends js.Object {
  
   // timestamp in ISO format of offer validity
  var cid: js.UndefOr[String] = js.native
  
   // state of trade after confirmTrade
  var error: js.UndefOr[String] = js.native
  
   // hash of tx from exchange to user
  var exchange: js.UndefOr[String] = js.native
  
   // 1000
  var fiatCurrency: js.UndefOr[String] = js.native
  
  var fiatStringAmount: js.UndefOr[String] = js.native
  
  var infoNote: js.UndefOr[String] = js.native
  
  var maxCrypto: js.UndefOr[Double] = js.native
  
  var maxFiat: js.UndefOr[Double] = js.native
  
  var minCrypto: js.UndefOr[Double] = js.native
  
   // google clientID
  var minFiat: js.UndefOr[Double] = js.native
  
   // ID of the quote assigned by exchange
  var orderId: js.UndefOr[String] = js.native
  
   // ID of the order assigned by us
  var originalPaymentId: js.UndefOr[String] = js.native
  
  var partnerData: js.UndefOr[String] = js.native
  
   // ID of the payment assigned by us and later changed by the partner
  var paymentId: js.UndefOr[String] = js.native
  
  var paymentMethod: js.UndefOr[BuyCryptoPaymentMethod] = js.native
  
   // 100
  var quoteId: js.UndefOr[String] = js.native
  
   // users address for receive tx
  var rate: js.UndefOr[Double] = js.native
  
   // 0.12345
  var receiveAddress: js.UndefOr[String] = js.native
  
   // EUR
  var receiveCurrency: js.UndefOr[String] = js.native
  
   // BTC
  var receiveStringAmount: js.UndefOr[String] = js.native
  
   // something went wrong after confirmTrade
  var receiveTxHash: js.UndefOr[String] = js.native
  
   // ID of the payment assigned by us or by partner
  var status: js.UndefOr[BuyTradeStatus] = js.native
  
   // arbitrary data specific for the partner
  var tags: js.UndefOr[js.Array[BuyTradeTag]] = js.native
  
  // locally used data types
  var tradeForm: js.UndefOr[BuyTradeFormResponse] = js.native
  
   // which exchange this trade belongs to, used for discrimination in ExchangeService
  var validUntil: js.UndefOr[String] = js.native
}
object BuyTrade {
  
  @scala.inline
  def apply(): BuyTrade = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuyTrade]
  }
  
  @scala.inline
  implicit class BuyTradeOps[Self <: BuyTrade] (val x: Self) extends AnyVal {
    
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
    def setCid(value: String): Self = this.set("cid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCid: Self = this.set("cid", js.undefined)
    
    @scala.inline
    def setError(value: String): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setExchange(value: String): Self = this.set("exchange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExchange: Self = this.set("exchange", js.undefined)
    
    @scala.inline
    def setFiatCurrency(value: String): Self = this.set("fiatCurrency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFiatCurrency: Self = this.set("fiatCurrency", js.undefined)
    
    @scala.inline
    def setFiatStringAmount(value: String): Self = this.set("fiatStringAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFiatStringAmount: Self = this.set("fiatStringAmount", js.undefined)
    
    @scala.inline
    def setInfoNote(value: String): Self = this.set("infoNote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInfoNote: Self = this.set("infoNote", js.undefined)
    
    @scala.inline
    def setMaxCrypto(value: Double): Self = this.set("maxCrypto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxCrypto: Self = this.set("maxCrypto", js.undefined)
    
    @scala.inline
    def setMaxFiat(value: Double): Self = this.set("maxFiat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxFiat: Self = this.set("maxFiat", js.undefined)
    
    @scala.inline
    def setMinCrypto(value: Double): Self = this.set("minCrypto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinCrypto: Self = this.set("minCrypto", js.undefined)
    
    @scala.inline
    def setMinFiat(value: Double): Self = this.set("minFiat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinFiat: Self = this.set("minFiat", js.undefined)
    
    @scala.inline
    def setOrderId(value: String): Self = this.set("orderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrderId: Self = this.set("orderId", js.undefined)
    
    @scala.inline
    def setOriginalPaymentId(value: String): Self = this.set("originalPaymentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginalPaymentId: Self = this.set("originalPaymentId", js.undefined)
    
    @scala.inline
    def setPartnerData(value: String): Self = this.set("partnerData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePartnerData: Self = this.set("partnerData", js.undefined)
    
    @scala.inline
    def setPaymentId(value: String): Self = this.set("paymentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaymentId: Self = this.set("paymentId", js.undefined)
    
    @scala.inline
    def setPaymentMethod(value: BuyCryptoPaymentMethod): Self = this.set("paymentMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaymentMethod: Self = this.set("paymentMethod", js.undefined)
    
    @scala.inline
    def setQuoteId(value: String): Self = this.set("quoteId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuoteId: Self = this.set("quoteId", js.undefined)
    
    @scala.inline
    def setRate(value: Double): Self = this.set("rate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRate: Self = this.set("rate", js.undefined)
    
    @scala.inline
    def setReceiveAddress(value: String): Self = this.set("receiveAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReceiveAddress: Self = this.set("receiveAddress", js.undefined)
    
    @scala.inline
    def setReceiveCurrency(value: String): Self = this.set("receiveCurrency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReceiveCurrency: Self = this.set("receiveCurrency", js.undefined)
    
    @scala.inline
    def setReceiveStringAmount(value: String): Self = this.set("receiveStringAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReceiveStringAmount: Self = this.set("receiveStringAmount", js.undefined)
    
    @scala.inline
    def setReceiveTxHash(value: String): Self = this.set("receiveTxHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReceiveTxHash: Self = this.set("receiveTxHash", js.undefined)
    
    @scala.inline
    def setStatus(value: BuyTradeStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: BuyTradeTag*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: js.Array[BuyTradeTag]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setTradeForm(value: BuyTradeFormResponse): Self = this.set("tradeForm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTradeForm: Self = this.set("tradeForm", js.undefined)
    
    @scala.inline
    def setValidUntil(value: String): Self = this.set("validUntil", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidUntil: Self = this.set("validUntil", js.undefined)
  }
}
