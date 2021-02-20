package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrdersGetTestOrderTemplateResponse extends StObject {
  
  /** Identifies what kind of resource this is. Value: the fixed string "content#ordersGetTestOrderTemplateResponse". */
  var kind: js.UndefOr[String] = js.native
  
  /** The requested test order template. */
  var template: js.UndefOr[TestOrder] = js.native
}
object OrdersGetTestOrderTemplateResponse {
  
  @scala.inline
  def apply(): OrdersGetTestOrderTemplateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrdersGetTestOrderTemplateResponse]
  }
  
  @scala.inline
  implicit class OrdersGetTestOrderTemplateResponseMutableBuilder[Self <: OrdersGetTestOrderTemplateResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setTemplate(value: TestOrder): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
  }
}
