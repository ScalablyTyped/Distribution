package typings.jquerymobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchInputOptions extends js.Object {
  var clearSearchButtonText: js.UndefOr[String] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var initSelector: js.UndefOr[String] = js.native
  var mini: js.UndefOr[Boolean] = js.native
  var theme: js.UndefOr[String] = js.native
}

object SearchInputOptions {
  @scala.inline
  def apply(): SearchInputOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchInputOptions]
  }
  @scala.inline
  implicit class SearchInputOptionsOps[Self <: SearchInputOptions] (val x: Self) extends AnyVal {
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
    def setClearSearchButtonText(value: String): Self = this.set("clearSearchButtonText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClearSearchButtonText: Self = this.set("clearSearchButtonText", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setInitSelector(value: String): Self = this.set("initSelector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitSelector: Self = this.set("initSelector", js.undefined)
    @scala.inline
    def setMini(value: Boolean): Self = this.set("mini", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMini: Self = this.set("mini", js.undefined)
    @scala.inline
    def setTheme(value: String): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
  
}

