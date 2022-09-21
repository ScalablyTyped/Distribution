package typings.mangopay2NodejsSdk.bankAccountMod.bankAccount

import typings.mangopay2NodejsSdk.addressMod.address.AddressType
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.US
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait USDetails
  extends StObject
     with CreationDetails {
  
  /**
    * The ABA of the bank account. Must be numbers only, and 9 digits long
    */
  var ABA: String
  
  /**
    * The account number of the bank account. US account numbers must be digits only.
    */
  var AccountNumber: String
  
  /**
    * The type of account
    */
  var DepositAccountType: js.UndefOr[typings.mangopay2NodejsSdk.bankAccountMod.bankAccount.DepositAccountType] = js.undefined
  
  /**
    * The address of the owner of the bank account
    */
  var OwnerAddress: AddressType
  
  /**
    * The name of the owner of the bank account
    */
  var OwnerName: String
  
  var Type: US
}
object USDetails {
  
  inline def apply(ABA: String, AccountNumber: String, OwnerAddress: AddressType, OwnerName: String): USDetails = {
    val __obj = js.Dynamic.literal(ABA = ABA.asInstanceOf[js.Any], AccountNumber = AccountNumber.asInstanceOf[js.Any], OwnerAddress = OwnerAddress.asInstanceOf[js.Any], OwnerName = OwnerName.asInstanceOf[js.Any], Type = "US")
    __obj.asInstanceOf[USDetails]
  }
  
  extension [Self <: USDetails](x: Self) {
    
    inline def setABA(value: String): Self = StObject.set(x, "ABA", value.asInstanceOf[js.Any])
    
    inline def setAccountNumber(value: String): Self = StObject.set(x, "AccountNumber", value.asInstanceOf[js.Any])
    
    inline def setDepositAccountType(value: DepositAccountType): Self = StObject.set(x, "DepositAccountType", value.asInstanceOf[js.Any])
    
    inline def setDepositAccountTypeUndefined: Self = StObject.set(x, "DepositAccountType", js.undefined)
    
    inline def setOwnerAddress(value: AddressType): Self = StObject.set(x, "OwnerAddress", value.asInstanceOf[js.Any])
    
    inline def setOwnerName(value: String): Self = StObject.set(x, "OwnerName", value.asInstanceOf[js.Any])
    
    inline def setType(value: US): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
