package typings.jsrsasign.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tlv extends StObject {
  
  var tlv: js.UndefOr[String] = js.undefined
}
object Tlv {
  
  inline def apply(): Tlv = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Tlv]
  }
  
  extension [Self <: Tlv](x: Self) {
    
    inline def setTlv(value: String): Self = StObject.set(x, "tlv", value.asInstanceOf[js.Any])
    
    inline def setTlvUndefined: Self = StObject.set(x, "tlv", js.undefined)
  }
}
