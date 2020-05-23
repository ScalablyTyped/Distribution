package typings.iotaLibJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Checksum extends js.Object {
  var checksum: js.UndefOr[Boolean] = js.undefined
  var index: js.UndefOr[Double] = js.undefined
  var returnAll: js.UndefOr[Boolean] = js.undefined
  var security: js.UndefOr[typings.iotaLibJs.mod.Security] = js.undefined
  var total: js.UndefOr[Double] = js.undefined
}

object Checksum {
  @scala.inline
  def apply(
    checksum: js.UndefOr[Boolean] = js.undefined,
    index: js.UndefOr[Double] = js.undefined,
    returnAll: js.UndefOr[Boolean] = js.undefined,
    security: typings.iotaLibJs.mod.Security = null,
    total: js.UndefOr[Double] = js.undefined
  ): Checksum = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checksum)) __obj.updateDynamic("checksum")(checksum.get.asInstanceOf[js.Any])
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    if (!js.isUndefined(returnAll)) __obj.updateDynamic("returnAll")(returnAll.get.asInstanceOf[js.Any])
    if (security != null) __obj.updateDynamic("security")(security.asInstanceOf[js.Any])
    if (!js.isUndefined(total)) __obj.updateDynamic("total")(total.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Checksum]
  }
}

