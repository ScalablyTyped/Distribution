package typings.gorillaEngine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FocusColor extends StObject {
  
  var color: js.UndefOr[String] = js.undefined
  
  var focusColor: js.UndefOr[String] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object FocusColor {
  
  inline def apply(): FocusColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FocusColor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FocusColor] (val x: Self) extends AnyVal {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setFocusColor(value: String): Self = StObject.set(x, "focusColor", value.asInstanceOf[js.Any])
    
    inline def setFocusColorUndefined: Self = StObject.set(x, "focusColor", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
