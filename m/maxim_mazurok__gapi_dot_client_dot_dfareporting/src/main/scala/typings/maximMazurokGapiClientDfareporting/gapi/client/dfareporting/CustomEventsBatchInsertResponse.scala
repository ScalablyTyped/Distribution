package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomEventsBatchInsertResponse extends StObject {
  
  /** Indicates that some or all custom events failed to insert. */
  var hasFailures: js.UndefOr[Boolean] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#customEventsBatchInsertResponse". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** The insert status of each custom event. Statuses are returned in the same order that conversions are inserted. */
  var status: js.UndefOr[js.Array[CustomEventStatus]] = js.undefined
}
object CustomEventsBatchInsertResponse {
  
  inline def apply(): CustomEventsBatchInsertResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomEventsBatchInsertResponse]
  }
  
  extension [Self <: CustomEventsBatchInsertResponse](x: Self) {
    
    inline def setHasFailures(value: Boolean): Self = StObject.set(x, "hasFailures", value.asInstanceOf[js.Any])
    
    inline def setHasFailuresUndefined: Self = StObject.set(x, "hasFailures", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setStatus(value: js.Array[CustomEventStatus]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setStatusVarargs(value: CustomEventStatus*): Self = StObject.set(x, "status", js.Array(value :_*))
  }
}
