package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccessibilityAnnounceNewDataOptions extends js.Object {
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Optional formatter callback for
    * the announcement. Receives up to three arguments. The first argument is
    * always an array of all series that received updates. If an announcement
    * is already queued, the series that received updates for that announcement
    * are also included in this array. The second argument is provided if
    * `chart.addSeries` was called, and there is a new series. In that case,
    * this argument is a reference to the new series. The third argument,
    * similarly, is provided if `series.addPoint` was called, and there is a
    * new point. In that case, this argument is a reference to the new point.
    *
    * The function should return a string with the text to announce to the
    * user. Return empty string to not announce anything. Return `false` to use
    * the default announcement format.
    */
  var announcementFormatter: js.UndefOr[js.Function] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Enable announcing new data to
    * screen reader users
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Choose whether or not the
    * announcements should interrupt the screen reader. If not enabled, the
    * user will be notified once idle. It is recommended not to enable this
    * setting unless there is a specific reason to do so.
    */
  var interruptUser: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Minimum interval between
    * announcements in milliseconds. If new data arrives before this amount of
    * time has passed, it is queued for announcement. If another new data event
    * happens while an announcement is queued, the queued announcement is
    * dropped, and the latest announcement is queued instead. Set to 0 to allow
    * all announcements, but be warned that frequent announcements are
    * disturbing to users.
    */
  var minAnnounceInterval: js.UndefOr[Double] = js.undefined
}

object AccessibilityAnnounceNewDataOptions {
  @scala.inline
  def apply(
    announcementFormatter: js.Function = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    interruptUser: js.UndefOr[Boolean] = js.undefined,
    minAnnounceInterval: Int | Double = null
  ): AccessibilityAnnounceNewDataOptions = {
    val __obj = js.Dynamic.literal()
    if (announcementFormatter != null) __obj.updateDynamic("announcementFormatter")(announcementFormatter.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (!js.isUndefined(interruptUser)) __obj.updateDynamic("interruptUser")(interruptUser.asInstanceOf[js.Any])
    if (minAnnounceInterval != null) __obj.updateDynamic("minAnnounceInterval")(minAnnounceInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessibilityAnnounceNewDataOptions]
  }
}

