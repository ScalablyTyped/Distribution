package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign.KJUR.asn1.ASN1Object
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Status extends StObject {
  
  var status: Failinfo
  
  var tst: ASN1Object
}
object Status {
  
  @scala.inline
  def apply(status: Failinfo, tst: ASN1Object): Status = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], tst = tst.asInstanceOf[js.Any])
    __obj.asInstanceOf[Status]
  }
  
  @scala.inline
  implicit class StatusMutableBuilder[Self <: Status] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: Failinfo): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTst(value: ASN1Object): Self = StObject.set(x, "tst", value.asInstanceOf[js.Any])
  }
}
