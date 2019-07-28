package typings.jointjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Angle extends js.Object {
  var angle: js.UndefOr[Double] = js.undefined
}

object Anon_Angle {
  @scala.inline
  def apply(angle: Int | Double = null): Anon_Angle = {
    val __obj = js.Dynamic.literal()
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Angle]
  }
}

