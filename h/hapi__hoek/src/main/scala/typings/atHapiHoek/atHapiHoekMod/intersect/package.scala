package typings.atHapiHoek.atHapiHoekMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object intersect {
  import typings.std.ArrayLike
  import typings.std.Set

  type Array[T] = ArrayLike[T] | Set[T] | Null
}
