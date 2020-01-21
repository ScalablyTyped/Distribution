package typings.ixJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Ix {
  type Comparer[TFirst, TSecond] = js.Function2[/* item1 */ TFirst, /* item2 */ TSecond, scala.Double]
  type EnumerableFunc[T, TResult] = js.Function3[
    /* item */ T, 
    /* index */ scala.Double, 
    /* self */ typings.ixJs.Ix.Enumerable[T], 
    TResult
  ]
  type EnumerablePredicate[T] = typings.ixJs.Ix.EnumerableFunc[T, scala.Boolean]
  type EqualityComparer[TFirst, TSecond] = js.Function2[/* item1 */ TFirst, /* item2 */ TSecond, scala.Boolean]
  type Predicate[T] = js.Function1[/* item */ T, scala.Boolean]
}
