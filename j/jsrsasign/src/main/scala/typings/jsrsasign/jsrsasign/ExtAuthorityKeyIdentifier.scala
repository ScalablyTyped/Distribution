package typings.jsrsasign.jsrsasign

import typings.jsrsasign.jsrsasignStrings.authorityKeyIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtAuthorityKeyIdentifier
  extends StObject
     with ExtParam {
  
  var critical: js.UndefOr[Boolean] = js.undefined
  
  var extname: authorityKeyIdentifier
  
  var issuer: js.UndefOr[Hex] = js.undefined
  
  var kid: Hex
  
  var sn: js.UndefOr[Hex] = js.undefined
}
object ExtAuthorityKeyIdentifier {
  
  inline def apply(kid: Hex): ExtAuthorityKeyIdentifier = {
    val __obj = js.Dynamic.literal(extname = "authorityKeyIdentifier", kid = kid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtAuthorityKeyIdentifier]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExtAuthorityKeyIdentifier] (val x: Self) extends AnyVal {
    
    inline def setCritical(value: Boolean): Self = StObject.set(x, "critical", value.asInstanceOf[js.Any])
    
    inline def setCriticalUndefined: Self = StObject.set(x, "critical", js.undefined)
    
    inline def setExtname(value: authorityKeyIdentifier): Self = StObject.set(x, "extname", value.asInstanceOf[js.Any])
    
    inline def setIssuer(value: Hex): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
    
    inline def setIssuerUndefined: Self = StObject.set(x, "issuer", js.undefined)
    
    inline def setKid(value: Hex): Self = StObject.set(x, "kid", value.asInstanceOf[js.Any])
    
    inline def setSn(value: Hex): Self = StObject.set(x, "sn", value.asInstanceOf[js.Any])
    
    inline def setSnUndefined: Self = StObject.set(x, "sn", js.undefined)
  }
}
