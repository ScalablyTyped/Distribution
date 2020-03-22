package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHeading extends js.Object {
  var heading: js.UndefOr[AnonLevel] = js.undefined
  var icons: js.UndefOr[AnonPrevious] = js.undefined
  var large: js.UndefOr[AnonDaySize] = js.undefined
  var medium: js.UndefOr[AnonDaySize] = js.undefined
  var small: js.UndefOr[AnonDaySize] = js.undefined
}

object AnonHeading {
  @scala.inline
  def apply(
    heading: AnonLevel = null,
    icons: AnonPrevious = null,
    large: AnonDaySize = null,
    medium: AnonDaySize = null,
    small: AnonDaySize = null
  ): AnonHeading = {
    val __obj = js.Dynamic.literal()
    if (heading != null) __obj.updateDynamic("heading")(heading.asInstanceOf[js.Any])
    if (icons != null) __obj.updateDynamic("icons")(icons.asInstanceOf[js.Any])
    if (large != null) __obj.updateDynamic("large")(large.asInstanceOf[js.Any])
    if (medium != null) __obj.updateDynamic("medium")(medium.asInstanceOf[js.Any])
    if (small != null) __obj.updateDynamic("small")(small.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHeading]
  }
}

