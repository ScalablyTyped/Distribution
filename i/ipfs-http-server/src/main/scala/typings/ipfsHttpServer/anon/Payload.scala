package typings.ipfsHttpServer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Payload extends StObject {
  
  var payload: MaxBytes
  
  var validate: Options
}
object Payload {
  
  inline def apply(payload: MaxBytes, validate: Options): Payload = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], validate = validate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Payload]
  }
  
  extension [Self <: Payload](x: Self) {
    
    inline def setPayload(value: MaxBytes): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setValidate(value: Options): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
  }
}
