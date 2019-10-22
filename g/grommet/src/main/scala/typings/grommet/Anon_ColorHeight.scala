package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColorHeight extends js.Object {
  var color: js.UndefOr[js.Any] = js.undefined
  var height: js.UndefOr[String] = js.undefined
}

object Anon_ColorHeight {
  @scala.inline
  def apply(color: js.Any = null, height: String = null): Anon_ColorHeight = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (height != null) __obj.updateDynamic("height")(height)
    __obj.asInstanceOf[Anon_ColorHeight]
  }
}

