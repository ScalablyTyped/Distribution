package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgGridColumnMovingColumnSetting
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * Allows the column to be moved.
    *
    */
  var allowMoving: js.UndefOr[Boolean] = js.native
  /**
    * Column index. Can be used in place of column key. The preferred way of populating a column setting is to always use the column keys as identifiers.
    *
    */
  var columnIndex: js.UndefOr[Double] = js.native
  /**
    * Column key. This is a required property in every column setting if columnIndex is not set.
    *
    */
  var columnKey: js.UndefOr[String] = js.native
}

object IgGridColumnMovingColumnSetting {
  @scala.inline
  def apply(): IgGridColumnMovingColumnSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridColumnMovingColumnSetting]
  }
  @scala.inline
  implicit class IgGridColumnMovingColumnSettingOps[Self <: IgGridColumnMovingColumnSetting] (val x: Self) extends AnyVal {
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
    def setAllowMoving(value: Boolean): Self = this.set("allowMoving", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowMoving: Self = this.set("allowMoving", js.undefined)
    @scala.inline
    def setColumnIndex(value: Double): Self = this.set("columnIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnIndex: Self = this.set("columnIndex", js.undefined)
    @scala.inline
    def setColumnKey(value: String): Self = this.set("columnKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnKey: Self = this.set("columnKey", js.undefined)
  }
  
}

