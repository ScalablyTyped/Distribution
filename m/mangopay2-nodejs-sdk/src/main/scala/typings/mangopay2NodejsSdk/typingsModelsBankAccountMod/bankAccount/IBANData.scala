package typings.mangopay2NodejsSdk.typingsModelsBankAccountMod.bankAccount

import typings.mangopay2NodejsSdk.typingsModelsAddressMod.address.AddressType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.mangopay2NodejsSdk.typingsModelsBankAccountMod.bankAccount.IBANDetails because var conflicts: OwnerAddress, OwnerName, Type. Inlined IBAN, BIC */ trait IBANData
  extends StObject
     with BaseData
     with Data
     with CreationDetails {
  
  /**
    * The BIC of the bank account
    */
  var BIC: js.UndefOr[String] = js.undefined
  
  /**
    * The IBAN of the bank account
    */
  var IBAN: String
}
object IBANData {
  
  inline def apply(
    Active: Boolean,
    CreationDate: Double,
    IBAN: String,
    Id: String,
    OwnerAddress: AddressType,
    OwnerName: String,
    Tag: String,
    Type: BankAccountType,
    UserId: String
  ): IBANData = {
    val __obj = js.Dynamic.literal(Active = Active.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], IBAN = IBAN.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], OwnerAddress = OwnerAddress.asInstanceOf[js.Any], OwnerName = OwnerName.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBANData]
  }
  
  extension [Self <: IBANData](x: Self) {
    
    inline def setBIC(value: String): Self = StObject.set(x, "BIC", value.asInstanceOf[js.Any])
    
    inline def setBICUndefined: Self = StObject.set(x, "BIC", js.undefined)
    
    inline def setIBAN(value: String): Self = StObject.set(x, "IBAN", value.asInstanceOf[js.Any])
  }
}
