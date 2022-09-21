package typings.googleapis.mybusinessverificationsV1Mod.mybusinessverificationsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVerificationToken extends StObject {
  
  /**
    * The token string.
    */
  var tokenString: js.UndefOr[String | Null] = js.undefined
}
object SchemaVerificationToken {
  
  inline def apply(): SchemaVerificationToken = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVerificationToken]
  }
  
  extension [Self <: SchemaVerificationToken](x: Self) {
    
    inline def setTokenString(value: String): Self = StObject.set(x, "tokenString", value.asInstanceOf[js.Any])
    
    inline def setTokenStringNull: Self = StObject.set(x, "tokenString", null)
    
    inline def setTokenStringUndefined: Self = StObject.set(x, "tokenString", js.undefined)
  }
}
