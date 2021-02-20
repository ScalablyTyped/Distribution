package typings.materialUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ButtonSize extends StObject {
  
  var buttonSize: js.UndefOr[Double] = js.native
  
  var color: js.UndefOr[String] = js.native
  
  var disabledColor: js.UndefOr[String] = js.native
  
  var disabledTextColor: js.UndefOr[String] = js.native
  
  var iconColor: js.UndefOr[String] = js.native
  
  var miniSize: js.UndefOr[Double] = js.native
  
  var secondaryColor: js.UndefOr[String] = js.native
  
  var secondaryIconColor: js.UndefOr[String] = js.native
}
object ButtonSize {
  
  @scala.inline
  def apply(): ButtonSize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonSize]
  }
  
  @scala.inline
  implicit class ButtonSizeMutableBuilder[Self <: ButtonSize] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setButtonSize(value: Double): Self = StObject.set(x, "buttonSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonSizeUndefined: Self = StObject.set(x, "buttonSize", js.undefined)
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setDisabledColor(value: String): Self = StObject.set(x, "disabledColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledColorUndefined: Self = StObject.set(x, "disabledColor", js.undefined)
    
    @scala.inline
    def setDisabledTextColor(value: String): Self = StObject.set(x, "disabledTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledTextColorUndefined: Self = StObject.set(x, "disabledTextColor", js.undefined)
    
    @scala.inline
    def setIconColor(value: String): Self = StObject.set(x, "iconColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconColorUndefined: Self = StObject.set(x, "iconColor", js.undefined)
    
    @scala.inline
    def setMiniSize(value: Double): Self = StObject.set(x, "miniSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMiniSizeUndefined: Self = StObject.set(x, "miniSize", js.undefined)
    
    @scala.inline
    def setSecondaryColor(value: String): Self = StObject.set(x, "secondaryColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondaryColorUndefined: Self = StObject.set(x, "secondaryColor", js.undefined)
    
    @scala.inline
    def setSecondaryIconColor(value: String): Self = StObject.set(x, "secondaryIconColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondaryIconColorUndefined: Self = StObject.set(x, "secondaryIconColor", js.undefined)
  }
}
