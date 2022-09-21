package typings.interactjsTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DraggableElement extends StObject {
  
  var draggableElement: typings.interactjsTypes.typesMod.Element
  
  var dropzone: typings.interactjsTypes.interactableMod.Interactable
}
object DraggableElement {
  
  inline def apply(
    draggableElement: typings.interactjsTypes.typesMod.Element,
    dropzone: typings.interactjsTypes.interactableMod.Interactable
  ): DraggableElement = {
    val __obj = js.Dynamic.literal(draggableElement = draggableElement.asInstanceOf[js.Any], dropzone = dropzone.asInstanceOf[js.Any])
    __obj.asInstanceOf[DraggableElement]
  }
  
  extension [Self <: DraggableElement](x: Self) {
    
    inline def setDraggableElement(value: typings.interactjsTypes.typesMod.Element): Self = StObject.set(x, "draggableElement", value.asInstanceOf[js.Any])
    
    inline def setDropzone(value: typings.interactjsTypes.interactableMod.Interactable): Self = StObject.set(x, "dropzone", value.asInstanceOf[js.Any])
  }
}
