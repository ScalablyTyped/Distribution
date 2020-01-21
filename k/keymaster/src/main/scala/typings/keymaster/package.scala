package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object keymaster {
  type KeyHandler = js.Function2[
    /* keyboardEvent */ typings.std.KeyboardEvent, 
    /* keymasterEvent */ typings.keymaster.KeymasterEvent, 
    scala.Unit
  ]
}
