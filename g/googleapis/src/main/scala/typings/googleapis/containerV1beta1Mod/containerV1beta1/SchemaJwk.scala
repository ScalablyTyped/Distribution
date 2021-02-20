package typings.googleapis.containerV1beta1Mod.containerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Jwk is a JSON Web Key as specified in RFC 7517
  */
@js.native
trait SchemaJwk extends StObject {
  
  /**
    * NOLINT
    */
  var alg: js.UndefOr[String] = js.native
  
  /**
    * NOLINT
    */
  var crv: js.UndefOr[String] = js.native
  
  /**
    * NOLINT
    */
  var e: js.UndefOr[String] = js.native
  
  /**
    * NOLINT
    */
  var kid: js.UndefOr[String] = js.native
  
  /**
    * NOLINT
    */
  var kty: js.UndefOr[String] = js.native
  
  /**
    * Fields for RSA keys. NOLINT
    */
  var n: js.UndefOr[String] = js.native
  
  /**
    * NOLINT
    */
  var use: js.UndefOr[String] = js.native
  
  /**
    * Fields for ECDSA keys. NOLINT
    */
  var x: js.UndefOr[String] = js.native
  
  /**
    * NOLINT
    */
  var y: js.UndefOr[String] = js.native
}
object SchemaJwk {
  
  @scala.inline
  def apply(): SchemaJwk = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaJwk]
  }
  
  @scala.inline
  implicit class SchemaJwkMutableBuilder[Self <: SchemaJwk] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlg(value: String): Self = StObject.set(x, "alg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlgUndefined: Self = StObject.set(x, "alg", js.undefined)
    
    @scala.inline
    def setCrv(value: String): Self = StObject.set(x, "crv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrvUndefined: Self = StObject.set(x, "crv", js.undefined)
    
    @scala.inline
    def setE(value: String): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEUndefined: Self = StObject.set(x, "e", js.undefined)
    
    @scala.inline
    def setKid(value: String): Self = StObject.set(x, "kid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKidUndefined: Self = StObject.set(x, "kid", js.undefined)
    
    @scala.inline
    def setKty(value: String): Self = StObject.set(x, "kty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKtyUndefined: Self = StObject.set(x, "kty", js.undefined)
    
    @scala.inline
    def setN(value: String): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNUndefined: Self = StObject.set(x, "n", js.undefined)
    
    @scala.inline
    def setUse(value: String): Self = StObject.set(x, "use", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseUndefined: Self = StObject.set(x, "use", js.undefined)
    
    @scala.inline
    def setX(value: String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: String): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
