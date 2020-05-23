package typings.grommet.anon

import typings.grommet.baseMod.ExtendType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Xxlarge extends js.Object {
  var extend: js.UndefOr[ExtendType] = js.undefined
  var large: js.UndefOr[MaxWidth] = js.undefined
  var medium: js.UndefOr[MaxWidth] = js.undefined
  var small: js.UndefOr[MaxWidth] = js.undefined
  var xlarge: js.UndefOr[MaxWidth] = js.undefined
  var xxlarge: js.UndefOr[MaxWidth] = js.undefined
}

object Xxlarge {
  @scala.inline
  def apply(
    extend: ExtendType = null,
    large: MaxWidth = null,
    medium: MaxWidth = null,
    small: MaxWidth = null,
    xlarge: MaxWidth = null,
    xxlarge: MaxWidth = null
  ): Xxlarge = {
    val __obj = js.Dynamic.literal()
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (large != null) __obj.updateDynamic("large")(large.asInstanceOf[js.Any])
    if (medium != null) __obj.updateDynamic("medium")(medium.asInstanceOf[js.Any])
    if (small != null) __obj.updateDynamic("small")(small.asInstanceOf[js.Any])
    if (xlarge != null) __obj.updateDynamic("xlarge")(xlarge.asInstanceOf[js.Any])
    if (xxlarge != null) __obj.updateDynamic("xxlarge")(xxlarge.asInstanceOf[js.Any])
    __obj.asInstanceOf[Xxlarge]
  }
}

