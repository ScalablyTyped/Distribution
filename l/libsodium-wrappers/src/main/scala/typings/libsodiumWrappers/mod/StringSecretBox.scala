package typings.libsodiumWrappers.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StringSecretBox extends StObject {
  
  var cipher: String = js.native
  
  var mac: String = js.native
}
object StringSecretBox {
  
  @scala.inline
  def apply(cipher: String, mac: String): StringSecretBox = {
    val __obj = js.Dynamic.literal(cipher = cipher.asInstanceOf[js.Any], mac = mac.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringSecretBox]
  }
  
  @scala.inline
  implicit class StringSecretBoxMutableBuilder[Self <: StringSecretBox] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCipher(value: String): Self = StObject.set(x, "cipher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMac(value: String): Self = StObject.set(x, "mac", value.asInstanceOf[js.Any])
  }
}
