package typings.jqueryFileupload

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryFileUploadProgressAllObject extends js.Object {
  var bitrate: js.UndefOr[Double] = js.undefined
  var loaded: js.UndefOr[Double] = js.undefined
  var total: js.UndefOr[Double] = js.undefined
}

object JQueryFileUploadProgressAllObject {
  @scala.inline
  def apply(
    bitrate: js.UndefOr[Double] = js.undefined,
    loaded: js.UndefOr[Double] = js.undefined,
    total: js.UndefOr[Double] = js.undefined
  ): JQueryFileUploadProgressAllObject = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bitrate)) __obj.updateDynamic("bitrate")(bitrate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(loaded)) __obj.updateDynamic("loaded")(loaded.get.asInstanceOf[js.Any])
    if (!js.isUndefined(total)) __obj.updateDynamic("total")(total.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryFileUploadProgressAllObject]
  }
}

