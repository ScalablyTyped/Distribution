package typings
package ixDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object IxNs {
  type Comparer[TFirst, TSecond] = js.Function2[/* item1 */ TFirst, /* item2 */ TSecond, scala.Double]
  type EnumerableFunc[T, TResult] = js.Function3[/* item */ T, /* index */ scala.Double, /* self */ Enumerable[T], TResult]
  type EnumerablePredicate[T] = EnumerableFunc[T, scala.Boolean]
  type EqualityComparer[TFirst, TSecond] = js.Function2[/* item1 */ TFirst, /* item2 */ TSecond, scala.Boolean]
  type Predicate[T] = js.Function1[/* item */ T, scala.Boolean]
}
