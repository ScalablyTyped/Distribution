package typings.jqueryui.JQueryUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SizeEffect extends StObject {
  
  var origin: js.UndefOr[js.Array[String]] = js.undefined
  
  var scale: js.UndefOr[String] = js.undefined
  
  var to: js.UndefOr[Any] = js.undefined
}
object SizeEffect {
  
  inline def apply(): SizeEffect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SizeEffect]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SizeEffect] (val x: Self) extends AnyVal {
    
    inline def setOrigin(value: js.Array[String]): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    inline def setOriginVarargs(value: String*): Self = StObject.set(x, "origin", js.Array(value*))
    
    inline def setScale(value: String): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    inline def setTo(value: Any): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
  }
}
