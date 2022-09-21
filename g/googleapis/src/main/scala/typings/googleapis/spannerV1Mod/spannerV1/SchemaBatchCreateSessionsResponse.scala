package typings.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBatchCreateSessionsResponse extends StObject {
  
  /**
    * The freshly created sessions.
    */
  var session: js.UndefOr[js.Array[SchemaSession]] = js.undefined
}
object SchemaBatchCreateSessionsResponse {
  
  inline def apply(): SchemaBatchCreateSessionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBatchCreateSessionsResponse]
  }
  
  extension [Self <: SchemaBatchCreateSessionsResponse](x: Self) {
    
    inline def setSession(value: js.Array[SchemaSession]): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    inline def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
    
    inline def setSessionVarargs(value: SchemaSession*): Self = StObject.set(x, "session", js.Array(value*))
  }
}
