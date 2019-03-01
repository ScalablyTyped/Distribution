package typings
package ipDashRegexLib.ipDashRegexMod.ipNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IpRegexOptions extends js.Object {
  var exact: js.UndefOr[scala.Boolean] = js.undefined
}

object IpRegexOptions {
  @scala.inline
  def apply(exact: js.UndefOr[scala.Boolean] = js.undefined): IpRegexOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(exact)) __obj.updateDynamic("exact")(exact)
    __obj.asInstanceOf[IpRegexOptions]
  }
}

