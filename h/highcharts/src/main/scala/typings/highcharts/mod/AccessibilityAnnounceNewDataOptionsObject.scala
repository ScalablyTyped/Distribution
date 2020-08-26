package typings.highcharts.mod

import typings.highcharts.highchartsBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccessibilityAnnounceNewDataOptionsObject extends js.Object {
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
  var announcementFormatter: js.UndefOr[AccessibilityAnnouncementFormatter] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Enable announcing new data to
    * screen reader users
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Choose whether or not the
    * announcements should interrupt the screen reader. If not enabled, the
    * user will be notified once idle. It is recommended not to enable this
    * setting unless there is a specific reason to do so.
    */
  var interruptUser: js.UndefOr[Boolean] = js.native
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Minimum interval between
    * announcements in milliseconds. If new data arrives before this amount of
    * time has passed, it is queued for announcement. If another new data event
    * happens while an announcement is queued, the queued announcement is
    * dropped, and the latest announcement is queued instead. Set to 0 to allow
    * all announcements, but be warned that frequent announcements are
    * disturbing to users.
    */
  var minAnnounceInterval: js.UndefOr[Double] = js.native
}

object AccessibilityAnnounceNewDataOptionsObject {
  @scala.inline
  def apply(): AccessibilityAnnounceNewDataOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessibilityAnnounceNewDataOptionsObject]
  }
  @scala.inline
  implicit class AccessibilityAnnounceNewDataOptionsObjectOps[Self <: AccessibilityAnnounceNewDataOptionsObject] (val x: Self) extends AnyVal {
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
    def setAnnouncementFormatter(
      value: (/* updatedSeries */ js.Array[Series], /* addedSeries */ js.UndefOr[Series], /* addedPoint */ js.UndefOr[Point]) => `false` | String
    ): Self = this.set("announcementFormatter", js.Any.fromFunction3(value))
    @scala.inline
    def deleteAnnouncementFormatter: Self = this.set("announcementFormatter", js.undefined)
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setInterruptUser(value: Boolean): Self = this.set("interruptUser", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterruptUser: Self = this.set("interruptUser", js.undefined)
    @scala.inline
    def setMinAnnounceInterval(value: Double): Self = this.set("minAnnounceInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinAnnounceInterval: Self = this.set("minAnnounceInterval", js.undefined)
  }
  
}

