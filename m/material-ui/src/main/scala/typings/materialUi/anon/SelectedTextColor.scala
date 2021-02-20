package typings.materialUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectedTextColor extends StObject {
  
  var backgroundColor: js.UndefOr[String] = js.native
  
  var selectedTextColor: js.UndefOr[String] = js.native
  
  var textColor: js.UndefOr[String] = js.native
}
object SelectedTextColor {
  
  @scala.inline
  def apply(): SelectedTextColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectedTextColor]
  }
  
  @scala.inline
  implicit class SelectedTextColorMutableBuilder[Self <: SelectedTextColor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setSelectedTextColor(value: String): Self = StObject.set(x, "selectedTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedTextColorUndefined: Self = StObject.set(x, "selectedTextColor", js.undefined)
    
    @scala.inline
    def setTextColor(value: String): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
  }
}
