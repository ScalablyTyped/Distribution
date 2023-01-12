package typings.mangopay2NodejsSdk.typingsModelsBankAccountMod.bankAccount

import typings.mangopay2NodejsSdk.typingsModelsAddressMod.address.AddressType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.mangopay2NodejsSdk.typingsModelsBankAccountMod.bankAccount.USDetails because var conflicts: OwnerAddress, OwnerName, Type. Inlined AccountNumber, ABA, DepositAccountType */ trait USData
  extends StObject
     with BaseData
     with Data
     with CreationDetails {
  
  /**
    * The ABA of the bank account. Must be numbers only, and 9 digits long
    */
  var ABA: String
  
  /**
    * The account number of the bank account. US account numbers must be digits only.
    */
  var AccountNumber: String
  
  /**
    * The type of account
    */
  var DepositAccountType: js.UndefOr[
    typings.mangopay2NodejsSdk.typingsModelsBankAccountMod.bankAccount.DepositAccountType
  ] = js.undefined
}
object USData {
  
  inline def apply(
    ABA: String,
    AccountNumber: String,
    Active: Boolean,
    CreationDate: Double,
    Id: String,
    OwnerAddress: AddressType,
    OwnerName: String,
    Tag: String,
    Type: BankAccountType,
    UserId: String
  ): USData = {
    val __obj = js.Dynamic.literal(ABA = ABA.asInstanceOf[js.Any], AccountNumber = AccountNumber.asInstanceOf[js.Any], Active = Active.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], OwnerAddress = OwnerAddress.asInstanceOf[js.Any], OwnerName = OwnerName.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[USData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: USData] (val x: Self) extends AnyVal {
    
    inline def setABA(value: String): Self = StObject.set(x, "ABA", value.asInstanceOf[js.Any])
    
    inline def setAccountNumber(value: String): Self = StObject.set(x, "AccountNumber", value.asInstanceOf[js.Any])
    
    inline def setDepositAccountType(value: DepositAccountType): Self = StObject.set(x, "DepositAccountType", value.asInstanceOf[js.Any])
    
    inline def setDepositAccountTypeUndefined: Self = StObject.set(x, "DepositAccountType", js.undefined)
  }
}
