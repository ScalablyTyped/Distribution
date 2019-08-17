package typings.loopback

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object loopbackMod {
  import typings.std.Error

  type CallbackWithMultipleResults[T, G] = js.Function3[/* err */ Error | Null, /* arg0 */ T, /* arg1 */ G, js.Any]
  type CallbackWithResult[T] = js.Function2[/* err */ Error | Null, /* result */ T, js.Any]
  /**
    * General type for a callback to an async function.
    */
  type CallbackWithoutResult = js.Function1[/* err */ Error | Null, js.Any]
}
