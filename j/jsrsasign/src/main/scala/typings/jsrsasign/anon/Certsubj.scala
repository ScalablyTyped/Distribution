package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign.KJUR.asn1.x509.GeneralNameParam
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Certsubj extends GeneralNameParam {
  
  var certsubj: String = js.native
}
object Certsubj {
  
  @scala.inline
  def apply(certsubj: String): Certsubj = {
    val __obj = js.Dynamic.literal(certsubj = certsubj.asInstanceOf[js.Any])
    __obj.asInstanceOf[Certsubj]
  }
  
  @scala.inline
  implicit class CertsubjMutableBuilder[Self <: Certsubj] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertsubj(value: String): Self = StObject.set(x, "certsubj", value.asInstanceOf[js.Any])
  }
}
