package typings.jasmine.jasmine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsymmetricMatcher[TValue] extends js.Object {
  var jasmineToString: js.UndefOr[js.Function0[String]] = js.undefined
  def asymmetricMatch(other: TValue, customTesters: js.Array[CustomEqualityTester]): Boolean
}

object AsymmetricMatcher {
  @scala.inline
  def apply[TValue](
    asymmetricMatch: (TValue, js.Array[CustomEqualityTester]) => Boolean,
    jasmineToString: () => String = null
  ): AsymmetricMatcher[TValue] = {
    val __obj = js.Dynamic.literal(asymmetricMatch = js.Any.fromFunction2(asymmetricMatch))
    if (jasmineToString != null) __obj.updateDynamic("jasmineToString")(js.Any.fromFunction0(jasmineToString))
    __obj.asInstanceOf[AsymmetricMatcher[TValue]]
  }
}

