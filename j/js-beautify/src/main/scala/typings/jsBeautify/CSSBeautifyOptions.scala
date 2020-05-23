package typings.jsBeautify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CSSBeautifyOptions extends CoreBeautifyOptions {
  var newline_between_rules: js.UndefOr[Boolean] = js.undefined
  var selector_separator_newline: js.UndefOr[Boolean] = js.undefined
  var space_around_combinator: js.UndefOr[Boolean] = js.undefined
  var space_around_selector_separator: js.UndefOr[Boolean] = js.undefined
}

object CSSBeautifyOptions {
  @scala.inline
  def apply(
    disabled: js.UndefOr[Boolean] = js.undefined,
    end_with_newline: js.UndefOr[Boolean] = js.undefined,
    eol: String = null,
    indent_char: String = null,
    indent_empty_lines: js.UndefOr[Boolean] = js.undefined,
    indent_level: js.UndefOr[Double] = js.undefined,
    indent_size: js.UndefOr[Double] = js.undefined,
    indent_with_tabs: js.UndefOr[Boolean] = js.undefined,
    max_preserve_newlines: js.UndefOr[Double] = js.undefined,
    newline_between_rules: js.UndefOr[Boolean] = js.undefined,
    preserve_newlines: js.UndefOr[Boolean] = js.undefined,
    selector_separator_newline: js.UndefOr[Boolean] = js.undefined,
    space_around_combinator: js.UndefOr[Boolean] = js.undefined,
    space_around_selector_separator: js.UndefOr[Boolean] = js.undefined,
    templating: js.Array[String] = null,
    wrap_line_length: js.UndefOr[Double] = js.undefined
  ): CSSBeautifyOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(end_with_newline)) __obj.updateDynamic("end_with_newline")(end_with_newline.get.asInstanceOf[js.Any])
    if (eol != null) __obj.updateDynamic("eol")(eol.asInstanceOf[js.Any])
    if (indent_char != null) __obj.updateDynamic("indent_char")(indent_char.asInstanceOf[js.Any])
    if (!js.isUndefined(indent_empty_lines)) __obj.updateDynamic("indent_empty_lines")(indent_empty_lines.get.asInstanceOf[js.Any])
    if (!js.isUndefined(indent_level)) __obj.updateDynamic("indent_level")(indent_level.get.asInstanceOf[js.Any])
    if (!js.isUndefined(indent_size)) __obj.updateDynamic("indent_size")(indent_size.get.asInstanceOf[js.Any])
    if (!js.isUndefined(indent_with_tabs)) __obj.updateDynamic("indent_with_tabs")(indent_with_tabs.get.asInstanceOf[js.Any])
    if (!js.isUndefined(max_preserve_newlines)) __obj.updateDynamic("max_preserve_newlines")(max_preserve_newlines.get.asInstanceOf[js.Any])
    if (!js.isUndefined(newline_between_rules)) __obj.updateDynamic("newline_between_rules")(newline_between_rules.get.asInstanceOf[js.Any])
    if (!js.isUndefined(preserve_newlines)) __obj.updateDynamic("preserve_newlines")(preserve_newlines.get.asInstanceOf[js.Any])
    if (!js.isUndefined(selector_separator_newline)) __obj.updateDynamic("selector_separator_newline")(selector_separator_newline.get.asInstanceOf[js.Any])
    if (!js.isUndefined(space_around_combinator)) __obj.updateDynamic("space_around_combinator")(space_around_combinator.get.asInstanceOf[js.Any])
    if (!js.isUndefined(space_around_selector_separator)) __obj.updateDynamic("space_around_selector_separator")(space_around_selector_separator.get.asInstanceOf[js.Any])
    if (templating != null) __obj.updateDynamic("templating")(templating.asInstanceOf[js.Any])
    if (!js.isUndefined(wrap_line_length)) __obj.updateDynamic("wrap_line_length")(wrap_line_length.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSSBeautifyOptions]
  }
}

