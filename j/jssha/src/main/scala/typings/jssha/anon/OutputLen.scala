package typings.jssha.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutputLen extends StObject {
  
  var outputLen: js.UndefOr[Double] = js.undefined
  
  var outputUpper: js.UndefOr[Boolean] = js.undefined
  
  var shakeLen: js.UndefOr[Double] = js.undefined
}
object OutputLen {
  
  inline def apply(): OutputLen = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutputLen]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OutputLen] (val x: Self) extends AnyVal {
    
    inline def setOutputLen(value: Double): Self = StObject.set(x, "outputLen", value.asInstanceOf[js.Any])
    
    inline def setOutputLenUndefined: Self = StObject.set(x, "outputLen", js.undefined)
    
    inline def setOutputUpper(value: Boolean): Self = StObject.set(x, "outputUpper", value.asInstanceOf[js.Any])
    
    inline def setOutputUpperUndefined: Self = StObject.set(x, "outputUpper", js.undefined)
    
    inline def setShakeLen(value: Double): Self = StObject.set(x, "shakeLen", value.asInstanceOf[js.Any])
    
    inline def setShakeLenUndefined: Self = StObject.set(x, "shakeLen", js.undefined)
  }
}
