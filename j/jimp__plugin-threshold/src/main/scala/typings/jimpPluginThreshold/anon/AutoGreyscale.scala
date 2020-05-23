package typings.jimpPluginThreshold.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoGreyscale extends js.Object {
  var autoGreyscale: js.UndefOr[Boolean] = js.undefined
  var max: Double
  var replace: js.UndefOr[Double] = js.undefined
}

object AutoGreyscale {
  @scala.inline
  def apply(
    max: Double,
    autoGreyscale: js.UndefOr[Boolean] = js.undefined,
    replace: js.UndefOr[Double] = js.undefined
  ): AutoGreyscale = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any])
    if (!js.isUndefined(autoGreyscale)) __obj.updateDynamic("autoGreyscale")(autoGreyscale.get.asInstanceOf[js.Any])
    if (!js.isUndefined(replace)) __obj.updateDynamic("replace")(replace.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoGreyscale]
  }
}

