package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgGridTooltipsColumnSettings
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * Enables / disables tooltips on the specified column. By default tooltips are displayed for each column. Note: This option is mandatory.
    *
    */
  var allowTooltips: js.UndefOr[Boolean] = js.native
  /**
    * Either key or index must be set in every column setting.
    *
    */
  var columnIndex: js.UndefOr[Double] = js.native
  /**
    * Either key or index must be set in every column setting.
    *
    */
  var columnKey: js.UndefOr[String] = js.native
  /**
    * Specifies the maximum width (in pixels) of the tooltip when shown for the specified column. If unset the width of the column will be used instead.
    *
    */
  var maxWidth: js.UndefOr[Double] = js.native
}

object IgGridTooltipsColumnSettings {
  @scala.inline
  def apply(): IgGridTooltipsColumnSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridTooltipsColumnSettings]
  }
  @scala.inline
  implicit class IgGridTooltipsColumnSettingsOps[Self <: IgGridTooltipsColumnSettings] (val x: Self) extends AnyVal {
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
    def setAllowTooltips(value: Boolean): Self = this.set("allowTooltips", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowTooltips: Self = this.set("allowTooltips", js.undefined)
    @scala.inline
    def setColumnIndex(value: Double): Self = this.set("columnIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnIndex: Self = this.set("columnIndex", js.undefined)
    @scala.inline
    def setColumnKey(value: String): Self = this.set("columnKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnKey: Self = this.set("columnKey", js.undefined)
    @scala.inline
    def setMaxWidth(value: Double): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
  }
  
}

