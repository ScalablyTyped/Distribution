package typings.googleapis.fcmV1Mod.fcmV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSendMessageRequest extends StObject {
  
  /**
    * Required. Message to send.
    */
  var message: js.UndefOr[SchemaMessage] = js.undefined
  
  /**
    * Flag for testing the request without actually delivering the message.
    */
  var validateOnly: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaSendMessageRequest {
  
  inline def apply(): SchemaSendMessageRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSendMessageRequest]
  }
  
  extension [Self <: SchemaSendMessageRequest](x: Self) {
    
    inline def setMessage(value: SchemaMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setValidateOnly(value: Boolean): Self = StObject.set(x, "validateOnly", value.asInstanceOf[js.Any])
    
    inline def setValidateOnlyNull: Self = StObject.set(x, "validateOnly", null)
    
    inline def setValidateOnlyUndefined: Self = StObject.set(x, "validateOnly", js.undefined)
  }
}
