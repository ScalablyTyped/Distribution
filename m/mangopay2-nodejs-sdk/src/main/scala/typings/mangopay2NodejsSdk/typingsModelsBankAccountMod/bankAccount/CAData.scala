package typings.mangopay2NodejsSdk.typingsModelsBankAccountMod.bankAccount

import typings.mangopay2NodejsSdk.typingsModelsAddressMod.address.AddressType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.mangopay2NodejsSdk.typingsModelsBankAccountMod.bankAccount.CADetails because var conflicts: OwnerAddress, OwnerName, Type. Inlined BranchCode, InstitutionNumber, AccountNumber, BankName */ trait CAData
  extends StObject
     with BaseData
     with Data
     with CreationDetails {
  
  /**
    * The account number of the bank account. Must be numbers only. Canadian account numbers must be a maximum of 20 digits.
    */
  var AccountNumber: String
  
  /**
    * The name of the bank where the account is held. Must be letters or numbers only and maximum 50 characters long.
    */
  var BankName: String
  
  /**
    * The branch code of the bank where the bank account. Must be numbers only, and 5 digits long
    */
  var BranchCode: String
  
  /**
    * The institution number of the bank account. Must be numbers only, and 3 or 4 digits long
    */
  var InstitutionNumber: String
}
object CAData {
  
  inline def apply(
    AccountNumber: String,
    Active: Boolean,
    BankName: String,
    BranchCode: String,
    CreationDate: Double,
    Id: String,
    InstitutionNumber: String,
    OwnerAddress: AddressType,
    OwnerName: String,
    Tag: String,
    Type: BankAccountType,
    UserId: String
  ): CAData = {
    val __obj = js.Dynamic.literal(AccountNumber = AccountNumber.asInstanceOf[js.Any], Active = Active.asInstanceOf[js.Any], BankName = BankName.asInstanceOf[js.Any], BranchCode = BranchCode.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], InstitutionNumber = InstitutionNumber.asInstanceOf[js.Any], OwnerAddress = OwnerAddress.asInstanceOf[js.Any], OwnerName = OwnerName.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CAData]
  }
  
  extension [Self <: CAData](x: Self) {
    
    inline def setAccountNumber(value: String): Self = StObject.set(x, "AccountNumber", value.asInstanceOf[js.Any])
    
    inline def setBankName(value: String): Self = StObject.set(x, "BankName", value.asInstanceOf[js.Any])
    
    inline def setBranchCode(value: String): Self = StObject.set(x, "BranchCode", value.asInstanceOf[js.Any])
    
    inline def setInstitutionNumber(value: String): Self = StObject.set(x, "InstitutionNumber", value.asInstanceOf[js.Any])
  }
}
