package typings.jsrsasign.jsrsasign

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ECCPrivateKey extends StObject {
  
  var curve: String = js.native
  
  var d: String = js.native
}
object ECCPrivateKey {
  
  @scala.inline
  def apply(curve: String, d: String): ECCPrivateKey = {
    val __obj = js.Dynamic.literal(curve = curve.asInstanceOf[js.Any], d = d.asInstanceOf[js.Any])
    __obj.asInstanceOf[ECCPrivateKey]
  }
  
  @scala.inline
  implicit class ECCPrivateKeyMutableBuilder[Self <: ECCPrivateKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurve(value: String): Self = StObject.set(x, "curve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setD(value: String): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
  }
}
