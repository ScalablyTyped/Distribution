package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormatLabelEventUIParam extends StObject {
  
  /**
    * Used to obtain the maximum value of the bullet graph scale.
    */
  var actualMaximumValue: js.UndefOr[Any] = js.undefined
  
  /**
    * Used to obtain the minimum value of the bullet graph scale.
    */
  var actualMinimumValue: js.UndefOr[Any] = js.undefined
  
  /**
    * Used to obtain the string value of the label.
    */
  var label: js.UndefOr[Any] = js.undefined
  
  /**
    * Used to obtain reference to the bullet graph widget.
    */
  var owner: js.UndefOr[Any] = js.undefined
  
  /**
    * Used to obtain the value on the the bullet graph scale associated with the label.
    */
  var value: js.UndefOr[Any] = js.undefined
}
object FormatLabelEventUIParam {
  
  inline def apply(): FormatLabelEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormatLabelEventUIParam]
  }
  
  extension [Self <: FormatLabelEventUIParam](x: Self) {
    
    inline def setActualMaximumValue(value: Any): Self = StObject.set(x, "actualMaximumValue", value.asInstanceOf[js.Any])
    
    inline def setActualMaximumValueUndefined: Self = StObject.set(x, "actualMaximumValue", js.undefined)
    
    inline def setActualMinimumValue(value: Any): Self = StObject.set(x, "actualMinimumValue", value.asInstanceOf[js.Any])
    
    inline def setActualMinimumValueUndefined: Self = StObject.set(x, "actualMinimumValue", js.undefined)
    
    inline def setLabel(value: Any): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
