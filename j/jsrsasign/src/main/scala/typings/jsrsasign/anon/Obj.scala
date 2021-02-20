package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign.KJUR.crypto.DSA
import typings.jsrsasign.jsrsasign.KJUR.crypto.ECDSA
import typings.jsrsasign.jsrsasign.RSAKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Obj extends StObject {
  
  var hex: String = js.native
  
  var obj: RSAKey | DSA | ECDSA = js.native
}
object Obj {
  
  @scala.inline
  def apply(hex: String, obj: RSAKey | DSA | ECDSA): Obj = {
    val __obj = js.Dynamic.literal(hex = hex.asInstanceOf[js.Any], obj = obj.asInstanceOf[js.Any])
    __obj.asInstanceOf[Obj]
  }
  
  @scala.inline
  implicit class ObjMutableBuilder[Self <: Obj] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHex(value: String): Self = StObject.set(x, "hex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObj(value: RSAKey | DSA | ECDSA): Self = StObject.set(x, "obj", value.asInstanceOf[js.Any])
  }
}
