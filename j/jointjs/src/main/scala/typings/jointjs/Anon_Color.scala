package typings.jointjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Color extends js.Object {
  var color: String
  var offset: String
  var opacity: js.UndefOr[Double] = js.undefined
}

object Anon_Color {
  @scala.inline
  def apply(color: String, offset: String, opacity: Int | Double = null): Anon_Color = {
    val __obj = js.Dynamic.literal(color = color, offset = offset)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Color]
  }
}

