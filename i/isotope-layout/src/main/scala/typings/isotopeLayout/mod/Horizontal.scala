package typings.isotopeLayout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Horizontal extends js.Object {
  var verticalAligment: js.UndefOr[Double] = js.undefined
}

object Horizontal {
  @scala.inline
  def apply(verticalAligment: js.UndefOr[Double] = js.undefined): Horizontal = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(verticalAligment)) __obj.updateDynamic("verticalAligment")(verticalAligment.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Horizontal]
  }
}

