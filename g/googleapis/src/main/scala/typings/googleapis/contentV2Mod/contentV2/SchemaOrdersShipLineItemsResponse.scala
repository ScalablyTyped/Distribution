package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOrdersShipLineItemsResponse extends StObject {
  
  /**
    * The status of the execution. Acceptable values are: - "`duplicate`" - "`executed`"
    */
  var executionStatus: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "content#ordersShipLineItemsResponse".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
}
object SchemaOrdersShipLineItemsResponse {
  
  inline def apply(): SchemaOrdersShipLineItemsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrdersShipLineItemsResponse]
  }
  
  extension [Self <: SchemaOrdersShipLineItemsResponse](x: Self) {
    
    inline def setExecutionStatus(value: String): Self = StObject.set(x, "executionStatus", value.asInstanceOf[js.Any])
    
    inline def setExecutionStatusNull: Self = StObject.set(x, "executionStatus", null)
    
    inline def setExecutionStatusUndefined: Self = StObject.set(x, "executionStatus", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
