package typings.kosDashCore

import typings.react.reactMod.ComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object kosDashCoreMod {
  type GetKosState[T] = js.Function0[T]
  type KosDispatch = js.Function1[/* action */ Action[js.Any], Unit]
  type ReactComponent[P, S] = ComponentClass[P, S]
}
