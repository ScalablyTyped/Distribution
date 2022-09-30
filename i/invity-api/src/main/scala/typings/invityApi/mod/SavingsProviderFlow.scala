package typings.invityApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SavingsProviderFlow extends StObject {
  
  /** Defines what should happen after login. */
  var afterLogin: SavingsStepAfterLogin
  
  var afterSuccessfulPhoneVerification: SavingsStepAfterSuccessfulPhoneVerification
  
  var aml: SavingsStepAML
  
  var bankAccount: SavingsStepBankAccount
  
  var credentials: SavingsStepCredentials
  
  var cryptoWalletVerification: SavingsStepCryptoWalletVerification
  
  var kyc: SavingsStepKYC
  
  var parameters: SavingsStepParameters
  
  var paymentInfo: SavingsStepPaymentInfo
  
  var phoneVerification: SavingsStepPhoneVerification
}
object SavingsProviderFlow {
  
  inline def apply(
    afterLogin: SavingsStepAfterLogin,
    afterSuccessfulPhoneVerification: SavingsStepAfterSuccessfulPhoneVerification,
    aml: SavingsStepAML,
    bankAccount: SavingsStepBankAccount,
    credentials: SavingsStepCredentials,
    cryptoWalletVerification: SavingsStepCryptoWalletVerification,
    kyc: SavingsStepKYC,
    parameters: SavingsStepParameters,
    paymentInfo: SavingsStepPaymentInfo,
    phoneVerification: SavingsStepPhoneVerification
  ): SavingsProviderFlow = {
    val __obj = js.Dynamic.literal(afterLogin = afterLogin.asInstanceOf[js.Any], afterSuccessfulPhoneVerification = afterSuccessfulPhoneVerification.asInstanceOf[js.Any], aml = aml.asInstanceOf[js.Any], bankAccount = bankAccount.asInstanceOf[js.Any], credentials = credentials.asInstanceOf[js.Any], cryptoWalletVerification = cryptoWalletVerification.asInstanceOf[js.Any], kyc = kyc.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], paymentInfo = paymentInfo.asInstanceOf[js.Any], phoneVerification = phoneVerification.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavingsProviderFlow]
  }
  
  extension [Self <: SavingsProviderFlow](x: Self) {
    
    inline def setAfterLogin(value: SavingsStepAfterLogin): Self = StObject.set(x, "afterLogin", value.asInstanceOf[js.Any])
    
    inline def setAfterSuccessfulPhoneVerification(value: SavingsStepAfterSuccessfulPhoneVerification): Self = StObject.set(x, "afterSuccessfulPhoneVerification", value.asInstanceOf[js.Any])
    
    inline def setAml(value: SavingsStepAML): Self = StObject.set(x, "aml", value.asInstanceOf[js.Any])
    
    inline def setBankAccount(value: SavingsStepBankAccount): Self = StObject.set(x, "bankAccount", value.asInstanceOf[js.Any])
    
    inline def setCredentials(value: SavingsStepCredentials): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
    
    inline def setCryptoWalletVerification(value: SavingsStepCryptoWalletVerification): Self = StObject.set(x, "cryptoWalletVerification", value.asInstanceOf[js.Any])
    
    inline def setKyc(value: SavingsStepKYC): Self = StObject.set(x, "kyc", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: SavingsStepParameters): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setPaymentInfo(value: SavingsStepPaymentInfo): Self = StObject.set(x, "paymentInfo", value.asInstanceOf[js.Any])
    
    inline def setPhoneVerification(value: SavingsStepPhoneVerification): Self = StObject.set(x, "phoneVerification", value.asInstanceOf[js.Any])
  }
}
