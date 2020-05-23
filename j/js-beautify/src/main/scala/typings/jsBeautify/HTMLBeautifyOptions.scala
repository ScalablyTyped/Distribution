package typings.jsBeautify

import typings.jsBeautify.jsBeautifyStrings.`aligned-multiple`
import typings.jsBeautify.jsBeautifyStrings.`force-aligned`
import typings.jsBeautify.jsBeautifyStrings.`force-expand-multiline`
import typings.jsBeautify.jsBeautifyStrings.`preserve-aligned`
import typings.jsBeautify.jsBeautifyStrings.auto
import typings.jsBeautify.jsBeautifyStrings.force
import typings.jsBeautify.jsBeautifyStrings.keep
import typings.jsBeautify.jsBeautifyStrings.normal
import typings.jsBeautify.jsBeautifyStrings.preserve
import typings.jsBeautify.jsBeautifyStrings.separate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTMLBeautifyOptions extends CoreBeautifyOptions {
  var content_unformatted: js.UndefOr[js.Array[String]] = js.undefined
  var extra_liners: js.UndefOr[js.Array[String]] = js.undefined
  var indent_body_inner_html: js.UndefOr[Boolean] = js.undefined
  var indent_handlebars: js.UndefOr[Boolean] = js.undefined
  var indent_head_inner_html: js.UndefOr[Boolean] = js.undefined
  var indent_inner_html: js.UndefOr[Boolean] = js.undefined
  var indent_scripts: js.UndefOr[normal | keep | separate] = js.undefined
  var `inline`: js.UndefOr[js.Array[String]] = js.undefined
  var unformatted: js.UndefOr[js.Array[String]] = js.undefined
  var unformatted_content_delimiter: js.UndefOr[String] = js.undefined
  var void_elements: js.UndefOr[js.Array[String]] = js.undefined
  var wrap_attributes: js.UndefOr[
    auto | force | `force-aligned` | `force-expand-multiline` | `aligned-multiple` | preserve | `preserve-aligned`
  ] = js.undefined
  var wrap_attributes_indent_size: js.UndefOr[Double] = js.undefined
}

object HTMLBeautifyOptions {
  @scala.inline
  def apply(
    content_unformatted: js.Array[String] = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    end_with_newline: js.UndefOr[Boolean] = js.undefined,
    eol: String = null,
    extra_liners: js.Array[String] = null,
    indent_body_inner_html: js.UndefOr[Boolean] = js.undefined,
    indent_char: String = null,
    indent_empty_lines: js.UndefOr[Boolean] = js.undefined,
    indent_handlebars: js.UndefOr[Boolean] = js.undefined,
    indent_head_inner_html: js.UndefOr[Boolean] = js.undefined,
    indent_inner_html: js.UndefOr[Boolean] = js.undefined,
    indent_level: js.UndefOr[Double] = js.undefined,
    indent_scripts: normal | keep | separate = null,
    indent_size: js.UndefOr[Double] = js.undefined,
    indent_with_tabs: js.UndefOr[Boolean] = js.undefined,
    `inline`: js.Array[String] = null,
    max_preserve_newlines: js.UndefOr[Double] = js.undefined,
    preserve_newlines: js.UndefOr[Boolean] = js.undefined,
    templating: js.Array[String] = null,
    unformatted: js.Array[String] = null,
    unformatted_content_delimiter: String = null,
    void_elements: js.Array[String] = null,
    wrap_attributes: auto | force | `force-aligned` | `force-expand-multiline` | `aligned-multiple` | preserve | `preserve-aligned` = null,
    wrap_attributes_indent_size: js.UndefOr[Double] = js.undefined,
    wrap_line_length: js.UndefOr[Double] = js.undefined
  ): HTMLBeautifyOptions = {
    val __obj = js.Dynamic.literal()
    if (content_unformatted != null) __obj.updateDynamic("content_unformatted")(content_unformatted.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(end_with_newline)) __obj.updateDynamic("end_with_newline")(end_with_newline.get.asInstanceOf[js.Any])
    if (eol != null) __obj.updateDynamic("eol")(eol.asInstanceOf[js.Any])
    if (extra_liners != null) __obj.updateDynamic("extra_liners")(extra_liners.asInstanceOf[js.Any])
    if (!js.isUndefined(indent_body_inner_html)) __obj.updateDynamic("indent_body_inner_html")(indent_body_inner_html.get.asInstanceOf[js.Any])
    if (indent_char != null) __obj.updateDynamic("indent_char")(indent_char.asInstanceOf[js.Any])
    if (!js.isUndefined(indent_empty_lines)) __obj.updateDynamic("indent_empty_lines")(indent_empty_lines.get.asInstanceOf[js.Any])
    if (!js.isUndefined(indent_handlebars)) __obj.updateDynamic("indent_handlebars")(indent_handlebars.get.asInstanceOf[js.Any])
    if (!js.isUndefined(indent_head_inner_html)) __obj.updateDynamic("indent_head_inner_html")(indent_head_inner_html.get.asInstanceOf[js.Any])
    if (!js.isUndefined(indent_inner_html)) __obj.updateDynamic("indent_inner_html")(indent_inner_html.get.asInstanceOf[js.Any])
    if (!js.isUndefined(indent_level)) __obj.updateDynamic("indent_level")(indent_level.get.asInstanceOf[js.Any])
    if (indent_scripts != null) __obj.updateDynamic("indent_scripts")(indent_scripts.asInstanceOf[js.Any])
    if (!js.isUndefined(indent_size)) __obj.updateDynamic("indent_size")(indent_size.get.asInstanceOf[js.Any])
    if (!js.isUndefined(indent_with_tabs)) __obj.updateDynamic("indent_with_tabs")(indent_with_tabs.get.asInstanceOf[js.Any])
    if (`inline` != null) __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    if (!js.isUndefined(max_preserve_newlines)) __obj.updateDynamic("max_preserve_newlines")(max_preserve_newlines.get.asInstanceOf[js.Any])
    if (!js.isUndefined(preserve_newlines)) __obj.updateDynamic("preserve_newlines")(preserve_newlines.get.asInstanceOf[js.Any])
    if (templating != null) __obj.updateDynamic("templating")(templating.asInstanceOf[js.Any])
    if (unformatted != null) __obj.updateDynamic("unformatted")(unformatted.asInstanceOf[js.Any])
    if (unformatted_content_delimiter != null) __obj.updateDynamic("unformatted_content_delimiter")(unformatted_content_delimiter.asInstanceOf[js.Any])
    if (void_elements != null) __obj.updateDynamic("void_elements")(void_elements.asInstanceOf[js.Any])
    if (wrap_attributes != null) __obj.updateDynamic("wrap_attributes")(wrap_attributes.asInstanceOf[js.Any])
    if (!js.isUndefined(wrap_attributes_indent_size)) __obj.updateDynamic("wrap_attributes_indent_size")(wrap_attributes_indent_size.get.asInstanceOf[js.Any])
    if (!js.isUndefined(wrap_line_length)) __obj.updateDynamic("wrap_line_length")(wrap_line_length.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLBeautifyOptions]
  }
}

