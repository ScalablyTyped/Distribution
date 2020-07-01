package typings.googleapis.v31Mod.dfareportingV31

import typings.googleapis.anon.Active
import typings.googleapis.anon.Activities
import typings.googleapis.anon.ActivityFilters
import typings.googleapis.anon.Breakdown
import typings.googleapis.anon.CustomRichMediaEvents
import typings.googleapis.anon.DateRange
import typings.googleapis.anon.EmailOwner
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
  var criteria: js.UndefOr[Activities] = js.native
  /**
    * The report criteria for a report of type
    * &quot;CROSS_DIMENSION_REACH&quot;.
    */
  var crossDimensionReachCriteria: js.UndefOr[Breakdown] = js.native
  /**
    * The report&#39;s email delivery settings.
    */
  var delivery: js.UndefOr[EmailOwner] = js.native
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
  var floodlightCriteria: js.UndefOr[CustomRichMediaEvents] = js.native
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
  var pathToConversionCriteria: js.UndefOr[ActivityFilters] = js.native
  /**
    * The report criteria for a report of type &quot;REACH&quot;.
    */
  var reachCriteria: js.UndefOr[DateRange] = js.native
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
  def apply(
    accountId: String = null,
    criteria: Activities = null,
    crossDimensionReachCriteria: Breakdown = null,
    delivery: EmailOwner = null,
    etag: String = null,
    fileName: String = null,
    floodlightCriteria: CustomRichMediaEvents = null,
    format: String = null,
    id: String = null,
    kind: String = null,
    lastModifiedTime: String = null,
    name: String = null,
    ownerProfileId: String = null,
    pathToConversionCriteria: ActivityFilters = null,
    reachCriteria: DateRange = null,
    schedule: Active = null,
    subAccountId: String = null,
    `type`: String = null
  ): SchemaReport = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (criteria != null) __obj.updateDynamic("criteria")(criteria.asInstanceOf[js.Any])
    if (crossDimensionReachCriteria != null) __obj.updateDynamic("crossDimensionReachCriteria")(crossDimensionReachCriteria.asInstanceOf[js.Any])
    if (delivery != null) __obj.updateDynamic("delivery")(delivery.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (fileName != null) __obj.updateDynamic("fileName")(fileName.asInstanceOf[js.Any])
    if (floodlightCriteria != null) __obj.updateDynamic("floodlightCriteria")(floodlightCriteria.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (lastModifiedTime != null) __obj.updateDynamic("lastModifiedTime")(lastModifiedTime.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (ownerProfileId != null) __obj.updateDynamic("ownerProfileId")(ownerProfileId.asInstanceOf[js.Any])
    if (pathToConversionCriteria != null) __obj.updateDynamic("pathToConversionCriteria")(pathToConversionCriteria.asInstanceOf[js.Any])
    if (reachCriteria != null) __obj.updateDynamic("reachCriteria")(reachCriteria.asInstanceOf[js.Any])
    if (schedule != null) __obj.updateDynamic("schedule")(schedule.asInstanceOf[js.Any])
    if (subAccountId != null) __obj.updateDynamic("subAccountId")(subAccountId.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaReport]
  }
}

