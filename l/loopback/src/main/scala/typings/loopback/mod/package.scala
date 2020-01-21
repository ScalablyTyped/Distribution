package typings.loopback

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CallbackWithMultipleResults[T, G] = js.Function3[/* err */ typings.std.Error | scala.Null, /* arg0 */ T, /* arg1 */ G, js.Any]
  type CallbackWithResult[T] = js.Function2[/* err */ typings.std.Error | scala.Null, /* result */ T, js.Any]
  /**
    * General type for a callback to an async function.
    */
  type CallbackWithoutResult = js.Function1[/* err */ typings.std.Error | scala.Null, js.Any]
}
