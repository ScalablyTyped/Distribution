package typings.googleapis.iamcredentialsV1Mod.iamcredentialsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGenerateIdTokenResponse extends StObject {
  
  /**
    * The OpenId Connect ID token.
    */
  var token: js.UndefOr[String] = js.undefined
}
object SchemaGenerateIdTokenResponse {
  
  @scala.inline
  def apply(): SchemaGenerateIdTokenResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGenerateIdTokenResponse]
  }
  
  @scala.inline
  implicit class SchemaGenerateIdTokenResponseMutableBuilder[Self <: SchemaGenerateIdTokenResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
  }
}
