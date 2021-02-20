package typings.libsodiumWrappers.mod

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CryptoBox extends StObject {
  
  var ciphertext: Uint8Array = js.native
  
  var mac: Uint8Array = js.native
}
object CryptoBox {
  
  @scala.inline
  def apply(ciphertext: Uint8Array, mac: Uint8Array): CryptoBox = {
    val __obj = js.Dynamic.literal(ciphertext = ciphertext.asInstanceOf[js.Any], mac = mac.asInstanceOf[js.Any])
    __obj.asInstanceOf[CryptoBox]
  }
  
  @scala.inline
  implicit class CryptoBoxMutableBuilder[Self <: CryptoBox] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCiphertext(value: Uint8Array): Self = StObject.set(x, "ciphertext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMac(value: Uint8Array): Self = StObject.set(x, "mac", value.asInstanceOf[js.Any])
  }
}
