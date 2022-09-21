package typings.interactjsTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dropzone extends StObject {
  
  var draggableElement: typings.interactjsTypes.typesMod.Element
  
  var dropzone: Interactable
}
object Dropzone {
  
  inline def apply(draggableElement: typings.interactjsTypes.typesMod.Element, dropzone: Interactable): Dropzone = {
    val __obj = js.Dynamic.literal(draggableElement = draggableElement.asInstanceOf[js.Any], dropzone = dropzone.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dropzone]
  }
  
  extension [Self <: Dropzone](x: Self) {
    
    inline def setDraggableElement(value: typings.interactjsTypes.typesMod.Element): Self = StObject.set(x, "draggableElement", value.asInstanceOf[js.Any])
    
    inline def setDropzone(value: Interactable): Self = StObject.set(x, "dropzone", value.asInstanceOf[js.Any])
  }
}
