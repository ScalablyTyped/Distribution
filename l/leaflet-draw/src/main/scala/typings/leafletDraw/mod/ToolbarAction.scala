package typings.leafletDraw.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToolbarAction extends StObject {
  
  def callback(): Unit
  
  var context: js.Object
  
  var text: String
  
  var title: String
}
object ToolbarAction {
  
  @scala.inline
  def apply(callback: () => Unit, context: js.Object, text: String, title: String): ToolbarAction = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction0(callback), context = context.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolbarAction]
  }
  
  @scala.inline
  implicit class ToolbarActionMutableBuilder[Self <: ToolbarAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallback(value: () => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction0(value))
    
    @scala.inline
    def setContext(value: js.Object): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
