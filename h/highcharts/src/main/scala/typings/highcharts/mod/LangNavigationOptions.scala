package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LangNavigationOptions extends js.Object {
  /**
    * (Highcharts, Highstock) Translations for all field names used in popup.
    */
  var popup: js.UndefOr[LangNavigationPopupOptions] = js.native
}

object LangNavigationOptions {
  @scala.inline
  def apply(): LangNavigationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LangNavigationOptions]
  }
  @scala.inline
  implicit class LangNavigationOptionsOps[Self <: LangNavigationOptions] (val x: Self) extends AnyVal {
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
    def setPopup(value: LangNavigationPopupOptions): Self = this.set("popup", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopup: Self = this.set("popup", js.undefined)
  }
  
}

