package typings.mangopay2NodejsSdk.typingsEnumsMod.enums

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BANK_WIRE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPayOutPaymentType extends StObject {
  
  var BankWire: BANK_WIRE
}
object IPayOutPaymentType {
  
  inline def apply(): IPayOutPaymentType = {
    val __obj = js.Dynamic.literal(BankWire = "BANK_WIRE")
    __obj.asInstanceOf[IPayOutPaymentType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IPayOutPaymentType] (val x: Self) extends AnyVal {
    
    inline def setBankWire(value: BANK_WIRE): Self = StObject.set(x, "BankWire", value.asInstanceOf[js.Any])
  }
}
