package typings.jsrsasign.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlgCert extends StObject {
  
  var alg: String
  
  var cert: String
}
object AlgCert {
  
  inline def apply(alg: String, cert: String): AlgCert = {
    val __obj = js.Dynamic.literal(alg = alg.asInstanceOf[js.Any], cert = cert.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlgCert]
  }
  
  extension [Self <: AlgCert](x: Self) {
    
    inline def setAlg(value: String): Self = StObject.set(x, "alg", value.asInstanceOf[js.Any])
    
    inline def setCert(value: String): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
  }
}
