package typings.googleapis.containerV1beta1Mod.containerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Jwk is a JSON Web Key as specified in RFC 7517
  */
trait SchemaJwk extends StObject {
  
  /**
    * NOLINT
    */
  var alg: js.UndefOr[String] = js.undefined
  
  /**
    * NOLINT
    */
  var crv: js.UndefOr[String] = js.undefined
  
  /**
    * NOLINT
    */
  var e: js.UndefOr[String] = js.undefined
  
  /**
    * NOLINT
    */
  var kid: js.UndefOr[String] = js.undefined
  
  /**
    * NOLINT
    */
  var kty: js.UndefOr[String] = js.undefined
  
  /**
    * Fields for RSA keys. NOLINT
    */
  var n: js.UndefOr[String] = js.undefined
  
  /**
    * NOLINT
    */
  var use: js.UndefOr[String] = js.undefined
  
  /**
    * Fields for ECDSA keys. NOLINT
    */
  var x: js.UndefOr[String] = js.undefined
  
  /**
    * NOLINT
    */
  var y: js.UndefOr[String] = js.undefined
}
object SchemaJwk {
  
  inline def apply(): SchemaJwk = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaJwk]
  }
  
  extension [Self <: SchemaJwk](x: Self) {
    
    inline def setAlg(value: String): Self = StObject.set(x, "alg", value.asInstanceOf[js.Any])
    
    inline def setAlgUndefined: Self = StObject.set(x, "alg", js.undefined)
    
    inline def setCrv(value: String): Self = StObject.set(x, "crv", value.asInstanceOf[js.Any])
    
    inline def setCrvUndefined: Self = StObject.set(x, "crv", js.undefined)
    
    inline def setE(value: String): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
    
    inline def setEUndefined: Self = StObject.set(x, "e", js.undefined)
    
    inline def setKid(value: String): Self = StObject.set(x, "kid", value.asInstanceOf[js.Any])
    
    inline def setKidUndefined: Self = StObject.set(x, "kid", js.undefined)
    
    inline def setKty(value: String): Self = StObject.set(x, "kty", value.asInstanceOf[js.Any])
    
    inline def setKtyUndefined: Self = StObject.set(x, "kty", js.undefined)
    
    inline def setN(value: String): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
    
    inline def setNUndefined: Self = StObject.set(x, "n", js.undefined)
    
    inline def setUse(value: String): Self = StObject.set(x, "use", value.asInstanceOf[js.Any])
    
    inline def setUseUndefined: Self = StObject.set(x, "use", js.undefined)
    
    inline def setX(value: String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: String): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
