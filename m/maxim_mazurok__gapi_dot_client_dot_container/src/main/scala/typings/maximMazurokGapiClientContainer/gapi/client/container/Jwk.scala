package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Jwk extends StObject {
  
  /** Algorithm. */
  var alg: js.UndefOr[String] = js.undefined
  
  /** Used for ECDSA keys. */
  var crv: js.UndefOr[String] = js.undefined
  
  /** Used for RSA keys. */
  var e: js.UndefOr[String] = js.undefined
  
  /** Key ID. */
  var kid: js.UndefOr[String] = js.undefined
  
  /** Key Type. */
  var kty: js.UndefOr[String] = js.undefined
  
  /** Used for RSA keys. */
  var n: js.UndefOr[String] = js.undefined
  
  /** Permitted uses for the public keys. */
  var use: js.UndefOr[String] = js.undefined
  
  /** Used for ECDSA keys. */
  var x: js.UndefOr[String] = js.undefined
  
  /** Used for ECDSA keys. */
  var y: js.UndefOr[String] = js.undefined
}
object Jwk {
  
  @scala.inline
  def apply(): Jwk = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Jwk]
  }
  
  @scala.inline
  implicit class JwkMutableBuilder[Self <: Jwk] (val x: Self) extends AnyVal {
    
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
