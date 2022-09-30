package typings.invityApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SellFiatTrade extends StObject {
  
  var amountInCrypto: js.UndefOr[Boolean] = js.undefined
  
  // CZ
  var bankAccount: js.UndefOr[BankAccount] = js.undefined
  
  // selected bank account
  var bankAccounts: js.UndefOr[js.Array[BankAccount]] = js.undefined
  
  var cid: js.UndefOr[String] = js.undefined
  
  var country: js.UndefOr[String] = js.undefined
  
  // EUR
  var cryptoCurrency: js.UndefOr[String] = js.undefined
  
  // BTC
  var cryptoStringAmount: js.UndefOr[String] = js.undefined
  
  // Extra ID for returns to exchange for networks that require it (destinationTag)
  var destinationAddress: js.UndefOr[String] = js.undefined
  
  // crypto address to which sent crypto currency to sell
  var destinationPaymentExtraId: js.UndefOr[String] = js.undefined
  
  // Extra ID for payments to exchange for networks that require it (destinationTag)
  var error: js.UndefOr[String] = js.undefined
  
  // ID of the payment assigned by us and later changed by the partner
  var eventId: js.UndefOr[String] = js.undefined
  
  // something went wrong
  var exchange: js.UndefOr[String] = js.undefined
  
  // 1000
  var fiatCurrency: js.UndefOr[String] = js.undefined
  
  // true for cryptoAmount, false for fiatAmount
  var fiatStringAmount: js.UndefOr[String] = js.undefined
  
  // list of available bank accounts
  var id: js.UndefOr[String] = js.undefined
  
  var infoNote: js.UndefOr[String] = js.undefined
  
  var maxCrypto: js.UndefOr[Double] = js.undefined
  
  var maxFiat: js.UndefOr[Double] = js.undefined
  
  var minCrypto: js.UndefOr[Double] = js.undefined
  
  // google clientID
  var minFiat: js.UndefOr[Double] = js.undefined
  
  // ID of the quote assigned by exchange
  var orderId: js.UndefOr[String] = js.undefined
  
  // ID of the payment assigned by the partner
  var originalPaymentId: js.UndefOr[String] = js.undefined
  
  // internal DB id
  var partnerData: js.UndefOr[String] = js.undefined
  
  // arbitrary data specific for the partner
  var partnerData2: js.UndefOr[String] = js.undefined
  
  // ID of the order assigned by us
  var paymentId: js.UndefOr[String] = js.undefined
  
  var paymentMethod: js.UndefOr[SellCryptoPaymentMethod] = js.undefined
  
  // 100
  var quoteId: js.UndefOr[String] = js.undefined
  
  // 0.12345
  var rate: js.UndefOr[Double] = js.undefined
  
  // state of trade after confirmTrade
  var refundAddress: js.UndefOr[String] = js.undefined
  
  // crypto address to which sent crypto currency will be returned in case of a refund
  var refundAddressExtraId: js.UndefOr[String] = js.undefined
  
  // ID of the last event which modified the trade
  var siteUrl: js.UndefOr[String] = js.undefined
  
  // sell site url
  var status: js.UndefOr[SellTradeStatus] = js.undefined
  
  // txid of crypto transaction
  var tags: js.UndefOr[js.Array[SellTradeTag]] = js.undefined
  
  // timestamp in ISO format of offer validity
  var txid: js.UndefOr[String] = js.undefined
  
  // which exchange this trade belongs to, used for discrimination in ExchangeService
  var validUntil: js.UndefOr[String] = js.undefined
}
object SellFiatTrade {
  
