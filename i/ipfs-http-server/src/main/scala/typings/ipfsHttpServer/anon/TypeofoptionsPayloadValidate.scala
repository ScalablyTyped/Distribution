package typings.ipfsHttpServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofoptionsPayloadValidate extends StObject {
  
  val payload: Typeofpayload
  
  val validate: Typeofvalidate
}
object TypeofoptionsPayloadValidate {
  
  @scala.inline
  def apply(payload: Typeofpayload, validate: Typeofvalidate): TypeofoptionsPayloadValidate = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], validate = validate.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofoptionsPayloadValidate]
  }
  
  @scala.inline
  implicit class TypeofoptionsPayloadValidateMutableBuilder[Self <: TypeofoptionsPayloadValidate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPayload(value: Typeofpayload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidate(value: Typeofvalidate): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
  }
}
