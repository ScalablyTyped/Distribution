package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign.KJUR.crypto.DSA
import typings.jsrsasign.jsrsasign.KJUR.crypto.ECDSA
import typings.jsrsasign.jsrsasign.RSAKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HexObj extends StObject {
  
  var hex: String
  
  var obj: RSAKey | DSA | ECDSA
}
object HexObj {
  
  inline def apply(hex: String, obj: RSAKey | DSA | ECDSA): HexObj = {
    val __obj = js.Dynamic.literal(hex = hex.asInstanceOf[js.Any], obj = obj.asInstanceOf[js.Any])
    __obj.asInstanceOf[HexObj]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HexObj] (val x: Self) extends AnyVal {
    
    inline def setHex(value: String): Self = StObject.set(x, "hex", value.asInstanceOf[js.Any])
    
    inline def setObj(value: RSAKey | DSA | ECDSA): Self = StObject.set(x, "obj", value.asInstanceOf[js.Any])
  }
}
