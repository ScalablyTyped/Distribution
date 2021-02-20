package typings.googleapis.iamcredentialsV1Mod.iamcredentialsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaSignJwtResponse extends StObject {
  
  /**
    * The ID of the key used to sign the JWT.
    */
  var keyId: js.UndefOr[String] = js.native
  
  /**
    * The signed JWT.
    */
  var signedJwt: js.UndefOr[String] = js.native
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
