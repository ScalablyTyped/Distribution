package typings.googleapis.v1Mod.abusiveexperiencereportV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for GetSiteSummary.
  */
@js.native
trait SchemaSiteSummaryResponse extends js.Object {
  /**
    * The status of the site reviewed for the abusive experiences.
    */
  var abusiveStatus: js.UndefOr[String] = js.native
  /**
    * The date on which enforcement begins.
    */
  var enforcementTime: js.UndefOr[String] = js.native
  /**
    * The abusive experience enforcement status of the site.
    */
  var filterStatus: js.UndefOr[String] = js.native
  /**
    * The last time that the site changed status.
    */
  var lastChangeTime: js.UndefOr[String] = js.native
  /**
    * A link that leads to a full abusive experience report.
    */
  var reportUrl: js.UndefOr[String] = js.native
  /**
    * The name of the site reviewed.
    */
  var reviewedSite: js.UndefOr[String] = js.native
  /**
    * Whether the site is currently under review.
    */
  var underReview: js.UndefOr[Boolean] = js.native
}

object SchemaSiteSummaryResponse {
  @scala.inline
  def apply(
    abusiveStatus: String = null,
    enforcementTime: String = null,
    filterStatus: String = null,
    lastChangeTime: String = null,
    reportUrl: String = null,
    reviewedSite: String = null,
    underReview: js.UndefOr[Boolean] = js.undefined
  ): SchemaSiteSummaryResponse = {
    val __obj = js.Dynamic.literal()
    if (abusiveStatus != null) __obj.updateDynamic("abusiveStatus")(abusiveStatus.asInstanceOf[js.Any])
    if (enforcementTime != null) __obj.updateDynamic("enforcementTime")(enforcementTime.asInstanceOf[js.Any])
    if (filterStatus != null) __obj.updateDynamic("filterStatus")(filterStatus.asInstanceOf[js.Any])
    if (lastChangeTime != null) __obj.updateDynamic("lastChangeTime")(lastChangeTime.asInstanceOf[js.Any])
    if (reportUrl != null) __obj.updateDynamic("reportUrl")(reportUrl.asInstanceOf[js.Any])
    if (reviewedSite != null) __obj.updateDynamic("reviewedSite")(reviewedSite.asInstanceOf[js.Any])
    if (!js.isUndefined(underReview)) __obj.updateDynamic("underReview")(underReview.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSiteSummaryResponse]
  }
}

