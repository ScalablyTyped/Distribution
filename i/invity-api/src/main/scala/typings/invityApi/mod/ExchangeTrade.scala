package typings.invityApi.mod

import typings.invityApi.invityApiStrings.bestRate
import typings.invityApi.invityApiStrings.favorite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExchangeTrade extends js.Object {
  
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
  implicit class ExchangeTradeOps[Self <: ExchangeTrade] (val x: Self) extends AnyVal {
    
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
    def setExtraField(value: String): Self = this.set("extraField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtraField: Self = this.set("extraField", js.undefined)
    
    @scala.inline
    def setExtraFieldDescription(value: CoinExtraField): Self = this.set("extraFieldDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtraFieldDescription: Self = this.set("extraFieldDescription", js.undefined)
    
    @scala.inline
    def setFee(value: ExchangeFee): Self = this.set("fee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFee: Self = this.set("fee", js.undefined)
    
    @scala.inline
    def setMax(value: ExchangeMaximum): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    
    @scala.inline
    def setOfferReferenceId(value: String): Self = this.set("offerReferenceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOfferReferenceId: Self = this.set("offerReferenceId", js.undefined)
    
    @scala.inline
    def setOfferType(value: bestRate | favorite): Self = this.set("offerType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOfferType: Self = this.set("offerType", js.undefined)
    
    @scala.inline
    def setOrderId(value: String): Self = this.set("orderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrderId: Self = this.set("orderId", js.undefined)
    
    @scala.inline
    def setPartnerPaymentExtraId(value: String): Self = this.set("partnerPaymentExtraId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePartnerPaymentExtraId: Self = this.set("partnerPaymentExtraId", js.undefined)
    
    @scala.inline
    def setQuoteToken(value: String): Self = this.set("quoteToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuoteToken: Self = this.set("quoteToken", js.undefined)
    
    @scala.inline
    def setRate(value: Double): Self = this.set("rate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRate: Self = this.set("rate", js.undefined)
    
    @scala.inline
    def setRateIdentificator(value: String): Self = this.set("rateIdentificator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRateIdentificator: Self = this.set("rateIdentificator", js.undefined)
    
    @scala.inline
    def setReceive(value: String): Self = this.set("receive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReceive: Self = this.set("receive", js.undefined)
    
    @scala.inline
    def setReceiveAddress(value: String): Self = this.set("receiveAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReceiveAddress: Self = this.set("receiveAddress", js.undefined)
    
    @scala.inline
    def setReceiveStringAmount(value: String): Self = this.set("receiveStringAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReceiveStringAmount: Self = this.set("receiveStringAmount", js.undefined)
    
    @scala.inline
    def setReceiveTxHash(value: String): Self = this.set("receiveTxHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReceiveTxHash: Self = this.set("receiveTxHash", js.undefined)
    
    @scala.inline
    def setSend(value: String): Self = this.set("send", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSend: Self = this.set("send", js.undefined)
    
    @scala.inline
    def setSendAddress(value: String): Self = this.set("sendAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSendAddress: Self = this.set("sendAddress", js.undefined)
    
    @scala.inline
    def setSendStringAmount(value: String): Self = this.set("sendStringAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSendStringAmount: Self = this.set("sendStringAmount", js.undefined)
    
    @scala.inline
    def setSignature(value: String): Self = this.set("signature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignature: Self = this.set("signature", js.undefined)
    
    @scala.inline
    def setStatus(value: ExchangeTradeStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setStatusUrl(value: String): Self = this.set("statusUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusUrl: Self = this.set("statusUrl", js.undefined)
  }
}
