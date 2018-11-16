package typings
package jsDashBeautifyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// See https://github.com/beautify-web/js-beautify/blob/v1.8.2/js/src/html/beautifier.js#L268-L330

trait HTMLBeautifyOptions extends js.Object {
  var content_unformatted: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var end_with_newline: js.UndefOr[scala.Boolean] = js.undefined
  var eol: js.UndefOr[java.lang.String] = js.undefined
  var extra_liners: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var indent_body_inner_html: js.UndefOr[scala.Boolean] = js.undefined
  var indent_char: js.UndefOr[java.lang.String] = js.undefined
  var indent_handlebars: js.UndefOr[scala.Boolean] = js.undefined
  var indent_head_inner_html: js.UndefOr[scala.Boolean] = js.undefined
  var indent_inner_html: js.UndefOr[scala.Boolean] = js.undefined
  var indent_scripts: js.UndefOr[
    jsDashBeautifyLib.jsDashBeautifyLibStrings.keep | jsDashBeautifyLib.jsDashBeautifyLibStrings.separate
  ] = js.undefined
  var indent_size: js.UndefOr[scala.Double] = js.undefined
  var indent_with_tabs: js.UndefOr[scala.Boolean] = js.undefined
  var `inline`: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var max_preserve_newlines: js.UndefOr[scala.Double] = js.undefined
  var preserve_newlines: js.UndefOr[scala.Boolean] = js.undefined
  var unformatted: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var void_elements: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var wrap_attributes: js.UndefOr[
    jsDashBeautifyLib.jsDashBeautifyLibStrings.auto | jsDashBeautifyLib.jsDashBeautifyLibStrings.force | jsDashBeautifyLib.jsDashBeautifyLibStrings.`force-expand-multiline` | jsDashBeautifyLib.jsDashBeautifyLibStrings.`force-aligned` | jsDashBeautifyLib.jsDashBeautifyLibStrings.`aligned-multiple`
  ] = js.undefined
  var wrap_attributes_indent_size: js.UndefOr[scala.Double] = js.undefined
  var wrap_line_length: js.UndefOr[scala.Double] = js.undefined
}

