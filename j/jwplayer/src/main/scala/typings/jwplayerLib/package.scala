package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jwplayerLib {
  type EventCallback[T /* <: CallbackParam */] = js.Function1[/* param */ T, scala.Unit]
}
