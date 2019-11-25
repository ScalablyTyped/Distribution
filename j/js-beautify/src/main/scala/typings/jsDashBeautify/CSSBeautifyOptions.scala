package typings.jsDashBeautify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CSSBeautifyOptions extends js.Object {
  var end_with_newline: js.UndefOr[Boolean] = js.undefined
  var eol: js.UndefOr[String] = js.undefined
  var indent_char: js.UndefOr[String] = js.undefined
  var indent_size: js.UndefOr[Double] = js.undefined
  var indent_with_tabs: js.UndefOr[Boolean] = js.undefined
  var newline_between_rules: js.UndefOr[Boolean] = js.undefined
  var selector_separator_newline: js.UndefOr[Boolean] = js.undefined
}

object CSSBeautifyOptions {
  @scala.inline
  def apply(
    end_with_newline: js.UndefOr[Boolean] = js.undefined,
    eol: String = null,
    indent_char: String = null,
    indent_size: Int | Double = null,
    indent_with_tabs: js.UndefOr[Boolean] = js.undefined,
    newline_between_rules: js.UndefOr[Boolean] = js.undefined,
    selector_separator_newline: js.UndefOr[Boolean] = js.undefined
  ): CSSBeautifyOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(end_with_newline)) __obj.updateDynamic("end_with_newline")(end_with_newline.asInstanceOf[js.Any])
    if (eol != null) __obj.updateDynamic("eol")(eol.asInstanceOf[js.Any])
    if (indent_char != null) __obj.updateDynamic("indent_char")(indent_char.asInstanceOf[js.Any])
    if (indent_size != null) __obj.updateDynamic("indent_size")(indent_size.asInstanceOf[js.Any])
    if (!js.isUndefined(indent_with_tabs)) __obj.updateDynamic("indent_with_tabs")(indent_with_tabs.asInstanceOf[js.Any])
    if (!js.isUndefined(newline_between_rules)) __obj.updateDynamic("newline_between_rules")(newline_between_rules.asInstanceOf[js.Any])
    if (!js.isUndefined(selector_separator_newline)) __obj.updateDynamic("selector_separator_newline")(selector_separator_newline.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSSBeautifyOptions]
  }
}

