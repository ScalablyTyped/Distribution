package typings.grommet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Heading extends js.Object {
  var heading: js.UndefOr[Level] = js.undefined
  var icons: js.UndefOr[Previous] = js.undefined
  var large: js.UndefOr[DaySize] = js.undefined
  var medium: js.UndefOr[DaySize] = js.undefined
  var small: js.UndefOr[DaySize] = js.undefined
}

object Heading {
  @scala.inline
  def apply(
    heading: Level = null,
    icons: Previous = null,
    large: DaySize = null,
    medium: DaySize = null,
    small: DaySize = null
  ): Heading = {
    val __obj = js.Dynamic.literal()
    if (heading != null) __obj.updateDynamic("heading")(heading.asInstanceOf[js.Any])
    if (icons != null) __obj.updateDynamic("icons")(icons.asInstanceOf[js.Any])
    if (large != null) __obj.updateDynamic("large")(large.asInstanceOf[js.Any])
    if (medium != null) __obj.updateDynamic("medium")(medium.asInstanceOf[js.Any])
    if (small != null) __obj.updateDynamic("small")(small.asInstanceOf[js.Any])
    __obj.asInstanceOf[Heading]
  }
}

