package typings.jasmineJquery.jasmine

import typings.jquery.JQueryEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQueryEventSpy extends js.Object {
  
  var eventName: String = js.native
  
  def handler(eventObject: JQueryEventObject): js.Any = js.native
  
  def reset(): js.Any = js.native
  
  var selector: String = js.native
}
object JQueryEventSpy {
  
  @scala.inline
  def apply(eventName: String, handler: JQueryEventObject => js.Any, reset: () => js.Any, selector: String): JQueryEventSpy = {
    val __obj = js.Dynamic.literal(eventName = eventName.asInstanceOf[js.Any], handler = js.Any.fromFunction1(handler), reset = js.Any.fromFunction0(reset), selector = selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryEventSpy]
  }
  
  @scala.inline
  implicit class JQueryEventSpyOps[Self <: JQueryEventSpy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEventName(value: String): Self = this.set("eventName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHandler(value: JQueryEventObject => js.Any): Self = this.set("handler", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReset(value: () => js.Any): Self = this.set("reset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSelector(value: String): Self = this.set("selector", value.asInstanceOf[js.Any])
  }
}
