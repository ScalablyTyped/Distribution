package typings.markdownlint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCodeblocksHeaders extends js.Object {
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

object AnonCodeblocksHeaders {
  @scala.inline
  def apply(
    heading_line_length: Double,
    line_length: Double,
    code_blocks: js.UndefOr[Boolean] = js.undefined,
    headers: js.UndefOr[Boolean] = js.undefined,
    headings: js.UndefOr[Boolean] = js.undefined,
    tables: js.UndefOr[Boolean] = js.undefined
  ): AnonCodeblocksHeaders = {
    val __obj = js.Dynamic.literal(heading_line_length = heading_line_length.asInstanceOf[js.Any], line_length = line_length.asInstanceOf[js.Any])
    if (!js.isUndefined(code_blocks)) __obj.updateDynamic("code_blocks")(code_blocks.asInstanceOf[js.Any])
    if (!js.isUndefined(headers)) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(headings)) __obj.updateDynamic("headings")(headings.asInstanceOf[js.Any])
    if (!js.isUndefined(tables)) __obj.updateDynamic("tables")(tables.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCodeblocksHeaders]
  }
}

