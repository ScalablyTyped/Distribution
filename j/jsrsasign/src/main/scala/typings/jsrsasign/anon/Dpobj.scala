package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign.KJUR.asn1.ASN1Object
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dpobj extends StObject {
  
  var dpobj: ASN1Object
}
object Dpobj {
  
  inline def apply(dpobj: ASN1Object): Dpobj = {
    val __obj = js.Dynamic.literal(dpobj = dpobj.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dpobj]
  }
  
  extension [Self <: Dpobj](x: Self) {
    
    inline def setDpobj(value: ASN1Object): Self = StObject.set(x, "dpobj", value.asInstanceOf[js.Any])
  }
}
