package typings.jqueryui.JQueryUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExplodeEffect extends js.Object {
  var pieces: js.UndefOr[Double] = js.undefined
}

object ExplodeEffect {
  @scala.inline
  def apply(pieces: js.UndefOr[Double] = js.undefined): ExplodeEffect = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(pieces)) __obj.updateDynamic("pieces")(pieces.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExplodeEffect]
  }
}

