package typings.mangopay2NodejsSdk.typingsEnumsMod.enums

import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CANCELED
import typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.WAITING
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPaymentStatus extends StObject {
  
  var Canceled: CANCELED
  
  var Waiting: WAITING
}
object IPaymentStatus {
  
  inline def apply(): IPaymentStatus = {
    val __obj = js.Dynamic.literal(Canceled = "CANCELED", Waiting = "WAITING")
    __obj.asInstanceOf[IPaymentStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IPaymentStatus] (val x: Self) extends AnyVal {
    
    inline def setCanceled(value: CANCELED): Self = StObject.set(x, "Canceled", value.asInstanceOf[js.Any])
    
    inline def setWaiting(value: WAITING): Self = StObject.set(x, "Waiting", value.asInstanceOf[js.Any])
  }
}
