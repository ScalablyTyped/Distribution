package typings.googleapis.v33Mod.dfareportingV33

import typings.googleapis.anon.Active
import typings.googleapis.anon.CustomFloodlightVariables
import typings.googleapis.anon.Message
import typings.googleapis.anon.MetricNames
import typings.googleapis.anon.OverlapMetricNames
import typings.googleapis.anon.ReachByFrequencyMetricNames
import typings.googleapis.anon.ReportProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a Report resource.
  */
@js.native
trait SchemaReport extends js.Object {
  /**
    * The account ID to which this report belongs.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * The report criteria for a report of type &quot;STANDARD&quot;.
    */
  var criteria: js.UndefOr[MetricNames] = js.native
  /**
    * The report criteria for a report of type
    * &quot;CROSS_DIMENSION_REACH&quot;.
    */
  var crossDimensionReachCriteria: js.UndefOr[OverlapMetricNames] = js.native
  /**
    * The report&#39;s email delivery settings.
    */
  var delivery: js.UndefOr[Message] = js.native
  /**
    * The eTag of this response for caching purposes.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * The filename used when generating report files for this report.
    */
  var fileName: js.UndefOr[String] = js.native
  /**
    * The report criteria for a report of type &quot;FLOODLIGHT&quot;.
    */
  var floodlightCriteria: js.UndefOr[ReportProperties] = js.native
  /**
    * The output format of the report. If not specified, default format is
    * &quot;CSV&quot;. Note that the actual format in the completed report file
    * might differ if for instance the report&#39;s size exceeds the
    * format&#39;s capabilities. &quot;CSV&quot; will then be the fallback
    * format.
    */
  var format: js.UndefOr[String] = js.native
  /**
    * The unique ID identifying this report resource.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The kind of resource this is, in this case dfareporting#report.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The timestamp (in milliseconds since epoch) of when this report was last
    * modified.
    */
  var lastModifiedTime: js.UndefOr[String] = js.native
  /**
    * The name of the report.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The user profile id of the owner of this report.
    */
  var ownerProfileId: js.UndefOr[String] = js.native
  /**
    * The report criteria for a report of type &quot;PATH_TO_CONVERSION&quot;.
    */
  var pathToConversionCriteria: js.UndefOr[CustomFloodlightVariables] = js.native
  /**
    * The report criteria for a report of type &quot;REACH&quot;.
    */
  var reachCriteria: js.UndefOr[ReachByFrequencyMetricNames] = js.native
  /**
    * The report&#39;s schedule. Can only be set if the report&#39;s
    * &#39;dateRange&#39; is a relative date range and the relative date range
    * is not &quot;TODAY&quot;.
    */
  var schedule: js.UndefOr[Active] = js.native
  /**
    * The subaccount ID to which this report belongs if applicable.
    */
  var subAccountId: js.UndefOr[String] = js.native
  /**
    * The type of the report.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaReport {
  @scala.inline
  def apply(): SchemaReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReport]
  }
  @scala.inline
  implicit class SchemaReportOps[Self <: SchemaReport] (val x: Self) extends AnyVal {
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
    def setAccountId(value: String): Self = this.set("accountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    @scala.inline
    def setCriteria(value: MetricNames): Self = this.set("criteria", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCriteria: Self = this.set("criteria", js.undefined)
    @scala.inline
    def setCrossDimensionReachCriteria(value: OverlapMetricNames): Self = this.set("crossDimensionReachCriteria", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCrossDimensionReachCriteria: Self = this.set("crossDimensionReachCriteria", js.undefined)
    @scala.inline
    def setDelivery(value: Message): Self = this.set("delivery", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelivery: Self = this.set("delivery", js.undefined)
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    @scala.inline
    def setFileName(value: String): Self = this.set("fileName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileName: Self = this.set("fileName", js.undefined)
    @scala.inline
    def setFloodlightCriteria(value: ReportProperties): Self = this.set("floodlightCriteria", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFloodlightCriteria: Self = this.set("floodlightCriteria", js.undefined)
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setLastModifiedTime(value: String): Self = this.set("lastModifiedTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModifiedTime: Self = this.set("lastModifiedTime", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOwnerProfileId(value: String): Self = this.set("ownerProfileId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwnerProfileId: Self = this.set("ownerProfileId", js.undefined)
    @scala.inline
    def setPathToConversionCriteria(value: CustomFloodlightVariables): Self = this.set("pathToConversionCriteria", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePathToConversionCriteria: Self = this.set("pathToConversionCriteria", js.undefined)
    @scala.inline
    def setReachCriteria(value: ReachByFrequencyMetricNames): Self = this.set("reachCriteria", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReachCriteria: Self = this.set("reachCriteria", js.undefined)
    @scala.inline
    def setSchedule(value: Active): Self = this.set("schedule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchedule: Self = this.set("schedule", js.undefined)
    @scala.inline
    def setSubAccountId(value: String): Self = this.set("subAccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubAccountId: Self = this.set("subAccountId", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

