package typings.mangopay2NodejsSdk.mod.bankAccount

import typings.mangopay2NodejsSdk.mod.address.AddressType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.mangopay2NodejsSdk.mod.bankAccount.OtherDetails
  - typings.mangopay2NodejsSdk.mod.bankAccount.CADetails
  - typings.mangopay2NodejsSdk.mod.bankAccount.GBDetails
  - typings.mangopay2NodejsSdk.mod.bankAccount.IBANDetails
  - typings.mangopay2NodejsSdk.mod.bankAccount.USDetails
*/
trait CreationDetails extends StObject
object CreationDetails {
  
  @scala.inline
  def CADetails(
    AccountNumber: String,
    BankName: String,
    BranchCode: String,
    InstitutionNumber: String,
    OwnerAddress: AddressType,
    OwnerName: String
  ): typings.mangopay2NodejsSdk.mod.bankAccount.CADetails = {
    val __obj = js.Dynamic.literal(AccountNumber = AccountNumber.asInstanceOf[js.Any], BankName = BankName.asInstanceOf[js.Any], BranchCode = BranchCode.asInstanceOf[js.Any], InstitutionNumber = InstitutionNumber.asInstanceOf[js.Any], OwnerAddress = OwnerAddress.asInstanceOf[js.Any], OwnerName = OwnerName.asInstanceOf[js.Any], Type = "CA")
    __obj.asInstanceOf[typings.mangopay2NodejsSdk.mod.bankAccount.CADetails]
  }
  
  @scala.inline
  def GBDetails(AccountNumber: String, OwnerAddress: AddressType, OwnerName: String, SortCode: String): typings.mangopay2NodejsSdk.mod.bankAccount.GBDetails = {
    val __obj = js.Dynamic.literal(AccountNumber = AccountNumber.asInstanceOf[js.Any], OwnerAddress = OwnerAddress.asInstanceOf[js.Any], OwnerName = OwnerName.asInstanceOf[js.Any], SortCode = SortCode.asInstanceOf[js.Any], Type = "GB")
    __obj.asInstanceOf[typings.mangopay2NodejsSdk.mod.bankAccount.GBDetails]
  }
  
  @scala.inline
  def IBANDetails(IBAN: String, OwnerAddress: AddressType, OwnerName: String): typings.mangopay2NodejsSdk.mod.bankAccount.IBANDetails = {
    val __obj = js.Dynamic.literal(IBAN = IBAN.asInstanceOf[js.Any], OwnerAddress = OwnerAddress.asInstanceOf[js.Any], OwnerName = OwnerName.asInstanceOf[js.Any], Type = "IBAN")
    __obj.asInstanceOf[typings.mangopay2NodejsSdk.mod.bankAccount.IBANDetails]
  }
  
  @scala.inline
  def OtherDetails(AccountNumber: String, BIC: String, Country: String, OwnerAddress: AddressType, OwnerName: String): typings.mangopay2NodejsSdk.mod.bankAccount.OtherDetails = {
    val __obj = js.Dynamic.literal(AccountNumber = AccountNumber.asInstanceOf[js.Any], BIC = BIC.asInstanceOf[js.Any], Country = Country.asInstanceOf[js.Any], OwnerAddress = OwnerAddress.asInstanceOf[js.Any], OwnerName = OwnerName.asInstanceOf[js.Any], Type = "OTHER")
    __obj.asInstanceOf[typings.mangopay2NodejsSdk.mod.bankAccount.OtherDetails]
  }
  
  @scala.inline
  def USDetails(ABA: String, AccountNumber: String, OwnerAddress: AddressType, OwnerName: String): typings.mangopay2NodejsSdk.mod.bankAccount.USDetails = {
    val __obj = js.Dynamic.literal(ABA = ABA.asInstanceOf[js.Any], AccountNumber = AccountNumber.asInstanceOf[js.Any], OwnerAddress = OwnerAddress.asInstanceOf[js.Any], OwnerName = OwnerName.asInstanceOf[js.Any], Type = "US")
    __obj.asInstanceOf[typings.mangopay2NodejsSdk.mod.bankAccount.USDetails]
  }
}
