package typings.mangopay2NodejsSdk.mod.bankAccount

import typings.mangopay2NodejsSdk.mod.address.AddressType
import typings.mangopay2NodejsSdk.mod.entityBase.EntityBaseData
import typings.mangopay2NodejsSdk.mod.models.BankAccountDetails
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseData
  extends StObject
     with EntityBaseData {
  
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
