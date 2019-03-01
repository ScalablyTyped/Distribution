package typings
package inversifyLib.dtsInterfacesInterfacesMod.interfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context extends js.Object {
  var container: Container
  var currentRequest: Request
  var id: scala.Double
  var plan: Plan
  def addPlan(plan: Plan): scala.Unit
  def setCurrentRequest(request: Request): scala.Unit
}

object Context {
  @scala.inline
  def apply(
    addPlan: js.Function1[Plan, scala.Unit],
    container: Container,
    currentRequest: Request,
    id: scala.Double,
    plan: Plan,
    setCurrentRequest: js.Function1[Request, scala.Unit]
  ): Context = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addPlan")(addPlan)
    __obj.updateDynamic("container")(container)
    __obj.updateDynamic("currentRequest")(currentRequest)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("plan")(plan)
    __obj.updateDynamic("setCurrentRequest")(setCurrentRequest)
    __obj.asInstanceOf[Context]
  }
}

