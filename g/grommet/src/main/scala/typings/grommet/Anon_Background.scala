package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Background extends js.Object {
  var background: js.UndefOr[js.Object] = js.undefined
  var border: js.UndefOr[js.Object] = js.undefined
  var pad: js.UndefOr[js.Object] = js.undefined
}

object Anon_Background {
  @scala.inline
  def apply(background: js.Object = null, border: js.Object = null, pad: js.Object = null): Anon_Background = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background)
    if (border != null) __obj.updateDynamic("border")(border)
    if (pad != null) __obj.updateDynamic("pad")(pad)
    __obj.asInstanceOf[Anon_Background]
  }
}

