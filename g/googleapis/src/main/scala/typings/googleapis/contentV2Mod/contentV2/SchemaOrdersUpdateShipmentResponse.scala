package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOrdersUpdateShipmentResponse extends StObject {
  
  /**
    * The status of the execution.
    */
  var executionStatus: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#ordersUpdateShipmentResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
}
object SchemaOrdersUpdateShipmentResponse {
  
  inline def apply(): SchemaOrdersUpdateShipmentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrdersUpdateShipmentResponse]
  }
  
  extension [Self <: SchemaOrdersUpdateShipmentResponse](x: Self) {
    
    inline def setExecutionStatus(value: String): Self = StObject.set(x, "executionStatus", value.asInstanceOf[js.Any])
    
    inline def setExecutionStatusUndefined: Self = StObject.set(x, "executionStatus", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
