package typings.mangopay2NodejsSdk.mod.bankAccount

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CA
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GB
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IBAN
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OTHER
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.US
import typings.mangopay2NodejsSdk.mod.address.AddressType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.mangopay2NodejsSdk.mod.bankAccount.OtherDetails
  - typings.mangopay2NodejsSdk.mod.bankAccount.CADetails
  - typings.mangopay2NodejsSdk.mod.bankAccount.GBDetails
  - typings.mangopay2NodejsSdk.mod.bankAccount.IBANDetails
  - typings.mangopay2NodejsSdk.mod.bankAccount.USDetails
*/
trait CreationDetails extends js.Object

object CreationDetails {
  @scala.inline
  def CADetails(
    AccountNumber: String,
    BankName: String,
    BranchCode: String,
    InstitutionNumber: String,
    OwnerAddress: AddressType,
    OwnerName: String,
    Type: CA
  ): CreationDetails = {
    val __obj = js.Dynamic.literal(AccountNumber = AccountNumber.asInstanceOf[js.Any], BankName = BankName.asInstanceOf[js.Any], BranchCode = BranchCode.asInstanceOf[js.Any], InstitutionNumber = InstitutionNumber.asInstanceOf[js.Any], OwnerAddress = OwnerAddress.asInstanceOf[js.Any], OwnerName = OwnerName.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreationDetails]
  }
  @scala.inline
  def IBANDetails(IBAN: String, OwnerAddress: AddressType, OwnerName: String, Type: IBAN, BIC: String = null): CreationDetails = {
    val __obj = js.Dynamic.literal(IBAN = IBAN.asInstanceOf[js.Any], OwnerAddress = OwnerAddress.asInstanceOf[js.Any], OwnerName = OwnerName.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    if (BIC != null) __obj.updateDynamic("BIC")(BIC.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreationDetails]
  }
  @scala.inline
  def GBDetails(AccountNumber: String, OwnerAddress: AddressType, OwnerName: String, SortCode: String, Type: GB): CreationDetails = {
    val __obj = js.Dynamic.literal(AccountNumber = AccountNumber.asInstanceOf[js.Any], OwnerAddress = OwnerAddress.asInstanceOf[js.Any], OwnerName = OwnerName.asInstanceOf[js.Any], SortCode = SortCode.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreationDetails]
  }
  @scala.inline
  def OtherDetails(
    AccountNumber: String,
    BIC: String,
    Country: String,
    OwnerAddress: AddressType,
    OwnerName: String,
    Type: OTHER
  ): CreationDetails = {
    val __obj = js.Dynamic.literal(AccountNumber = AccountNumber.asInstanceOf[js.Any], BIC = BIC.asInstanceOf[js.Any], Country = Country.asInstanceOf[js.Any], OwnerAddress = OwnerAddress.asInstanceOf[js.Any], OwnerName = OwnerName.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreationDetails]
  }
  @scala.inline
  def USDetails(
    ABA: String,
    AccountNumber: String,
    OwnerAddress: AddressType,
    OwnerName: String,
    Type: US,
    DepositAccountType: DepositAccountType = null
  ): CreationDetails = {
    val __obj = js.Dynamic.literal(ABA = ABA.asInstanceOf[js.Any], AccountNumber = AccountNumber.asInstanceOf[js.Any], OwnerAddress = OwnerAddress.asInstanceOf[js.Any], OwnerName = OwnerName.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    if (DepositAccountType != null) __obj.updateDynamic("DepositAccountType")(DepositAccountType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreationDetails]
  }
}

