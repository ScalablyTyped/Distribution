package typings.mangopay2NodejsSdk.mod.bankAccount

import typings.mangopay2NodejsSdk.mod.address.AddressType
import typings.mangopay2NodejsSdk.mod.entityBase.EntityBaseData
import typings.mangopay2NodejsSdk.mod.models.BankAccountDetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseData extends EntityBaseData {
  /**
    * Whether the bank account is active or not
    */
  var Active: Boolean
  /**
    * @deprecated
    */
  var Details: js.UndefOr[BankAccountDetails] = js.undefined
  /**
    * The address of the owner of the bank account
    */
  var OwnerAddress: AddressType
  /**
    * The name of the owner of the bank account
    */
  var OwnerName: String
  /**
    * The type of bank account
    */
  var Type: BankAccountType
  /**
    * The object owner's UserId
    */
  var UserId: String
}

object BaseData {
  @scala.inline
  def apply(
    Active: Boolean,
    CreationDate: Double,
    Id: String,
    OwnerAddress: AddressType,
    OwnerName: String,
    Tag: String,
    Type: BankAccountType,
    UserId: String,
    Details: BankAccountDetails = null
  ): BaseData = {
    val __obj = js.Dynamic.literal(Active = Active.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], OwnerAddress = OwnerAddress.asInstanceOf[js.Any], OwnerName = OwnerName.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
    if (Details != null) __obj.updateDynamic("Details")(Details.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseData]
  }
}

