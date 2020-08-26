package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgGridResizingColumnSetting
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * Enables disables resizing for the column.
    *
    */
  var allowResizing: js.UndefOr[Boolean] = js.native
  /**
    * Column index. Can be used in place of column key. the preferred way of populating a column setting is to always use the column keys as identifiers.
    *
    */
  var columnIndex: js.UndefOr[Double] = js.native
  /**
    * Column key. this is a required property in every column setting if columnIndex is not set.
    *
    */
  var columnKey: js.UndefOr[String] = js.native
  /**
    * Maximum column width in pixels or percents.
    *
    */
  var maximumWidth: js.UndefOr[String | Double] = js.native
  /**
    * Minimum column width in pixels or percents.
    *
    */
  var minimumWidth: js.UndefOr[String | Double] = js.native
}

object IgGridResizingColumnSetting {
  @scala.inline
  def apply(): IgGridResizingColumnSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridResizingColumnSetting]
  }
  @scala.inline
  implicit class IgGridResizingColumnSettingOps[Self <: IgGridResizingColumnSetting] (val x: Self) extends AnyVal {
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
    def setAllowResizing(value: Boolean): Self = this.set("allowResizing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowResizing: Self = this.set("allowResizing", js.undefined)
    @scala.inline
    def setColumnIndex(value: Double): Self = this.set("columnIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnIndex: Self = this.set("columnIndex", js.undefined)
    @scala.inline
    def setColumnKey(value: String): Self = this.set("columnKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnKey: Self = this.set("columnKey", js.undefined)
    @scala.inline
    def setMaximumWidth(value: String | Double): Self = this.set("maximumWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximumWidth: Self = this.set("maximumWidth", js.undefined)
    @scala.inline
    def setMinimumWidth(value: String | Double): Self = this.set("minimumWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimumWidth: Self = this.set("minimumWidth", js.undefined)
  }
  
}

