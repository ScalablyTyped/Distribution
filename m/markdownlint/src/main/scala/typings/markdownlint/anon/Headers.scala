package typings.markdownlint.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Headers extends js.Object {
  /**
    * Exclude this rule for code blocks.
    */
  var code_blocks: js.UndefOr[Boolean] = js.native
  /**
    * Exclude this rule for headings/headers (alias for `headings`).
    */
  var headers: js.UndefOr[Boolean] = js.native
  var heading_line_length: Double = js.native
  /**
    * Exclude this rule for headings/headers.
    */
  var headings: js.UndefOr[Boolean] = js.native
  var line_length: Double = js.native
  /**
    * Exclude this rule for tables.
    */
  var tables: js.UndefOr[Boolean] = js.native
}

object Headers {
  @scala.inline
  def apply(heading_line_length: Double, line_length: Double): Headers = {
    val __obj = js.Dynamic.literal(heading_line_length = heading_line_length.asInstanceOf[js.Any], line_length = line_length.asInstanceOf[js.Any])
    __obj.asInstanceOf[Headers]
  }
  @scala.inline
  implicit class HeadersOps[Self <: Headers] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHeading_line_length(value: Double): Self = this.set("heading_line_length", value.asInstanceOf[js.Any])
    @scala.inline
    def setLine_length(value: Double): Self = this.set("line_length", value.asInstanceOf[js.Any])
    @scala.inline
    def setCode_blocks(value: Boolean): Self = this.set("code_blocks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCode_blocks: Self = this.set("code_blocks", js.undefined)
    @scala.inline
    def setHeaders(value: Boolean): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setHeadings(value: Boolean): Self = this.set("headings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeadings: Self = this.set("headings", js.undefined)
    @scala.inline
    def setTables(value: Boolean): Self = this.set("tables", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTables: Self = this.set("tables", js.undefined)
  }
  
}

