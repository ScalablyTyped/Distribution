package typings.grommet

import typings.grommet.themesBaseMod.ExtendType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExtendLarge extends js.Object {
  var extend: js.UndefOr[ExtendType] = js.undefined
  var large: js.UndefOr[Anon_HeightMaxWidth] = js.undefined
  var medium: js.UndefOr[Anon_HeightMaxWidth] = js.undefined
  var small: js.UndefOr[Anon_HeightMaxWidth] = js.undefined
  var xlarge: js.UndefOr[Anon_HeightMaxWidth] = js.undefined
  var xxlarge: js.UndefOr[Anon_HeightMaxWidth] = js.undefined
}

object Anon_ExtendLarge {
  @scala.inline
  def apply(
    extend: ExtendType = null,
    large: Anon_HeightMaxWidth = null,
    medium: Anon_HeightMaxWidth = null,
    small: Anon_HeightMaxWidth = null,
    xlarge: Anon_HeightMaxWidth = null,
    xxlarge: Anon_HeightMaxWidth = null
  ): Anon_ExtendLarge = {
    val __obj = js.Dynamic.literal()
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (large != null) __obj.updateDynamic("large")(large.asInstanceOf[js.Any])
    if (medium != null) __obj.updateDynamic("medium")(medium.asInstanceOf[js.Any])
    if (small != null) __obj.updateDynamic("small")(small.asInstanceOf[js.Any])
    if (xlarge != null) __obj.updateDynamic("xlarge")(xlarge.asInstanceOf[js.Any])
    if (xxlarge != null) __obj.updateDynamic("xxlarge")(xxlarge.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ExtendLarge]
  }
}

