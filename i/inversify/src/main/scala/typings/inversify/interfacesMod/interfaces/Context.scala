package typings.inversify.interfacesMod.interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Context extends js.Object {
  
  def addPlan(plan: Plan): Unit = js.native
  
  var container: Container = js.native
  
  var currentRequest: Request = js.native
  
  var id: Double = js.native
  
  var plan: Plan = js.native
  
  def setCurrentRequest(request: Request): Unit = js.native
}
object Context {
  
  @scala.inline
  def apply(
    addPlan: Plan => Unit,
    container: Container,
    currentRequest: Request,
    id: Double,
    plan: Plan,
    setCurrentRequest: Request => Unit
  ): Context = {
    val __obj = js.Dynamic.literal(addPlan = js.Any.fromFunction1(addPlan), container = container.asInstanceOf[js.Any], currentRequest = currentRequest.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], plan = plan.asInstanceOf[js.Any], setCurrentRequest = js.Any.fromFunction1(setCurrentRequest))
    __obj.asInstanceOf[Context]
  }
  
  @scala.inline
  implicit class ContextOps[Self <: Context] (val x: Self) extends AnyVal {
    
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
    def setAddPlan(value: Plan => Unit): Self = this.set("addPlan", js.Any.fromFunction1(value))
    
    @scala.inline
    def setContainer(value: Container): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentRequest(value: Request): Self = this.set("currentRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlan(value: Plan): Self = this.set("plan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetCurrentRequest(value: Request => Unit): Self = this.set("setCurrentRequest", js.Any.fromFunction1(value))
  }
}
