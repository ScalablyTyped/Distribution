package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrdersCancelTestOrderByCustomerResponse extends StObject {
  
  /** Identifies what kind of resource this is. Value: the fixed string "`content#ordersCancelTestOrderByCustomerResponse`". */
  var kind: js.UndefOr[String] = js.undefined
}
object OrdersCancelTestOrderByCustomerResponse {
  
  inline def apply(): OrdersCancelTestOrderByCustomerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrdersCancelTestOrderByCustomerResponse]
  }
  
  extension [Self <: OrdersCancelTestOrderByCustomerResponse](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
