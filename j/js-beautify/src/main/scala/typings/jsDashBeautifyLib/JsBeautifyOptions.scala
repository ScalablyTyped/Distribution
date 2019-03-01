package typings
package jsDashBeautifyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsBeautifyOptions extends js.Object {
  var brace_style: js.UndefOr[
    jsDashBeautifyLib.jsDashBeautifyLibStrings.`collapse-preserve-inline` | jsDashBeautifyLib.jsDashBeautifyLibStrings.collapse | jsDashBeautifyLib.jsDashBeautifyLibStrings.expand | jsDashBeautifyLib.jsDashBeautifyLibStrings.`end-expand` | jsDashBeautifyLib.jsDashBeautifyLibStrings.none
  ] = js.undefined
  var break_chained_methods: js.UndefOr[scala.Boolean] = js.undefined
  var end_with_newline: js.UndefOr[scala.Boolean] = js.undefined
  var eol: js.UndefOr[java.lang.String] = js.undefined
  var eval_code: js.UndefOr[scala.Boolean] = js.undefined
  var indent_char: js.UndefOr[java.lang.String] = js.undefined
  var indent_level: js.UndefOr[scala.Double] = js.undefined
  var indent_size: js.UndefOr[scala.Double] = js.undefined
  var indent_with_tabs: js.UndefOr[scala.Boolean] = js.undefined
  var jslint_happy: js.UndefOr[scala.Boolean] = js.undefined
  var keep_array_indentation: js.UndefOr[scala.Boolean] = js.undefined
  var keep_function_indentation: js.UndefOr[scala.Boolean] = js.undefined
  var max_preserve_newlines: js.UndefOr[scala.Double] = js.undefined
  var preserve_newlines: js.UndefOr[scala.Boolean] = js.undefined
  var space_after_anon_function: js.UndefOr[scala.Boolean] = js.undefined
  var space_before_conditional: js.UndefOr[scala.Boolean] = js.undefined
  var unescape_strings: js.UndefOr[scala.Boolean] = js.undefined
  var wrap_attributes: js.UndefOr[
    jsDashBeautifyLib.jsDashBeautifyLibStrings.auto | jsDashBeautifyLib.jsDashBeautifyLibStrings.force
  ] = js.undefined
  var wrap_attributes_indent_size: js.UndefOr[scala.Double] = js.undefined
  var wrap_line_length: js.UndefOr[scala.Double] = js.undefined
}

object JsBeautifyOptions {
  @scala.inline
  def apply(
    brace_style: jsDashBeautifyLib.jsDashBeautifyLibStrings.`collapse-preserve-inline` | jsDashBeautifyLib.jsDashBeautifyLibStrings.collapse | jsDashBeautifyLib.jsDashBeautifyLibStrings.expand | jsDashBeautifyLib.jsDashBeautifyLibStrings.`end-expand` | jsDashBeautifyLib.jsDashBeautifyLibStrings.none = null,
    break_chained_methods: js.UndefOr[scala.Boolean] = js.undefined,
    end_with_newline: js.UndefOr[scala.Boolean] = js.undefined,
    eol: java.lang.String = null,
    eval_code: js.UndefOr[scala.Boolean] = js.undefined,
    indent_char: java.lang.String = null,
    indent_level: scala.Int | scala.Double = null,
    indent_size: scala.Int | scala.Double = null,
    indent_with_tabs: js.UndefOr[scala.Boolean] = js.undefined,
    jslint_happy: js.UndefOr[scala.Boolean] = js.undefined,
    keep_array_indentation: js.UndefOr[scala.Boolean] = js.undefined,
    keep_function_indentation: js.UndefOr[scala.Boolean] = js.undefined,
    max_preserve_newlines: scala.Int | scala.Double = null,
    preserve_newlines: js.UndefOr[scala.Boolean] = js.undefined,
    space_after_anon_function: js.UndefOr[scala.Boolean] = js.undefined,
    space_before_conditional: js.UndefOr[scala.Boolean] = js.undefined,
    unescape_strings: js.UndefOr[scala.Boolean] = js.undefined,
    wrap_attributes: jsDashBeautifyLib.jsDashBeautifyLibStrings.auto | jsDashBeautifyLib.jsDashBeautifyLibStrings.force = null,
    wrap_attributes_indent_size: scala.Int | scala.Double = null,
    wrap_line_length: scala.Int | scala.Double = null
  ): JsBeautifyOptions = {
    val __obj = js.Dynamic.literal()
    if (brace_style != null) __obj.updateDynamic("brace_style")(brace_style.asInstanceOf[js.Any])
    if (!js.isUndefined(break_chained_methods)) __obj.updateDynamic("break_chained_methods")(break_chained_methods)
    if (!js.isUndefined(end_with_newline)) __obj.updateDynamic("end_with_newline")(end_with_newline)
    if (eol != null) __obj.updateDynamic("eol")(eol)
    if (!js.isUndefined(eval_code)) __obj.updateDynamic("eval_code")(eval_code)
    if (indent_char != null) __obj.updateDynamic("indent_char")(indent_char)
    if (indent_level != null) __obj.updateDynamic("indent_level")(indent_level.asInstanceOf[js.Any])
    if (indent_size != null) __obj.updateDynamic("indent_size")(indent_size.asInstanceOf[js.Any])
    if (!js.isUndefined(indent_with_tabs)) __obj.updateDynamic("indent_with_tabs")(indent_with_tabs)
    if (!js.isUndefined(jslint_happy)) __obj.updateDynamic("jslint_happy")(jslint_happy)
    if (!js.isUndefined(keep_array_indentation)) __obj.updateDynamic("keep_array_indentation")(keep_array_indentation)
    if (!js.isUndefined(keep_function_indentation)) __obj.updateDynamic("keep_function_indentation")(keep_function_indentation)
    if (max_preserve_newlines != null) __obj.updateDynamic("max_preserve_newlines")(max_preserve_newlines.asInstanceOf[js.Any])
    if (!js.isUndefined(preserve_newlines)) __obj.updateDynamic("preserve_newlines")(preserve_newlines)
    if (!js.isUndefined(space_after_anon_function)) __obj.updateDynamic("space_after_anon_function")(space_after_anon_function)
    if (!js.isUndefined(space_before_conditional)) __obj.updateDynamic("space_before_conditional")(space_before_conditional)
    if (!js.isUndefined(unescape_strings)) __obj.updateDynamic("unescape_strings")(unescape_strings)
    if (wrap_attributes != null) __obj.updateDynamic("wrap_attributes")(wrap_attributes.asInstanceOf[js.Any])
    if (wrap_attributes_indent_size != null) __obj.updateDynamic("wrap_attributes_indent_size")(wrap_attributes_indent_size.asInstanceOf[js.Any])
    if (wrap_line_length != null) __obj.updateDynamic("wrap_line_length")(wrap_line_length.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsBeautifyOptions]
  }
}

