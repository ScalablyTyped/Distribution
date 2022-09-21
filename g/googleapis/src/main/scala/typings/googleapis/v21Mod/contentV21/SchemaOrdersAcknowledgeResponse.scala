package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOrdersAcknowledgeResponse extends StObject {
  
  /**
    * The status of the execution. Acceptable values are: - "`duplicate`" - "`executed`"
    */
  var executionStatus: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "`content#ordersAcknowledgeResponse`".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
}
object SchemaOrdersAcknowledgeResponse {
  
  inline def apply(): SchemaOrdersAcknowledgeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrdersAcknowledgeResponse]
  }
  
  extension [Self <: SchemaOrdersAcknowledgeResponse](x: Self) {
    
    inline def setExecutionStatus(value: String): Self = StObject.set(x, "executionStatus", value.asInstanceOf[js.Any])
    
    inline def setExecutionStatusNull: Self = StObject.set(x, "executionStatus", null)
    
    inline def setExecutionStatusUndefined: Self = StObject.set(x, "executionStatus", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
