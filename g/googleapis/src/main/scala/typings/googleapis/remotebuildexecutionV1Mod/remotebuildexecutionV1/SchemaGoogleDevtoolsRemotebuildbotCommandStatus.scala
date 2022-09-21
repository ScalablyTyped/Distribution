package typings.googleapis.remotebuildexecutionV1Mod.remotebuildexecutionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleDevtoolsRemotebuildbotCommandStatus extends StObject {
  
  /**
    * The status code.
    */
  var code: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The error message.
    */
  var message: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleDevtoolsRemotebuildbotCommandStatus {
  
  inline def apply(): SchemaGoogleDevtoolsRemotebuildbotCommandStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemotebuildbotCommandStatus]
  }
  
  extension [Self <: SchemaGoogleDevtoolsRemotebuildbotCommandStatus](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeNull: Self = StObject.set(x, "code", null)
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageNull: Self = StObject.set(x, "message", null)
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
