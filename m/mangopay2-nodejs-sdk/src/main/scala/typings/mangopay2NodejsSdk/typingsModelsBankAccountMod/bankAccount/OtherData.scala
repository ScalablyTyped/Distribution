package typings.mangopay2NodejsSdk.typingsModelsBankAccountMod.bankAccount

import typings.mangopay2NodejsSdk.typingsModelsAddressMod.address.AddressType
import typings.mangopay2NodejsSdk.typingsTypesMod.CountryISO
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.mangopay2NodejsSdk.typingsModelsBankAccountMod.bankAccount.OtherDetails because var conflicts: OwnerAddress, OwnerName, Type. Inlined Country, BIC, AccountNumber */ trait OtherData
  extends StObject
     with BaseData
     with Data
     with CreationDetails {
  
  /**
    * The account number of the bank account. Must be numbers only. Canadian account numbers must be a maximum of 20 digits.
    */
  var AccountNumber: String
  
  /**
    * The BIC of the bank account
    */
  var BIC: String
  
  /**
    * The Country of the Address
    */
  var Country: CountryISO
}
object OtherData {
  
  inline def apply(
    AccountNumber: String,
    Active: Boolean,
    BIC: String,
    Country: CountryISO,
    CreationDate: Double,
    Id: String,
    OwnerAddress: AddressType,
    OwnerName: String,
    Tag: String,
    Type: BankAccountType,
    UserId: String
  ): OtherData = {
    val __obj = js.Dynamic.literal(AccountNumber = AccountNumber.asInstanceOf[js.Any], Active = Active.asInstanceOf[js.Any], BIC = BIC.asInstanceOf[js.Any], Country = Country.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], OwnerAddress = OwnerAddress.asInstanceOf[js.Any], OwnerName = OwnerName.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OtherData]
  }
  
  extension [Self <: OtherData](x: Self) {
    
    inline def setAccountNumber(value: String): Self = StObject.set(x, "AccountNumber", value.asInstanceOf[js.Any])
    
    inline def setBIC(value: String): Self = StObject.set(x, "BIC", value.asInstanceOf[js.Any])
    
    inline def setCountry(value: CountryISO): Self = StObject.set(x, "Country", value.asInstanceOf[js.Any])
  }
}
