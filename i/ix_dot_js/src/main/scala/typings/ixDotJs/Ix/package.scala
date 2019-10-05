package typings.ixDotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Ix {
  type Comparer[TFirst, TSecond] = js.Function2[/* item1 */ TFirst, /* item2 */ TSecond, Double]
  type EnumerableFunc[T, TResult] = js.Function3[/* item */ T, /* index */ Double, /* self */ Enumerable[T], TResult]
  type EnumerablePredicate[T] = EnumerableFunc[T, Boolean]
  type EqualityComparer[TFirst, TSecond] = js.Function2[/* item1 */ TFirst, /* item2 */ TSecond, Boolean]
  type Predicate[T] = js.Function1[/* item */ T, Boolean]
}
