package typings.grommet

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDictx
  extends /* x */ StringDictionary[js.UndefOr[AnonBorderSize]] {
  var large: js.UndefOr[AnonBorderSize] = js.undefined
  var medium: js.UndefOr[AnonBorderSize] = js.undefined
  var small: js.UndefOr[AnonBorderSize] = js.undefined
}

object AnonDictx {
  @scala.inline
  def apply(
    StringDictionary: /* x */ StringDictionary[js.UndefOr[AnonBorderSize]] = null,
    large: AnonBorderSize = null,
    medium: AnonBorderSize = null,
    small: AnonBorderSize = null
  ): AnonDictx = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (large != null) __obj.updateDynamic("large")(large.asInstanceOf[js.Any])
    if (medium != null) __obj.updateDynamic("medium")(medium.asInstanceOf[js.Any])
    if (small != null) __obj.updateDynamic("small")(small.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDictx]
  }
}

