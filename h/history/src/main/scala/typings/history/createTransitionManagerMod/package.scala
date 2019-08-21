package typings.history

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object createTransitionManagerMod {
  import typings.history.historyMod.Action
  import typings.history.historyMod.Location

  type Prompt[S] = PromptFunction[S] | Boolean
  type PromptFunction[S] = js.Function2[/* location */ Location[S], /* action */ Action, js.Any]
}
