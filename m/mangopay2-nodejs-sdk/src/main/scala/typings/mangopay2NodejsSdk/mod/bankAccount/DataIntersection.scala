package typings.mangopay2NodejsSdk.mod.bankAccount

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CA
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GB
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IBAN
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OTHER
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.US
import typings.mangopay2NodejsSdk.mod.address.AddressType
import typings.mangopay2NodejsSdk.mod.models.BankAccountDetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.bankAccount.OtherData & mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.bankAccount.CAData & mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.bankAccount.GBData & mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.bankAccount.IBANData & mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.bankAccount.USData & {  Type :never} */
@js.native
trait DataIntersection extends js.Object {
  /**
    * The ABA of the bank account. Must be numbers only, and 9 digits long
    */
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
  var AccountNumber: String = js.native
  /**
    * Whether the bank account is active or not
    */
  var Active: Boolean = js.native
  /**
    * The BIC of the bank account
    */
  var BIC: String with js.UndefOr[String] = js.native
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
  var CreationDate: Double = js.native
  /**
    * The type of account
    */
  var DepositAccountType: js.UndefOr[typings.mangopay2NodejsSdk.mod.bankAccount.DepositAccountType] = js.native
  /**
    * @deprecated
    */
  var Details: js.UndefOr[BankAccountDetails] = js.native
  /**
    * The IBAN of the bank account
    */
  var IBAN: String = js.native
  var Id: String = js.native
  /**
    * The institution number of the bank account. Must be numbers only, and 3 or 4 digits long
    */
  var InstitutionNumber: String = js.native
  /**
    * The address of the owner of the bank account
    */
  var OwnerAddress: AddressType = js.native
  /**
    * The name of the owner of the bank account
    */
  var OwnerName: String = js.native
  /**
    * The sort code of the bank account. Must be numbers only, and 6 digits long
    */
  var SortCode: String = js.native
  var Tag: String = js.native
  /**
    * The type of bank account
    */
  var Type: BankAccountType with OTHER with CA with GB with IBAN with US = js.native
  /**
    * The object owner's UserId
    */
  var UserId: String = js.native
}

object DataIntersection {
  @scala.inline
  def apply(
    ABA: String,
    AccountNumber: String,
    Active: Boolean,
    BIC: String with js.UndefOr[String],
    BankName: String,
    BranchCode: String,
    Country: String,
    CreationDate: Double,
    IBAN: String,
    Id: String,
    InstitutionNumber: String,
    OwnerAddress: AddressType,
    OwnerName: String,
    SortCode: String,
    Tag: String,
    Type: BankAccountType with OTHER with CA with GB with IBAN with US,
    UserId: String
  ): DataIntersection = {
    val __obj = js.Dynamic.literal(ABA = ABA.asInstanceOf[js.Any], AccountNumber = AccountNumber.asInstanceOf[js.Any], Active = Active.asInstanceOf[js.Any], BIC = BIC.asInstanceOf[js.Any], BankName = BankName.asInstanceOf[js.Any], BranchCode = BranchCode.asInstanceOf[js.Any], Country = Country.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], IBAN = IBAN.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], InstitutionNumber = InstitutionNumber.asInstanceOf[js.Any], OwnerAddress = OwnerAddress.asInstanceOf[js.Any], OwnerName = OwnerName.asInstanceOf[js.Any], SortCode = SortCode.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataIntersection]
  }
  @scala.inline
  implicit class DataIntersectionOps[Self <: DataIntersection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setABA(value: String): Self = this.set("ABA", value.asInstanceOf[js.Any])
    @scala.inline
    def setAccountNumber(value: String): Self = this.set("AccountNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def setActive(value: Boolean): Self = this.set("Active", value.asInstanceOf[js.Any])
    @scala.inline
    def setBIC(value: String with js.UndefOr[String]): Self = this.set("BIC", value.asInstanceOf[js.Any])
    @scala.inline
    def setBankName(value: String): Self = this.set("BankName", value.asInstanceOf[js.Any])
    @scala.inline
    def setBranchCode(value: String): Self = this.set("BranchCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setCountry(value: String): Self = this.set("Country", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreationDate(value: Double): Self = this.set("CreationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setIBAN(value: String): Self = this.set("IBAN", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def setInstitutionNumber(value: String): Self = this.set("InstitutionNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def setOwnerAddress(value: AddressType): Self = this.set("OwnerAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def setOwnerName(value: String): Self = this.set("OwnerName", value.asInstanceOf[js.Any])
    @scala.inline
    def setSortCode(value: String): Self = this.set("SortCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setTag(value: String): Self = this.set("Tag", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: BankAccountType with OTHER with CA with GB with IBAN with US): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserId(value: String): Self = this.set("UserId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDepositAccountType(value: DepositAccountType): Self = this.set("DepositAccountType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDepositAccountType: Self = this.set("DepositAccountType", js.undefined)
    @scala.inline
    def setDetails(value: BankAccountDetails): Self = this.set("Details", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetails: Self = this.set("Details", js.undefined)
  }
  
}

