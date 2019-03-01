package typings
package mapboxDashGlLib.mapboxDashGlMod.mapboxglNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyleOptions extends js.Object {
  var transition: js.UndefOr[scala.Boolean] = js.undefined
}

object StyleOptions {
  @scala.inline
  def apply(transition: js.UndefOr[scala.Boolean] = js.undefined): StyleOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(transition)) __obj.updateDynamic("transition")(transition)
    __obj.asInstanceOf[StyleOptions]
  }
}

