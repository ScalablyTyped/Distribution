package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgGridCellMergingColumnSetting
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * Column index. This is a required property in every column setting if columnKey is not set.
    *
    */
  var columnIndex: js.UndefOr[Double] = js.native
  /**
    * Column key. This is a required property in every column setting if columnIndex is not set.
    *
    */
  var columnKey: js.UndefOr[String] = js.native
  /**
    * Defines when merging should be applied.
    *
    *
    * Valid values:
    * "sorting" The column will only be merged when sorted
    * "always" The column will always be merged
    * "never" No merging will be applied
    */
  var mergeOn: js.UndefOr[String] = js.native
  /**
    * Defines the rules merging is based on.
    *
    *
    * Valid values:
    * "duplicate" Duplicate values in the column will be merged together.
    * "null" Merging will be applied for each subsequent null value after a non-null value.
    */
  var mergeStrategy: js.UndefOr[String | js.Function] = js.native
}

object IgGridCellMergingColumnSetting {
  @scala.inline
  def apply(): IgGridCellMergingColumnSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridCellMergingColumnSetting]
  }
  @scala.inline
  implicit class IgGridCellMergingColumnSettingOps[Self <: IgGridCellMergingColumnSetting] (val x: Self) extends AnyVal {
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
    def setColumnIndex(value: Double): Self = this.set("columnIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnIndex: Self = this.set("columnIndex", js.undefined)
    @scala.inline
    def setColumnKey(value: String): Self = this.set("columnKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnKey: Self = this.set("columnKey", js.undefined)
    @scala.inline
    def setMergeOn(value: String): Self = this.set("mergeOn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMergeOn: Self = this.set("mergeOn", js.undefined)
    @scala.inline
    def setMergeStrategy(value: String | js.Function): Self = this.set("mergeStrategy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMergeStrategy: Self = this.set("mergeStrategy", js.undefined)
  }
  
}

