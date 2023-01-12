package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign._ASN1HEXParseResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Asn1
  extends StObject
     with _ASN1HEXParseResult {
  
  var asn1: TlvString
}
object Asn1 {
  
  inline def apply(asn1: TlvString): Asn1 = {
    val __obj = js.Dynamic.literal(asn1 = asn1.asInstanceOf[js.Any])
    __obj.asInstanceOf[Asn1]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Asn1] (val x: Self) extends AnyVal {
    
    inline def setAsn1(value: TlvString): Self = StObject.set(x, "asn1", value.asInstanceOf[js.Any])
  }
}
