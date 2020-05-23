package typings.jsBeautify

import typings.jsBeautify.jsBeautifyStrings.`after-newline`
import typings.jsBeautify.jsBeautifyStrings.`before-newline`
import typings.jsBeautify.jsBeautifyStrings.`end-expand`
import typings.jsBeautify.jsBeautifyStrings.`preserve-inline`
import typings.jsBeautify.jsBeautifyStrings.`preserve-newline`
import typings.jsBeautify.jsBeautifyStrings.collapse
import typings.jsBeautify.jsBeautifyStrings.expand
import typings.jsBeautify.jsBeautifyStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSBeautifyOptions extends CoreBeautifyOptions {
  var brace_style: js.UndefOr[collapse | expand | `end-expand` | none | `preserve-inline`] = js.undefined
  var break_chained_methods: js.UndefOr[Boolean] = js.undefined
  var comma_first: js.UndefOr[Boolean] = js.undefined
  var e4x: js.UndefOr[Boolean] = js.undefined
  var jslint_happy: js.UndefOr[Boolean] = js.undefined
  var keep_array_indentation: js.UndefOr[Boolean] = js.undefined
  var operator_position: js.UndefOr[`before-newline` | `after-newline` | `preserve-newline`] = js.undefined
  var space_after_anon_function: js.UndefOr[Boolean] = js.undefined
  var space_after_named_function: js.UndefOr[Boolean] = js.undefined
  var space_before_conditional: js.UndefOr[Boolean] = js.undefined
  var space_in_empty_paren: js.UndefOr[Boolean] = js.undefined
  var space_in_paren: js.UndefOr[Boolean] = js.undefined
  var test_output_raw: js.UndefOr[Boolean] = js.undefined
  var unescape_strings: js.UndefOr[Boolean] = js.undefined
  var unindent_chained_methods: js.UndefOr[Boolean] = js.undefined
}

object JSBeautifyOptions {
  @scala.inline
  def apply(
    brace_style: collapse | expand | `end-expand` | none | `preserve-inline` = null,
    break_chained_methods: js.UndefOr[Boolean] = js.undefined,
    comma_first: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    e4x: js.UndefOr[Boolean] = js.undefined,
    end_with_newline: js.UndefOr[Boolean] = js.undefined,
    eol: String = null,
    indent_char: String = null,
    indent_empty_lines: js.UndefOr[Boolean] = js.undefined,
    indent_level: js.UndefOr[Double] = js.undefined,
    indent_size: js.UndefOr[Double] = js.undefined,
    indent_with_tabs: js.UndefOr[Boolean] = js.undefined,
    jslint_happy: js.UndefOr[Boolean] = js.undefined,
    keep_array_indentation: js.UndefOr[Boolean] = js.undefined,
    max_preserve_newlines: js.UndefOr[Double] = js.undefined,
    operator_position: `before-newline` | `after-newline` | `preserve-newline` = null,
    preserve_newlines: js.UndefOr[Boolean] = js.undefined,
    space_after_anon_function: js.UndefOr[Boolean] = js.undefined,
    space_after_named_function: js.UndefOr[Boolean] = js.undefined,
    space_before_conditional: js.UndefOr[Boolean] = js.undefined,
    space_in_empty_paren: js.UndefOr[Boolean] = js.undefined,
    space_in_paren: js.UndefOr[Boolean] = js.undefined,
    templating: js.Array[String] = null,
    test_output_raw: js.UndefOr[Boolean] = js.undefined,
    unescape_strings: js.UndefOr[Boolean] = js.undefined,
    unindent_chained_methods: js.UndefOr[Boolean] = js.undefined,
    wrap_line_length: js.UndefOr[Double] = js.undefined
  ): JSBeautifyOptions = {
    val __obj = js.Dynamic.literal()
    if (brace_style != null) __obj.updateDynamic("brace_style")(brace_style.asInstanceOf[js.Any])
    if (!js.isUndefined(break_chained_methods)) __obj.updateDynamic("break_chained_methods")(break_chained_methods.get.asInstanceOf[js.Any])
    if (!js.isUndefined(comma_first)) __obj.updateDynamic("comma_first")(comma_first.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(e4x)) __obj.updateDynamic("e4x")(e4x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(end_with_newline)) __obj.updateDynamic("end_with_newline")(end_with_newline.get.asInstanceOf[js.Any])
    if (eol != null) __obj.updateDynamic("eol")(eol.asInstanceOf[js.Any])
    if (indent_char != null) __obj.updateDynamic("indent_char")(indent_char.asInstanceOf[js.Any])
    if (!js.isUndefined(indent_empty_lines)) __obj.updateDynamic("indent_empty_lines")(indent_empty_lines.get.asInstanceOf[js.Any])
    if (!js.isUndefined(indent_level)) __obj.updateDynamic("indent_level")(indent_level.get.asInstanceOf[js.Any])
    if (!js.isUndefined(indent_size)) __obj.updateDynamic("indent_size")(indent_size.get.asInstanceOf[js.Any])
    if (!js.isUndefined(indent_with_tabs)) __obj.updateDynamic("indent_with_tabs")(indent_with_tabs.get.asInstanceOf[js.Any])
    if (!js.isUndefined(jslint_happy)) __obj.updateDynamic("jslint_happy")(jslint_happy.get.asInstanceOf[js.Any])
    if (!js.isUndefined(keep_array_indentation)) __obj.updateDynamic("keep_array_indentation")(keep_array_indentation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(max_preserve_newlines)) __obj.updateDynamic("max_preserve_newlines")(max_preserve_newlines.get.asInstanceOf[js.Any])
    if (operator_position != null) __obj.updateDynamic("operator_position")(operator_position.asInstanceOf[js.Any])
    if (!js.isUndefined(preserve_newlines)) __obj.updateDynamic("preserve_newlines")(preserve_newlines.get.asInstanceOf[js.Any])
    if (!js.isUndefined(space_after_anon_function)) __obj.updateDynamic("space_after_anon_function")(space_after_anon_function.get.asInstanceOf[js.Any])
    if (!js.isUndefined(space_after_named_function)) __obj.updateDynamic("space_after_named_function")(space_after_named_function.get.asInstanceOf[js.Any])
    if (!js.isUndefined(space_before_conditional)) __obj.updateDynamic("space_before_conditional")(space_before_conditional.get.asInstanceOf[js.Any])
    if (!js.isUndefined(space_in_empty_paren)) __obj.updateDynamic("space_in_empty_paren")(space_in_empty_paren.get.asInstanceOf[js.Any])
    if (!js.isUndefined(space_in_paren)) __obj.updateDynamic("space_in_paren")(space_in_paren.get.asInstanceOf[js.Any])
    if (templating != null) __obj.updateDynamic("templating")(templating.asInstanceOf[js.Any])
    if (!js.isUndefined(test_output_raw)) __obj.updateDynamic("test_output_raw")(test_output_raw.get.asInstanceOf[js.Any])
    if (!js.isUndefined(unescape_strings)) __obj.updateDynamic("unescape_strings")(unescape_strings.get.asInstanceOf[js.Any])
    if (!js.isUndefined(unindent_chained_methods)) __obj.updateDynamic("unindent_chained_methods")(unindent_chained_methods.get.asInstanceOf[js.Any])
    if (!js.isUndefined(wrap_line_length)) __obj.updateDynamic("wrap_line_length")(wrap_line_length.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSBeautifyOptions]
  }
}

