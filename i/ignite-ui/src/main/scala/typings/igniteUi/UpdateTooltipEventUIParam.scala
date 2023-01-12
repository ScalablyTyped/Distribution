package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateTooltipEventUIParam extends StObject {
  
  /**
    * Used to obtain reference to jquery object which represents tooltip. Value of that member can be replaced by custom element.
    */
  var element: js.UndefOr[Any] = js.undefined
  
  /**
    * Used to obtain reference to item. Value of that member can be modified or replaced by custom item.
    */
  var item: js.UndefOr[Any] = js.undefined
  
  /**
    * Used to obtain reference to chart widget.
    */
  var owner: js.UndefOr[Any] = js.undefined
  
  /**
    * Used to obtain html of tooltip. Value of that member can be modified. If modified value is null or empty string, then current content of tooltip keeps old value.
    */
  var text: js.UndefOr[Any] = js.undefined
  
  /**
    * Used to obtain left position of tooltip in pixels relative to widget. Value of that member can be modified.
    */
  var x: js.UndefOr[Any] = js.undefined
  
  /**
    * Used to obtain top position of tooltip in pixels relative to widget. Value of that member can be modified.
    */
  var y: js.UndefOr[Any] = js.undefined
}
object UpdateTooltipEventUIParam {
  
  inline def apply(): UpdateTooltipEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateTooltipEventUIParam]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateTooltipEventUIParam] (val x: Self) extends AnyVal {
    
    inline def setElement(value: Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    inline def setItem(value: Any): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setText(value: Any): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setX(value: Any): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Any): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
