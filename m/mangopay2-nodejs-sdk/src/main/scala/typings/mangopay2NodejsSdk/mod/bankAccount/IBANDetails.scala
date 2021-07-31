package typings.mangopay2NodejsSdk.mod.bankAccount

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IBAN
import typings.mangopay2NodejsSdk.mod.address.AddressType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBANDetails
  extends StObject
     with CreationDetails {
  
  /**
    * The BIC of the bank account
    */
  var BIC: js.UndefOr[String] = js.undefined
  
  /**
    * The IBAN of the bank account
    */
  var IBAN: String
  
  /**
    * The address of the owner of the bank account
    */
  var OwnerAddress: AddressType
  
  /**
    * The name of the owner of the bank account
    */
  var OwnerName: String
  
  var Type: IBAN
}
object IBANDetails {
  
  @scala.inline
  def apply(IBAN: String, OwnerAddress: AddressType, OwnerName: String): IBANDetails = {
    val __obj = js.Dynamic.literal(IBAN = IBAN.asInstanceOf[js.Any], OwnerAddress = OwnerAddress.asInstanceOf[js.Any], OwnerName = OwnerName.asInstanceOf[js.Any], Type = "IBAN")
    __obj.asInstanceOf[IBANDetails]
  }
  
  @scala.inline
  implicit class IBANDetailsMutableBuilder[Self <: IBANDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBIC(value: String): Self = StObject.set(x, "BIC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBICUndefined: Self = StObject.set(x, "BIC", js.undefined)
    
    @scala.inline
    def setIBAN(value: String): Self = StObject.set(x, "IBAN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerAddress(value: AddressType): Self = StObject.set(x, "OwnerAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerName(value: String): Self = StObject.set(x, "OwnerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: IBAN): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
