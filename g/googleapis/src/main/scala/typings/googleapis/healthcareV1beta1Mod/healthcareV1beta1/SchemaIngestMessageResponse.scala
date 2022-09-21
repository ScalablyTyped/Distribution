package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaIngestMessageResponse extends StObject {
  
  /**
    * HL7v2 ACK message.
    */
  var hl7Ack: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Created message resource.
    */
  var message: js.UndefOr[SchemaMessage] = js.undefined
}
object SchemaIngestMessageResponse {
  
  inline def apply(): SchemaIngestMessageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIngestMessageResponse]
  }
  
  extension [Self <: SchemaIngestMessageResponse](x: Self) {
    
    inline def setHl7Ack(value: String): Self = StObject.set(x, "hl7Ack", value.asInstanceOf[js.Any])
    
    inline def setHl7AckNull: Self = StObject.set(x, "hl7Ack", null)
    
    inline def setHl7AckUndefined: Self = StObject.set(x, "hl7Ack", js.undefined)
    
    inline def setMessage(value: SchemaMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
