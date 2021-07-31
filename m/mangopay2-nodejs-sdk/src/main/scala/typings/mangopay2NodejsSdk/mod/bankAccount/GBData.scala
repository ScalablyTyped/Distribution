package typings.mangopay2NodejsSdk.mod.bankAccount

import typings.mangopay2NodejsSdk.mod.address.AddressType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.mangopay2NodejsSdk.mod.bankAccount.GBDetails because var conflicts: OwnerAddress, OwnerName, Type. Inlined SortCode, AccountNumber */ trait GBData
  extends StObject
     with BaseData
     with Data
     with CreationDetails {
  
  /**
    * The account number of the bank account. Must be numbers only. GB account numbers must be 8 digits long.
    */
  var AccountNumber: String
  
  /**
    * The sort code of the bank account. Must be numbers only, and 6 digits long
    */
  var SortCode: String
}
object GBData {
  
  @scala.inline
  def apply(
    AccountNumber: String,
    Active: Boolean,
    CreationDate: Double,
    Id: String,
    OwnerAddress: AddressType,
    OwnerName: String,
    SortCode: String,
    Tag: String,
    Type: BankAccountType,
    UserId: String
  ): GBData = {
    val __obj = js.Dynamic.literal(AccountNumber = AccountNumber.asInstanceOf[js.Any], Active = Active.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], OwnerAddress = OwnerAddress.asInstanceOf[js.Any], OwnerName = OwnerName.asInstanceOf[js.Any], SortCode = SortCode.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GBData]
  }
  
  @scala.inline
  implicit class GBDataMutableBuilder[Self <: GBData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountNumber(value: String): Self = StObject.set(x, "AccountNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortCode(value: String): Self = StObject.set(x, "SortCode", value.asInstanceOf[js.Any])
  }
}
