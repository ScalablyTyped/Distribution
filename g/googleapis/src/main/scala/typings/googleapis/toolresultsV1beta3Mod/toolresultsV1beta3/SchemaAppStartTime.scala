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
  def apply(): SchemaAppStartTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppStartTime]
  }
  @scala.inline
  implicit class SchemaAppStartTimeOps[Self <: SchemaAppStartTime] (val x: Self) extends AnyVal {
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
    def setFullyDrawnTime(value: SchemaDuration): Self = this.set("fullyDrawnTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullyDrawnTime: Self = this.set("fullyDrawnTime", js.undefined)
    @scala.inline
    def setInitialDisplayTime(value: SchemaDuration): Self = this.set("initialDisplayTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialDisplayTime: Self = this.set("initialDisplayTime", js.undefined)
  }
  
}

