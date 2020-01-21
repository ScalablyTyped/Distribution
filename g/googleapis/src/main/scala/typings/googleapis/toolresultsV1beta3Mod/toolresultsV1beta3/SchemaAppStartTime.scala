package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaAppStartTime extends js.Object {
  /**
    * Optional. The time from app start to reaching the developer-reported
    * &quot;fully drawn&quot; time. This is only stored if the app includes a
    * call to Activity.reportFullyDrawn(). See
    * https://developer.android.com/topic/performance/launch-time.html#time-full
    */
  var fullyDrawnTime: js.UndefOr[SchemaDuration] = js.native
  /**
    * The time from app start to the first displayed activity being drawn, as
    * reported in Logcat. See
    * https://developer.android.com/topic/performance/launch-time.html#time-initial
    */
  var initialDisplayTime: js.UndefOr[SchemaDuration] = js.native
}

object SchemaAppStartTime {
  @scala.inline
  def apply(fullyDrawnTime: SchemaDuration = null, initialDisplayTime: SchemaDuration = null): SchemaAppStartTime = {
    val __obj = js.Dynamic.literal()
    if (fullyDrawnTime != null) __obj.updateDynamic("fullyDrawnTime")(fullyDrawnTime.asInstanceOf[js.Any])
    if (initialDisplayTime != null) __obj.updateDynamic("initialDisplayTime")(initialDisplayTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAppStartTime]
  }
}

