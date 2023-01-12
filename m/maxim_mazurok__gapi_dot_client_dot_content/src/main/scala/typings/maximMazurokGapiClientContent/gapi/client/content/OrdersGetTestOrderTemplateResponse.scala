package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrdersGetTestOrderTemplateResponse extends StObject {
  
  /** Identifies what kind of resource this is. Value: the fixed string "`content#ordersGetTestOrderTemplateResponse`". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** The requested test order template. */
  var template: js.UndefOr[TestOrder] = js.undefined
}
object OrdersGetTestOrderTemplateResponse {
  
  inline def apply(): OrdersGetTestOrderTemplateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrdersGetTestOrderTemplateResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OrdersGetTestOrderTemplateResponse] (val x: Self) extends AnyVal {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setTemplate(value: TestOrder): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
  }
}
