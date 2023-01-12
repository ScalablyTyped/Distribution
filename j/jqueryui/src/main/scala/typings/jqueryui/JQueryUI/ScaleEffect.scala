package typings.jqueryui.JQueryUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScaleEffect extends StObject {
  
  var direction: js.UndefOr[String] = js.undefined
  
  var origin: js.UndefOr[js.Array[String]] = js.undefined
  
  var percent: js.UndefOr[Double] = js.undefined
  
  var scale: js.UndefOr[String] = js.undefined
}
object ScaleEffect {
  
  inline def apply(): ScaleEffect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScaleEffect]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScaleEffect] (val x: Self) extends AnyVal {
    
    inline def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setOrigin(value: js.Array[String]): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    inline def setOriginVarargs(value: String*): Self = StObject.set(x, "origin", js.Array(value*))
    
    inline def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
    
    inline def setPercentUndefined: Self = StObject.set(x, "percent", js.undefined)
    
    inline def setScale(value: String): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
  }
}
