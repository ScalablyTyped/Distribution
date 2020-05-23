package typings.grommet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorHeight extends js.Object {
  var color: js.UndefOr[js.Any] = js.undefined
  var height: js.UndefOr[String] = js.undefined
}

object ColorHeight {
  @scala.inline
  def apply(color: js.Any = null, height: String = null): ColorHeight = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorHeight]
  }
}

