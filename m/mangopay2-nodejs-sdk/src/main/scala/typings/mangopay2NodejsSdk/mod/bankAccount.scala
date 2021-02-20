package typings.mangopay2NodejsSdk.mod

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CA
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GB
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IBAN
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OTHER
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.US
import typings.mangopay2NodejsSdk.mod.address.AddressType
import typings.mangopay2NodejsSdk.mod.entityBase.EntityBaseData
import typings.mangopay2NodejsSdk.mod.models.BankAccountDetails
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bankAccount {
  
  /* Rewritten from type alias, can be one of: 
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IBAN
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GB
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.US
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CA
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OTHER
  */
  trait BankAccountType extends StObject
  object BankAccountType {
    
    @scala.inline
    def CA: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CA = "CA".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CA]
    
    @scala.inline
    def GB: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GB = "GB".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.GB]
    
    @scala.inline
    def IBAN: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IBAN = "IBAN".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.IBAN]
    
    @scala.inline
    def OTHER: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OTHER = "OTHER".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.OTHER]
    
    @scala.inline
    def US: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.US = "US".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.US]
  }
  
  @js.native
  trait BaseData extends EntityBaseData {
    
    /**
      * Whether the bank account is active or not
      */
    var Active: Boolean = js.native
    
    /**
      * @deprecated
      */
    var Details: js.UndefOr[BankAccountDetails] = js.native
    
    /**
      * The address of the owner of the bank account
      */
    var OwnerAddress: AddressType = js.native
    
    /**
      * The name of the owner of the bank account
      */
    var OwnerName: String = js.native
    
    /**
      * The type of bank account
      */
    var Type: BankAccountType = js.native
    
    /**
      * The object owner's UserId
      */
    var UserId: String = js.native
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
      UserId: String
    ): BaseData = {
      val __obj = js.Dynamic.literal(Active = Active.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], OwnerAddress = OwnerAddress.asInstanceOf[js.Any], OwnerName = OwnerName.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseData]
    }
    
    @scala.inline
    implicit class BaseDataMutableBuilder[Self <: BaseData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "Active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetails(value: BankAccountDetails): Self = StObject.set(x, "Details", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetailsUndefined: Self = StObject.set(x, "Details", js.undefined)
      
      @scala.inline
      def setOwnerAddress(value: AddressType): Self = StObject.set(x, "OwnerAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwnerName(value: String): Self = StObject.set(x, "OwnerName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: BankAccountType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserId(value: String): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
    }
  }
  
  type CAData = BaseData with CADetails
  
  @js.native
  trait CADetails extends CreationDetails {
    
    /**
      * The account number of the bank account. Must be numbers only. Canadian account numbers must be a maximum of 20 digits.
      */
    var AccountNumber: String = js.native
    
    /**
      * The name of the bank where the account is held. Must be letters or numbers only and maximum 50 characters long.
      */
    var BankName: String = js.native
    
    /**
      * The branch code of the bank where the bank account. Must be numbers only, and 5 digits long
      */
    var BranchCode: String = js.native
    
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
    
    var Type: CA = js.native
  }
  object CADetails {
    
    @scala.inline
    def apply(
      AccountNumber: String,
      BankName: String,
      BranchCode: String,
      InstitutionNumber: String,
      OwnerAddress: AddressType,
      OwnerName: String,
      Type: CA
    ): CADetails = {
      val __obj = js.Dynamic.literal(AccountNumber = AccountNumber.asInstanceOf[js.Any], BankName = BankName.asInstanceOf[js.Any], BranchCode = BranchCode.asInstanceOf[js.Any], InstitutionNumber = InstitutionNumber.asInstanceOf[js.Any], OwnerAddress = OwnerAddress.asInstanceOf[js.Any], OwnerName = OwnerName.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
      __obj.asInstanceOf[CADetails]
    }
    
    @scala.inline
    implicit class CADetailsMutableBuilder[Self <: CADetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccountNumber(value: String): Self = StObject.set(x, "AccountNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBankName(value: String): Self = StObject.set(x, "BankName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBranchCode(value: String): Self = StObject.set(x, "BranchCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstitutionNumber(value: String): Self = StObject.set(x, "InstitutionNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwnerAddress(value: AddressType): Self = StObject.set(x, "OwnerAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwnerName(value: String): Self = StObject.set(x, "OwnerName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: CA): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    }
  }
  
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
      OwnerName: String,
      Type: CA
    ): typings.mangopay2NodejsSdk.mod.bankAccount.CADetails = {
      val __obj = js.Dynamic.literal(AccountNumber = AccountNumber.asInstanceOf[js.Any], BankName = BankName.asInstanceOf[js.Any], BranchCode = BranchCode.asInstanceOf[js.Any], InstitutionNumber = InstitutionNumber.asInstanceOf[js.Any], OwnerAddress = OwnerAddress.asInstanceOf[js.Any], OwnerName = OwnerName.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.mangopay2NodejsSdk.mod.bankAccount.CADetails]
    }
    
    @scala.inline
    def GBDetails(AccountNumber: String, OwnerAddress: AddressType, OwnerName: String, SortCode: String, Type: GB): typings.mangopay2NodejsSdk.mod.bankAccount.GBDetails = {
      val __obj = js.Dynamic.literal(AccountNumber = AccountNumber.asInstanceOf[js.Any], OwnerAddress = OwnerAddress.asInstanceOf[js.Any], OwnerName = OwnerName.asInstanceOf[js.Any], SortCode = SortCode.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.mangopay2NodejsSdk.mod.bankAccount.GBDetails]
    }
    
    @scala.inline
    def IBANDetails(IBAN: String, OwnerAddress: AddressType, OwnerName: String, Type: IBAN): typings.mangopay2NodejsSdk.mod.bankAccount.IBANDetails = {
      val __obj = js.Dynamic.literal(IBAN = IBAN.asInstanceOf[js.Any], OwnerAddress = OwnerAddress.asInstanceOf[js.Any], OwnerName = OwnerName.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.mangopay2NodejsSdk.mod.bankAccount.IBANDetails]
    }
    
    @scala.inline
    def OtherDetails(
      AccountNumber: String,
      BIC: String,
      Country: String,
      OwnerAddress: AddressType,
      OwnerName: String,
      Type: OTHER
    ): typings.mangopay2NodejsSdk.mod.bankAccount.OtherDetails = {
      val __obj = js.Dynamic.literal(AccountNumber = AccountNumber.asInstanceOf[js.Any], BIC = BIC.asInstanceOf[js.Any], Country = Country.asInstanceOf[js.Any], OwnerAddress = OwnerAddress.asInstanceOf[js.Any], OwnerName = OwnerName.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.mangopay2NodejsSdk.mod.bankAccount.OtherDetails]
    }
    
    @scala.inline
    def USDetails(ABA: String, AccountNumber: String, OwnerAddress: AddressType, OwnerName: String, Type: US): typings.mangopay2NodejsSdk.mod.bankAccount.USDetails = {
      val __obj = js.Dynamic.literal(ABA = ABA.asInstanceOf[js.Any], AccountNumber = AccountNumber.asInstanceOf[js.Any], OwnerAddress = OwnerAddress.asInstanceOf[js.Any], OwnerName = OwnerName.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.mangopay2NodejsSdk.mod.bankAccount.USDetails]
    }
  }
  
  type Data = OtherData | CAData | GBData | IBANData | USData
  
  /* Inlined mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.bankAccount.OtherData & mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.bankAccount.CAData & mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.bankAccount.GBData & mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.bankAccount.IBANData & mangopay2-nodejs-sdk.mangopay2-nodejs-sdk.bankAccount.USData & {  Type :never} */
  @js.native
  trait DataIntersection extends StObject {
    
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
    implicit class DataIntersectionMutableBuilder[Self <: DataIntersection] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setABA(value: String): Self = StObject.set(x, "ABA", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccountNumber(value: String): Self = StObject.set(x, "AccountNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "Active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBIC(value: String with js.UndefOr[String]): Self = StObject.set(x, "BIC", value.asInstanceOf[js.Any])
      
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
      def setType(value: BankAccountType with OTHER with CA with GB with IBAN with US): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserId(value: String): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CHECKING
    - typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SAVINGS
  */
  trait DepositAccountType extends StObject
  object DepositAccountType {
    
    @scala.inline
    def CHECKING: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CHECKING = "CHECKING".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CHECKING]
    
    @scala.inline
    def SAVINGS: typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SAVINGS = "SAVINGS".asInstanceOf[typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.SAVINGS]
  }
  
  type GBData = BaseData with GBDetails
  
  @js.native
  trait GBDetails extends CreationDetails {
    
    /**
      * The account number of the bank account. Must be numbers only. GB account numbers must be 8 digits long.
      */
    var AccountNumber: String = js.native
    
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
    
    var Type: GB = js.native
  }
  object GBDetails {
    
    @scala.inline
    def apply(AccountNumber: String, OwnerAddress: AddressType, OwnerName: String, SortCode: String, Type: GB): GBDetails = {
      val __obj = js.Dynamic.literal(AccountNumber = AccountNumber.asInstanceOf[js.Any], OwnerAddress = OwnerAddress.asInstanceOf[js.Any], OwnerName = OwnerName.asInstanceOf[js.Any], SortCode = SortCode.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
      __obj.asInstanceOf[GBDetails]
    }
    
    @scala.inline
    implicit class GBDetailsMutableBuilder[Self <: GBDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccountNumber(value: String): Self = StObject.set(x, "AccountNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwnerAddress(value: AddressType): Self = StObject.set(x, "OwnerAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwnerName(value: String): Self = StObject.set(x, "OwnerName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortCode(value: String): Self = StObject.set(x, "SortCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: GB): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    }
  }
  
  type IBANData = BaseData with IBANDetails
  
  @js.native
  trait IBANDetails extends CreationDetails {
    
    /**
      * The BIC of the bank account
      */
    var BIC: js.UndefOr[String] = js.native
    
    /**
      * The IBAN of the bank account
      */
    var IBAN: String = js.native
    
    /**
      * The address of the owner of the bank account
      */
    var OwnerAddress: AddressType = js.native
    
    /**
      * The name of the owner of the bank account
      */
    var OwnerName: String = js.native
    
    var Type: IBAN = js.native
  }
  object IBANDetails {
    
    @scala.inline
    def apply(IBAN: String, OwnerAddress: AddressType, OwnerName: String, Type: IBAN): IBANDetails = {
      val __obj = js.Dynamic.literal(IBAN = IBAN.asInstanceOf[js.Any], OwnerAddress = OwnerAddress.asInstanceOf[js.Any], OwnerName = OwnerName.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
      __obj.asInstanceOf[IBANDetails]
    }
    
    @scala.inline
    implicit class IBANDetailsMutableBuilder[Self <: IBANDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBIC(value: String): Self = StObject.set(x, "BIC", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBICUndefined: Self = StObject.set(x, "BIC", js.undefined)
      
      @scala.inline
      def setIBAN(value: String): Self = StObject.set(x, "IBAN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwnerAddress(value: AddressType): Self = StObject.set(x, "OwnerAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwnerName(value: String): Self = StObject.set(x, "OwnerName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: IBAN): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    }
  }
  
  type OtherData = BaseData with OtherDetails
  
  @js.native
  trait OtherDetails extends CreationDetails {
    
    /**
      * The account number of the bank account. Must be numbers only. Canadian account numbers must be a maximum of 20 digits.
      */
    var AccountNumber: String = js.native
    
    /**
      * The BIC of the bank account
      */
    var BIC: String = js.native
    
    /**
      * The Country of the Address
      */
    var Country: String = js.native
    
    /**
      * The address of the owner of the bank account
      */
    var OwnerAddress: AddressType = js.native
    
    /**
      * The name of the owner of the bank account
      */
    var OwnerName: String = js.native
    
    var Type: OTHER = js.native
  }
  object OtherDetails {
    
    @scala.inline
    def apply(
      AccountNumber: String,
      BIC: String,
      Country: String,
      OwnerAddress: AddressType,
      OwnerName: String,
      Type: OTHER
    ): OtherDetails = {
      val __obj = js.Dynamic.literal(AccountNumber = AccountNumber.asInstanceOf[js.Any], BIC = BIC.asInstanceOf[js.Any], Country = Country.asInstanceOf[js.Any], OwnerAddress = OwnerAddress.asInstanceOf[js.Any], OwnerName = OwnerName.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
      __obj.asInstanceOf[OtherDetails]
    }
    
    @scala.inline
    implicit class OtherDetailsMutableBuilder[Self <: OtherDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccountNumber(value: String): Self = StObject.set(x, "AccountNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBIC(value: String): Self = StObject.set(x, "BIC", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountry(value: String): Self = StObject.set(x, "Country", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwnerAddress(value: AddressType): Self = StObject.set(x, "OwnerAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwnerName(value: String): Self = StObject.set(x, "OwnerName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: OTHER): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    }
  }
  
  type USData = BaseData with USDetails
  
  @js.native
  trait USDetails extends CreationDetails {
    
    /**
      * The ABA of the bank account. Must be numbers only, and 9 digits long
      */
    var ABA: String = js.native
    
    /**
      * The account number of the bank account. US account numbers must be digits only.
      */
    var AccountNumber: String = js.native
    
    /**
      * The type of account
      */
    var DepositAccountType: js.UndefOr[typings.mangopay2NodejsSdk.mod.bankAccount.DepositAccountType] = js.native
    
    /**
      * The address of the owner of the bank account
      */
    var OwnerAddress: AddressType = js.native
    
    /**
      * The name of the owner of the bank account
      */
    var OwnerName: String = js.native
    
    var Type: US = js.native
  }
  object USDetails {
    
    @scala.inline
    def apply(ABA: String, AccountNumber: String, OwnerAddress: AddressType, OwnerName: String, Type: US): USDetails = {
      val __obj = js.Dynamic.literal(ABA = ABA.asInstanceOf[js.Any], AccountNumber = AccountNumber.asInstanceOf[js.Any], OwnerAddress = OwnerAddress.asInstanceOf[js.Any], OwnerName = OwnerName.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
      __obj.asInstanceOf[USDetails]
    }
    
    @scala.inline
    implicit class USDetailsMutableBuilder[Self <: USDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setABA(value: String): Self = StObject.set(x, "ABA", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccountNumber(value: String): Self = StObject.set(x, "AccountNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDepositAccountType(value: DepositAccountType): Self = StObject.set(x, "DepositAccountType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDepositAccountTypeUndefined: Self = StObject.set(x, "DepositAccountType", js.undefined)
      
      @scala.inline
      def setOwnerAddress(value: AddressType): Self = StObject.set(x, "OwnerAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwnerName(value: String): Self = StObject.set(x, "OwnerName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: US): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    }
  }
}
