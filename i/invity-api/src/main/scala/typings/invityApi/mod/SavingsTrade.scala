package typings.invityApi.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SavingsTrade extends StObject {
  
  var amlAnswers: js.UndefOr[js.Array[SavingsTradeAMLAnswer]] = js.undefined
  
  var amlQuestions: js.UndefOr[js.Array[SavingsTradeAMLQuestion]] = js.undefined
  
  var amlStatus: js.UndefOr[SavingsAMLStatus] = js.undefined
  
  /** Customer's bank account from which payments should be paid to receive crypto. */
  var bankAccount: js.UndefOr[BankAccount] = js.undefined
  
  var country: js.UndefOr[String] = js.undefined
  
  /** Crypto currency of recurrent payment. */
  var cryptoCurrency: js.UndefOr[String] = js.undefined
  
  /** Name of savings provider. */
  var exchange: String
  
  var externalId: js.UndefOr[String] = js.undefined
  
  var externals: js.UndefOr[Record[String, String]] = js.undefined
  
  /** Fiat currency of recurrent payment. */
  var fiatCurrency: js.UndefOr[String] = js.undefined
  
  /** Amount of money to be paid recurrently. */
  var fiatStringAmount: js.UndefOr[String] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  /** Indicates whether the user is registered in partner's system. */
  var isUserRegisteredInPartnerSystem: js.UndefOr[Boolean] = js.undefined
  
  var kycStatus: js.UndefOr[SavingsKYCStatus] = js.undefined
  
  /** How often payment should be paid by customer. */
  var paymentFrequency: js.UndefOr[PaymentFrequency] = js.undefined
  
  var paymentInfo: js.UndefOr[SavingsPaymentInfo] = js.undefined
  
  var paymentMethod: js.UndefOr[SavingsPaymentMethod] = js.undefined
  
  /** Crypto address where provider sends crypto. */
  var receivingCryptoAddresses: js.UndefOr[js.Array[String]] = js.undefined
  
  var status: js.UndefOr[SavingsStatus] = js.undefined
  
  var tradeItems: js.UndefOr[js.Array[SavingsTradeItem]] = js.undefined
  
  var userKYCStart: js.UndefOr[js.Array[SavingsTradeUserKYCStart]] = js.undefined
  
  var userRegistration: js.UndefOr[SavingsTradeUserRegistration] = js.undefined
}
object SavingsTrade {
  
  inline def apply(exchange: String): SavingsTrade = {
    val __obj = js.Dynamic.literal(exchange = exchange.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavingsTrade]
  }
  
  extension [Self <: SavingsTrade](x: Self) {
    
    inline def setAmlAnswers(value: js.Array[SavingsTradeAMLAnswer]): Self = StObject.set(x, "amlAnswers", value.asInstanceOf[js.Any])
    
    inline def setAmlAnswersUndefined: Self = StObject.set(x, "amlAnswers", js.undefined)
    
    inline def setAmlAnswersVarargs(value: SavingsTradeAMLAnswer*): Self = StObject.set(x, "amlAnswers", js.Array(value*))
    
    inline def setAmlQuestions(value: js.Array[SavingsTradeAMLQuestion]): Self = StObject.set(x, "amlQuestions", value.asInstanceOf[js.Any])
    
    inline def setAmlQuestionsUndefined: Self = StObject.set(x, "amlQuestions", js.undefined)
    
    inline def setAmlQuestionsVarargs(value: SavingsTradeAMLQuestion*): Self = StObject.set(x, "amlQuestions", js.Array(value*))
    
    inline def setAmlStatus(value: SavingsAMLStatus): Self = StObject.set(x, "amlStatus", value.asInstanceOf[js.Any])
    
    inline def setAmlStatusUndefined: Self = StObject.set(x, "amlStatus", js.undefined)
    
    inline def setBankAccount(value: BankAccount): Self = StObject.set(x, "bankAccount", value.asInstanceOf[js.Any])
    
    inline def setBankAccountUndefined: Self = StObject.set(x, "bankAccount", js.undefined)
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    inline def setCryptoCurrency(value: String): Self = StObject.set(x, "cryptoCurrency", value.asInstanceOf[js.Any])
    
