package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAccountCredentials extends StObject {
  
  /**
    * An OAuth access token.
    */
  var accessToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The amount of time, in seconds, after which the access token is no longer valid.
    */
  var expiresIn: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Indicates to Google how Google should use these OAuth tokens.
    */
  var purpose: js.UndefOr[String | Null] = js.undefined
}
object SchemaAccountCredentials {
  
  inline def apply(): SchemaAccountCredentials = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAccountCredentials]
  }
  
  extension [Self <: SchemaAccountCredentials](x: Self) {
    
    inline def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
    
    inline def setAccessTokenNull: Self = StObject.set(x, "accessToken", null)
    
    inline def setAccessTokenUndefined: Self = StObject.set(x, "accessToken", js.undefined)
    
    inline def setExpiresIn(value: String): Self = StObject.set(x, "expiresIn", value.asInstanceOf[js.Any])
    
    inline def setExpiresInNull: Self = StObject.set(x, "expiresIn", null)
    
    inline def setExpiresInUndefined: Self = StObject.set(x, "expiresIn", js.undefined)
    
    inline def setPurpose(value: String): Self = StObject.set(x, "purpose", value.asInstanceOf[js.Any])
    
    inline def setPurposeNull: Self = StObject.set(x, "purpose", null)
    
    inline def setPurposeUndefined: Self = StObject.set(x, "purpose", js.undefined)
  }
}
