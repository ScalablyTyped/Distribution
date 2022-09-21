package typings.googleapis.mybusinessverificationsV1Mod.mybusinessverificationsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGenerateVerificationTokenResponse extends StObject {
  
  /**
    * The generated token to verify the location.
    */
  var token: js.UndefOr[SchemaVerificationToken] = js.undefined
}
object SchemaGenerateVerificationTokenResponse {
  
  inline def apply(): SchemaGenerateVerificationTokenResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGenerateVerificationTokenResponse]
  }
  
  extension [Self <: SchemaGenerateVerificationTokenResponse](x: Self) {
    
    inline def setToken(value: SchemaVerificationToken): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
  }
}
