package typings.inboxsdk.mod.ButterBar

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageButtonDescriptor extends StObject {
  
  def onClick(event: Any): Unit
  
  var title: String
}
object MessageButtonDescriptor {
  
  inline def apply(onClick: Any => Unit, title: String): MessageButtonDescriptor = {
    val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction1(onClick), title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageButtonDescriptor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MessageButtonDescriptor] (val x: Self) extends AnyVal {
    
    inline def setOnClick(value: Any => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
