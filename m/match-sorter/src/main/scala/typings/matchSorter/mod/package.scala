package typings.matchSorter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ExtendedKeyOptions[T] = typings.matchSorter.AnonKey[T] with (typings.matchSorter.AnonMinRanking | typings.matchSorter.AnonMaxRanking | typings.matchSorter.AnonThreshold)
  type KeyOptions[T] = java.lang.String | (js.Function1[/* item */ T, java.lang.String | js.Array[java.lang.String]])
}
