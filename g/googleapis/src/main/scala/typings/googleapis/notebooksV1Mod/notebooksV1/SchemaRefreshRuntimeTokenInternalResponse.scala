package typings.googleapis.notebooksV1Mod.notebooksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRefreshRuntimeTokenInternalResponse extends StObject {
  
  /**
    * The OAuth 2.0 access token.
    */
  var accessToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Token expiration time.
    */
  var expireTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaRefreshRuntimeTokenInternalResponse {
  
  inline def apply(): SchemaRefreshRuntimeTokenInternalResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRefreshRuntimeTokenInternalResponse]
  }
  
  extension [Self <: SchemaRefreshRuntimeTokenInternalResponse](x: Self) {
    
    inline def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
    
    inline def setAccessTokenNull: Self = StObject.set(x, "accessToken", null)
    
    inline def setAccessTokenUndefined: Self = StObject.set(x, "accessToken", js.undefined)
    
    inline def setExpireTime(value: String): Self = StObject.set(x, "expireTime", value.asInstanceOf[js.Any])
    
    inline def setExpireTimeNull: Self = StObject.set(x, "expireTime", null)
    
    inline def setExpireTimeUndefined: Self = StObject.set(x, "expireTime", js.undefined)
  }
}
