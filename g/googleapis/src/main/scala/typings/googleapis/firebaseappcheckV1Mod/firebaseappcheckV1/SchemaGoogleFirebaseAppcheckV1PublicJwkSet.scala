package typings.googleapis.firebaseappcheckV1Mod.firebaseappcheckV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleFirebaseAppcheckV1PublicJwkSet extends StObject {
  
  /**
    * The set of public keys. See [section 5.1 of RFC 7517](https://tools.ietf.org/html/rfc7517#section-5).
    */
  var keys: js.UndefOr[js.Array[SchemaGoogleFirebaseAppcheckV1PublicJwk]] = js.undefined
}
object SchemaGoogleFirebaseAppcheckV1PublicJwkSet {
  
  inline def apply(): SchemaGoogleFirebaseAppcheckV1PublicJwkSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFirebaseAppcheckV1PublicJwkSet]
  }
  
  extension [Self <: SchemaGoogleFirebaseAppcheckV1PublicJwkSet](x: Self) {
    
    inline def setKeys(value: js.Array[SchemaGoogleFirebaseAppcheckV1PublicJwk]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    inline def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
    
    inline def setKeysVarargs(value: SchemaGoogleFirebaseAppcheckV1PublicJwk*): Self = StObject.set(x, "keys", js.Array(value*))
  }
}
