package typings.jimp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAutoGreyscale extends js.Object {
  var autoGreyscale: js.UndefOr[Boolean] = js.undefined
  var max: Double
  var replace: js.UndefOr[Double] = js.undefined
}

object AnonAutoGreyscale {
  @scala.inline
  def apply(max: Double, autoGreyscale: js.UndefOr[Boolean] = js.undefined, replace: Int | Double = null): AnonAutoGreyscale = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any])
    if (!js.isUndefined(autoGreyscale)) __obj.updateDynamic("autoGreyscale")(autoGreyscale.asInstanceOf[js.Any])
    if (replace != null) __obj.updateDynamic("replace")(replace.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAutoGreyscale]
  }
}

