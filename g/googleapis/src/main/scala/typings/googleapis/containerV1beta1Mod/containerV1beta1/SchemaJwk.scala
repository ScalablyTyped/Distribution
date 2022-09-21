package typings.googleapis.containerV1beta1Mod.containerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaJwk extends StObject {
  
  /**
    * Algorithm.
    */
  var alg: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Used for ECDSA keys.
    */
  var crv: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Used for RSA keys.
    */
  var e: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Key ID.
    */
  var kid: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Key Type.
    */
  var kty: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Used for RSA keys.
    */
  var n: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Permitted uses for the public keys.
    */
  var use: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Used for ECDSA keys.
    */
  var x: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Used for ECDSA keys.
    */
  var y: js.UndefOr[String | Null] = js.undefined
}
object SchemaJwk {
  
  inline def apply(): SchemaJwk = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaJwk]
  }
  
  extension [Self <: SchemaJwk](x: Self) {
    
    inline def setAlg(value: String): Self = StObject.set(x, "alg", value.asInstanceOf[js.Any])
    
    inline def setAlgNull: Self = StObject.set(x, "alg", null)
    
    inline def setAlgUndefined: Self = StObject.set(x, "alg", js.undefined)
    
    inline def setCrv(value: String): Self = StObject.set(x, "crv", value.asInstanceOf[js.Any])
    
    inline def setCrvNull: Self = StObject.set(x, "crv", null)
    
    inline def setCrvUndefined: Self = StObject.set(x, "crv", js.undefined)
    
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
    
    inline def setX(value: String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXNull: Self = StObject.set(x, "x", null)
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: String): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYNull: Self = StObject.set(x, "y", null)
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
