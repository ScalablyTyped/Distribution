package typings.mangopay2NodejsSdk.typingsModelsPayInMod.payIn

import typings.mangopay2NodejsSdk.typingsEnumsMod.enums.IBankAccountType
import typings.mangopay2NodejsSdk.typingsTypesMod.ValueOf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BankAccountData extends StObject {
  
  /**
    * The BIC of the bank account
    */
  var BIC: String
  
  /**
    * The IBAN of the bank account
    */
  var IBAN: String
  
  /**
    * The address of the owner of the bank account
    */
  var OwnerAddress: String
  
  /**
    * The name of the owner of the bank account
    */
  var OwnerName: String
  
  /**
    * The type of bank account
    */
  var Type: ValueOf[IBankAccountType]
}
object BankAccountData {
  
  inline def apply(
    BIC: String,
    IBAN: String,
    OwnerAddress: String,
    OwnerName: String,
    Type: ValueOf[IBankAccountType]
  ): BankAccountData = {
    val __obj = js.Dynamic.literal(BIC = BIC.asInstanceOf[js.Any], IBAN = IBAN.asInstanceOf[js.Any], OwnerAddress = OwnerAddress.asInstanceOf[js.Any], OwnerName = OwnerName.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[BankAccountData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BankAccountData] (val x: Self) extends AnyVal {
    
    inline def setBIC(value: String): Self = StObject.set(x, "BIC", value.asInstanceOf[js.Any])
    
    inline def setIBAN(value: String): Self = StObject.set(x, "IBAN", value.asInstanceOf[js.Any])
    
    inline def setOwnerAddress(value: String): Self = StObject.set(x, "OwnerAddress", value.asInstanceOf[js.Any])
    
    inline def setOwnerName(value: String): Self = StObject.set(x, "OwnerName", value.asInstanceOf[js.Any])
    
    inline def setType(value: ValueOf[IBankAccountType]): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
