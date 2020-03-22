package typings.intlRelativeformat

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDisplayName extends js.Object {
  var displayName: String
  var relative: Record[String, String]
  var relativePeriod: js.UndefOr[String] = js.undefined
  var relativeTime: AnonFuture
}

object AnonDisplayName {
  @scala.inline
  def apply(
    displayName: String,
    relative: Record[String, String],
    relativeTime: AnonFuture,
    relativePeriod: String = null
  ): AnonDisplayName = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], relative = relative.asInstanceOf[js.Any], relativeTime = relativeTime.asInstanceOf[js.Any])
    if (relativePeriod != null) __obj.updateDynamic("relativePeriod")(relativePeriod.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDisplayName]
  }
}

