package typings.jasmine.jasmine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsymmetricMatcher[TValue] extends js.Object {
  var jasmineToString: js.UndefOr[js.Function0[String]] = js.native
  def asymmetricMatch(other: TValue, customTesters: js.Array[CustomEqualityTester]): Boolean = js.native
}

object AsymmetricMatcher {
  @scala.inline
  def apply[TValue](asymmetricMatch: (TValue, js.Array[CustomEqualityTester]) => Boolean): AsymmetricMatcher[TValue] = {
    val __obj = js.Dynamic.literal(asymmetricMatch = js.Any.fromFunction2(asymmetricMatch))
    __obj.asInstanceOf[AsymmetricMatcher[TValue]]
  }
  @scala.inline
  implicit class AsymmetricMatcherOps[Self <: AsymmetricMatcher[_], TValue] (val x: Self with AsymmetricMatcher[TValue]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAsymmetricMatch(value: (TValue, js.Array[CustomEqualityTester]) => Boolean): Self = this.set("asymmetricMatch", js.Any.fromFunction2(value))
    @scala.inline
    def setJasmineToString(value: () => String): Self = this.set("jasmineToString", js.Any.fromFunction0(value))
    @scala.inline
    def deleteJasmineToString: Self = this.set("jasmineToString", js.undefined)
  }
  
}

