package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HideTooltipEventUIParam extends StObject {
  
  /**
    * Used to obtain reference to jquery object which represents tooltip or value of ui.element from last updateTooltip event. Value of that member can be replaced by custom element.
    */
  var element: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Used to obtain reference to item.
    */
  var item: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Used to obtain reference to chart widget.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
}
object HideTooltipEventUIParam {
  
  @scala.inline
  def apply(): HideTooltipEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HideTooltipEventUIParam]
  }
  
  @scala.inline
  implicit class HideTooltipEventUIParamMutableBuilder[Self <: HideTooltipEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElement(value: js.Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    @scala.inline
    def setItem(value: js.Any): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
  }
}
