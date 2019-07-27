package typings
package jasmineLib.jasmineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsymmetricMatcher
  extends _Expected[js.Any]
     with _ExpectedRecursive[js.Any] {
  var jasmineToString: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  def asymmetricMatch(other: js.Any): scala.Boolean
}

object AsymmetricMatcher {
  @scala.inline
  def apply(asymmetricMatch: js.Any => scala.Boolean, jasmineToString: () => java.lang.String = null): AsymmetricMatcher = {
    val __obj = js.Dynamic.literal(asymmetricMatch = js.Any.fromFunction1(asymmetricMatch))
    if (jasmineToString != null) __obj.updateDynamic("jasmineToString")(js.Any.fromFunction0(jasmineToString))
    __obj.asInstanceOf[AsymmetricMatcher]
  }
}

