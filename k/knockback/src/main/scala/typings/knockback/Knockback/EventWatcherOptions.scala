package typings.knockback.Knockback

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventWatcherOptions extends StObject {
  
  def emitter(newEmitter: Any): Unit
  
  var event_selector: String
  
  var key: js.UndefOr[String] = js.undefined
  
  def update(newValue: Any): Unit
}
object EventWatcherOptions {
  
  inline def apply(emitter: Any => Unit, event_selector: String, update: Any => Unit): EventWatcherOptions = {
    val __obj = js.Dynamic.literal(emitter = js.Any.fromFunction1(emitter), event_selector = event_selector.asInstanceOf[js.Any], update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[EventWatcherOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventWatcherOptions] (val x: Self) extends AnyVal {
    
    inline def setEmitter(value: Any => Unit): Self = StObject.set(x, "emitter", js.Any.fromFunction1(value))
    
    inline def setEvent_selector(value: String): Self = StObject.set(x, "event_selector", value.asInstanceOf[js.Any])
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setUpdate(value: Any => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
  }
}
