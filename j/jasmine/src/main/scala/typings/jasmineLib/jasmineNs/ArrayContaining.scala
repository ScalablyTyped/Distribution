package typings
package jasmineLib.jasmineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArrayContaining[T] extends AsymmetricMatcher {
  var `new`: js.UndefOr[js.Function1[/* sample */ ArrayLike[T], ArrayLike[T]]] = js.undefined
}

object ArrayContaining {
  @scala.inline
  def apply[T](
    asymmetricMatch: js.Any => scala.Boolean,
    jasmineToString: () => java.lang.String = null,
    `new`: /* sample */ ArrayLike[T] => ArrayLike[T] = null
  ): ArrayContaining[T] = {
    val __obj = js.Dynamic.literal(asymmetricMatch = js.Any.fromFunction1(asymmetricMatch))
    if (jasmineToString != null) __obj.updateDynamic("jasmineToString")(js.Any.fromFunction0(jasmineToString))
    if (`new` != null) __obj.updateDynamic("new")(js.Any.fromFunction1(`new`))
    __obj.asInstanceOf[ArrayContaining[T]]
  }
}

