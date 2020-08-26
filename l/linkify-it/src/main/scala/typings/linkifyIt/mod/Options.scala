package typings.linkifyIt.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var fuzzyEmail: js.UndefOr[Boolean] = js.native
  var fuzzyIP: js.UndefOr[Boolean] = js.native
  var fuzzyLink: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setFuzzyEmail(value: Boolean): Self = this.set("fuzzyEmail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFuzzyEmail: Self = this.set("fuzzyEmail", js.undefined)
    @scala.inline
    def setFuzzyIP(value: Boolean): Self = this.set("fuzzyIP", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFuzzyIP: Self = this.set("fuzzyIP", js.undefined)
    @scala.inline
    def setFuzzyLink(value: Boolean): Self = this.set("fuzzyLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFuzzyLink: Self = this.set("fuzzyLink", js.undefined)
  }
  
}

