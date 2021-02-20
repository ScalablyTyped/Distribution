package typings.materialUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BoxColor extends StObject {
  
  var boxColor: js.UndefOr[String] = js.native
  
  var checkedColor: js.UndefOr[String] = js.native
  
  var disabledColor: js.UndefOr[String] = js.native
  
  var labelColor: js.UndefOr[String] = js.native
  
  var labelDisabledColor: js.UndefOr[String] = js.native
  
  var requiredColor: js.UndefOr[String] = js.native
}
object BoxColor {
  
  @scala.inline
  def apply(): BoxColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BoxColor]
  }
  
  @scala.inline
  implicit class BoxColorMutableBuilder[Self <: BoxColor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBoxColor(value: String): Self = StObject.set(x, "boxColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoxColorUndefined: Self = StObject.set(x, "boxColor", js.undefined)
    
    @scala.inline
    def setCheckedColor(value: String): Self = StObject.set(x, "checkedColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckedColorUndefined: Self = StObject.set(x, "checkedColor", js.undefined)
    
    @scala.inline
    def setDisabledColor(value: String): Self = StObject.set(x, "disabledColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledColorUndefined: Self = StObject.set(x, "disabledColor", js.undefined)
    
    @scala.inline
    def setLabelColor(value: String): Self = StObject.set(x, "labelColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelColorUndefined: Self = StObject.set(x, "labelColor", js.undefined)
    
    @scala.inline
    def setLabelDisabledColor(value: String): Self = StObject.set(x, "labelDisabledColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelDisabledColorUndefined: Self = StObject.set(x, "labelDisabledColor", js.undefined)
    
    @scala.inline
    def setRequiredColor(value: String): Self = StObject.set(x, "requiredColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredColorUndefined: Self = StObject.set(x, "requiredColor", js.undefined)
  }
}
