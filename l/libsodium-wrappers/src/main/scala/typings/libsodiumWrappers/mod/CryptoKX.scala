package typings.libsodiumWrappers.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CryptoKX extends StObject {
  
  var sharedRx: js.typedarray.Uint8Array
  
  var sharedTx: js.typedarray.Uint8Array
}
object CryptoKX {
  
  inline def apply(sharedRx: js.typedarray.Uint8Array, sharedTx: js.typedarray.Uint8Array): CryptoKX = {
    val __obj = js.Dynamic.literal(sharedRx = sharedRx.asInstanceOf[js.Any], sharedTx = sharedTx.asInstanceOf[js.Any])
    __obj.asInstanceOf[CryptoKX]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CryptoKX] (val x: Self) extends AnyVal {
    
    inline def setSharedRx(value: js.typedarray.Uint8Array): Self = StObject.set(x, "sharedRx", value.asInstanceOf[js.Any])
    
    inline def setSharedTx(value: js.typedarray.Uint8Array): Self = StObject.set(x, "sharedTx", value.asInstanceOf[js.Any])
  }
}
