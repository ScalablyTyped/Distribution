package typings.mangopay2NodejsSdk.mod

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BANK_WIRE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPayOutPaymentType extends StObject {
  
  var BankWire: BANK_WIRE = js.native
}
object IPayOutPaymentType {
  
  @scala.inline
  def apply(BankWire: BANK_WIRE): IPayOutPaymentType = {
    val __obj = js.Dynamic.literal(BankWire = BankWire.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPayOutPaymentType]
  }
  
  @scala.inline
  implicit class IPayOutPaymentTypeMutableBuilder[Self <: IPayOutPaymentType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBankWire(value: BANK_WIRE): Self = StObject.set(x, "BankWire", value.asInstanceOf[js.Any])
  }
}
