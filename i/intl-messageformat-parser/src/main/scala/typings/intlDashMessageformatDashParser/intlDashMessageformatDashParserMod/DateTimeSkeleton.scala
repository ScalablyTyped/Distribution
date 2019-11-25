package typings.intlDashMessageformatDashParser.intlDashMessageformatDashParserMod

import typings.intlDashMessageformatDashParser.intlDashMessageformatDashParserNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DateTimeSkeleton extends Skeleton {
  var location: js.UndefOr[Location] = js.undefined
  var pattern: String
  var `type`: `1`
}

object DateTimeSkeleton {
  @scala.inline
  def apply(pattern: String, `type`: `1`, location: Location = null): DateTimeSkeleton = {
    val __obj = js.Dynamic.literal(pattern = pattern.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateTimeSkeleton]
  }
}

