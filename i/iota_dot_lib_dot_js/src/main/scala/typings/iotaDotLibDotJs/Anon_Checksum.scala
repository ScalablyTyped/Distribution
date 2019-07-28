package typings.iotaDotLibDotJs

import typings.iotaDotLibDotJs.iotaDotLibDotJsMod.Security
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Checksum extends js.Object {
  var checksum: js.UndefOr[Boolean] = js.undefined
  var index: js.UndefOr[Double] = js.undefined
  var returnAll: js.UndefOr[Boolean] = js.undefined
  var security: js.UndefOr[Security] = js.undefined
  var total: js.UndefOr[Double] = js.undefined
}

object Anon_Checksum {
  @scala.inline
  def apply(
    checksum: js.UndefOr[Boolean] = js.undefined,
    index: Int | Double = null,
    returnAll: js.UndefOr[Boolean] = js.undefined,
    security: Security = null,
    total: Int | Double = null
  ): Anon_Checksum = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checksum)) __obj.updateDynamic("checksum")(checksum)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (!js.isUndefined(returnAll)) __obj.updateDynamic("returnAll")(returnAll)
    if (security != null) __obj.updateDynamic("security")(security)
    if (total != null) __obj.updateDynamic("total")(total.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Checksum]
  }
}

