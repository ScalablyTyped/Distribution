package typings.grommet.anon

import typings.grommet.utilsMod.ColorType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Down extends js.Object {
  var color: js.UndefOr[ColorType] = js.undefined
  var down: js.UndefOr[js.Any] = js.undefined
}

object Down {
  @scala.inline
  def apply(color: ColorType = null, down: js.Any = null): Down = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (down != null) __obj.updateDynamic("down")(down.asInstanceOf[js.Any])
    __obj.asInstanceOf[Down]
  }
}

