package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateTooltipEventUIParam extends StObject {
  
  /**
    * Used to obtain reference to jquery object which represents tooltip. Value of that member can be replaced by custom element.
    */
  var element: js.UndefOr[js.Any] = js.native
  
  /**
    * Used to obtain reference to item. Value of that member can be modified or replaced by custom item.
    */
  var item: js.UndefOr[js.Any] = js.native
  
  /**
    * Used to obtain reference to chart widget.
    */
  var owner: js.UndefOr[js.Any] = js.native
  
  /**
    * Used to obtain html of tooltip. Value of that member can be modified. If modified value is null or empty string, then current content of tooltip keeps old value.
    */
  var text: js.UndefOr[js.Any] = js.native
  
  /**
    * Used to obtain left position of tooltip in pixels relative to widget. Value of that member can be modified.
    */
  var x: js.UndefOr[js.Any] = js.native
  
  /**
    * Used to obtain top position of tooltip in pixels relative to widget. Value of that member can be modified.
    */
  var y: js.UndefOr[js.Any] = js.native
}
object UpdateTooltipEventUIParam {
  
  @scala.inline
  def apply(): UpdateTooltipEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateTooltipEventUIParam]
  }
  
  @scala.inline
  implicit class UpdateTooltipEventUIParamMutableBuilder[Self <: UpdateTooltipEventUIParam] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setText(value: js.Any): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setX(value: js.Any): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: js.Any): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
