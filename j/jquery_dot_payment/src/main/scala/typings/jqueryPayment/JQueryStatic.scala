package typings.jqueryPayment

import typings.jqueryPayment.JQueryPayment.Payment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQueryStatic extends StObject {
  
  var payment: Payment = js.native
}
object JQueryStatic {
  
  @scala.inline
  def apply(payment: Payment): JQueryStatic = {
    val __obj = js.Dynamic.literal(payment = payment.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryStatic]
  }
  
  @scala.inline
  implicit class JQueryStaticMutableBuilder[Self <: JQueryStatic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPayment(value: Payment): Self = StObject.set(x, "payment", value.asInstanceOf[js.Any])
  }
}
