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
  
  extension [Self <: TextAreaStyle](x: Self) {
    
    inline def setTextLineClamp(value: Double): Self = StObject.set(x, "textLineClamp", value.asInstanceOf[js.Any])
    
    inline def setTextLineClampUndefined: Self = StObject.set(x, "textLineClamp", js.undefined)
  }
}
