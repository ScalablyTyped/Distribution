package typings.jsfl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlashComponentsPanel extends StObject {
  
  def addItemToDocument(): js.Any = js.native
  
  def reload(): js.Any = js.native
}
object FlashComponentsPanel {
  
  @scala.inline
  def apply(addItemToDocument: () => js.Any, reload: () => js.Any): FlashComponentsPanel = {
    val __obj = js.Dynamic.literal(addItemToDocument = js.Any.fromFunction0(addItemToDocument), reload = js.Any.fromFunction0(reload))
    __obj.asInstanceOf[FlashComponentsPanel]
  }
  
  @scala.inline
  implicit class FlashComponentsPanelMutableBuilder[Self <: FlashComponentsPanel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddItemToDocument(value: () => js.Any): Self = StObject.set(x, "addItemToDocument", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReload(value: () => js.Any): Self = StObject.set(x, "reload", js.Any.fromFunction0(value))
  }
}
