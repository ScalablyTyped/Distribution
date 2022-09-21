package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlignLabelEventUIParam extends StObject {
  
  /**
    * Used to obtain the maximum value of the bullet graph scale.
    */
  var actualMaximumValue: js.UndefOr[Any] = js.undefined
  
  /**
    * Used to obtain the minimum value of the bullet graph scale.
    */
  var actualMinimumValue: js.UndefOr[Any] = js.undefined
  
  /**
    * Used to obtain the height of the label.
    */
  var height: js.UndefOr[Any] = js.undefined
  
  /**
    * Used to obtain the string value of the label.
    */
  var label: js.UndefOr[Any] = js.undefined
  
  /**
    * Used to obtain the X offset of the label on the bullet graph scale.
    */
  var offsetX: js.UndefOr[Any] = js.undefined
  
  /**
    * Used to obtain the Y offset of the label on the bullet graph scale.
    */
  var offsetY: js.UndefOr[Any] = js.undefined
  
  /**
    * Used to obtain reference to gauge widget.
    */
  var owner: js.UndefOr[Any] = js.undefined
  
  /**
    * Used to obtain the value on the the bullet graph scale associated with the label.
    */
  var value: js.UndefOr[Any] = js.undefined
  
  /**
    * Used to obtain the width of the label.
    */
  var width: js.UndefOr[Any] = js.undefined
}
object AlignLabelEventUIParam {
  
  inline def apply(): AlignLabelEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlignLabelEventUIParam]
  }
  
  extension [Self <: AlignLabelEventUIParam](x: Self) {
    
    inline def setActualMaximumValue(value: Any): Self = StObject.set(x, "actualMaximumValue", value.asInstanceOf[js.Any])
    
    inline def setActualMaximumValueUndefined: Self = StObject.set(x, "actualMaximumValue", js.undefined)
    
    inline def setActualMinimumValue(value: Any): Self = StObject.set(x, "actualMinimumValue", value.asInstanceOf[js.Any])
    
    inline def setActualMinimumValueUndefined: Self = StObject.set(x, "actualMinimumValue", js.undefined)
    
    inline def setHeight(value: Any): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setLabel(value: Any): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setOffsetX(value: Any): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    inline def setOffsetXUndefined: Self = StObject.set(x, "offsetX", js.undefined)
    
    inline def setOffsetY(value: Any): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    inline def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setWidth(value: Any): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
