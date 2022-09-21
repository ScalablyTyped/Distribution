package typings.jsrsasign.jsrsasign

import typings.jsrsasign.jsrsasignStrings.ocspNonce
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtOcspNonce
  extends StObject
     with ExtParam {
  
  var critical: js.UndefOr[Boolean] = js.undefined
  
  var extname: ocspNonce
  
  var hex: String
}
object ExtOcspNonce {
  
  inline def apply(hex: String): ExtOcspNonce = {
    val __obj = js.Dynamic.literal(extname = "ocspNonce", hex = hex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtOcspNonce]
  }
  
  extension [Self <: ExtOcspNonce](x: Self) {
    
    inline def setCritical(value: Boolean): Self = StObject.set(x, "critical", value.asInstanceOf[js.Any])
    
    inline def setCriticalUndefined: Self = StObject.set(x, "critical", js.undefined)
    
    inline def setExtname(value: ocspNonce): Self = StObject.set(x, "extname", value.asInstanceOf[js.Any])
    
    inline def setHex(value: String): Self = StObject.set(x, "hex", value.asInstanceOf[js.Any])
  }
}
