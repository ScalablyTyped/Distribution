package typings.mapboxMapboxSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonReverse extends js.Object {
  var reverse: js.UndefOr[Boolean] = js.undefined
}

object AnonReverse {
  @scala.inline
  def apply(reverse: js.UndefOr[Boolean] = js.undefined): AnonReverse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonReverse]
  }
}

