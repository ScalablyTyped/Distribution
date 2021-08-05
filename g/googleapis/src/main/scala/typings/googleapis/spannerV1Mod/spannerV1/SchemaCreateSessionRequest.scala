package typings.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The request for CreateSession.
  */
trait SchemaCreateSessionRequest extends StObject {
  
  /**
    * The session to create.
    */
  var session: js.UndefOr[SchemaSession] = js.undefined
}
object SchemaCreateSessionRequest {
  
  inline def apply(): SchemaCreateSessionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateSessionRequest]
  }
  
  extension [Self <: SchemaCreateSessionRequest](x: Self) {
    
    inline def setSession(value: SchemaSession): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    inline def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
  }
}
