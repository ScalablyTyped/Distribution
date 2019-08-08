package typings.jasmine.jasmineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsymmetricMatcher[T /* <: String */] extends js.Object {
  var jasmineToString: js.UndefOr[js.Function0[T]] = js.undefined
  def asymmetricMatch(other: js.Any): Boolean
}

object AsymmetricMatcher {
  @scala.inline
  def apply[T /* <: String */](asymmetricMatch: js.Any => Boolean, jasmineToString: () => T = null): AsymmetricMatcher[T] = {
    val __obj = js.Dynamic.literal(asymmetricMatch = js.Any.fromFunction1(asymmetricMatch))
    if (jasmineToString != null) __obj.updateDynamic("jasmineToString")(js.Any.fromFunction0(jasmineToString))
    __obj.asInstanceOf[AsymmetricMatcher[T]]
  }
}

