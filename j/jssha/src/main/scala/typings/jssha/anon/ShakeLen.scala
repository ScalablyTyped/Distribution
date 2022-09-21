package typings.jssha.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShakeLen extends StObject {
  
  var outputLen: js.UndefOr[Double] = js.undefined
  
  var shakeLen: js.UndefOr[Double] = js.undefined
}
object ShakeLen {
  
  inline def apply(): ShakeLen = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShakeLen]
  }
  
  extension [Self <: ShakeLen](x: Self) {
    
    inline def setOutputLen(value: Double): Self = StObject.set(x, "outputLen", value.asInstanceOf[js.Any])
    
    inline def setOutputLenUndefined: Self = StObject.set(x, "outputLen", js.undefined)
    
    inline def setShakeLen(value: Double): Self = StObject.set(x, "shakeLen", value.asInstanceOf[js.Any])
    
    inline def setShakeLenUndefined: Self = StObject.set(x, "shakeLen", js.undefined)
  }
}
