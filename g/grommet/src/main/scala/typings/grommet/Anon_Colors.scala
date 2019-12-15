package typings.grommet

import typings.grommet.utilsMod.GraphColorsType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Colors extends js.Object {
  var colors: js.UndefOr[GraphColorsType] = js.undefined
}

object Anon_Colors {
  @scala.inline
  def apply(colors: GraphColorsType = null): Anon_Colors = {
    val __obj = js.Dynamic.literal()
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Colors]
  }
}

