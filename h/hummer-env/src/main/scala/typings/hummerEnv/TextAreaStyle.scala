package typings.hummerEnv

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextAreaStyle
  extends StObject
     with InputStyle {
  
  var textLineClamp: js.UndefOr[Double] = js.undefined
}
object TextAreaStyle {
  
  inline def apply(): TextAreaStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextAreaStyle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextAreaStyle] (val x: Self) extends AnyVal {
    
    inline def setTextLineClamp(value: Double): Self = StObject.set(x, "textLineClamp", value.asInstanceOf[js.Any])
    
    inline def setTextLineClampUndefined: Self = StObject.set(x, "textLineClamp", js.undefined)
  }
}
