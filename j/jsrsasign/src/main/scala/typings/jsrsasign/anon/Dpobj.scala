package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign.KJUR.asn1.ASN1Object
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dpobj extends StObject {
  
  var dpobj: ASN1Object
}
object Dpobj {
  
  @scala.inline
  def apply(dpobj: ASN1Object): Dpobj = {
    val __obj = js.Dynamic.literal(dpobj = dpobj.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dpobj]
  }
  
  @scala.inline
  implicit class DpobjMutableBuilder[Self <: Dpobj] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDpobj(value: ASN1Object): Self = StObject.set(x, "dpobj", value.asInstanceOf[js.Any])
  }
}
