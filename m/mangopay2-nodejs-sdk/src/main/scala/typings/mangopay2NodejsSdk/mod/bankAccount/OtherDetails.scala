package typings.mangopay2NodejsSdk.mod.bankAccount

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OTHER
import typings.mangopay2NodejsSdk.mod.address.AddressType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OtherDetails
  extends StObject
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
  var Country: String
  
  /**
    * The address of the owner of the bank account
    */
  var OwnerAddress: AddressType
  
  /**
    * The name of the owner of the bank account
    */
  var OwnerName: String
  
  var Type: OTHER
}
object OtherDetails {
  
  @scala.inline
  def apply(AccountNumber: String, BIC: String, Country: String, OwnerAddress: AddressType, OwnerName: String): OtherDetails = {
    val __obj = js.Dynamic.literal(AccountNumber = AccountNumber.asInstanceOf[js.Any], BIC = BIC.asInstanceOf[js.Any], Country = Country.asInstanceOf[js.Any], OwnerAddress = OwnerAddress.asInstanceOf[js.Any], OwnerName = OwnerName.asInstanceOf[js.Any], Type = "OTHER")
    __obj.asInstanceOf[OtherDetails]
  }
  
  @scala.inline
  implicit class OtherDetailsMutableBuilder[Self <: OtherDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountNumber(value: String): Self = StObject.set(x, "AccountNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBIC(value: String): Self = StObject.set(x, "BIC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountry(value: String): Self = StObject.set(x, "Country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerAddress(value: AddressType): Self = StObject.set(x, "OwnerAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerName(value: String): Self = StObject.set(x, "OwnerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: OTHER): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
