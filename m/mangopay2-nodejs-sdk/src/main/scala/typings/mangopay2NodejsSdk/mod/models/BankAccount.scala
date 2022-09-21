package typings.mangopay2NodejsSdk.mod.models

import typings.mangopay2NodejsSdk.addressMod.address.AddressType
import typings.mangopay2NodejsSdk.bankAccountMod.bankAccount.BaseData
import typings.mangopay2NodejsSdk.bankAccountMod.bankAccount.CreationDetails
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mangopay2-nodejs-sdk", "models.BankAccount")
@js.native
open class BankAccount protected ()
  extends EntityBase[BaseData]
     with BaseData {
  def this(data: CreationDetails) = this()
  
  /**
    * Whether the bank account is active or not
    */
  /* CompleteClass */
  var Active: Boolean = js.native
  
  /* CompleteClass */
  var CreationDate: Double = js.native
  
  /* CompleteClass */
  var Id: String = js.native
  
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
  var Tag: String = js.native
  
  /**
    * The type of bank account
    */
  /* CompleteClass */
  var Type: typings.mangopay2NodejsSdk.bankAccountMod.bankAccount.BankAccountType = js.native
  
  /**
    * The object owner's UserId
    */
  /* CompleteClass */
  var UserId: String = js.native
}
