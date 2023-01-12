package typings.interactjsTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DraggableElementElement extends StObject {
  
  var draggableElement: typings.interactjsTypes.coreTypesMod.Element
  
  var dropzone: InteractableContext
}
object DraggableElementElement {
  
  inline def apply(draggableElement: typings.interactjsTypes.coreTypesMod.Element, dropzone: InteractableContext): DraggableElementElement = {
    val __obj = js.Dynamic.literal(draggableElement = draggableElement.asInstanceOf[js.Any], dropzone = dropzone.asInstanceOf[js.Any])
    __obj.asInstanceOf[DraggableElementElement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DraggableElementElement] (val x: Self) extends AnyVal {
    
    inline def setDraggableElement(value: typings.interactjsTypes.coreTypesMod.Element): Self = StObject.set(x, "draggableElement", value.asInstanceOf[js.Any])
    
    inline def setDropzone(value: InteractableContext): Self = StObject.set(x, "dropzone", value.asInstanceOf[js.Any])
  }
}
