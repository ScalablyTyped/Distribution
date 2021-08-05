package typings.googleapis.healthcareV1alphaMod.healthcareV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Ingests a message into the specified HL7v2 store.
  */
trait SchemaIngestMessageRequest extends StObject {
  
  /**
    * HL7v2 message to ingest.
    */
  var message: js.UndefOr[SchemaMessage] = js.undefined
}
object SchemaIngestMessageRequest {
  
  inline def apply(): SchemaIngestMessageRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIngestMessageRequest]
  }
  
  extension [Self <: SchemaIngestMessageRequest](x: Self) {
    
    inline def setMessage(value: SchemaMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
