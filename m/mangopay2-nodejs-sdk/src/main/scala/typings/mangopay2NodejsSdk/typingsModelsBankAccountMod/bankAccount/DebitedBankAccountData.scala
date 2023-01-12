package typings.mangopay2NodejsSdk.typingsModelsBankAccountMod.bankAccount

import typings.mangopay2NodejsSdk.typingsTypesMod.CountryISO
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DebitedBankAccountData extends StObject {
  
  /**
    * The account number of the bank account. Must be numbers only. Canadian account numbers must be a maximum of 20 digits.
    */
  var AccountNumber: String
  
  /**
    * The BIC of the bank account
    */
  var BIC: String
  
  /**
    * The Country ISO
    */
  var Country: CountryISO
  
  /**
    * The IBAN of the bank account
    */
  var IBAN: String
  
  /**
    * The name of the owner of the bank account
    */
  var OwnerName: String
  
  /**
    * The Type of the bank account
    */
  var Type: BankAccountType
}
object DebitedBankAccountData {
  
  inline def apply(
    AccountNumber: String,
    BIC: String,
    Country: CountryISO,
    IBAN: String,
    OwnerName: String,
    Type: BankAccountType
  ): DebitedBankAccountData = {
    val __obj = js.Dynamic.literal(AccountNumber = AccountNumber.asInstanceOf[js.Any], BIC = BIC.asInstanceOf[js.Any], Country = Country.asInstanceOf[js.Any], IBAN = IBAN.asInstanceOf[js.Any], OwnerName = OwnerName.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[DebitedBankAccountData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DebitedBankAccountData] (val x: Self) extends AnyVal {
    
    inline def setAccountNumber(value: String): Self = StObject.set(x, "AccountNumber", value.asInstanceOf[js.Any])
    
    inline def setBIC(value: String): Self = StObject.set(x, "BIC", value.asInstanceOf[js.Any])
    
    inline def setCountry(value: CountryISO): Self = StObject.set(x, "Country", value.asInstanceOf[js.Any])
    
    inline def setIBAN(value: String): Self = StObject.set(x, "IBAN", value.asInstanceOf[js.Any])
    
    inline def setOwnerName(value: String): Self = StObject.set(x, "OwnerName", value.asInstanceOf[js.Any])
    
    inline def setType(value: BankAccountType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
