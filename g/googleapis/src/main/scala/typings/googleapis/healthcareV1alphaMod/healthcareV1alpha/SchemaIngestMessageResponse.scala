package typings.googleapis.healthcareV1alphaMod.healthcareV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Acknowledges that a message has been ingested into the specified HL7v2
  * store.
  */
trait SchemaIngestMessageResponse extends StObject {
  
  /**
    * HL7v2 ACK message.
    */
  var hl7Ack: js.UndefOr[String] = js.undefined
  
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
    
    inline def setHl7AckUndefined: Self = StObject.set(x, "hl7Ack", js.undefined)
    
    inline def setMessage(value: SchemaMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
