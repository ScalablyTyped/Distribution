package typings.mangopay2NodejsSdk.mod.models

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CA
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GB
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IBAN
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OTHER
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.US
import typings.mangopay2NodejsSdk.mod.address.AddressType
import typings.mangopay2NodejsSdk.mod.bankAccount.BaseData
import typings.mangopay2NodejsSdk.mod.bankAccount.CreationDetails
import typings.mangopay2NodejsSdk.mod.bankAccount.DataIntersection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mangopay2-nodejs-sdk", "models.BankAccount")
@js.native
class BankAccount protected ()
  extends EntityBase[BaseData]
     with DataIntersection {
  def this(data: CreationDetails) = this()
  
  /**
    * The ABA of the bank account. Must be numbers only, and 9 digits long
    */
  /* CompleteClass */
  var ABA: String = js.native
  
  /**
    * The account number of the bank account. Must be numbers only. Canadian account numbers must be a maximum of 20 digits.
    */
  /**
    * The account number of the bank account. Must be numbers only. GB account numbers must be 8 digits long.
    */
  /**
    * The account number of the bank account. US account numbers must be digits only.
    */
  /* CompleteClass */
  var AccountNumber: String = js.native
  
  /**
    * Whether the bank account is active or not
    */
  /* CompleteClass */
  var Active: Boolean = js.native
  
  /**
    * The BIC of the bank account
    */
  /* CompleteClass */
  var BIC: String & js.UndefOr[String] = js.native
  
  /**
    * The name of the bank where the account is held. Must be letters or numbers only and maximum 50 characters long.
    */
  /* CompleteClass */
  var BankName: String = js.native
  
  /**
    * The branch code of the bank where the bank account. Must be numbers only, and 5 digits long
    */
  /* CompleteClass */
  var BranchCode: String = js.native
  
  /**
    * The Country of the Address
    */
  /* CompleteClass */
  var Country: String = js.native
  
  /* CompleteClass */
  var CreationDate: Double = js.native
  
  /**
    * The IBAN of the bank account
    */
  /* CompleteClass */
  var IBAN: String = js.native
  
  /* CompleteClass */
  var Id: String = js.native
  
  /**
    * The institution number of the bank account. Must be numbers only, and 3 or 4 digits long
    */
  /* CompleteClass */
  var InstitutionNumber: String = js.native
  
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
  
  /**
    * The sort code of the bank account. Must be numbers only, and 6 digits long
    */
  /* CompleteClass */
  var SortCode: String = js.native
  
  /* CompleteClass */
  var Tag: String = js.native
  
  /**
    * The type of bank account
    */
  /* CompleteClass */
  var Type: typings.mangopay2NodejsSdk.mod.bankAccount.BankAccountType & OTHER & CA & GB & IBAN & US = js.native
  
  /**
    * The object owner's UserId
    */
  /* CompleteClass */
  var UserId: String = js.native
}
