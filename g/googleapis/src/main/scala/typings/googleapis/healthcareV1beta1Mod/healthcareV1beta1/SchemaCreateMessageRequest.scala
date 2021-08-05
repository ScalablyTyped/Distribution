package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Creates a new message.
  */
trait SchemaCreateMessageRequest extends StObject {
  
  /**
    * HL7v2 message.
    */
  var message: js.UndefOr[SchemaMessage] = js.undefined
}
object SchemaCreateMessageRequest {
  
  inline def apply(): SchemaCreateMessageRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateMessageRequest]
  }
  
  extension [Self <: SchemaCreateMessageRequest](x: Self) {
    
    inline def setMessage(value: SchemaMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
