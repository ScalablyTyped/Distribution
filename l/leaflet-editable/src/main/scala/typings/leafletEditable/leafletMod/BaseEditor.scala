package typings.leafletEditable.leafletMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * When editing a feature (marker, polyline…), an editor is attached to it.
  * This editor basically knows how to handle the edition.
  */
trait BaseEditor extends StObject {
  
  /**
    * Remove editing tools.
    */
  def disable(): Editor
  
  /**
    * Return true if any drawing action is ongoing with this editor.
    */
  def drawing(): Boolean
  
  /**
    * Set up the drawing tools for the feature to be editable.
    */
  def enable(): Editor
}
object BaseEditor {
  
  inline def apply(disable: () => Editor, drawing: () => Boolean, enable: () => Editor): BaseEditor = {
    val __obj = js.Dynamic.literal(disable = js.Any.fromFunction0(disable), drawing = js.Any.fromFunction0(drawing), enable = js.Any.fromFunction0(enable))
    __obj.asInstanceOf[BaseEditor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaseEditor] (val x: Self) extends AnyVal {
    
    inline def setDisable(value: () => Editor): Self = StObject.set(x, "disable", js.Any.fromFunction0(value))
    
    inline def setDrawing(value: () => Boolean): Self = StObject.set(x, "drawing", js.Any.fromFunction0(value))
    
    inline def setEnable(value: () => Editor): Self = StObject.set(x, "enable", js.Any.fromFunction0(value))
  }
}
