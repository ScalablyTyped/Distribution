package typings.isotopeLayout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Vertical extends js.Object {
  var horizontalAlignment: js.UndefOr[Double] = js.undefined
}

object Vertical {
  @scala.inline
  def apply(horizontalAlignment: js.UndefOr[Double] = js.undefined): Vertical = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(horizontalAlignment)) __obj.updateDynamic("horizontalAlignment")(horizontalAlignment.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Vertical]
  }
}

