package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrdersCancelTestOrderByCustomerResponse extends StObject {
  
  /** Identifies what kind of resource this is. Value: the fixed string "content#ordersCancelTestOrderByCustomerResponse". */
  var kind: js.UndefOr[String] = js.undefined
}
object OrdersCancelTestOrderByCustomerResponse {
  
  @scala.inline
  def apply(): OrdersCancelTestOrderByCustomerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrdersCancelTestOrderByCustomerResponse]
  }
  
  @scala.inline
  implicit class OrdersCancelTestOrderByCustomerResponseMutableBuilder[Self <: OrdersCancelTestOrderByCustomerResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
