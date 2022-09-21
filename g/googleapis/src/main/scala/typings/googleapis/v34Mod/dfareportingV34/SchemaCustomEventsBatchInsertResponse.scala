package typings.googleapis.v34Mod.dfareportingV34

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCustomEventsBatchInsertResponse extends StObject {
  
  /**
    * Indicates that some or all custom events failed to insert.
    */
  var hasFailures: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "dfareporting#customEventsBatchInsertResponse".
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The insert status of each custom event. Statuses are returned in the same order that conversions are inserted.
    */
  var status: js.UndefOr[js.Array[SchemaCustomEventStatus]] = js.undefined
}
object SchemaCustomEventsBatchInsertResponse {
  
  inline def apply(): SchemaCustomEventsBatchInsertResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomEventsBatchInsertResponse]
  }
  
  extension [Self <: SchemaCustomEventsBatchInsertResponse](x: Self) {
    
    inline def setHasFailures(value: Boolean): Self = StObject.set(x, "hasFailures", value.asInstanceOf[js.Any])
    
    inline def setHasFailuresNull: Self = StObject.set(x, "hasFailures", null)
    
    inline def setHasFailuresUndefined: Self = StObject.set(x, "hasFailures", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setStatus(value: js.Array[SchemaCustomEventStatus]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setStatusVarargs(value: SchemaCustomEventStatus*): Self = StObject.set(x, "status", js.Array(value*))
  }
}
