package typings.mangopay2NodejsSdk.mod.models

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OTHER
import typings.mangopay2NodejsSdk.typingsModelsAddressMod.address.AddressType
import typings.mangopay2NodejsSdk.typingsModelsBankAccountMod.bankAccount.OtherDetails
import typings.mangopay2NodejsSdk.typingsTypesMod.CountryISO
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mangopay2-nodejs-sdk", "models.BankAccountDetailsOther")
@js.native
open class BankAccountDetailsOther protected ()
  extends BankAccountDetails
     with OtherDetails {
  def this(data: Any) = this()
  
  /**
    * The account number of the bank account. Must be numbers only. Canadian account numbers must be a maximum of 20 digits.
    */
  /* CompleteClass */
  var AccountNumber: String = js.native
  
  /**
    * The BIC of the bank account
    */
  /* CompleteClass */
  var BIC: String = js.native
  
  /**
    * The Country of the Address
    */
  /* CompleteClass */
  var Country: CountryISO = js.native
  
  /**
    * The address of the owner of the bank account
    */
  /* CompleteClass */
  var OwnerAddress: AddressType = js.native
  
  /**
    * The name of the owner of the bank account
    */
  /* CompleteClass */
  var OwnerName: String = js.native
  
  /* CompleteClass */
  var Type: OTHER = js.native
}
