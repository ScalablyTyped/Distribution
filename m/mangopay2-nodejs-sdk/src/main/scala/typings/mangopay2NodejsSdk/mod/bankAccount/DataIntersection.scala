package typings.mangopay2NodejsSdk.mod.bankAccount

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CA
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GB
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IBAN
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OTHER
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.US
import typings.mangopay2NodejsSdk.mod.address.AddressType
import typings.mangopay2NodejsSdk.mod.models.BankAccountDetails
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.bankAccount.OtherData & mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.bankAccount.CAData & mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.bankAccount.GBData & mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.bankAccount.IBANData & mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.bankAccount.USData & {  Type :never} */
trait DataIntersection extends StObject {
  
  /**
    * The ABA of the bank account. Must be numbers only, and 9 digits long
    */
  var ABA: String
  
  /**
    * The account number of the bank account. Must be numbers only. Canadian account numbers must be a maximum of 20 digits.
    */
  /**
    * The account number of the bank account. Must be numbers only. GB account numbers must be 8 digits long.
    */
  /**
    * The account number of the bank account. US account numbers must be digits only.
    */
  var AccountNumber: String
  
  /**
    * Whether the bank account is active or not
    */
  var Active: Boolean
  
  /**
    * The BIC of the bank account
    */
  var BIC: String & js.UndefOr[String]
  
  /**
    * The name of the bank where the account is held. Must be letters or numbers only and maximum 50 characters long.
    */
  var BankName: String
  
  /**
    * The branch code of the bank where the bank account. Must be numbers only, and 5 digits long
    */
  var BranchCode: String
  
  /**
    * The Country of the Address
    */
  var Country: String
  
  var CreationDate: Double
  
  /**
    * The type of account
    */
  var DepositAccountType: js.UndefOr[typings.mangopay2NodejsSdk.mod.bankAccount.DepositAccountType] = js.undefined
  
  /**
    * @deprecated
    */
  var Details: js.UndefOr[BankAccountDetails] = js.undefined
  
  /**
    * The IBAN of the bank account
    */
  var IBAN: String
  
  var Id: String
  
  /**
    * The institution number of the bank account. Must be numbers only, and 3 or 4 digits long
    */
  var InstitutionNumber: String
  
  /**
    * The address of the owner of the bank account
    */
  var OwnerAddress: AddressType
  
  /**
    * The name of the owner of the bank account
    */
  var OwnerName: String
  
  /**
    * The sort code of the bank account. Must be numbers only, and 6 digits long
    */
  var SortCode: String
  
  var Tag: String
  
  /**
    * The type of bank account
    */
  var Type: BankAccountType & OTHER & CA & GB & IBAN & US
  
  /**
    * The object owner's UserId
    */
  var UserId: String
}
object DataIntersection {
  
  @scala.inline
  def apply(
    ABA: String,
    AccountNumber: String,
    Active: Boolean,
    BIC: String & js.UndefOr[String],
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
    Type: BankAccountType & OTHER & CA & GB & IBAN & US,
    UserId: String
  ): DataIntersection = {
    val __obj = js.Dynamic.literal(ABA = ABA.asInstanceOf[js.Any], AccountNumber = AccountNumber.asInstanceOf[js.Any], Active = Active.asInstanceOf[js.Any], BIC = BIC.asInstanceOf[js.Any], BankName = BankName.asInstanceOf[js.Any], BranchCode = BranchCode.asInstanceOf[js.Any], Country = Country.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], IBAN = IBAN.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], InstitutionNumber = InstitutionNumber.asInstanceOf[js.Any], OwnerAddress = OwnerAddress.asInstanceOf[js.Any], OwnerName = OwnerName.asInstanceOf[js.Any], SortCode = SortCode.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataIntersection]
  }
  
  @scala.inline
  implicit class DataIntersectionMutableBuilder[Self <: DataIntersection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setABA(value: String): Self = StObject.set(x, "ABA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountNumber(value: String): Self = StObject.set(x, "AccountNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActive(value: Boolean): Self = StObject.set(x, "Active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBIC(value: String & js.UndefOr[String]): Self = StObject.set(x, "BIC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBankName(value: String): Self = StObject.set(x, "BankName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBranchCode(value: String): Self = StObject.set(x, "BranchCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountry(value: String): Self = StObject.set(x, "Country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDate(value: Double): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepositAccountType(value: DepositAccountType): Self = StObject.set(x, "DepositAccountType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepositAccountTypeUndefined: Self = StObject.set(x, "DepositAccountType", js.undefined)
    
    @scala.inline
    def setDetails(value: BankAccountDetails): Self = StObject.set(x, "Details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailsUndefined: Self = StObject.set(x, "Details", js.undefined)
    
    @scala.inline
    def setIBAN(value: String): Self = StObject.set(x, "IBAN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstitutionNumber(value: String): Self = StObject.set(x, "InstitutionNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerAddress(value: AddressType): Self = StObject.set(x, "OwnerAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerName(value: String): Self = StObject.set(x, "OwnerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortCode(value: String): Self = StObject.set(x, "SortCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTag(value: String): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: BankAccountType & OTHER & CA & GB & IBAN & US): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserId(value: String): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
  }
}
