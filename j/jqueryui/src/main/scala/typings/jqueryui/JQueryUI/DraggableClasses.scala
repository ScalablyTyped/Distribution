package typings.jqueryui.JQueryUI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DraggableClasses extends StObject {
  
  var `ui-draggable`: js.UndefOr[String] = js.undefined
  
  var `ui-draggable-disabled`: js.UndefOr[String] = js.undefined
  
  var `ui-draggable-dragging`: js.UndefOr[String] = js.undefined
  
  var `ui-draggable-handle`: js.UndefOr[String] = js.undefined
}
object DraggableClasses {
  
  inline def apply(): DraggableClasses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DraggableClasses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DraggableClasses] (val x: Self) extends AnyVal {
    
    inline def `setUi-draggable`(value: String): Self = StObject.set(x, "ui-draggable", value.asInstanceOf[js.Any])
    
    inline def `setUi-draggable-disabled`(value: String): Self = StObject.set(x, "ui-draggable-disabled", value.asInstanceOf[js.Any])
    
    inline def `setUi-draggable-disabledUndefined`: Self = StObject.set(x, "ui-draggable-disabled", js.undefined)
    
    inline def `setUi-draggable-dragging`(value: String): Self = StObject.set(x, "ui-draggable-dragging", value.asInstanceOf[js.Any])
    
    inline def `setUi-draggable-draggingUndefined`: Self = StObject.set(x, "ui-draggable-dragging", js.undefined)
    
    inline def `setUi-draggable-handle`(value: String): Self = StObject.set(x, "ui-draggable-handle", value.asInstanceOf[js.Any])
    
    inline def `setUi-draggable-handleUndefined`: Self = StObject.set(x, "ui-draggable-handle", js.undefined)
    
    inline def `setUi-draggableUndefined`: Self = StObject.set(x, "ui-draggable", js.undefined)
  }
}
