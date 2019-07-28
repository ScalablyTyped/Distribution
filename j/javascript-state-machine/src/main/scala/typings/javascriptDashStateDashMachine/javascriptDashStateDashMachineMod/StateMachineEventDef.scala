package typings.javascriptDashStateDashMachine.javascriptDashStateDashMachineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateMachineEventDef extends js.Object {
  var from: js.Any
  var name: String
      // string or string[]
  var to: String
}

object StateMachineEventDef {
  @scala.inline
  def apply(from: js.Any, name: String, to: String): StateMachineEventDef = {
    val __obj = js.Dynamic.literal(from = from, name = name, to = to)
  
    __obj.asInstanceOf[StateMachineEventDef]
  }
}

