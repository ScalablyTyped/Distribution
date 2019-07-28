package typings.jasmine.jasmineNs

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectContaining[T]
  extends _Expected[T]
     with _ExpectedRecursive[T] {
  var jasmineToString: js.UndefOr[js.Function0[String]] = js.undefined
  var `new`: js.UndefOr[js.Function1[/* sample */ Partial[T], Partial[T]]] = js.undefined
  def jasmineMatches(other: js.Any, mismatchKeys: js.Array[_], mismatchValues: js.Array[_]): Boolean
}

object ObjectContaining {
  @scala.inline
  def apply[T](
    jasmineMatches: (js.Any, js.Array[_], js.Array[_]) => Boolean,
    jasmineToString: () => String = null,
    `new`: /* sample */ Partial[T] => Partial[T] = null
  ): ObjectContaining[T] = {
    val __obj = js.Dynamic.literal(jasmineMatches = js.Any.fromFunction3(jasmineMatches))
    if (jasmineToString != null) __obj.updateDynamic("jasmineToString")(js.Any.fromFunction0(jasmineToString))
    if (`new` != null) __obj.updateDynamic("new")(js.Any.fromFunction1(`new`))
    __obj.asInstanceOf[ObjectContaining[T]]
  }
}

