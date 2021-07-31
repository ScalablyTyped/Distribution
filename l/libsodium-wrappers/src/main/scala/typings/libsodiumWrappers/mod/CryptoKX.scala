package typings.libsodiumWrappers.mod

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CryptoKX extends StObject {
  
  var sharedRx: Uint8Array
  
  var sharedTx: Uint8Array
}
object CryptoKX {
  
  @scala.inline
  def apply(sharedRx: Uint8Array, sharedTx: Uint8Array): CryptoKX = {
    val __obj = js.Dynamic.literal(sharedRx = sharedRx.asInstanceOf[js.Any], sharedTx = sharedTx.asInstanceOf[js.Any])
    __obj.asInstanceOf[CryptoKX]
  }
  
  @scala.inline
  implicit class CryptoKXMutableBuilder[Self <: CryptoKX] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSharedRx(value: Uint8Array): Self = StObject.set(x, "sharedRx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedTx(value: Uint8Array): Self = StObject.set(x, "sharedTx", value.asInstanceOf[js.Any])
  }
}
