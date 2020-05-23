package typings.ip6addr.mod

import typings.ip6addr.ip6addrStrings.`v4-mapped`
import typings.ip6addr.ip6addrStrings.auto
import typings.ip6addr.ip6addrStrings.v4
import typings.ip6addr.ip6addrStrings.v6
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToStringOpts extends js.Object {
  var format: js.UndefOr[auto | v4 | `v4-mapped` | v6] = js.undefined
  var zeroElide: js.UndefOr[Boolean] = js.undefined
  var zeroPad: js.UndefOr[Boolean] = js.undefined
}

object ToStringOpts {
  @scala.inline
  def apply(
    format: auto | v4 | `v4-mapped` | v6 = null,
    zeroElide: js.UndefOr[Boolean] = js.undefined,
    zeroPad: js.UndefOr[Boolean] = js.undefined
  ): ToStringOpts = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(zeroElide)) __obj.updateDynamic("zeroElide")(zeroElide.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zeroPad)) __obj.updateDynamic("zeroPad")(zeroPad.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToStringOpts]
  }
}

