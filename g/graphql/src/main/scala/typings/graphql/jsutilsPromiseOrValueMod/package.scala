package typings.graphql

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jsutilsPromiseOrValueMod {
  type PromiseOrValue[T] = js.Promise[T] | T
}
