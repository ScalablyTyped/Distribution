package typings

import typings.std.KeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object keymaster {
  type KeyHandler = js.Function2[/* keyboardEvent */ KeyboardEvent, /* keymasterEvent */ KeymasterEvent, Unit]
}
