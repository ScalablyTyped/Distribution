package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormatLabelEventUIParam extends StObject {
  
  /**
    * Used to obtain the maximum value of the bullet graph scale.
    */
  var actualMaximumValue: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Used to obtain the minimum value of the bullet graph scale.
    */
  var actualMinimumValue: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Used to obtain the string value of the label.
    */
  var label: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Used to obtain reference to the bullet graph widget.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Used to obtain the value on the the bullet graph scale associated with the label.
    */
  var value: js.UndefOr[js.Any] = js.undefined
}
object FormatLabelEventUIParam {
  
  @scala.inline
  def apply(): FormatLabelEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormatLabelEventUIParam]
  }
  
  @scala.inline
  implicit class FormatLabelEventUIParamMutableBuilder[Self <: FormatLabelEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActualMaximumValue(value: js.Any): Self = StObject.set(x, "actualMaximumValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActualMaximumValueUndefined: Self = StObject.set(x, "actualMaximumValue", js.undefined)
    
    @scala.inline
    def setActualMinimumValue(value: js.Any): Self = StObject.set(x, "actualMinimumValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActualMinimumValueUndefined: Self = StObject.set(x, "actualMinimumValue", js.undefined)
    
    @scala.inline
    def setLabel(value: js.Any): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
