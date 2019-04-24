package typings
package koaDashResponseDashTimeLib.koaDashResponseDashTimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KoaResponseTimeOptions extends js.Object {
  var hrtime: js.UndefOr[scala.Boolean] = js.undefined
}

object KoaResponseTimeOptions {
  @scala.inline
  def apply(hrtime: js.UndefOr[scala.Boolean] = js.undefined): KoaResponseTimeOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(hrtime)) __obj.updateDynamic("hrtime")(hrtime)
    __obj.asInstanceOf[KoaResponseTimeOptions]
  }
}

