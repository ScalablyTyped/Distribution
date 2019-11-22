package typings.intlDashMessageformatDashParser.libTypesMod

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
    val __obj = js.Dynamic.literal(pattern = pattern)
    __obj.updateDynamic("type")(`type`)
    if (location != null) __obj.updateDynamic("location")(location)
    __obj.asInstanceOf[DateTimeSkeleton]
  }
}

