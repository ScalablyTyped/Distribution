package typings.googleapis.iamV1Mod.iamV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The service account sign JWT response.
  */
trait SchemaSignJwtResponse extends StObject {
  
  /**
    * The id of the key used to sign the JWT.
    */
  var keyId: js.UndefOr[String] = js.undefined
  
  /**
    * The signed JWT.
    */
  var signedJwt: js.UndefOr[String] = js.undefined
}
object SchemaSignJwtResponse {
  
  @scala.inline
  def apply(): SchemaSignJwtResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSignJwtResponse]
  }
  
  @scala.inline
  implicit class SchemaSignJwtResponseMutableBuilder[Self <: SchemaSignJwtResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeyId(value: String): Self = StObject.set(x, "keyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyIdUndefined: Self = StObject.set(x, "keyId", js.undefined)
    
    @scala.inline
    def setSignedJwt(value: String): Self = StObject.set(x, "signedJwt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignedJwtUndefined: Self = StObject.set(x, "signedJwt", js.undefined)
  }
}
