package typings.iotaLibJs

import typings.iotaLibJs.mod.Security
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChecksum extends js.Object {
  var checksum: js.UndefOr[Boolean] = js.undefined
  var index: js.UndefOr[Double] = js.undefined
  var returnAll: js.UndefOr[Boolean] = js.undefined
  var security: js.UndefOr[Security] = js.undefined
  var total: js.UndefOr[Double] = js.undefined
}

object AnonChecksum {
  @scala.inline
  def apply(
    checksum: js.UndefOr[Boolean] = js.undefined,
    index: Int | Double = null,
    returnAll: js.UndefOr[Boolean] = js.undefined,
    security: Security = null,
    total: Int | Double = null
  ): AnonChecksum = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checksum)) __obj.updateDynamic("checksum")(checksum.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (!js.isUndefined(returnAll)) __obj.updateDynamic("returnAll")(returnAll.asInstanceOf[js.Any])
    if (security != null) __obj.updateDynamic("security")(security.asInstanceOf[js.Any])
    if (total != null) __obj.updateDynamic("total")(total.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChecksum]
  }
}

