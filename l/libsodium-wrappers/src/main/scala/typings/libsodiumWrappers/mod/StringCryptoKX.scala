package typings.libsodiumWrappers.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StringCryptoKX extends StObject {
  
  var sharedRx: String
  
  var sharedTx: String
}
object StringCryptoKX {
  
  @scala.inline
  def apply(sharedRx: String, sharedTx: String): StringCryptoKX = {
    val __obj = js.Dynamic.literal(sharedRx = sharedRx.asInstanceOf[js.Any], sharedTx = sharedTx.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringCryptoKX]
  }
  
  @scala.inline
  implicit class StringCryptoKXMutableBuilder[Self <: StringCryptoKX] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSharedRx(value: String): Self = StObject.set(x, "sharedRx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharedTx(value: String): Self = StObject.set(x, "sharedTx", value.asInstanceOf[js.Any])
  }
}
