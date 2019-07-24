package typings
package jasmineLib.jasmineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectContaining[T] extends _Expected[T] {
  var jasmineToString: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  var `new`: js.UndefOr[js.Function1[/* sample */ stdLib.Partial[T], stdLib.Partial[T]]] = js.undefined
  def jasmineMatches(other: js.Any, mismatchKeys: js.Array[_], mismatchValues: js.Array[_]): scala.Boolean
}

object ObjectContaining {
  @scala.inline
  def apply[T](
    jasmineMatches: (js.Any, js.Array[_], js.Array[_]) => scala.Boolean,
    jasmineToString: () => java.lang.String = null,
    `new`: /* sample */ stdLib.Partial[T] => stdLib.Partial[T] = null
  ): ObjectContaining[T] = {
    val __obj = js.Dynamic.literal(jasmineMatches = js.Any.fromFunction3(jasmineMatches))
    if (jasmineToString != null) __obj.updateDynamic("jasmineToString")(js.Any.fromFunction0(jasmineToString))
    if (`new` != null) __obj.updateDynamic("new")(js.Any.fromFunction1(`new`))
    __obj.asInstanceOf[ObjectContaining[T]]
  }
}

