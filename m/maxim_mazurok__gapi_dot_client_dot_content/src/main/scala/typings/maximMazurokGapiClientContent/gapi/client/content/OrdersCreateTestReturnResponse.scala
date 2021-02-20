package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrdersCreateTestReturnResponse extends StObject {
  
  /** Identifies what kind of resource this is. Value: the fixed string "content#ordersCreateTestReturnResponse". */
  var kind: js.UndefOr[String] = js.native
  
  /** The ID of the newly created test order return. */
  var returnId: js.UndefOr[String] = js.native
}
object OrdersCreateTestReturnResponse {
  
  @scala.inline
  def apply(): OrdersCreateTestReturnResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrdersCreateTestReturnResponse]
  }
  
  @scala.inline
  implicit class OrdersCreateTestReturnResponseMutableBuilder[Self <: OrdersCreateTestReturnResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setReturnId(value: String): Self = StObject.set(x, "returnId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnIdUndefined: Self = StObject.set(x, "returnId", js.undefined)
  }
}
