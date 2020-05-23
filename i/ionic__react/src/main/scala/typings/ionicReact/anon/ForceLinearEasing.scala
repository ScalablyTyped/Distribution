package typings.ionicReact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ForceLinearEasing extends js.Object {
  var forceLinearEasing: Boolean
  var step: js.UndefOr[Double] = js.undefined
}

object ForceLinearEasing {
  @scala.inline
  def apply(forceLinearEasing: Boolean, step: js.UndefOr[Double] = js.undefined): ForceLinearEasing = {
    val __obj = js.Dynamic.literal(forceLinearEasing = forceLinearEasing.asInstanceOf[js.Any])
    if (!js.isUndefined(step)) __obj.updateDynamic("step")(step.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForceLinearEasing]
  }
}

