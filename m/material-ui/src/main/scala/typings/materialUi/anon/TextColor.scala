package typings.materialUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextColor extends StObject {
  
  var textColor: js.UndefOr[String] = js.native
}
object TextColor {
  
  @scala.inline
  def apply(): TextColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextColor]
  }
  
  @scala.inline
  implicit class TextColorMutableBuilder[Self <: TextColor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTextColor(value: String): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
  }
}
