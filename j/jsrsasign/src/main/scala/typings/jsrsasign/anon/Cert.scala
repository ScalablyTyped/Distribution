package typings.jsrsasign.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cert extends StObject {
  
  var cert: String
  
  var hasis: Boolean
}
object Cert {
  
  @scala.inline
  def apply(cert: String, hasis: Boolean): Cert = {
    val __obj = js.Dynamic.literal(cert = cert.asInstanceOf[js.Any], hasis = hasis.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cert]
  }
  
  @scala.inline
  implicit class CertMutableBuilder[Self <: Cert] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCert(value: String): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasis(value: Boolean): Self = StObject.set(x, "hasis", value.asInstanceOf[js.Any])
  }
}
