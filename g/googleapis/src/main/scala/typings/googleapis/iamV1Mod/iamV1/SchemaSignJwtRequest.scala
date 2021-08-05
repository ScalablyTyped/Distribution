package typings.googleapis.iamV1Mod.iamV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The service account sign JWT request.
  */
trait SchemaSignJwtRequest extends StObject {
  
  /**
    * The JWT payload to sign, a JSON JWT Claim set.
    */
  var payload: js.UndefOr[String] = js.undefined
}
object SchemaSignJwtRequest {
  
  inline def apply(): SchemaSignJwtRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSignJwtRequest]
  }
  
  extension [Self <: SchemaSignJwtRequest](x: Self) {
    
    inline def setPayload(value: String): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
  }
}
