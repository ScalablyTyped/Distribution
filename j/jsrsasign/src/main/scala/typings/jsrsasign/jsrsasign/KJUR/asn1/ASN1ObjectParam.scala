package typings.jsrsasign.jsrsasign.KJUR.asn1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ASN1ObjectParam extends StObject {
  
  var obj: ASN1Object
}
object ASN1ObjectParam {
  
  inline def apply(obj: ASN1Object): ASN1ObjectParam = {
    val __obj = js.Dynamic.literal(obj = obj.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASN1ObjectParam]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASN1ObjectParam] (val x: Self) extends AnyVal {
    
    inline def setObj(value: ASN1Object): Self = StObject.set(x, "obj", value.asInstanceOf[js.Any])
  }
}
