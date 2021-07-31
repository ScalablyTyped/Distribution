package typings.inboxsdk.mod.ButterBar

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageButtonDescriptor extends StObject {
  
  def onClick(event: js.Any): Unit
  
  var title: String
}
object MessageButtonDescriptor {
  
  @scala.inline
  def apply(onClick: js.Any => Unit, title: String): MessageButtonDescriptor = {
    val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction1(onClick), title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageButtonDescriptor]
  }
  
  @scala.inline
  implicit class MessageButtonDescriptorMutableBuilder[Self <: MessageButtonDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnClick(value: js.Any => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
