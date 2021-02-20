package typings.ipfsHttpServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Payload extends StObject {
  
  var payload: MaxBytes = js.native
  
  var validate: Options = js.native
}
object Payload {
  
  @scala.inline
  def apply(payload: MaxBytes, validate: Options): Payload = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], validate = validate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Payload]
  }
  
  @scala.inline
  implicit class PayloadMutableBuilder[Self <: Payload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPayload(value: MaxBytes): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidate(value: Options): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
  }
}
