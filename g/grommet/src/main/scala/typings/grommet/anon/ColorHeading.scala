package typings.grommet.anon

import typings.grommet.utilsMod.ColorType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorHeading extends js.Object {
  var color: js.UndefOr[ColorType] = js.undefined
   // deprecated
  var heading: js.UndefOr[`1`] = js.undefined
}

object ColorHeading {
  @scala.inline
  def apply(color: ColorType = null, heading: `1` = null): ColorHeading = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (heading != null) __obj.updateDynamic("heading")(heading.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorHeading]
  }
}

