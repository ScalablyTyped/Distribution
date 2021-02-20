package typings.jqueryColorpicker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQueryStatic extends StObject {
  
  var colorpicker: JQueryColorpickerStatic = js.native
}
object JQueryStatic {
  
  @scala.inline
  def apply(colorpicker: JQueryColorpickerStatic): JQueryStatic = {
    val __obj = js.Dynamic.literal(colorpicker = colorpicker.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryStatic]
  }
  
  @scala.inline
  implicit class JQueryStaticMutableBuilder[Self <: JQueryStatic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColorpicker(value: JQueryColorpickerStatic): Self = StObject.set(x, "colorpicker", value.asInstanceOf[js.Any])
  }
}
