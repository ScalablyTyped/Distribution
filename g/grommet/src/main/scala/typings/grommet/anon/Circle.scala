package typings.grommet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Circle extends js.Object {
  var circle: js.UndefOr[String] = js.undefined
}

object Circle {
  @scala.inline
  def apply(circle: String = null): Circle = {
    val __obj = js.Dynamic.literal()
    if (circle != null) __obj.updateDynamic("circle")(circle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Circle]
  }
}

