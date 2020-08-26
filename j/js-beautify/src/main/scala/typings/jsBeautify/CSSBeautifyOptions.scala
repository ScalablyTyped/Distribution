package typings.jsBeautify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CSSBeautifyOptions extends CoreBeautifyOptions {
  var newline_between_rules: js.UndefOr[Boolean] = js.native
  var selector_separator_newline: js.UndefOr[Boolean] = js.native
  var space_around_combinator: js.UndefOr[Boolean] = js.native
  var space_around_selector_separator: js.UndefOr[Boolean] = js.native
}

object CSSBeautifyOptions {
  @scala.inline
  def apply(): CSSBeautifyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CSSBeautifyOptions]
  }
  @scala.inline
  implicit class CSSBeautifyOptionsOps[Self <: CSSBeautifyOptions] (val x: Self) extends AnyVal {
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
    def setNewline_between_rules(value: Boolean): Self = this.set("newline_between_rules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewline_between_rules: Self = this.set("newline_between_rules", js.undefined)
    @scala.inline
    def setSelector_separator_newline(value: Boolean): Self = this.set("selector_separator_newline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelector_separator_newline: Self = this.set("selector_separator_newline", js.undefined)
    @scala.inline
    def setSpace_around_combinator(value: Boolean): Self = this.set("space_around_combinator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpace_around_combinator: Self = this.set("space_around_combinator", js.undefined)
    @scala.inline
    def setSpace_around_selector_separator(value: Boolean): Self = this.set("space_around_selector_separator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpace_around_selector_separator: Self = this.set("space_around_selector_separator", js.undefined)
  }
  
}

