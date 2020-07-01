package typings.googleapis.surveysV2Mod.surveysV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaPageInfo extends js.Object {
  var resultPerPage: js.UndefOr[Double] = js.native
  var startIndex: js.UndefOr[Double] = js.native
  var totalResults: js.UndefOr[Double] = js.native
}

object SchemaPageInfo {
  @scala.inline
  def apply(
    resultPerPage: js.UndefOr[Double] = js.undefined,
    startIndex: js.UndefOr[Double] = js.undefined,
    totalResults: js.UndefOr[Double] = js.undefined
  ): SchemaPageInfo = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(resultPerPage)) __obj.updateDynamic("resultPerPage")(resultPerPage.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startIndex)) __obj.updateDynamic("startIndex")(startIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(totalResults)) __obj.updateDynamic("totalResults")(totalResults.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPageInfo]
  }
}

