package typings.mangopay2NodejsSdk.bankAccountMod.bankAccount

import typings.mangopay2NodejsSdk.addressMod.address.AddressType
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GB
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GBDetails
  extends StObject
     with CreationDetails {
  
  /**
    * The account number of the bank account. Must be numbers only. GB account numbers must be 8 digits long.
    */
  var AccountNumber: String
  
  /**
    * The address of the owner of the bank account
    */
  var OwnerAddress: AddressType
  
  /**
    * The name of the owner of the bank account
    */
  var OwnerName: String
  
  /**
    * The sort code of the bank account. Must be numbers only, and 6 digits long
    */
  var SortCode: String
  
  var Type: GB
}
object GBDetails {
  
  inline def apply(AccountNumber: String, OwnerAddress: AddressType, OwnerName: String, SortCode: String): GBDetails = {
    val __obj = js.Dynamic.literal(AccountNumber = AccountNumber.asInstanceOf[js.Any], OwnerAddress = OwnerAddress.asInstanceOf[js.Any], OwnerName = OwnerName.asInstanceOf[js.Any], SortCode = SortCode.asInstanceOf[js.Any], Type = "GB")
    __obj.asInstanceOf[GBDetails]
  }
  
  extension [Self <: GBDetails](x: Self) {
    
    inline def setAccountNumber(value: String): Self = StObject.set(x, "AccountNumber", value.asInstanceOf[js.Any])
    
    inline def setOwnerAddress(value: AddressType): Self = StObject.set(x, "OwnerAddress", value.asInstanceOf[js.Any])
    
    inline def setOwnerName(value: String): Self = StObject.set(x, "OwnerName", value.asInstanceOf[js.Any])
    
    inline def setSortCode(value: String): Self = StObject.set(x, "SortCode", value.asInstanceOf[js.Any])
    
    inline def setType(value: GB): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
