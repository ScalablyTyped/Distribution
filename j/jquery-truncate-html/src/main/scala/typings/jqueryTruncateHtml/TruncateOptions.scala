package typings.jqueryTruncateHtml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TruncateOptions extends js.Object {
  var ellipsis: js.UndefOr[String] = js.native
  var length: js.UndefOr[Double] = js.native
  var noBreaks: js.UndefOr[Boolean] = js.native
  var stripTags: js.UndefOr[Boolean] = js.native
  var words: js.UndefOr[Boolean] = js.native
}

object TruncateOptions {
  @scala.inline
  def apply(): TruncateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TruncateOptions]
  }
  @scala.inline
  implicit class TruncateOptionsOps[Self <: TruncateOptions] (val x: Self) extends AnyVal {
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
    def setEllipsis(value: String): Self = this.set("ellipsis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEllipsis: Self = this.set("ellipsis", js.undefined)
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
    @scala.inline
    def setNoBreaks(value: Boolean): Self = this.set("noBreaks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoBreaks: Self = this.set("noBreaks", js.undefined)
    @scala.inline
    def setStripTags(value: Boolean): Self = this.set("stripTags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStripTags: Self = this.set("stripTags", js.undefined)
    @scala.inline
    def setWords(value: Boolean): Self = this.set("words", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWords: Self = this.set("words", js.undefined)
  }
  
}

