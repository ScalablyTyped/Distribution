package typings.invityApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SavingsProviderInfo extends StObject {
  
  /** Official name of provider e.g.: BTC Direct. */
  var companyName: String
  
  var defaultPaymentAmount: Double
  
  var defaultPaymentFrequency: PaymentFrequency
  
  /** Defines a savings flow. Different providers might have different steps in the savings flow. */
  var flow: SavingsProviderFlow
  
  /** List of document types required by provider's KYC process. User has to choose one. */
  var identityDocuments: js.Array[SavingsProviderInfoIdentityDocument]
  
  /** Indicates whether the provider is marked as active or not. The setting comes from configuration. */
  var isActive: Boolean
  
  /** Name of logo file. */
  var logo: String
  
  var maximumPaymentAmountLimit: Double
  
  var minimumPaymentAmountLimit: Double
  
  /** Name of provider as our identifier e.g.: btcdirect. */
  var name: String
  
  /** Defines methods of how a user can pay to save crypto. */
  var paymentMethods: js.UndefOr[js.Array[SavingsPaymentMethod]] = js.undefined
  
  /** URL where a privacy policy of the provider is located. */
  var privacyPolicyUrl: String
  
  /** List of payment amounts selectable by user during savings setup. */
  var setupPaymentAmounts: js.Array[String]
  
  /** List of payment frequencies selectable by user during savings setup. */
  var setupPaymentFrequencies: js.Array[PaymentFrequency]
  
  /** Provider's support URL. */
  var supportUrl: js.UndefOr[String] = js.undefined
  
  /** Supported countries (2-letter ISO codes) of where provider offers the savings. */
  var supportedCountries: js.Array[String]
  
  /** Coins which user can save into. */
  var tradedCoins: js.Array[String]
  
  /** Fiat currencies (3-letter ISO codes) with which can the savings be set up. */
  var tradedFiatCurrencies: js.Array[String]
}
object SavingsProviderInfo {
  
  inline def apply(
    companyName: String,
    defaultPaymentAmount: Double,
    defaultPaymentFrequency: PaymentFrequency,
    flow: SavingsProviderFlow,
    identityDocuments: js.Array[SavingsProviderInfoIdentityDocument],
    isActive: Boolean,
    logo: String,
    maximumPaymentAmountLimit: Double,
    minimumPaymentAmountLimit: Double,
    name: String,
    privacyPolicyUrl: String,
    setupPaymentAmounts: js.Array[String],
    setupPaymentFrequencies: js.Array[PaymentFrequency],
    supportedCountries: js.Array[String],
    tradedCoins: js.Array[String],
    tradedFiatCurrencies: js.Array[String]
  ): SavingsProviderInfo = {
    val __obj = js.Dynamic.literal(companyName = companyName.asInstanceOf[js.Any], defaultPaymentAmount = defaultPaymentAmount.asInstanceOf[js.Any], defaultPaymentFrequency = defaultPaymentFrequency.asInstanceOf[js.Any], flow = flow.asInstanceOf[js.Any], identityDocuments = identityDocuments.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], logo = logo.asInstanceOf[js.Any], maximumPaymentAmountLimit = maximumPaymentAmountLimit.asInstanceOf[js.Any], minimumPaymentAmountLimit = minimumPaymentAmountLimit.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], privacyPolicyUrl = privacyPolicyUrl.asInstanceOf[js.Any], setupPaymentAmounts = setupPaymentAmounts.asInstanceOf[js.Any], setupPaymentFrequencies = setupPaymentFrequencies.asInstanceOf[js.Any], supportedCountries = supportedCountries.asInstanceOf[js.Any], tradedCoins = tradedCoins.asInstanceOf[js.Any], tradedFiatCurrencies = tradedFiatCurrencies.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavingsProviderInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SavingsProviderInfo] (val x: Self) extends AnyVal {
    
    inline def setCompanyName(value: String): Self = StObject.set(x, "companyName", value.asInstanceOf[js.Any])
    
    inline def setDefaultPaymentAmount(value: Double): Self = StObject.set(x, "defaultPaymentAmount", value.asInstanceOf[js.Any])
    
    inline def setDefaultPaymentFrequency(value: PaymentFrequency): Self = StObject.set(x, "defaultPaymentFrequency", value.asInstanceOf[js.Any])
    
    inline def setFlow(value: SavingsProviderFlow): Self = StObject.set(x, "flow", value.asInstanceOf[js.Any])
    
    inline def setIdentityDocuments(value: js.Array[SavingsProviderInfoIdentityDocument]): Self = StObject.set(x, "identityDocuments", value.asInstanceOf[js.Any])
    
    inline def setIdentityDocumentsVarargs(value: SavingsProviderInfoIdentityDocument*): Self = StObject.set(x, "identityDocuments", js.Array(value*))
    
    inline def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
    
    inline def setLogo(value: String): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
    
    inline def setMaximumPaymentAmountLimit(value: Double): Self = StObject.set(x, "maximumPaymentAmountLimit", value.asInstanceOf[js.Any])
    
    inline def setMinimumPaymentAmountLimit(value: Double): Self = StObject.set(x, "minimumPaymentAmountLimit", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPaymentMethods(value: js.Array[SavingsPaymentMethod]): Self = StObject.set(x, "paymentMethods", value.asInstanceOf[js.Any])
    
    inline def setPaymentMethodsUndefined: Self = StObject.set(x, "paymentMethods", js.undefined)
    
    inline def setPaymentMethodsVarargs(value: SavingsPaymentMethod*): Self = StObject.set(x, "paymentMethods", js.Array(value*))
    
    inline def setPrivacyPolicyUrl(value: String): Self = StObject.set(x, "privacyPolicyUrl", value.asInstanceOf[js.Any])
    
    inline def setSetupPaymentAmounts(value: js.Array[String]): Self = StObject.set(x, "setupPaymentAmounts", value.asInstanceOf[js.Any])
    
    inline def setSetupPaymentAmountsVarargs(value: String*): Self = StObject.set(x, "setupPaymentAmounts", js.Array(value*))
    
    inline def setSetupPaymentFrequencies(value: js.Array[PaymentFrequency]): Self = StObject.set(x, "setupPaymentFrequencies", value.asInstanceOf[js.Any])
    
    inline def setSetupPaymentFrequenciesVarargs(value: PaymentFrequency*): Self = StObject.set(x, "setupPaymentFrequencies", js.Array(value*))
    
    inline def setSupportUrl(value: String): Self = StObject.set(x, "supportUrl", value.asInstanceOf[js.Any])
    
    inline def setSupportUrlUndefined: Self = StObject.set(x, "supportUrl", js.undefined)
    
    inline def setSupportedCountries(value: js.Array[String]): Self = StObject.set(x, "supportedCountries", value.asInstanceOf[js.Any])
    
    inline def setSupportedCountriesVarargs(value: String*): Self = StObject.set(x, "supportedCountries", js.Array(value*))
    
    inline def setTradedCoins(value: js.Array[String]): Self = StObject.set(x, "tradedCoins", value.asInstanceOf[js.Any])
    
    inline def setTradedCoinsVarargs(value: String*): Self = StObject.set(x, "tradedCoins", js.Array(value*))
    
    inline def setTradedFiatCurrencies(value: js.Array[String]): Self = StObject.set(x, "tradedFiatCurrencies", value.asInstanceOf[js.Any])
    
    inline def setTradedFiatCurrenciesVarargs(value: String*): Self = StObject.set(x, "tradedFiatCurrencies", js.Array(value*))
  }
}
