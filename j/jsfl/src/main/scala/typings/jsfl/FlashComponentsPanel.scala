package typings.jsfl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlashComponentsPanel extends StObject {
  
  def addItemToDocument(): Any
  
  def reload(): Any
}
object FlashComponentsPanel {
  
  inline def apply(addItemToDocument: () => Any, reload: () => Any): FlashComponentsPanel = {
    val __obj = js.Dynamic.literal(addItemToDocument = js.Any.fromFunction0(addItemToDocument), reload = js.Any.fromFunction0(reload))
    __obj.asInstanceOf[FlashComponentsPanel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FlashComponentsPanel] (val x: Self) extends AnyVal {
    
    inline def setAddItemToDocument(value: () => Any): Self = StObject.set(x, "addItemToDocument", js.Any.fromFunction0(value))
    
    inline def setReload(value: () => Any): Self = StObject.set(x, "reload", js.Any.fromFunction0(value))
  }
}
