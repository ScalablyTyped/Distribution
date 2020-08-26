package typings.jqueryHighlightBartaz.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CaseSensitive extends js.Object {
  var caseSensitive: js.UndefOr[Boolean] = js.native
  var className: js.UndefOr[String] = js.native
  var element: js.UndefOr[String] = js.native
  var wordsOnly: js.UndefOr[Boolean] = js.native
}

object CaseSensitive {
  @scala.inline
  def apply(): CaseSensitive = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CaseSensitive]
  }
  @scala.inline
  implicit class CaseSensitiveOps[Self <: CaseSensitive] (val x: Self) extends AnyVal {
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
    def setCaseSensitive(value: Boolean): Self = this.set("caseSensitive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaseSensitive: Self = this.set("caseSensitive", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setElement(value: String): Self = this.set("element", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
    @scala.inline
    def setWordsOnly(value: Boolean): Self = this.set("wordsOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWordsOnly: Self = this.set("wordsOnly", js.undefined)
  }
  
}

