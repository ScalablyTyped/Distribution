package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgGridSummariesColumnSetting
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * Enables disables summaries for the column
    *
    */
  var allowSummaries: js.UndefOr[Boolean] = js.native
  /**
    * Column index. Can be used in place of column key. The preferred way of populating a column setting is to always use the column keys as identifiers
    *
    */
  var columnIndex: js.UndefOr[Double] = js.native
  /**
    * Column key. This is a required property in every column setting if columnIndex is not set
    *
    */
  var columnKey: js.UndefOr[String] = js.native
  /**
    * Check defaultSummaryOperands
    *
    */
  var summaryOperands: js.UndefOr[js.Array[IgGridSummariesColumnSettingSummaryOperand]] = js.native
}

object IgGridSummariesColumnSetting {
  @scala.inline
  def apply(): IgGridSummariesColumnSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgGridSummariesColumnSetting]
  }
  @scala.inline
  implicit class IgGridSummariesColumnSettingOps[Self <: IgGridSummariesColumnSetting] (val x: Self) extends AnyVal {
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
    def setAllowSummaries(value: Boolean): Self = this.set("allowSummaries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowSummaries: Self = this.set("allowSummaries", js.undefined)
    @scala.inline
    def setColumnIndex(value: Double): Self = this.set("columnIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnIndex: Self = this.set("columnIndex", js.undefined)
    @scala.inline
    def setColumnKey(value: String): Self = this.set("columnKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnKey: Self = this.set("columnKey", js.undefined)
    @scala.inline
    def setSummaryOperandsVarargs(value: IgGridSummariesColumnSettingSummaryOperand*): Self = this.set("summaryOperands", js.Array(value :_*))
    @scala.inline
    def setSummaryOperands(value: js.Array[IgGridSummariesColumnSettingSummaryOperand]): Self = this.set("summaryOperands", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSummaryOperands: Self = this.set("summaryOperands", js.undefined)
  }
  
}

