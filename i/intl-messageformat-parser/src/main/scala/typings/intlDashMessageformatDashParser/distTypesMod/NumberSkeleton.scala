package typings.intlDashMessageformatDashParser.distTypesMod

import typings.intlDashMessageformatDashParser.intlDashMessageformatDashParserNumbers.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumberSkeleton extends Skeleton {
  var location: js.UndefOr[Location] = js.undefined
  var tokens: js.Array[NumberSkeletonToken]
  var `type`: `0`
}

object NumberSkeleton {
  @scala.inline
  def apply(tokens: js.Array[NumberSkeletonToken], `type`: `0`, location: Location = null): NumberSkeleton = {
    val __obj = js.Dynamic.literal(tokens = tokens)
    __obj.updateDynamic("type")(`type`)
    if (location != null) __obj.updateDynamic("location")(location)
    __obj.asInstanceOf[NumberSkeleton]
  }
}

