package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HiddenEventUIParam extends StObject {
  
  /**
    * Gets the content displayed in the popover as a string.
    */
  var content: js.UndefOr[String] = js.undefined
  
  /**
    * Gets the element the popover is hidden for.
    */
  var element: js.UndefOr[String] = js.undefined
  
  /**
    * Gets reference to the %%WidgetName%% widget.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Gets the popover element hidden.
    */
  var popover: js.UndefOr[String] = js.undefined
}
object HiddenEventUIParam {
  
  @scala.inline
  def apply(): HiddenEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HiddenEventUIParam]
  }
  
  @scala.inline
  implicit class HiddenEventUIParamMutableBuilder[Self <: HiddenEventUIParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setElement(value: String): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    @scala.inline
    def setOwner(value: js.Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    @scala.inline
    def setPopover(value: String): Self = StObject.set(x, "popover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopoverUndefined: Self = StObject.set(x, "popover", js.undefined)
  }
}
