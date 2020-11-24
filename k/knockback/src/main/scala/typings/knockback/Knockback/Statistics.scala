package typings.knockback.Knockback

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Statistics extends js.Object {
  
  def addModelEvent(event: String): js.Any = js.native
  
  def clear(): js.Any = js.native
  
  def modelEventsStatsString(): js.Any = js.native
  
  def register(key: String, obj: js.Any): js.Any = js.native
  
  def registeredCount(`type`: js.Any): Double = js.native
  
  def registeredStatsString(success_message: String): String = js.native
  
  def unregister(key: String, obj: js.Any): js.Any = js.native
}
object Statistics {
  
  @scala.inline
  def apply(
    addModelEvent: String => js.Any,
    clear: () => js.Any,
    modelEventsStatsString: () => js.Any,
    register: (String, js.Any) => js.Any,
    registeredCount: js.Any => Double,
    registeredStatsString: String => String,
    unregister: (String, js.Any) => js.Any
  ): Statistics = {
    val __obj = js.Dynamic.literal(addModelEvent = js.Any.fromFunction1(addModelEvent), clear = js.Any.fromFunction0(clear), modelEventsStatsString = js.Any.fromFunction0(modelEventsStatsString), register = js.Any.fromFunction2(register), registeredCount = js.Any.fromFunction1(registeredCount), registeredStatsString = js.Any.fromFunction1(registeredStatsString), unregister = js.Any.fromFunction2(unregister))
    __obj.asInstanceOf[Statistics]
  }
  
  @scala.inline
  implicit class StatisticsOps[Self <: Statistics] (val x: Self) extends AnyVal {
    
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
    def setAddModelEvent(value: String => js.Any): Self = this.set("addModelEvent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClear(value: () => js.Any): Self = this.set("clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setModelEventsStatsString(value: () => js.Any): Self = this.set("modelEventsStatsString", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRegister(value: (String, js.Any) => js.Any): Self = this.set("register", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRegisteredCount(value: js.Any => Double): Self = this.set("registeredCount", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRegisteredStatsString(value: String => String): Self = this.set("registeredStatsString", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUnregister(value: (String, js.Any) => js.Any): Self = this.set("unregister", js.Any.fromFunction2(value))
  }
}
