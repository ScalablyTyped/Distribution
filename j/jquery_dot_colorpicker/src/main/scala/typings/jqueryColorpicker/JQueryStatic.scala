package typings.jqueryColorpicker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQueryStatic extends StObject {
  
  var colorpicker: JQueryColorpickerStatic
}
object JQueryStatic {
  
  inline def apply(colorpicker: JQueryColorpickerStatic): JQueryStatic = {
    val __obj = js.Dynamic.literal(colorpicker = colorpicker.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryStatic]
  }
  
  extension [Self <: JQueryStatic](x: Self) {
    
    inline def setColorpicker(value: JQueryColorpickerStatic): Self = StObject.set(x, "colorpicker", value.asInstanceOf[js.Any])
  }
}
