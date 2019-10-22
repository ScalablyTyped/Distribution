package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Circle extends js.Object {
  var circle: js.UndefOr[String] = js.undefined
}

object Anon_Circle {
  @scala.inline
  def apply(circle: String = null): Anon_Circle = {
    val __obj = js.Dynamic.literal()
    if (circle != null) __obj.updateDynamic("circle")(circle)
    __obj.asInstanceOf[Anon_Circle]
  }
}

