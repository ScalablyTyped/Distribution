package typings.materialUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionColor extends StObject {
  
  var actionColor: js.UndefOr[String] = js.undefined
  
  var backgroundColor: js.UndefOr[String] = js.undefined
  
  var textColor: js.UndefOr[String] = js.undefined
}
object ActionColor {
  
  inline def apply(): ActionColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionColor]
  }
  
  extension [Self <: ActionColor](x: Self) {
    
    inline def setActionColor(value: String): Self = StObject.set(x, "actionColor", value.asInstanceOf[js.Any])
    
    inline def setActionColorUndefined: Self = StObject.set(x, "actionColor", js.undefined)
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setTextColor(value: String): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
    
    inline def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
  }
}
