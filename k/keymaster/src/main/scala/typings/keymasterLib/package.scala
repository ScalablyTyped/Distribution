package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object keymasterLib {
  type KeyHandler = js.Function2[
    /* keyboardEvent */ stdLib.KeyboardEvent, 
    /* keymasterEvent */ KeymasterEvent, 
    scala.Unit
  ]
}
