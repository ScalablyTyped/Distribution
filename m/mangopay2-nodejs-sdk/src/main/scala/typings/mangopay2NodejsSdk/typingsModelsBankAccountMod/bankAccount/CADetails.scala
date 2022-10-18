package typings.mangopay2NodejsSdk.typingsModelsBankAccountMod.bankAccount

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CA
import typings.mangopay2NodejsSdk.typingsModelsAddressMod.address.AddressType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CADetails
  extends StObject
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
  
  /**
    * The address of the owner of the bank account
    */
  var OwnerAddress: AddressType
  
  /**
    * The name of the owner of the bank account
    */
  var OwnerName: String
  
  var Type: CA
}
object CADetails {
  
  inline def apply(
    AccountNumber: String,
    BankName: String,
    BranchCode: String,
    InstitutionNumber: String,
    OwnerAddress: AddressType,
    OwnerName: String
  ): CADetails = {
    val __obj = js.Dynamic.literal(AccountNumber = AccountNumber.asInstanceOf[js.Any], BankName = BankName.asInstanceOf[js.Any], BranchCode = BranchCode.asInstanceOf[js.Any], InstitutionNumber = InstitutionNumber.asInstanceOf[js.Any], OwnerAddress = OwnerAddress.asInstanceOf[js.Any], OwnerName = OwnerName.asInstanceOf[js.Any], Type = "CA")
    __obj.asInstanceOf[CADetails]
  }
  
  extension [Self <: CADetails](x: Self) {
    
    inline def setAccountNumber(value: String): Self = StObject.set(x, "AccountNumber", value.asInstanceOf[js.Any])
    
    inline def setBankName(value: String): Self = StObject.set(x, "BankName", value.asInstanceOf[js.Any])
    
    inline def setBranchCode(value: String): Self = StObject.set(x, "BranchCode", value.asInstanceOf[js.Any])
    
    inline def setInstitutionNumber(value: String): Self = StObject.set(x, "InstitutionNumber", value.asInstanceOf[js.Any])
    
    inline def setOwnerAddress(value: AddressType): Self = StObject.set(x, "OwnerAddress", value.asInstanceOf[js.Any])
    
    inline def setOwnerName(value: String): Self = StObject.set(x, "OwnerName", value.asInstanceOf[js.Any])
    
    inline def setType(value: CA): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
