package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaOrdersGetByMerchantOrderIdResponse extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#ordersGetByMerchantOrderIdResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The requested order.
    */
  var order: js.UndefOr[SchemaOrder] = js.native
}
object SchemaOrdersGetByMerchantOrderIdResponse {
  
  @scala.inline
  def apply(): SchemaOrdersGetByMerchantOrderIdResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrdersGetByMerchantOrderIdResponse]
  }
  
  @scala.inline
  implicit class SchemaOrdersGetByMerchantOrderIdResponseMutableBuilder[Self <: SchemaOrdersGetByMerchantOrderIdResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setOrder(value: SchemaOrder): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
  }
}
