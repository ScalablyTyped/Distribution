package typings.markdownlint.anon

import typings.markdownlint.markdownlintStrings.atx
import typings.markdownlint.markdownlintStrings.atx_closed
import typings.markdownlint.markdownlintStrings.consistent
import typings.markdownlint.markdownlintStrings.setext
import typings.markdownlint.markdownlintStrings.setext_with_atx
import typings.markdownlint.markdownlintStrings.setext_with_atx_closed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Style extends js.Object {
  var style: js.UndefOr[
    consistent | atx | atx_closed | setext | setext_with_atx | setext_with_atx_closed
  ] = js.native
}

object Style {
  @scala.inline
  def apply(): Style = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Style]
  }
  @scala.inline
  implicit class StyleOps[Self <: Style] (val x: Self) extends AnyVal {
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
    def setStyle(value: consistent | atx | atx_closed | setext | setext_with_atx | setext_with_atx_closed): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

