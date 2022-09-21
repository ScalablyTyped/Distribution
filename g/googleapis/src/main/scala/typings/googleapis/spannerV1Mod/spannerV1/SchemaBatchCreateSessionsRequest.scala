package typings.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBatchCreateSessionsRequest extends StObject {
  
  /**
    * Required. The number of sessions to be created in this batch call. The API may return fewer than the requested number of sessions. If a specific number of sessions are desired, the client can make additional calls to BatchCreateSessions (adjusting session_count as necessary).
    */
  var sessionCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Parameters to be applied to each created session.
    */
  var sessionTemplate: js.UndefOr[SchemaSession] = js.undefined
}
object SchemaBatchCreateSessionsRequest {
  
  inline def apply(): SchemaBatchCreateSessionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchCreateSessionsRequest]
  }
  
  extension [Self <: SchemaBatchCreateSessionsRequest](x: Self) {
    
    inline def setSessionCount(value: Double): Self = StObject.set(x, "sessionCount", value.asInstanceOf[js.Any])
    
    inline def setSessionCountNull: Self = StObject.set(x, "sessionCount", null)
    
    inline def setSessionCountUndefined: Self = StObject.set(x, "sessionCount", js.undefined)
    
    inline def setSessionTemplate(value: SchemaSession): Self = StObject.set(x, "sessionTemplate", value.asInstanceOf[js.Any])
    
    inline def setSessionTemplateUndefined: Self = StObject.set(x, "sessionTemplate", js.undefined)
  }
}
