package typings.mangopay2NodejsSdk.mod.models

import typings.mangopay2NodejsSdk.addressMod.address.AddressType
import typings.mangopay2NodejsSdk.bankAccountMod.bankAccount.USDetails
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.US
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mangopay2-nodejs-sdk", "models.BankAccountDetailsUS")
@js.native
open class BankAccountDetailsUS protected ()
  extends BankAccountDetails
     with USDetails {
  def this(data: Any) = this()
  
  /**
    * The ABA of the bank account. Must be numbers only, and 9 digits long
    */
  /* CompleteClass */
  var ABA: String = js.native
  
  /**
    * The account number of the bank account. US account numbers must be digits only.
    */
  /* CompleteClass */
  var AccountNumber: String = js.native
  
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
  var Type: US = js.native
}
