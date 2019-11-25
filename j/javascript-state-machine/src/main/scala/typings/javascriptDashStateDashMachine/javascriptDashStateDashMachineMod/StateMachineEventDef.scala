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
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StateMachineEventDef]
  }
}

