package typings.matrixJsSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ed25519 extends StObject {
  
  var ed25519: String
}
object Ed25519 {
  
  inline def apply(ed25519: String): Ed25519 = {
    val __obj = js.Dynamic.literal(ed25519 = ed25519.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ed25519]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ed25519] (val x: Self) extends AnyVal {
    
    inline def setEd25519(value: String): Self = StObject.set(x, "ed25519", value.asInstanceOf[js.Any])
  }
}
