package typings.atMapboxMapboxDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Reverse extends js.Object {
  var reverse: js.UndefOr[Boolean] = js.undefined
}

object Anon_Reverse {
  @scala.inline
  def apply(reverse: js.UndefOr[Boolean] = js.undefined): Anon_Reverse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse)
    __obj.asInstanceOf[Anon_Reverse]
  }
}

