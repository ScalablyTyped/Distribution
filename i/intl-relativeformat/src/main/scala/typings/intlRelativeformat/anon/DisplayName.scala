package typings.intlRelativeformat.anon

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisplayName extends js.Object {
  var displayName: String
  var relative: Record[String, String]
  var relativePeriod: js.UndefOr[String] = js.undefined
  var relativeTime: Future
}

object DisplayName {
  @scala.inline
  def apply(
    displayName: String,
    relative: Record[String, String],
    relativeTime: Future,
    relativePeriod: String = null
  ): DisplayName = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], relative = relative.asInstanceOf[js.Any], relativeTime = relativeTime.asInstanceOf[js.Any])
    if (relativePeriod != null) __obj.updateDynamic("relativePeriod")(relativePeriod.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplayName]
  }
}

