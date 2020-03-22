package typings.ionicReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonForceLinearEasing extends js.Object {
  var forceLinearEasing: Boolean
  var step: js.UndefOr[Double] = js.undefined
}

object AnonForceLinearEasing {
  @scala.inline
  def apply(forceLinearEasing: Boolean, step: Int | Double = null): AnonForceLinearEasing = {
    val __obj = js.Dynamic.literal(forceLinearEasing = forceLinearEasing.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonForceLinearEasing]
  }
}

