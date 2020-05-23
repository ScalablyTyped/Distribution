package typings.grommet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Huge extends js.Object {
  var huge: js.UndefOr[String] = js.undefined
  var large: js.UndefOr[String] = js.undefined
  var medium: js.UndefOr[String] = js.undefined
  var small: js.UndefOr[String] = js.undefined
  var xlarge: js.UndefOr[String] = js.undefined
}

object Huge {
  @scala.inline
  def apply(
    huge: String = null,
    large: String = null,
    medium: String = null,
    small: String = null,
    xlarge: String = null
  ): Huge = {
    val __obj = js.Dynamic.literal()
    if (huge != null) __obj.updateDynamic("huge")(huge.asInstanceOf[js.Any])
    if (large != null) __obj.updateDynamic("large")(large.asInstanceOf[js.Any])
    if (medium != null) __obj.updateDynamic("medium")(medium.asInstanceOf[js.Any])
    if (small != null) __obj.updateDynamic("small")(small.asInstanceOf[js.Any])
    if (xlarge != null) __obj.updateDynamic("xlarge")(xlarge.asInstanceOf[js.Any])
    __obj.asInstanceOf[Huge]
  }
}

