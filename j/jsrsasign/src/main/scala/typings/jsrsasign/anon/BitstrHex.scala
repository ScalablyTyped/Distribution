package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign._ASN1HEXParseResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BitstrHex
  extends StObject
     with _ASN1HEXParseResult {
  
  var bitstr: Hex
}
object BitstrHex {
  
  inline def apply(bitstr: Hex): BitstrHex = {
    val __obj = js.Dynamic.literal(bitstr = bitstr.asInstanceOf[js.Any])
    __obj.asInstanceOf[BitstrHex]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BitstrHex] (val x: Self) extends AnyVal {
    
    inline def setBitstr(value: Hex): Self = StObject.set(x, "bitstr", value.asInstanceOf[js.Any])
  }
}
