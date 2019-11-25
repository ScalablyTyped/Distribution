package typings.mapboxDashGl.mapboxDashGlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyleOptions extends js.Object {
  var transition: js.UndefOr[Boolean] = js.undefined
}

object StyleOptions {
  @scala.inline
  def apply(transition: js.UndefOr[Boolean] = js.undefined): StyleOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(transition)) __obj.updateDynamic("transition")(transition.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleOptions]
  }
}

