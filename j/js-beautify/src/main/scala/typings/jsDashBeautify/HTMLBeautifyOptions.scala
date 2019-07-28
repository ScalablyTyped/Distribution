package typings.jsDashBeautify

import typings.jsDashBeautify.jsDashBeautifyStrings.`aligned-multiple`
import typings.jsDashBeautify.jsDashBeautifyStrings.`force-aligned`
import typings.jsDashBeautify.jsDashBeautifyStrings.`force-expand-multiline`
import typings.jsDashBeautify.jsDashBeautifyStrings.auto
import typings.jsDashBeautify.jsDashBeautifyStrings.force
import typings.jsDashBeautify.jsDashBeautifyStrings.keep
import typings.jsDashBeautify.jsDashBeautifyStrings.separate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// See https://github.com/beautify-web/js-beautify/blob/v1.8.2/js/src/html/beautifier.js#L268-L330
trait HTMLBeautifyOptions extends js.Object {
  var content_unformatted: js.UndefOr[js.Array[String]] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var end_with_newline: js.UndefOr[Boolean] = js.undefined
  var eol: js.UndefOr[String] = js.undefined
  var extra_liners: js.UndefOr[js.Array[String]] = js.undefined
  var indent_body_inner_html: js.UndefOr[Boolean] = js.undefined
  var indent_char: js.UndefOr[String] = js.undefined
  var indent_handlebars: js.UndefOr[Boolean] = js.undefined
  var indent_head_inner_html: js.UndefOr[Boolean] = js.undefined
  var indent_inner_html: js.UndefOr[Boolean] = js.undefined
  var indent_scripts: js.UndefOr[keep | separate] = js.undefined
  var indent_size: js.UndefOr[Double] = js.undefined
  var indent_with_tabs: js.UndefOr[Boolean] = js.undefined
  var `inline`: js.UndefOr[js.Array[String]] = js.undefined
  var max_preserve_newlines: js.UndefOr[Double] = js.undefined
  var preserve_newlines: js.UndefOr[Boolean] = js.undefined
  var unformatted: js.UndefOr[js.Array[String]] = js.undefined
  var void_elements: js.UndefOr[js.Array[String]] = js.undefined
  var wrap_attributes: js.UndefOr[auto | force | `force-expand-multiline` | `force-aligned` | `aligned-multiple`] = js.undefined
  var wrap_attributes_indent_size: js.UndefOr[Double] = js.undefined
  var wrap_line_length: js.UndefOr[Double] = js.undefined
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
    indent_handlebars: js.UndefOr[Boolean] = js.undefined,
    indent_head_inner_html: js.UndefOr[Boolean] = js.undefined,
    indent_inner_html: js.UndefOr[Boolean] = js.undefined,
    indent_scripts: keep | separate = null,
    indent_size: Int | Double = null,
    indent_with_tabs: js.UndefOr[Boolean] = js.undefined,
    `inline`: js.Array[String] = null,
    max_preserve_newlines: Int | Double = null,
    preserve_newlines: js.UndefOr[Boolean] = js.undefined,
    unformatted: js.Array[String] = null,
    void_elements: js.Array[String] = null,
    wrap_attributes: auto | force | `force-expand-multiline` | `force-aligned` | `aligned-multiple` = null,
    wrap_attributes_indent_size: Int | Double = null,
    wrap_line_length: Int | Double = null
  ): HTMLBeautifyOptions = {
    val __obj = js.Dynamic.literal()
    if (content_unformatted != null) __obj.updateDynamic("content_unformatted")(content_unformatted)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(end_with_newline)) __obj.updateDynamic("end_with_newline")(end_with_newline)
    if (eol != null) __obj.updateDynamic("eol")(eol)
    if (extra_liners != null) __obj.updateDynamic("extra_liners")(extra_liners)
    if (!js.isUndefined(indent_body_inner_html)) __obj.updateDynamic("indent_body_inner_html")(indent_body_inner_html)
    if (indent_char != null) __obj.updateDynamic("indent_char")(indent_char)
    if (!js.isUndefined(indent_handlebars)) __obj.updateDynamic("indent_handlebars")(indent_handlebars)
    if (!js.isUndefined(indent_head_inner_html)) __obj.updateDynamic("indent_head_inner_html")(indent_head_inner_html)
    if (!js.isUndefined(indent_inner_html)) __obj.updateDynamic("indent_inner_html")(indent_inner_html)
    if (indent_scripts != null) __obj.updateDynamic("indent_scripts")(indent_scripts.asInstanceOf[js.Any])
    if (indent_size != null) __obj.updateDynamic("indent_size")(indent_size.asInstanceOf[js.Any])
    if (!js.isUndefined(indent_with_tabs)) __obj.updateDynamic("indent_with_tabs")(indent_with_tabs)
    if (`inline` != null) __obj.updateDynamic("inline")(`inline`)
    if (max_preserve_newlines != null) __obj.updateDynamic("max_preserve_newlines")(max_preserve_newlines.asInstanceOf[js.Any])
    if (!js.isUndefined(preserve_newlines)) __obj.updateDynamic("preserve_newlines")(preserve_newlines)
    if (unformatted != null) __obj.updateDynamic("unformatted")(unformatted)
    if (void_elements != null) __obj.updateDynamic("void_elements")(void_elements)
    if (wrap_attributes != null) __obj.updateDynamic("wrap_attributes")(wrap_attributes.asInstanceOf[js.Any])
    if (wrap_attributes_indent_size != null) __obj.updateDynamic("wrap_attributes_indent_size")(wrap_attributes_indent_size.asInstanceOf[js.Any])
    if (wrap_line_length != null) __obj.updateDynamic("wrap_line_length")(wrap_line_length.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLBeautifyOptions]
  }
}

