package typings
package javascriptDashStateDashMachineLib.javascriptDashStateDashMachineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateMachineEventDef extends js.Object {
  var from: js.Any
  var name: java.lang.String
      // string or string[]
  var to: java.lang.String
}

object StateMachineEventDef {
  @scala.inline
  def apply(from: js.Any, name: java.lang.String, to: java.lang.String): StateMachineEventDef = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("from")(from)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("to")(to)
    __obj.asInstanceOf[StateMachineEventDef]
  }
}

