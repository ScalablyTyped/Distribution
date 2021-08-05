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
  
  inline def apply(): SchemaSignJwtResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSignJwtResponse]
  }
  
  extension [Self <: SchemaSignJwtResponse](x: Self) {
    
    inline def setKeyId(value: String): Self = StObject.set(x, "keyId", value.asInstanceOf[js.Any])
    
    inline def setKeyIdUndefined: Self = StObject.set(x, "keyId", js.undefined)
    
    inline def setSignedJwt(value: String): Self = StObject.set(x, "signedJwt", value.asInstanceOf[js.Any])
    
    inline def setSignedJwtUndefined: Self = StObject.set(x, "signedJwt", js.undefined)
  }
}
