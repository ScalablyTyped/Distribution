package typings.history

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object createTransitionManagerMod {
  import typings.history.historyMod.Action
  import typings.history.historyMod.Location
  import typings.history.historyMod.LocationState

  type Prompt = PromptFunction | Boolean
  type PromptFunction = js.Function2[/* location */ Location[LocationState], /* action */ Action, js.Any]
}