    inline def setCryptoCurrencyUndefined: Self = StObject.set(x, "cryptoCurrency", js.undefined)
    
    inline def setExchange(value: String): Self = StObject.set(x, "exchange", value.asInstanceOf[js.Any])
    
    inline def setExternalId(value: String): Self = StObject.set(x, "externalId", value.asInstanceOf[js.Any])
    
    inline def setExternalIdUndefined: Self = StObject.set(x, "externalId", js.undefined)
    
    inline def setExternals(value: Record[String, String]): Self = StObject.set(x, "externals", value.asInstanceOf[js.Any])
    
    inline def setExternalsUndefined: Self = StObject.set(x, "externals", js.undefined)
    
    inline def setFiatCurrency(value: String): Self = StObject.set(x, "fiatCurrency", value.asInstanceOf[js.Any])
    
    inline def setFiatCurrencyUndefined: Self = StObject.set(x, "fiatCurrency", js.undefined)
    
    inline def setFiatStringAmount(value: String): Self = StObject.set(x, "fiatStringAmount", value.asInstanceOf[js.Any])
    
    inline def setFiatStringAmountUndefined: Self = StObject.set(x, "fiatStringAmount", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIsUserRegisteredInPartnerSystem(value: Boolean): Self = StObject.set(x, "isUserRegisteredInPartnerSystem", value.asInstanceOf[js.Any])
    
    inline def setIsUserRegisteredInPartnerSystemUndefined: Self = StObject.set(x, "isUserRegisteredInPartnerSystem", js.undefined)
    
    inline def setKycStatus(value: SavingsKYCStatus): Self = StObject.set(x, "kycStatus", value.asInstanceOf[js.Any])
    
    inline def setKycStatusUndefined: Self = StObject.set(x, "kycStatus", js.undefined)
    
    inline def setPaymentFrequency(value: PaymentFrequency): Self = StObject.set(x, "paymentFrequency", value.asInstanceOf[js.Any])
    
    inline def setPaymentFrequencyUndefined: Self = StObject.set(x, "paymentFrequency", js.undefined)
    
    inline def setPaymentInfo(value: SavingsPaymentInfo): Self = StObject.set(x, "paymentInfo", value.asInstanceOf[js.Any])
    
    inline def setPaymentInfoUndefined: Self = StObject.set(x, "paymentInfo", js.undefined)
    
    inline def setPaymentMethod(value: SavingsPaymentMethod): Self = StObject.set(x, "paymentMethod", value.asInstanceOf[js.Any])
    
    inline def setPaymentMethodUndefined: Self = StObject.set(x, "paymentMethod", js.undefined)
    
    inline def setReceivingCryptoAddresses(value: js.Array[String]): Self = StObject.set(x, "receivingCryptoAddresses", value.asInstanceOf[js.Any])
    
    inline def setReceivingCryptoAddressesUndefined: Self = StObject.set(x, "receivingCryptoAddresses", js.undefined)
    
    inline def setReceivingCryptoAddressesVarargs(value: String*): Self = StObject.set(x, "receivingCryptoAddresses", js.Array(value*))
    
    inline def setStatus(value: SavingsStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTradeItems(value: js.Array[SavingsTradeItem]): Self = StObject.set(x, "tradeItems", value.asInstanceOf[js.Any])
    
    inline def setTradeItemsUndefined: Self = StObject.set(x, "tradeItems", js.undefined)
    
    inline def setTradeItemsVarargs(value: SavingsTradeItem*): Self = StObject.set(x, "tradeItems", js.Array(value*))
    
    inline def setUserKYCStart(value: js.Array[SavingsTradeUserKYCStart]): Self = StObject.set(x, "userKYCStart", value.asInstanceOf[js.Any])
    
    inline def setUserKYCStartUndefined: Self = StObject.set(x, "userKYCStart", js.undefined)
    
    inline def setUserKYCStartVarargs(value: SavingsTradeUserKYCStart*): Self = StObject.set(x, "userKYCStart", js.Array(value*))
    
    inline def setUserRegistration(value: SavingsTradeUserRegistration): Self = StObject.set(x, "userRegistration", value.asInstanceOf[js.Any])
    
    inline def setUserRegistrationUndefined: Self = StObject.set(x, "userRegistration", js.undefined)
  }
}
