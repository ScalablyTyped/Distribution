package typings.jqueryui.JQueryUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExplodeEffect extends js.Object {
  var pieces: js.UndefOr[Double] = js.undefined
}

object ExplodeEffect {
  @scala.inline
  def apply(pieces: Int | Double = null): ExplodeEffect = {
    val __obj = js.Dynamic.literal()
    if (pieces != null) __obj.updateDynamic("pieces")(pieces.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExplodeEffect]
  }
}

