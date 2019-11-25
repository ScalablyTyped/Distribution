package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LangAccessibilityAnnounceNewDataOptions extends js.Object {
  var newDataAnnounce: js.UndefOr[String] = js.undefined
  var newPointAnnounceMultiple: js.UndefOr[String] = js.undefined
  var newPointAnnounceSingle: js.UndefOr[String] = js.undefined
  var newSeriesAnnounceMultiple: js.UndefOr[String] = js.undefined
  var newSeriesAnnounceSingle: js.UndefOr[String] = js.undefined
}

object LangAccessibilityAnnounceNewDataOptions {
  @scala.inline
  def apply(
    newDataAnnounce: String = null,
    newPointAnnounceMultiple: String = null,
    newPointAnnounceSingle: String = null,
    newSeriesAnnounceMultiple: String = null,
    newSeriesAnnounceSingle: String = null
  ): LangAccessibilityAnnounceNewDataOptions = {
    val __obj = js.Dynamic.literal()
    if (newDataAnnounce != null) __obj.updateDynamic("newDataAnnounce")(newDataAnnounce.asInstanceOf[js.Any])
    if (newPointAnnounceMultiple != null) __obj.updateDynamic("newPointAnnounceMultiple")(newPointAnnounceMultiple.asInstanceOf[js.Any])
    if (newPointAnnounceSingle != null) __obj.updateDynamic("newPointAnnounceSingle")(newPointAnnounceSingle.asInstanceOf[js.Any])
    if (newSeriesAnnounceMultiple != null) __obj.updateDynamic("newSeriesAnnounceMultiple")(newSeriesAnnounceMultiple.asInstanceOf[js.Any])
    if (newSeriesAnnounceSingle != null) __obj.updateDynamic("newSeriesAnnounceSingle")(newSeriesAnnounceSingle.asInstanceOf[js.Any])
    __obj.asInstanceOf[LangAccessibilityAnnounceNewDataOptions]
  }
}

