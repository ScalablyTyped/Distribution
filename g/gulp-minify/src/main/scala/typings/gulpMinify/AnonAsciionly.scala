package typings.gulpMinify

import typings.gulpMinify.gulpMinifyBooleans.`false`
import typings.gulpMinify.gulpMinifyNumbers.`32000`
import typings.gulpMinify.gulpMinifyNumbers.`80`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAsciionly extends js.Object {
  /**
    * Output ASCII-safe? (encodes Unicode characters as ASCII)
    */
  var ascii_only: js.UndefOr[Boolean] = js.undefined
  /**
    * Beautify output?
    */
  var beautify: js.UndefOr[Boolean] = js.undefined
  /**
    * Use brackets every time?
    */
  var bracketize: js.UndefOr[Boolean] = js.undefined
  /**
    * Output comments?
    */
  var comments: js.UndefOr[Boolean] = js.undefined
  /**
    * Beautify output?
    */
  var ie_proof: js.UndefOr[Boolean] = js.undefined
  /**
    * Indentation level (only when `beautify`)
    */
  var indent_level: js.UndefOr[Double] = js.undefined
  /**
    * Start indentation on every line (only when `beautify`)
    */
  var indent_start: js.UndefOr[Double] = js.undefined
  /**
    * Escape "</script"?
    */
  var inline_script: js.UndefOr[Boolean] = js.undefined
  /**
    * Maximum line length (for non-beautified output)
    */
  var max_line_len: js.UndefOr[`32000`] = js.undefined
  /**
    * Quote all keys in object literals?
    */
  var quote_keys: js.UndefOr[`false`] = js.undefined
  /**
    * Use semicolons to separate statements? (otherwise, newlines)
    */
  var semicolons: js.UndefOr[Boolean] = js.undefined
  /**
    * Output a source map
    */
  var source_map: js.UndefOr[Boolean] = js.undefined
  /**
    * Add a space after colon signs?
    */
  var space_colon: js.UndefOr[Boolean] = js.undefined
  /**
    * Informative maximum line width (for beautified output)
    */
  var width: js.UndefOr[`80`] = js.undefined
}

object AnonAsciionly {
  @scala.inline
  def apply(
    ascii_only: js.UndefOr[Boolean] = js.undefined,
    beautify: js.UndefOr[Boolean] = js.undefined,
    bracketize: js.UndefOr[Boolean] = js.undefined,
    comments: js.UndefOr[Boolean] = js.undefined,
    ie_proof: js.UndefOr[Boolean] = js.undefined,
    indent_level: Int | Double = null,
    indent_start: Int | Double = null,
    inline_script: js.UndefOr[Boolean] = js.undefined,
    max_line_len: `32000` = null,
    quote_keys: `false` = null,
    semicolons: js.UndefOr[Boolean] = js.undefined,
    source_map: js.UndefOr[Boolean] = js.undefined,
    space_colon: js.UndefOr[Boolean] = js.undefined,
    width: `80` = null
  ): AnonAsciionly = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ascii_only)) __obj.updateDynamic("ascii_only")(ascii_only.asInstanceOf[js.Any])
    if (!js.isUndefined(beautify)) __obj.updateDynamic("beautify")(beautify.asInstanceOf[js.Any])
    if (!js.isUndefined(bracketize)) __obj.updateDynamic("bracketize")(bracketize.asInstanceOf[js.Any])
    if (!js.isUndefined(comments)) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (!js.isUndefined(ie_proof)) __obj.updateDynamic("ie_proof")(ie_proof.asInstanceOf[js.Any])
    if (indent_level != null) __obj.updateDynamic("indent_level")(indent_level.asInstanceOf[js.Any])
    if (indent_start != null) __obj.updateDynamic("indent_start")(indent_start.asInstanceOf[js.Any])
    if (!js.isUndefined(inline_script)) __obj.updateDynamic("inline_script")(inline_script.asInstanceOf[js.Any])
    if (max_line_len != null) __obj.updateDynamic("max_line_len")(max_line_len.asInstanceOf[js.Any])
    if (quote_keys != null) __obj.updateDynamic("quote_keys")(quote_keys.asInstanceOf[js.Any])
    if (!js.isUndefined(semicolons)) __obj.updateDynamic("semicolons")(semicolons.asInstanceOf[js.Any])
    if (!js.isUndefined(source_map)) __obj.updateDynamic("source_map")(source_map.asInstanceOf[js.Any])
    if (!js.isUndefined(space_colon)) __obj.updateDynamic("space_colon")(space_colon.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAsciionly]
  }
}

