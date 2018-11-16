package typings
package loopbackLib.loopbackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object lNs {
  type CallbackWithMultipleResults[T, G] = js.Function3[/* err */ nodeLib.Error | scala.Null, /* arg0 */ T, /* arg1 */ G, js.Any]
  type CallbackWithResult[T] = js.Function2[/* err */ nodeLib.Error | scala.Null, /* result */ T, js.Any]
  /**
         * General type for a callback to an async function.
         */
  type CallbackWithoutResult = js.Function1[/* err */ nodeLib.Error | scala.Null, js.Any]
  /**
         * The Role model
         * @class Role
         * @inherits {PersistedModel}
         * @header Role objec
         */
  type Role = PersistedModel
}
