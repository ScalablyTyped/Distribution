package typings.iitc.hooksMod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventMapDataEntityInject extends js.Object {
  
  def callback(ents: js.Any): Unit = js.native
}
object EventMapDataEntityInject {
  
  @scala.inline
  def apply(callback: js.Any => Unit): EventMapDataEntityInject = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback))
    __obj.asInstanceOf[EventMapDataEntityInject]
  }
  
  @scala.inline
  implicit class EventMapDataEntityInjectOps[Self <: EventMapDataEntityInject] (val x: Self) extends AnyVal {
    
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
    def setCallback(value: js.Any => Unit): Self = this.set("callback", js.Any.fromFunction1(value))
  }
}
