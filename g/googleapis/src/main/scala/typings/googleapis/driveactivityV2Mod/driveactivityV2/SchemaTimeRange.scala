package typings.googleapis.driveactivityV2Mod.driveactivityV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about time ranges.
  */
@js.native
trait SchemaTimeRange extends js.Object {
  /**
    * The end of the time range.
    */
  var endTime: js.UndefOr[String] = js.native
  /**
    * The start of the time range.
    */
  var startTime: js.UndefOr[String] = js.native
}

object SchemaTimeRange {
  @scala.inline
  def apply(endTime: String = null, startTime: String = null): SchemaTimeRange = {
    val __obj = js.Dynamic.literal()
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTimeRange]
  }
}

