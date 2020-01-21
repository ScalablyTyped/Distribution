package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorSelectedEventUIParam extends js.Object {
  /**
  	 * Used to get a reference to the color object.
  	 */
  var color: js.UndefOr[js.Any] = js.undefined
}

object ColorSelectedEventUIParam {
  @scala.inline
  def apply(color: js.Any = null): ColorSelectedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorSelectedEventUIParam]
  }
}

