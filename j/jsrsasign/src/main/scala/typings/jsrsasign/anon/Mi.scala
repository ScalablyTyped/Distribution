package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign.KJUR.asn1.tsp.MessageImprint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mi extends StObject {
  
  var certreq: js.UndefOr[Boolean] = js.undefined
  
  var mi: MessageImprint
  
  var nonce: js.UndefOr[String] = js.undefined
  
  var policy: js.UndefOr[String] = js.undefined
}
object Mi {
  
  inline def apply(mi: MessageImprint): Mi = {
    val __obj = js.Dynamic.literal(mi = mi.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mi]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Mi] (val x: Self) extends AnyVal {
    
    inline def setCertreq(value: Boolean): Self = StObject.set(x, "certreq", value.asInstanceOf[js.Any])
    
    inline def setCertreqUndefined: Self = StObject.set(x, "certreq", js.undefined)
    
    inline def setMi(value: MessageImprint): Self = StObject.set(x, "mi", value.asInstanceOf[js.Any])
    
    inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    
    inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
    
    inline def setPolicy(value: String): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
  }
}
