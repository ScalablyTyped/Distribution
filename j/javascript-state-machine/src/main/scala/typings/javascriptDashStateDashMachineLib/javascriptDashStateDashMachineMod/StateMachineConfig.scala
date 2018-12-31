package typings
package javascriptDashStateDashMachineLib.javascriptDashStateDashMachineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateMachineConfig extends js.Object {
  var callbacks: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[
      js.Function4[
        /* event */ js.UndefOr[java.lang.String], 
        /* from */ js.UndefOr[java.lang.String], 
        /* to */ js.UndefOr[java.lang.String], 
        /* repeated */ js.Any, 
        _
      ]
    ]
  ] = js.undefined
  var error: js.UndefOr[StateMachineErrorCallback] = js.undefined
   // string or { state: 'foo', event: 'setup', defer: true|false }
  var events: js.UndefOr[js.Array[StateMachineEventDef]] = js.undefined
  var initial: js.UndefOr[js.Any] = js.undefined
  var target: js.UndefOr[StateMachine] = js.undefined
}

