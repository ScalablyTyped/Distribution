package typings.jqueryColorbox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQueryStatic extends StObject {
  
  /**
    * This method allows you to call Colorbox without having to assign it to an element.
    */
  def colorbox(settings: ColorboxSettings): js.Any
  @JSName("colorbox")
  var colorbox_Original: ColorboxStatic
}
object JQueryStatic {
  
  @scala.inline
  def apply(colorbox: ColorboxStatic): JQueryStatic = {
    val __obj = js.Dynamic.literal(colorbox = colorbox.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryStatic]
  }
  
  @scala.inline
  implicit class JQueryStaticMutableBuilder[Self <: JQueryStatic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColorbox(value: ColorboxStatic): Self = StObject.set(x, "colorbox", value.asInstanceOf[js.Any])
  }
}
