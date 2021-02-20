package typings.knockback.Knockback

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventWatcherOptions extends StObject {
  
  def emitter(newEmitter: js.Any): Unit = js.native
  
  var event_selector: String = js.native
  
  var key: js.UndefOr[String] = js.native
  
  def update(newValue: js.Any): Unit = js.native
}
object EventWatcherOptions {
  
  @scala.inline
  def apply(emitter: js.Any => Unit, event_selector: String, update: js.Any => Unit): EventWatcherOptions = {
    val __obj = js.Dynamic.literal(emitter = js.Any.fromFunction1(emitter), event_selector = event_selector.asInstanceOf[js.Any], update = js.Any.fromFunction1(update))
    __obj.asInstanceOf[EventWatcherOptions]
  }
  
  @scala.inline
  implicit class EventWatcherOptionsMutableBuilder[Self <: EventWatcherOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmitter(value: js.Any => Unit): Self = StObject.set(x, "emitter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEvent_selector(value: String): Self = StObject.set(x, "event_selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setUpdate(value: js.Any => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
  }
}
