package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign.KJUR.asn1.ASN1Object
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Asn1params extends StObject {
  
  var asn1params: js.UndefOr[ASN1Object] = js.undefined
  
  var name: String
  
  var paramempty: js.UndefOr[Boolean] = js.undefined
}
object Asn1params {
  
  inline def apply(name: String): Asn1params = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Asn1params]
  }
  
  extension [Self <: Asn1params](x: Self) {
    
    inline def setAsn1params(value: ASN1Object): Self = StObject.set(x, "asn1params", value.asInstanceOf[js.Any])
    
    inline def setAsn1paramsUndefined: Self = StObject.set(x, "asn1params", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setParamempty(value: Boolean): Self = StObject.set(x, "paramempty", value.asInstanceOf[js.Any])
    
    inline def setParamemptyUndefined: Self = StObject.set(x, "paramempty", js.undefined)
  }
}
