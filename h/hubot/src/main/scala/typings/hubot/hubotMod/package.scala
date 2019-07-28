package typings.hubot

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object hubotMod {
  type ListenerCallback[R] = js.Function1[/* response */ Response[R], Unit]
}
