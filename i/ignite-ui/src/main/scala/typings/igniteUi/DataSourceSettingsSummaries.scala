package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSourceSettingsSummaries
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * A list of column settings that specifies custom summaries options per column basis
    *
    */
  var columnSettings: js.UndefOr[js.Array[_]] = js.native
  /**
    * Key for retrieving data from the summaries response - used only when summaries are remote
    *
    */
  var summariesResponseKey: js.UndefOr[String] = js.native
  /**
    * Determines when the summary values are calculated
    *
    *
    * Valid values:
    * "priortofilteringandpaging"
    * "afterfilteringbeforepaging"
    * "afterfilteringandpaging"
    */
  var summaryExecution: js.UndefOr[String] = js.native
  /**
    * Url key for retrieving data from response - used only when summaries are remote
    *
    */
  var summaryExprUrlKey: js.UndefOr[String] = js.native
  /**
    * Specifies whether summaries will be applied locally or remotely (via a remote request)
    *
    *
    * Valid values:
    * "remote" A remote request is done and URL params encoded
    * "local" Data is paged client-side.
    */
  var `type`: js.UndefOr[String] = js.native
}

object DataSourceSettingsSummaries {
  @scala.inline
  def apply(): DataSourceSettingsSummaries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceSettingsSummaries]
  }
  @scala.inline
  implicit class DataSourceSettingsSummariesOps[Self <: DataSourceSettingsSummaries] (val x: Self) extends AnyVal {
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
    def setColumnSettingsVarargs(value: js.Any*): Self = this.set("columnSettings", js.Array(value :_*))
    @scala.inline
    def setColumnSettings(value: js.Array[_]): Self = this.set("columnSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnSettings: Self = this.set("columnSettings", js.undefined)
    @scala.inline
    def setSummariesResponseKey(value: String): Self = this.set("summariesResponseKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSummariesResponseKey: Self = this.set("summariesResponseKey", js.undefined)
    @scala.inline
    def setSummaryExecution(value: String): Self = this.set("summaryExecution", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSummaryExecution: Self = this.set("summaryExecution", js.undefined)
    @scala.inline
    def setSummaryExprUrlKey(value: String): Self = this.set("summaryExprUrlKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSummaryExprUrlKey: Self = this.set("summaryExprUrlKey", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

