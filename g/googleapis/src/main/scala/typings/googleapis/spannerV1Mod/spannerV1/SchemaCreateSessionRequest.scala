package typings.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The request for CreateSession.
  */
@js.native
trait SchemaCreateSessionRequest extends StObject {
  
  /**
    * The session to create.
    */
  var session: js.UndefOr[SchemaSession] = js.native
}
object SchemaCreateSessionRequest {
  
  @scala.inline
  def apply(): SchemaCreateSessionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateSessionRequest]
  }
  
  @scala.inline
  implicit class SchemaCreateSessionRequestMutableBuilder[Self <: SchemaCreateSessionRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSession(value: SchemaSession): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
  }
}
