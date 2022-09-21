package typings.jssha.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait B64Pad extends StObject {
  
  var b64Pad: js.UndefOr[String] = js.undefined
  
  var outputLen: js.UndefOr[Double] = js.undefined
  
  var shakeLen: js.UndefOr[Double] = js.undefined
}
object B64Pad {
  
  inline def apply(): B64Pad = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[B64Pad]
  }
  
  extension [Self <: B64Pad](x: Self) {
    
    inline def setB64Pad(value: String): Self = StObject.set(x, "b64Pad", value.asInstanceOf[js.Any])
    
    inline def setB64PadUndefined: Self = StObject.set(x, "b64Pad", js.undefined)
    
    inline def setOutputLen(value: Double): Self = StObject.set(x, "outputLen", value.asInstanceOf[js.Any])
    
    inline def setOutputLenUndefined: Self = StObject.set(x, "outputLen", js.undefined)
    
    inline def setShakeLen(value: Double): Self = StObject.set(x, "shakeLen", value.asInstanceOf[js.Any])
    
    inline def setShakeLenUndefined: Self = StObject.set(x, "shakeLen", js.undefined)
  }
}