  inline def apply(): SellFiatTrade = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SellFiatTrade]
  }
  
  extension [Self <: SellFiatTrade](x: Self) {
    
    inline def setAmountInCrypto(value: Boolean): Self = StObject.set(x, "amountInCrypto", value.asInstanceOf[js.Any])
    
    inline def setAmountInCryptoUndefined: Self = StObject.set(x, "amountInCrypto", js.undefined)
    
    inline def setBankAccount(value: BankAccount): Self = StObject.set(x, "bankAccount", value.asInstanceOf[js.Any])
    
    inline def setBankAccountUndefined: Self = StObject.set(x, "bankAccount", js.undefined)
    
    inline def setBankAccounts(value: js.Array[BankAccount]): Self = StObject.set(x, "bankAccounts", value.asInstanceOf[js.Any])
    
    inline def setBankAccountsUndefined: Self = StObject.set(x, "bankAccounts", js.undefined)
    
    inline def setBankAccountsVarargs(value: BankAccount*): Self = StObject.set(x, "bankAccounts", js.Array(value*))
    
    inline def setCid(value: String): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
    
    inline def setCidUndefined: Self = StObject.set(x, "cid", js.undefined)
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    inline def setCryptoCurrency(value: String): Self = StObject.set(x, "cryptoCurrency", value.asInstanceOf[js.Any])
    
    inline def setCryptoCurrencyUndefined: Self = StObject.set(x, "cryptoCurrency", js.undefined)
    
    inline def setCryptoStringAmount(value: String): Self = StObject.set(x, "cryptoStringAmount", value.asInstanceOf[js.Any])
    
    inline def setCryptoStringAmountUndefined: Self = StObject.set(x, "cryptoStringAmount", js.undefined)
    
    inline def setDestinationAddress(value: String): Self = StObject.set(x, "destinationAddress", value.asInstanceOf[js.Any])
    
    inline def setDestinationAddressUndefined: Self = StObject.set(x, "destinationAddress", js.undefined)
    
    inline def setDestinationPaymentExtraId(value: String): Self = StObject.set(x, "destinationPaymentExtraId", value.asInstanceOf[js.Any])
    
    inline def setDestinationPaymentExtraIdUndefined: Self = StObject.set(x, "destinationPaymentExtraId", js.undefined)
    
    inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setEventId(value: String): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
    
    inline def setEventIdUndefined: Self = StObject.set(x, "eventId", js.undefined)
    
    inline def setExchange(value: String): Self = StObject.set(x, "exchange", value.asInstanceOf[js.Any])
    
    inline def setExchangeUndefined: Self = StObject.set(x, "exchange", js.undefined)
    
    inline def setFiatCurrency(value: String): Self = StObject.set(x, "fiatCurrency", value.asInstanceOf[js.Any])
    
    inline def setFiatCurrencyUndefined: Self = StObject.set(x, "fiatCurrency", js.undefined)
    
    inline def setFiatStringAmount(value: String): Self = StObject.set(x, "fiatStringAmount", value.asInstanceOf[js.Any])
    
    inline def setFiatStringAmountUndefined: Self = StObject.set(x, "fiatStringAmount", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInfoNote(value: String): Self = StObject.set(x, "infoNote", value.asInstanceOf[js.Any])
    
    inline def setInfoNoteUndefined: Self = StObject.set(x, "infoNote", js.undefined)
    
    inline def setMaxCrypto(value: Double): Self = StObject.set(x, "maxCrypto", value.asInstanceOf[js.Any])
    
    inline def setMaxCryptoUndefined: Self = StObject.set(x, "maxCrypto", js.undefined)
    
    inline def setMaxFiat(value: Double): Self = StObject.set(x, "maxFiat", value.asInstanceOf[js.Any])
    
    inline def setMaxFiatUndefined: Self = StObject.set(x, "maxFiat", js.undefined)
    
    inline def setMinCrypto(value: Double): Self = StObject.set(x, "minCrypto", value.asInstanceOf[js.Any])
    
    inline def setMinCryptoUndefined: Self = StObject.set(x, "minCrypto", js.undefined)
    
    inline def setMinFiat(value: Double): Self = StObject.set(x, "minFiat", value.asInstanceOf[js.Any])
    
    inline def setMinFiatUndefined: Self = StObject.set(x, "minFiat", js.undefined)
    
    inline def setOrderId(value: String): Self = StObject.set(x, "orderId", value.asInstanceOf[js.Any])
    
    inline def setOrderIdUndefined: Self = StObject.set(x, "orderId", js.undefined)
    
    inline def setOriginalPaymentId(value: String): Self = StObject.set(x, "originalPaymentId", value.asInstanceOf[js.Any])
    
    inline def setOriginalPaymentIdUndefined: Self = StObject.set(x, "originalPaymentId", js.undefined)
    
    inline def setPartnerData(value: String): Self = StObject.set(x, "partnerData", value.asInstanceOf[js.Any])
    
    inline def setPartnerData2(value: String): Self = StObject.set(x, "partnerData2", value.asInstanceOf[js.Any])
    
    inline def setPartnerData2Undefined: Self = StObject.set(x, "partnerData2", js.undefined)
    
    inline def setPartnerDataUndefined: Self = StObject.set(x, "partnerData", js.undefined)
    
    inline def setPaymentId(value: String): Self = StObject.set(x, "paymentId", value.asInstanceOf[js.Any])
    
    inline def setPaymentIdUndefined: Self = StObject.set(x, "paymentId", js.undefined)
    
    inline def setPaymentMethod(value: SellCryptoPaymentMethod): Self = StObject.set(x, "paymentMethod", value.asInstanceOf[js.Any])
    
    inline def setPaymentMethodUndefined: Self = StObject.set(x, "paymentMethod", js.undefined)
    
    inline def setQuoteId(value: String): Self = StObject.set(x, "quoteId", value.asInstanceOf[js.Any])
    
    inline def setQuoteIdUndefined: Self = StObject.set(x, "quoteId", js.undefined)
    
    inline def setRate(value: Double): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
    
    inline def setRateUndefined: Self = StObject.set(x, "rate", js.undefined)
    
    inline def setRefundAddress(value: String): Self = StObject.set(x, "refundAddress", value.asInstanceOf[js.Any])
    
    inline def setRefundAddressExtraId(value: String): Self = StObject.set(x, "refundAddressExtraId", value.asInstanceOf[js.Any])
    
    inline def setRefundAddressExtraIdUndefined: Self = StObject.set(x, "refundAddressExtraId", js.undefined)
    
    inline def setRefundAddressUndefined: Self = StObject.set(x, "refundAddress", js.undefined)
    
    inline def setSiteUrl(value: String): Self = StObject.set(x, "siteUrl", value.asInstanceOf[js.Any])
    
    inline def setSiteUrlUndefined: Self = StObject.set(x, "siteUrl", js.undefined)
    
    inline def setStatus(value: SellTradeStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTags(value: js.Array[SellTradeTag]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: SellTradeTag*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setTxid(value: String): Self = StObject.set(x, "txid", value.asInstanceOf[js.Any])
    
    inline def setTxidUndefined: Self = StObject.set(x, "txid", js.undefined)
    
    inline def setValidUntil(value: String): Self = StObject.set(x, "validUntil", value.asInstanceOf[js.Any])
    
    inline def setValidUntilUndefined: Self = StObject.set(x, "validUntil", js.undefined)
  }
}
