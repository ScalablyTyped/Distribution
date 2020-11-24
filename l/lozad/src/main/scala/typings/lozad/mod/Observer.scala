package typings.lozad.mod

import typings.std.Element
import typings.std.IntersectionObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Observer extends js.Object {
  
  def observe(): Unit = js.native
  
  var observer: IntersectionObserver = js.native
  
  def triggerLoad(element: Element): Unit = js.native
}
object Observer {
  
  @scala.inline
  def apply(observe: () => Unit, observer: IntersectionObserver, triggerLoad: Element => Unit): Observer = {
    val __obj = js.Dynamic.literal(observe = js.Any.fromFunction0(observe), observer = observer.asInstanceOf[js.Any], triggerLoad = js.Any.fromFunction1(triggerLoad))
    __obj.asInstanceOf[Observer]
  }
  
  @scala.inline
  implicit class ObserverOps[Self <: Observer] (val x: Self) extends AnyVal {
    
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
    def setObserve(value: () => Unit): Self = this.set("observe", js.Any.fromFunction0(value))
    
    @scala.inline
    def setObserver(value: IntersectionObserver): Self = this.set("observer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerLoad(value: Element => Unit): Self = this.set("triggerLoad", js.Any.fromFunction1(value))
  }
}
