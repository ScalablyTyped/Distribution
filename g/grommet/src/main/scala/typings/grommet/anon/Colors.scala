package typings.grommet.anon

import typings.grommet.utilsMod.GraphColorsType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Colors extends js.Object {
  var colors: js.UndefOr[GraphColorsType] = js.undefined
}

object Colors {
  @scala.inline
  def apply(colors: GraphColorsType = null): Colors = {
    val __obj = js.Dynamic.literal()
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    __obj.asInstanceOf[Colors]
  }
}

