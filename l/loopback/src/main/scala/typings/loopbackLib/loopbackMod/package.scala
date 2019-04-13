package typings
package loopbackLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object loopbackMod {
  type CallbackWithMultipleResults[T, G] = js.Function3[/* err */ stdLib.Error | scala.Null, /* arg0 */ T, /* arg1 */ G, js.Any]
  type CallbackWithResult[T] = js.Function2[/* err */ stdLib.Error | scala.Null, /* result */ T, js.Any]
  /**
    * General type for a callback to an async function.
    */
  type CallbackWithoutResult = js.Function1[/* err */ stdLib.Error | scala.Null, js.Any]
}
