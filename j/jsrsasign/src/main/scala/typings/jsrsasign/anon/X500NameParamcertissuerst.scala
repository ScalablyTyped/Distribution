package typings.jsrsasign.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined jsrsasign.jsrsasign.KJUR.asn1.x509.X500NameParam & {  certissuer :string | undefined,   certsubject :string | undefined} */
trait X500NameParamcertissuerst extends StObject {
  
  var C: String
  
  var CN: String
  
  var O: String
  
  var certissuer: js.UndefOr[String] = js.undefined
  
  var certsubject: js.UndefOr[String] = js.undefined
}
object X500NameParamcertissuerst {
  
  inline def apply(C: String, CN: String, O: String): X500NameParamcertissuerst = {
    val __obj = js.Dynamic.literal(C = C.asInstanceOf[js.Any], CN = CN.asInstanceOf[js.Any], O = O.asInstanceOf[js.Any])
    __obj.asInstanceOf[X500NameParamcertissuerst]
  }
  
  extension [Self <: X500NameParamcertissuerst](x: Self) {
    
    inline def setC(value: String): Self = StObject.set(x, "C", value.asInstanceOf[js.Any])
    
    inline def setCN(value: String): Self = StObject.set(x, "CN", value.asInstanceOf[js.Any])
    
    inline def setCertissuer(value: String): Self = StObject.set(x, "certissuer", value.asInstanceOf[js.Any])
    
    inline def setCertissuerUndefined: Self = StObject.set(x, "certissuer", js.undefined)
    
    inline def setCertsubject(value: String): Self = StObject.set(x, "certsubject", value.asInstanceOf[js.Any])
    
    inline def setCertsubjectUndefined: Self = StObject.set(x, "certsubject", js.undefined)
    
    inline def setO(value: String): Self = StObject.set(x, "O", value.asInstanceOf[js.Any])
  }
}
