package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign._ASN1HEXParseResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntHex
  extends StObject
     with _ASN1HEXParseResult {
  
  var int: Hex
}
object IntHex {
  
  inline def apply(int: Hex): IntHex = {
    val __obj = js.Dynamic.literal(int = int.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntHex]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IntHex] (val x: Self) extends AnyVal {
    
    inline def setInt(value: Hex): Self = StObject.set(x, "int", value.asInstanceOf[js.Any])
  }
}
