package typings.materialUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextColor extends StObject {
  
  var textColor: js.UndefOr[String] = js.undefined
}
object TextColor {
  
  inline def apply(): TextColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextColor]
  }
  
  extension [Self <: TextColor](x: Self) {
    
    inline def setTextColor(value: String): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
    
    inline def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
  }
}
