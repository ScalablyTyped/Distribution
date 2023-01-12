package typings.interactjsTypes.actionsDropPluginMod

import typings.interactjsTypes.anon.InteractableActions
import typings.interactjsTypes.coreTypesMod.Element
import typings.interactjsTypes.coreTypesMod.Rect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActiveDrop extends StObject {
  
  var dropzone: InteractableActions
  
  var element: Element
  
  var rect: Rect
}
object ActiveDrop {
  
  inline def apply(dropzone: InteractableActions, element: Element, rect: Rect): ActiveDrop = {
    val __obj = js.Dynamic.literal(dropzone = dropzone.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], rect = rect.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveDrop]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActiveDrop] (val x: Self) extends AnyVal {
    
    inline def setDropzone(value: InteractableActions): Self = StObject.set(x, "dropzone", value.asInstanceOf[js.Any])
    
    inline def setElement(value: Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setRect(value: Rect): Self = StObject.set(x, "rect", value.asInstanceOf[js.Any])
  }
}
