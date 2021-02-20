package typings.googleapis.iamV1Mod.iamV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The service account sign JWT request.
  */
@js.native
trait SchemaSignJwtRequest extends StObject {
  
  /**
    * The JWT payload to sign, a JSON JWT Claim set.
    */
  var payload: js.UndefOr[String] = js.native
}
object SchemaSignJwtRequest {
  
  @scala.inline
  def apply(): SchemaSignJwtRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSignJwtRequest]
  }
  
  @scala.inline
  implicit class SchemaSignJwtRequestMutableBuilder[Self <: SchemaSignJwtRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPayload(value: String): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
  }
}
