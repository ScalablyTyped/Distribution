package typings
package historyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object createTransitionManagerMod {
  type Prompt = PromptFunction | scala.Boolean
  type PromptFunction = js.Function2[
    /* location */ historyLib.historyMod.Location[historyLib.historyMod.LocationState], 
    /* action */ historyLib.historyMod.Action, 
    js.Any
  ]
}
