package typings.jsrsasign.jsrsasign

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthorityKeyIdentifierResult extends StObject {
  
  var critical: js.UndefOr[Boolean] = js.undefined
  
  var issuer: js.UndefOr[Hex] = js.undefined
  
  var kid: Hex
  
  var sn: js.UndefOr[Hex] = js.undefined
}
object AuthorityKeyIdentifierResult {
  
  inline def apply(kid: Hex): AuthorityKeyIdentifierResult = {
    val __obj = js.Dynamic.literal(kid = kid.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorityKeyIdentifierResult]
  }
  
  extension [Self <: AuthorityKeyIdentifierResult](x: Self) {
    
    inline def setCritical(value: Boolean): Self = StObject.set(x, "critical", value.asInstanceOf[js.Any])
    
    inline def setCriticalUndefined: Self = StObject.set(x, "critical", js.undefined)
    
    inline def setIssuer(value: Hex): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
    
    inline def setIssuerUndefined: Self = StObject.set(x, "issuer", js.undefined)
    
    inline def setKid(value: Hex): Self = StObject.set(x, "kid", value.asInstanceOf[js.Any])
    
    inline def setSn(value: Hex): Self = StObject.set(x, "sn", value.asInstanceOf[js.Any])
    
    inline def setSnUndefined: Self = StObject.set(x, "sn", js.undefined)
  }
}
