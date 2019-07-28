package typings.markdownlint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CodeblocksHeaders extends js.Object {
  /**
    * Exclude this rule for code blocks.
    */
  var code_blocks: js.UndefOr[Boolean] = js.undefined
  /**
    * Exclude this rule for headings/headers (alias for `headings`).
    */
  var headers: js.UndefOr[Boolean] = js.undefined
  var heading_line_length: Double
  /**
    * Exclude this rule for headings/headers.
    */
  var headings: js.UndefOr[Boolean] = js.undefined
  var line_length: Double
  /**
    * Exclude this rule for tables.
    */
  var tables: js.UndefOr[Boolean] = js.undefined
}

object Anon_CodeblocksHeaders {
  @scala.inline
  def apply(
    heading_line_length: Double,
    line_length: Double,
    code_blocks: js.UndefOr[Boolean] = js.undefined,
    headers: js.UndefOr[Boolean] = js.undefined,
    headings: js.UndefOr[Boolean] = js.undefined,
    tables: js.UndefOr[Boolean] = js.undefined
  ): Anon_CodeblocksHeaders = {
    val __obj = js.Dynamic.literal(heading_line_length = heading_line_length, line_length = line_length)
    if (!js.isUndefined(code_blocks)) __obj.updateDynamic("code_blocks")(code_blocks)
    if (!js.isUndefined(headers)) __obj.updateDynamic("headers")(headers)
    if (!js.isUndefined(headings)) __obj.updateDynamic("headings")(headings)
    if (!js.isUndefined(tables)) __obj.updateDynamic("tables")(tables)
    __obj.asInstanceOf[Anon_CodeblocksHeaders]
  }
}

