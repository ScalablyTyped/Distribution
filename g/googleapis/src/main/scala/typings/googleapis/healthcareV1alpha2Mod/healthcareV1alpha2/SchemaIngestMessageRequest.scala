package typings.googleapis.healthcareV1alpha2Mod.healthcareV1alpha2

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
  
  @scala.inline
  def apply(): SchemaIngestMessageRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIngestMessageRequest]
  }
  
  @scala.inline
  implicit class SchemaIngestMessageRequestMutableBuilder[Self <: SchemaIngestMessageRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: SchemaMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
