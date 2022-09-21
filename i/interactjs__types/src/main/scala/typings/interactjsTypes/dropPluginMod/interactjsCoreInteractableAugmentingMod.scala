package typings.interactjsTypes.dropPluginMod

import typings.interactjsTypes.anon.InteractableActions
import typings.interactjsTypes.interactEventMod.EventPhase
import typings.interactjsTypes.interactEventMod.InteractEvent
import typings.interactjsTypes.typesMod.Element
import typings.interactjsTypes.typesMod.PointerEventType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object interactjsCoreInteractableAugmentingMod {
  
  trait Interactable extends StObject {
    
    def dropCheck(
      dragEvent: InteractEvent[scala.Nothing, EventPhase],
      event: PointerEventType,
      draggable: Interactable,
      draggableElement: Element,
      dropElemen: Element,
      rect: Any
    ): Boolean
    
    def dropzone(): DropzoneOptions
    def dropzone(options: Boolean): InteractableActions
    def dropzone(options: DropzoneOptions): InteractableActions
    @JSName("dropzone")
    var dropzone_Original: DropzoneMethod
  }
  object Interactable {
    
    inline def apply(
      dropCheck: (InteractEvent[scala.Nothing, EventPhase], PointerEventType, Interactable, Element, Element, Any) => Boolean,
      dropzone: DropzoneMethod
    ): Interactable = {
      val __obj = js.Dynamic.literal(dropCheck = js.Any.fromFunction6(dropCheck), dropzone = dropzone.asInstanceOf[js.Any])
      __obj.asInstanceOf[Interactable]
    }
    
    extension [Self <: Interactable](x: Self) {
      
      inline def setDropCheck(
        value: (InteractEvent[scala.Nothing, EventPhase], PointerEventType, Interactable, Element, Element, Any) => Boolean
      ): Self = StObject.set(x, "dropCheck", js.Any.fromFunction6(value))
      
      inline def setDropzone(value: DropzoneMethod): Self = StObject.set(x, "dropzone", value.asInstanceOf[js.Any])
    }
  }
}
