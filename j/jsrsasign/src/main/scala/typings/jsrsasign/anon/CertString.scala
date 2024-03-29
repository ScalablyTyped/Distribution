package typings.jsrsasign.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CertString extends StObject {
  
  var cert: String
}
object CertString {
  
  inline def apply(cert: String): CertString = {
    val __obj = js.Dynamic.literal(cert = cert.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CertString] (val x: Self) extends AnyVal {
    
    inline def setCert(value: String): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
  }
}
