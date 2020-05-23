package typings.leafletLoading.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapOptions extends js.Object {
  var loadingControl: js.UndefOr[Boolean] = js.undefined
}

object MapOptions {
  @scala.inline
  def apply(loadingControl: js.UndefOr[Boolean] = js.undefined): MapOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(loadingControl)) __obj.updateDynamic("loadingControl")(loadingControl.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapOptions]
  }
}

