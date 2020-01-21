package typings.inversify.interfacesMod.interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context extends js.Object {
  var container: Container
  var currentRequest: Request
  var id: Double
  var plan: Plan
  def addPlan(plan: Plan): Unit
  def setCurrentRequest(request: Request): Unit
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
}

