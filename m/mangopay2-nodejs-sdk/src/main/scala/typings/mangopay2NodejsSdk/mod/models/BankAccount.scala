package typings.mangopay2NodejsSdk.mod.models

import typings.mangopay2NodejsSdk.mod.address.AddressType
import typings.mangopay2NodejsSdk.mod.bankAccount.BaseData
import typings.mangopay2NodejsSdk.mod.bankAccount.CreationDetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.mangopay2NodejsSdk.mod.bankAccount.USDetails because var conflicts: AccountNumber, OwnerAddress, OwnerName, Type. Inlined ABA, DepositAccountType
- typings.mangopay2NodejsSdk.mod.bankAccount.IBANDetails because var conflicts: BIC, OwnerAddress, OwnerName, Type. Inlined IBAN
- typings.mangopay2NodejsSdk.mod.bankAccount.GBDetails because var conflicts: AccountNumber, OwnerAddress, OwnerName, Type. Inlined SortCode
- typings.mangopay2NodejsSdk.mod.bankAccount.CADetails because var conflicts: AccountNumber, OwnerAddress, OwnerName, Type. Inlined BranchCode, InstitutionNumber, BankName
- typings.mangopay2NodejsSdk.mod.bankAccount.OtherDetails because var conflicts: OwnerAddress, OwnerName, Type. Inlined Country, BIC, AccountNumber */ @JSImport("mangopay2-nodejs-sdk", "models.BankAccount")
@js.native
class BankAccount protected ()
  extends EntityBase[BaseData]
     with BaseData
     with CreationDetails {
  def this(data: CreationDetails) = this()
  /**
    * The ABA of the bank account. Must be numbers only, and 9 digits long
    */
  var ABA: String = js.native
  /**
    * The account number of the bank account. Must be numbers only. Canadian account numbers must be a maximum of 20 digits.
    */
  var AccountNumber: String = js.native
  /**
    * Whether the bank account is active or not
    */
  /* CompleteClass */
  override var Active: Boolean = js.native
  /**
    * The BIC of the bank account
    */
  var BIC: String = js.native
  /**
    * The name of the bank where the account is held. Must be letters or numbers only and maximum 50 characters long.
    */
  var BankName: String = js.native
  /**
    * The branch code of the bank where the bank account. Must be numbers only, and 5 digits long
    */
  var BranchCode: String = js.native
  /**
    * The Country of the Address
    */
  var Country: String = js.native
  /* CompleteClass */
  override var CreationDate: Double = js.native
  /**
    * The type of account
    */
  var DepositAccountType: js.UndefOr[typings.mangopay2NodejsSdk.mod.bankAccount.DepositAccountType] = js.native
  /**
    * The IBAN of the bank account
    */
  var IBAN: String = js.native
  /* CompleteClass */
  override var Id: String = js.native
  /**
    * The institution number of the bank account. Must be numbers only, and 3 or 4 digits long
    */
  var InstitutionNumber: String = js.native
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
  var SortCode: String = js.native
  /* CompleteClass */
  override var Tag: String = js.native
  /**
    * The type of bank account
    */
  /* CompleteClass */
  override var Type: typings.mangopay2NodejsSdk.mod.bankAccount.BankAccountType = js.native
  /**
    * The object owner's UserId
    */
  /* CompleteClass */
  override var UserId: String = js.native
}

