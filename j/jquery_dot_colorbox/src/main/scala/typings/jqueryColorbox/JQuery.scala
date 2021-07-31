package typings.jqueryColorbox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQuery extends StObject {
  
  def colorbox(): JQuery
  def colorbox(settings: ColorboxSettings): JQuery
  @JSName("colorbox")
  var colorbox_Original: Colorbox
}
object JQuery {
  
  @scala.inline
  def apply(colorbox: Colorbox): JQuery = {
    val __obj = js.Dynamic.literal(colorbox = colorbox.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQuery]
  }
  
  @scala.inline
  implicit class JQueryMutableBuilder[Self <: JQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColorbox(value: Colorbox): Self = StObject.set(x, "colorbox", value.asInstanceOf[js.Any])
  }
}
