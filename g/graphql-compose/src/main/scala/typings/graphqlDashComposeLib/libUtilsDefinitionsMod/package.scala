package typings
package graphqlDashComposeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libUtilsDefinitionsMod {
  type MaybePromise[T] = js.Promise[T] | T
  type Thunk[T] = js.Function0[T] | T
}
