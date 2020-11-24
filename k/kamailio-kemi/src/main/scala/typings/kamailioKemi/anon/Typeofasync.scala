package typings.kamailioKemi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofasync extends js.Object {
  
  def route(rn: String, s: Double): Double = js.native
  
  def task_route(rn: String): Double = js.native
}
object Typeofasync {
  
  @scala.inline
  def apply(route: (String, Double) => Double, task_route: String => Double): Typeofasync = {
    val __obj = js.Dynamic.literal(route = js.Any.fromFunction2(route), task_route = js.Any.fromFunction1(task_route))
    __obj.asInstanceOf[Typeofasync]
  }
  
  @scala.inline
  implicit class TypeofasyncOps[Self <: Typeofasync] (val x: Self) extends AnyVal {
    
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
    def setRoute(value: (String, Double) => Double): Self = this.set("route", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTask_route(value: String => Double): Self = this.set("task_route", js.Any.fromFunction1(value))
  }
}
