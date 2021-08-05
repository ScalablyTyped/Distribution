package typings.jqueryPayment

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQuery extends StObject {
  
  def payment(command: String): JQuery
}
object JQuery {
  
  inline def apply(payment: String => JQuery): JQuery = {
    val __obj = js.Dynamic.literal(payment = js.Any.fromFunction1(payment))
    __obj.asInstanceOf[JQuery]
  }
  
  extension [Self <: JQuery](x: Self) {
    
    inline def setPayment(value: String => JQuery): Self = StObject.set(x, "payment", js.Any.fromFunction1(value))
  }
}
