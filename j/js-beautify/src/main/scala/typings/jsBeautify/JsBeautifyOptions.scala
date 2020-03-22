package typings.jsBeautify

import typings.jsBeautify.jsBeautifyStrings.`collapse-preserve-inline`
import typings.jsBeautify.jsBeautifyStrings.`end-expand`
import typings.jsBeautify.jsBeautifyStrings.auto
import typings.jsBeautify.jsBeautifyStrings.collapse
import typings.jsBeautify.jsBeautifyStrings.expand
import typings.jsBeautify.jsBeautifyStrings.force
import typings.jsBeautify.jsBeautifyStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsBeautifyOptions extends js.Object {
  var brace_style: js.UndefOr[`collapse-preserve-inline` | collapse | expand | `end-expand` | none] = js.undefined
  var break_chained_methods: js.UndefOr[Boolean] = js.undefined
  var e4x: js.UndefOr[Boolean] = js.undefined
  var end_with_newline: js.UndefOr[Boolean] = js.undefined
  var eol: js.UndefOr[String] = js.undefined
  var eval_code: js.UndefOr[Boolean] = js.undefined
  var indent_char: js.UndefOr[String] = js.undefined
  var indent_level: js.UndefOr[Double] = js.undefined
  var indent_size: js.UndefOr[Double] = js.undefined
  var indent_with_tabs: js.UndefOr[Boolean] = js.undefined
  var jslint_happy: js.UndefOr[Boolean] = js.undefined
  var keep_array_indentation: js.UndefOr[Boolean] = js.undefined
  var keep_function_indentation: js.UndefOr[Boolean] = js.undefined
  var max_preserve_newlines: js.UndefOr[Double] = js.undefined
  var preserve_newlines: js.UndefOr[Boolean] = js.undefined
  var space_after_anon_function: js.UndefOr[Boolean] = js.undefined
  var space_before_conditional: js.UndefOr[Boolean] = js.undefined
  var space_in_empty_paren: js.UndefOr[Boolean] = js.undefined
  var unescape_strings: js.UndefOr[Boolean] = js.undefined
  var wrap_attributes: js.UndefOr[auto | force] = js.undefined
  var wrap_attributes_indent_size: js.UndefOr[Double] = js.undefined
  var wrap_line_length: js.UndefOr[Double] = js.undefined
}

object JsBeautifyOptions {
  @scala.inline
  def apply(
    brace_style: `collapse-preserve-inline` | collapse | expand | `end-expand` | none = null,
    break_chained_methods: js.UndefOr[Boolean] = js.undefined,
    e4x: js.UndefOr[Boolean] = js.undefined,
    end_with_newline: js.UndefOr[Boolean] = js.undefined,
    eol: String = null,
    eval_code: js.UndefOr[Boolean] = js.undefined,
    indent_char: String = null,
    indent_level: Int | Double = null,
    indent_size: Int | Double = null,
    indent_with_tabs: js.UndefOr[Boolean] = js.undefined,
    jslint_happy: js.UndefOr[Boolean] = js.undefined,
    keep_array_indentation: js.UndefOr[Boolean] = js.undefined,
    keep_function_indentation: js.UndefOr[Boolean] = js.undefined,
    max_preserve_newlines: Int | Double = null,
    preserve_newlines: js.UndefOr[Boolean] = js.undefined,
    space_after_anon_function: js.UndefOr[Boolean] = js.undefined,
    space_before_conditional: js.UndefOr[Boolean] = js.undefined,
    space_in_empty_paren: js.UndefOr[Boolean] = js.undefined,
    unescape_strings: js.UndefOr[Boolean] = js.undefined,
    wrap_attributes: auto | force = null,
    wrap_attributes_indent_size: Int | Double = null,
    wrap_line_length: Int | Double = null
  ): JsBeautifyOptions = {
    val __obj = js.Dynamic.literal()
    if (brace_style != null) __obj.updateDynamic("brace_style")(brace_style.asInstanceOf[js.Any])
    if (!js.isUndefined(break_chained_methods)) __obj.updateDynamic("break_chained_methods")(break_chained_methods.asInstanceOf[js.Any])
    if (!js.isUndefined(e4x)) __obj.updateDynamic("e4x")(e4x.asInstanceOf[js.Any])
    if (!js.isUndefined(end_with_newline)) __obj.updateDynamic("end_with_newline")(end_with_newline.asInstanceOf[js.Any])
    if (eol != null) __obj.updateDynamic("eol")(eol.asInstanceOf[js.Any])
    if (!js.isUndefined(eval_code)) __obj.updateDynamic("eval_code")(eval_code.asInstanceOf[js.Any])
    if (indent_char != null) __obj.updateDynamic("indent_char")(indent_char.asInstanceOf[js.Any])
    if (indent_level != null) __obj.updateDynamic("indent_level")(indent_level.asInstanceOf[js.Any])
    if (indent_size != null) __obj.updateDynamic("indent_size")(indent_size.asInstanceOf[js.Any])
    if (!js.isUndefined(indent_with_tabs)) __obj.updateDynamic("indent_with_tabs")(indent_with_tabs.asInstanceOf[js.Any])
    if (!js.isUndefined(jslint_happy)) __obj.updateDynamic("jslint_happy")(jslint_happy.asInstanceOf[js.Any])
    if (!js.isUndefined(keep_array_indentation)) __obj.updateDynamic("keep_array_indentation")(keep_array_indentation.asInstanceOf[js.Any])
    if (!js.isUndefined(keep_function_indentation)) __obj.updateDynamic("keep_function_indentation")(keep_function_indentation.asInstanceOf[js.Any])
    if (max_preserve_newlines != null) __obj.updateDynamic("max_preserve_newlines")(max_preserve_newlines.asInstanceOf[js.Any])
    if (!js.isUndefined(preserve_newlines)) __obj.updateDynamic("preserve_newlines")(preserve_newlines.asInstanceOf[js.Any])
    if (!js.isUndefined(space_after_anon_function)) __obj.updateDynamic("space_after_anon_function")(space_after_anon_function.asInstanceOf[js.Any])
    if (!js.isUndefined(space_before_conditional)) __obj.updateDynamic("space_before_conditional")(space_before_conditional.asInstanceOf[js.Any])
    if (!js.isUndefined(space_in_empty_paren)) __obj.updateDynamic("space_in_empty_paren")(space_in_empty_paren.asInstanceOf[js.Any])
    if (!js.isUndefined(unescape_strings)) __obj.updateDynamic("unescape_strings")(unescape_strings.asInstanceOf[js.Any])
    if (wrap_attributes != null) __obj.updateDynamic("wrap_attributes")(wrap_attributes.asInstanceOf[js.Any])
    if (wrap_attributes_indent_size != null) __obj.updateDynamic("wrap_attributes_indent_size")(wrap_attributes_indent_size.asInstanceOf[js.Any])
    if (wrap_line_length != null) __obj.updateDynamic("wrap_line_length")(wrap_line_length.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsBeautifyOptions]
  }
}

