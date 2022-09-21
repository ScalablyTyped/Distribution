package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HideTooltipEventUIParam extends StObject {
  
  /**
    * Used to obtain reference to jquery object which represents tooltip or value of ui.element from last updateTooltip event. Value of that member can be replaced by custom element.
    */
  var element: js.UndefOr[Any] = js.undefined
  
  /**
    * Used to obtain reference to item.
    */
  var item: js.UndefOr[Any] = js.undefined
  
  /**
    * Used to obtain reference to chart widget.
    */
  var owner: js.UndefOr[Any] = js.undefined
}
object HideTooltipEventUIParam {
  
  inline def apply(): HideTooltipEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HideTooltipEventUIParam]
  }
  
  extension [Self <: HideTooltipEventUIParam](x: Self) {
    
    inline def setElement(value: Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    inline def setItem(value: Any): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
