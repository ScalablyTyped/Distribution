package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign._ASN1HEXParseResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bitstr
  extends StObject
     with _ASN1HEXParseResult {
  
  var bitstr: Obj
}
object Bitstr {
  
  inline def apply(bitstr: Obj): Bitstr = {
    val __obj = js.Dynamic.literal(bitstr = bitstr.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bitstr]
  }
  
  extension [Self <: Bitstr](x: Self) {
    
    inline def setBitstr(value: Obj): Self = StObject.set(x, "bitstr", value.asInstanceOf[js.Any])
  }
}
