package typings.knockback.Knockback

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventWatcherOptions extends StObject {
  
  def emitter(newEmitter: js.Any): Unit
  
  var event_selector: String
  
  var key: js.UndefOr[String] = js.undefined
  
  def update(newValue: js.Any): Unit
}
object EventWatcherOptions {
  
  inline def apply(emitter: js.Any => Unit, event_selector: String, update: js.Any => Unit): EventWatcherOptions = {
    val __obj = js.Dynamic.literal(emitter = js.Any.fromFunction1(emitter), event_selector = event_selector.asInstanceOf[js.Any], update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[EventWatcherOptions]
  }
  
  extension [Self <: EventWatcherOptions](x: Self) {
    
    inline def setEmitter(value: js.Any => Unit): Self = StObject.set(x, "emitter", js.Any.fromFunction1(value))
    
    inline def setEvent_selector(value: String): Self = StObject.set(x, "event_selector", value.asInstanceOf[js.Any])
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setUpdate(value: js.Any => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
  }
}
