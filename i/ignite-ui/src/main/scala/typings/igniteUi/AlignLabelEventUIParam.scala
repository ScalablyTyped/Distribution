package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlignLabelEventUIParam extends StObject {
  
  /**
    * Used to obtain the maximum value of the bullet graph scale.
    */
  var actualMaximumValue: js.UndefOr[js.Any] = js.native
  
  /**
    * Used to obtain the minimum value of the bullet graph scale.
    */
  var actualMinimumValue: js.UndefOr[js.Any] = js.native
  
  /**
    * Used to obtain the height of the label.
    */
  var height: js.UndefOr[js.Any] = js.native
  
  /**
    * Used to obtain the string value of the label.
    */
  var label: js.UndefOr[js.Any] = js.native
  
  /**
    * Used to obtain the X offset of the label on the bullet graph scale.
    */
  var offsetX: js.UndefOr[js.Any] = js.native
  
  /**
    * Used to obtain the Y offset of the label on the bullet graph scale.
    */
  var offsetY: js.UndefOr[js.Any] = js.native
  
  /**
    * Used to obtain reference to gauge widget.
    */
  var owner: js.UndefOr[js.Any] = js.native
  
  /**
    * Used to obtain the value on the the bullet graph scale associated with the label.
    */
  var value: js.UndefOr[js.Any] = js.native
  
  /**
    * Used to obtain the width of the label.
    */
  var width: js.UndefOr[js.Any] = js.native
}
object AlignLabelEventUIParam {
  
  @scala.inline
  def apply(): AlignLabelEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlignLabelEventUIParam]
  }
  
  @scala.inline
  implicit class AlignLabelEventUIParamMutableBuilder[Self <: AlignLabelEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActualMaximumValue(value: js.Any): Self = StObject.set(x, "actualMaximumValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActualMaximumValueUndefined: Self = StObject.set(x, "actualMaximumValue", js.undefined)
    
    @scala.inline
    def setActualMinimumValue(value: js.Any): Self = StObject.set(x, "actualMinimumValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActualMinimumValueUndefined: Self = StObject.set(x, "actualMinimumValue", js.undefined)
    
    @scala.inline
    def setHeight(value: js.Any): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setLabel(value: js.Any): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setOffsetX(value: js.Any): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetXUndefined: Self = StObject.set(x, "offsetX", js.undefined)
    
    @scala.inline
    def setOffsetY(value: js.Any): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def setWidth(value: js.Any): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
