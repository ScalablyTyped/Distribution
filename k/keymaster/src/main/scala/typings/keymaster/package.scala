package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object keymaster {
  import typings.std.KeyboardEvent

  type KeyHandler = js.Function2[/* keyboardEvent */ KeyboardEvent, /* keymasterEvent */ KeymasterEvent, Unit]
}
