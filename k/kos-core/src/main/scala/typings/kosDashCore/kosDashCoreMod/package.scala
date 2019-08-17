package typings.kosDashCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object kosDashCoreMod {
  import typings.react.reactMod.ComponentClass

  type GetKosState[T] = js.Function0[T]
  type KosDispatch = js.Function1[/* action */ Action[js.Any], Unit]
  type ReactComponent[P, S] = ComponentClass[P, S]
}
