package typings.materialUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BorderColorTextColor extends StObject {
  
  var borderColor: js.UndefOr[String] = js.native
  
  var textColor: js.UndefOr[String] = js.native
}
object BorderColorTextColor {
  
  @scala.inline
  def apply(): BorderColorTextColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderColorTextColor]
  }
  
  @scala.inline
  implicit class BorderColorTextColorMutableBuilder[Self <: BorderColorTextColor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    @scala.inline
    def setTextColor(value: String): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
  }
}
