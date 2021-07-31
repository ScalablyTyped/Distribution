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
  
  @scala.inline
  def apply(): SchemaCreateMessageRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateMessageRequest]
  }
  
  @scala.inline
  implicit class SchemaCreateMessageRequestMutableBuilder[Self <: SchemaCreateMessageRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: SchemaMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
