package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LangNavigationOptions extends js.Object {
  /**
    * (Highcharts, Highstock) Translations for all field names used in popup.
    */
  var popup: js.UndefOr[js.Object | LangNavigationPopupOptions] = js.undefined
}

object LangNavigationOptions {
  @scala.inline
  def apply(popup: js.Object | LangNavigationPopupOptions = null): LangNavigationOptions = {
    val __obj = js.Dynamic.literal()
    if (popup != null) __obj.updateDynamic("popup")(popup.asInstanceOf[js.Any])
    __obj.asInstanceOf[LangNavigationOptions]
  }
}

