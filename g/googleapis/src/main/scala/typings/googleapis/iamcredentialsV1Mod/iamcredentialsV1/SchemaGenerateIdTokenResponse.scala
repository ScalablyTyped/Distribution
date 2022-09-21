package typings.googleapis.iamcredentialsV1Mod.iamcredentialsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGenerateIdTokenResponse extends StObject {
  
  /**
    * The OpenId Connect ID token.
    */
  var token: js.UndefOr[String | Null] = js.undefined
}
object SchemaGenerateIdTokenResponse {
  
  inline def apply(): SchemaGenerateIdTokenResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGenerateIdTokenResponse]
  }
  
  extension [Self <: SchemaGenerateIdTokenResponse](x: Self) {
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setTokenNull: Self = StObject.set(x, "token", null)
    
    inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
  }
}
