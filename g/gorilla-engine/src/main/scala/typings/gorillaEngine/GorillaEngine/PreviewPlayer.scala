package typings.gorillaEngine.GorillaEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreviewPlayer extends StObject {
  
  def on(eventName: String, callback: Any): Unit
}
object PreviewPlayer {
  
  inline def apply(on: (String, Any) => Unit): PreviewPlayer = {
    val __obj = js.Dynamic.literal(on = js.Any.fromFunction2(on))
    __obj.asInstanceOf[PreviewPlayer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PreviewPlayer] (val x: Self) extends AnyVal {
    
    inline def setOn(value: (String, Any) => Unit): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
  }
}
