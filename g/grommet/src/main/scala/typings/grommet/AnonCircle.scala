package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCircle extends js.Object {
  var circle: js.UndefOr[String] = js.undefined
}

object AnonCircle {
  @scala.inline
  def apply(circle: String = null): AnonCircle = {
    val __obj = js.Dynamic.literal()
    if (circle != null) __obj.updateDynamic("circle")(circle.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCircle]
  }
}

