package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign._ASN1HEXParseResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BitstrBinString
  extends StObject
     with _ASN1HEXParseResult {
  
  var bitstr: BinString
}
object BitstrBinString {
  
  inline def apply(bitstr: BinString): BitstrBinString = {
    val __obj = js.Dynamic.literal(bitstr = bitstr.asInstanceOf[js.Any])
    __obj.asInstanceOf[BitstrBinString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BitstrBinString] (val x: Self) extends AnyVal {
    
    inline def setBitstr(value: BinString): Self = StObject.set(x, "bitstr", value.asInstanceOf[js.Any])
  }
}
