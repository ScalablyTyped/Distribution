package typings.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShownEventUIParam extends StObject {
  
  /**
    * Gets the content that was shown as a string.
    */
  var content: js.UndefOr[String] = js.undefined
  
  /**
    * Gets the element the popover showed for.
    */
  var element: js.UndefOr[String] = js.undefined
  
  /**
    * Gets a reference to the %%WidgetName%% widget.
    */
  var owner: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets the popover element showing.
    */
  var popover: js.UndefOr[String] = js.undefined
}
object ShownEventUIParam {
  
  inline def apply(): ShownEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShownEventUIParam]
  }
  
  extension [Self <: ShownEventUIParam](x: Self) {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setElement(value: String): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setPopover(value: String): Self = StObject.set(x, "popover", value.asInstanceOf[js.Any])
    
    inline def setPopoverUndefined: Self = StObject.set(x, "popover", js.undefined)
  }
}
