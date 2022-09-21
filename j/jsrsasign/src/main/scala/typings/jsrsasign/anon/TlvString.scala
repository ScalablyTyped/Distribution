package typings.jsrsasign.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TlvString extends StObject {
  
  var tlv: String
}
object TlvString {
  
  inline def apply(tlv: String): TlvString = {
    val __obj = js.Dynamic.literal(tlv = tlv.asInstanceOf[js.Any])
    __obj.asInstanceOf[TlvString]
  }
  
  extension [Self <: TlvString](x: Self) {
    
    inline def setTlv(value: String): Self = StObject.set(x, "tlv", value.asInstanceOf[js.Any])
  }
}
