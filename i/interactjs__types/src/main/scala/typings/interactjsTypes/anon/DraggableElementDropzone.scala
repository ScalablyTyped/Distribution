package typings.interactjsTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DraggableElementDropzone extends StObject {
  
  var draggableElement: typings.interactjsTypes.coreTypesMod.Element
  
  var dropzone: this.type
}
object DraggableElementDropzone {
  
  inline def apply(draggableElement: typings.interactjsTypes.coreTypesMod.Element, dropzone: DraggableElementDropzone): DraggableElementDropzone = {
    val __obj = js.Dynamic.literal(draggableElement = draggableElement.asInstanceOf[js.Any], dropzone = dropzone.asInstanceOf[js.Any])
    __obj.asInstanceOf[DraggableElementDropzone]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DraggableElementDropzone] (val x: Self) extends AnyVal {
    
    inline def setDraggableElement(value: typings.interactjsTypes.coreTypesMod.Element): Self = StObject.set(x, "draggableElement", value.asInstanceOf[js.Any])
    
    inline def setDropzone(value: DraggableElementDropzone): Self = StObject.set(x, "dropzone", value.asInstanceOf[js.Any])
  }
}
