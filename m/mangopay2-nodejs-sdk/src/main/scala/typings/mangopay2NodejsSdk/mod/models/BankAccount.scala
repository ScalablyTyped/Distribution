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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  override var ABA: String = js.native
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
  override var AccountNumber: String = js.native
  /**
    * Whether the bank account is active or not
    */
  /* CompleteClass */
  override var Active: Boolean = js.native
  /**
    * The name of the bank where the account is held. Must be letters or numbers only and maximum 50 characters long.
    */
  /* CompleteClass */
  override var BankName: String = js.native
  /**
    * The branch code of the bank where the bank account. Must be numbers only, and 5 digits long
    */
  /* CompleteClass */
  override var BranchCode: String = js.native
  /**
    * The Country of the Address
    */
  /* CompleteClass */
  override var Country: String = js.native
  /* CompleteClass */
  override var CreationDate: Double = js.native
  /**
    * The IBAN of the bank account
    */
  /* CompleteClass */
  override var IBAN: String = js.native
  /* CompleteClass */
  override var Id: String = js.native
  /**
    * The institution number of the bank account. Must be numbers only, and 3 or 4 digits long
    */
  /* CompleteClass */
  override var InstitutionNumber: String = js.native
  /**
    * The address of the owner of the bank account
    */
  /* CompleteClass */
  override var OwnerAddress: AddressType = js.native
  /**
    * The name of the owner of the bank account
    */
  /* CompleteClass */
  override var OwnerName: String = js.native
  /**
    * The sort code of the bank account. Must be numbers only, and 6 digits long
    */
  /* CompleteClass */
  override var SortCode: String = js.native
  /* CompleteClass */
  override var Tag: String = js.native
  /**
    * The type of bank account
    */
  /* CompleteClass */
  override var Type: typings.mangopay2NodejsSdk.mod.bankAccount.BankAccountType with OTHER with CA with GB with IBAN with US = js.native
  /**
    * The object owner's UserId
    */
  /* CompleteClass */
  override var UserId: String = js.native
}

