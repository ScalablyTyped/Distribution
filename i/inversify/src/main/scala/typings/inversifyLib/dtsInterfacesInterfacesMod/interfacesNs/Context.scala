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

