package typings.jimp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoGreyscale extends js.Object {
  var autoGreyscale: js.UndefOr[Boolean] = js.undefined
  var max: Double
  var replace: js.UndefOr[Double] = js.undefined
}

object Anon_AutoGreyscale {
  @scala.inline
  def apply(max: Double, autoGreyscale: js.UndefOr[Boolean] = js.undefined, replace: Int | Double = null): Anon_AutoGreyscale = {
    val __obj = js.Dynamic.literal(max = max)
    if (!js.isUndefined(autoGreyscale)) __obj.updateDynamic("autoGreyscale")(autoGreyscale)
    if (replace != null) __obj.updateDynamic("replace")(replace.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AutoGreyscale]
  }
}

