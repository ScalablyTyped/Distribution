package typings.googleapis.firebaseappcheckV1betaMod.firebaseappcheckV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleFirebaseAppcheckV1betaPublicJwkSet extends StObject {
  
  /**
    * The set of public keys. See [section 5.1 of RFC 7517](https://tools.ietf.org/html/rfc7517#section-5).
    */
  var keys: js.UndefOr[js.Array[SchemaGoogleFirebaseAppcheckV1betaPublicJwk]] = js.undefined
}
object SchemaGoogleFirebaseAppcheckV1betaPublicJwkSet {
  
  inline def apply(): SchemaGoogleFirebaseAppcheckV1betaPublicJwkSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFirebaseAppcheckV1betaPublicJwkSet]
  }
  
  extension [Self <: SchemaGoogleFirebaseAppcheckV1betaPublicJwkSet](x: Self) {
    
    inline def setKeys(value: js.Array[SchemaGoogleFirebaseAppcheckV1betaPublicJwk]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    inline def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
    
    inline def setKeysVarargs(value: SchemaGoogleFirebaseAppcheckV1betaPublicJwk*): Self = StObject.set(x, "keys", js.Array(value*))
  }
}
