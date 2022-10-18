package typings.interactjsTypes.actionsDropPluginMod

import typings.interactjsTypes.anon.InteractableActions
import typings.interactjsTypes.coreTypesMod.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object interactjsCoreInteractEventAugmentingMod {
  
  trait InteractEvent extends StObject {
    
    var dragEnter: js.UndefOr[Element] = js.undefined
    
    var dragLeave: js.UndefOr[Element] = js.undefined
    
    var dropzone: js.UndefOr[InteractableActions] = js.undefined
    
    var prevDropzone: js.UndefOr[InteractableActions] = js.undefined
  }
  object InteractEvent {
    
    inline def apply(): InteractEvent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InteractEvent]
    }
    
    extension [Self <: InteractEvent](x: Self) {
      
      inline def setDragEnter(value: Element): Self = StObject.set(x, "dragEnter", value.asInstanceOf[js.Any])
      
      inline def setDragEnterUndefined: Self = StObject.set(x, "dragEnter", js.undefined)
      
      inline def setDragLeave(value: Element): Self = StObject.set(x, "dragLeave", value.asInstanceOf[js.Any])
      
      inline def setDragLeaveUndefined: Self = StObject.set(x, "dragLeave", js.undefined)
      
      inline def setDropzone(value: InteractableActions): Self = StObject.set(x, "dropzone", value.asInstanceOf[js.Any])
      
      inline def setDropzoneUndefined: Self = StObject.set(x, "dropzone", js.undefined)
      
      inline def setPrevDropzone(value: InteractableActions): Self = StObject.set(x, "prevDropzone", value.asInstanceOf[js.Any])
      
      inline def setPrevDropzoneUndefined: Self = StObject.set(x, "prevDropzone", js.undefined)
    }
  }
}
