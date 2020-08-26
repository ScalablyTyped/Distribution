package typings.jestMatcherUtils.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MatcherHintOptions extends js.Object {
  var comment: js.UndefOr[String] = js.native
  var expectedColor: js.UndefOr[MatcherHintColor] = js.native
  var isDirectExpectCall: js.UndefOr[Boolean] = js.native
  var isNot: js.UndefOr[Boolean] = js.native
  var promise: js.UndefOr[String] = js.native
  var receivedColor: js.UndefOr[MatcherHintColor] = js.native
  var secondArgument: js.UndefOr[String] = js.native
  var secondArgumentColor: js.UndefOr[MatcherHintColor] = js.native
}

object MatcherHintOptions {
  @scala.inline
  def apply(): MatcherHintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatcherHintOptions]
  }
  @scala.inline
  implicit class MatcherHintOptionsOps[Self <: MatcherHintOptions] (val x: Self) extends AnyVal {
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
    def setComment(value: String): Self = this.set("comment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComment: Self = this.set("comment", js.undefined)
    @scala.inline
    def setExpectedColor(value: /* arg */ String => String): Self = this.set("expectedColor", js.Any.fromFunction1(value))
    @scala.inline
    def deleteExpectedColor: Self = this.set("expectedColor", js.undefined)
    @scala.inline
    def setIsDirectExpectCall(value: Boolean): Self = this.set("isDirectExpectCall", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsDirectExpectCall: Self = this.set("isDirectExpectCall", js.undefined)
    @scala.inline
    def setIsNot(value: Boolean): Self = this.set("isNot", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsNot: Self = this.set("isNot", js.undefined)
    @scala.inline
    def setPromise(value: String): Self = this.set("promise", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePromise: Self = this.set("promise", js.undefined)
    @scala.inline
    def setReceivedColor(value: /* arg */ String => String): Self = this.set("receivedColor", js.Any.fromFunction1(value))
    @scala.inline
    def deleteReceivedColor: Self = this.set("receivedColor", js.undefined)
    @scala.inline
    def setSecondArgument(value: String): Self = this.set("secondArgument", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecondArgument: Self = this.set("secondArgument", js.undefined)
    @scala.inline
    def setSecondArgumentColor(value: /* arg */ String => String): Self = this.set("secondArgumentColor", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSecondArgumentColor: Self = this.set("secondArgumentColor", js.undefined)
  }
  
}

