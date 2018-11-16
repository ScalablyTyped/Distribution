package typings
package graphqlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jsutilsMaybePromiseMod {
  type MaybePromise[T] = stdLib.Promise[T] | T
}
