package typings.googleapis.firebaseappcheckV1Mod.firebaseappcheckV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleFirebaseAppcheckV1PublicJwk extends StObject {
  
  /**
    * See [section 4.4 of RFC 7517](https://tools.ietf.org/html/rfc7517#section-4.4).
    */
  var alg: js.UndefOr[String | Null] = js.undefined
  
  /**
    * See [section 6.3.1.2 of RFC 7518](https://tools.ietf.org/html/rfc7518#section-6.3.1.2).
    */
  var e: js.UndefOr[String | Null] = js.undefined
  
  /**
    * See [section 4.5 of RFC 7517](https://tools.ietf.org/html/rfc7517#section-4.5).
    */
  var kid: js.UndefOr[String | Null] = js.undefined
  
  /**
    * See [section 4.1 of RFC 7517](https://tools.ietf.org/html/rfc7517#section-4.1).
    */
  var kty: js.UndefOr[String | Null] = js.undefined
  
  /**
    * See [section 6.3.1.1 of RFC 7518](https://tools.ietf.org/html/rfc7518#section-6.3.1.1).
    */
  var n: js.UndefOr[String | Null] = js.undefined
  
  /**
    * See [section 4.2 of RFC 7517](https://tools.ietf.org/html/rfc7517#section-4.2).
    */
  var use: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleFirebaseAppcheckV1PublicJwk {
  
  inline def apply(): SchemaGoogleFirebaseAppcheckV1PublicJwk = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFirebaseAppcheckV1PublicJwk]
  }
  
  extension [Self <: SchemaGoogleFirebaseAppcheckV1PublicJwk](x: Self) {
    
    inline def setAlg(value: String): Self = StObject.set(x, "alg", value.asInstanceOf[js.Any])
    
    inline def setAlgNull: Self = StObject.set(x, "alg", null)
    
    inline def setAlgUndefined: Self = StObject.set(x, "alg", js.undefined)
    
    inline def setE(value: String): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
    
    inline def setENull: Self = StObject.set(x, "e", null)
    
    inline def setEUndefined: Self = StObject.set(x, "e", js.undefined)
    
    inline def setKid(value: String): Self = StObject.set(x, "kid", value.asInstanceOf[js.Any])
    
    inline def setKidNull: Self = StObject.set(x, "kid", null)
    
    inline def setKidUndefined: Self = StObject.set(x, "kid", js.undefined)
    
    inline def setKty(value: String): Self = StObject.set(x, "kty", value.asInstanceOf[js.Any])
    
    inline def setKtyNull: Self = StObject.set(x, "kty", null)
    
    inline def setKtyUndefined: Self = StObject.set(x, "kty", js.undefined)
    
    inline def setN(value: String): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
    
    inline def setNNull: Self = StObject.set(x, "n", null)
    
    inline def setNUndefined: Self = StObject.set(x, "n", js.undefined)
    
    inline def setUse(value: String): Self = StObject.set(x, "use", value.asInstanceOf[js.Any])
    
    inline def setUseNull: Self = StObject.set(x, "use", null)
    
    inline def setUseUndefined: Self = StObject.set(x, "use", js.undefined)
  }
}
