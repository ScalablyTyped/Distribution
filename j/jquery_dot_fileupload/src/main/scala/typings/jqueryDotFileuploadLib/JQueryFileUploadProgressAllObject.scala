package typings
package jqueryDotFileuploadLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryFileUploadProgressAllObject extends js.Object {
  var bitrate: js.UndefOr[scala.Double] = js.undefined
  var loaded: js.UndefOr[scala.Double] = js.undefined
  var total: js.UndefOr[scala.Double] = js.undefined
}

object JQueryFileUploadProgressAllObject {
  @scala.inline
  def apply(
    bitrate: scala.Int | scala.Double = null,
    loaded: scala.Int | scala.Double = null,
    total: scala.Int | scala.Double = null
  ): JQueryFileUploadProgressAllObject = {
    val __obj = js.Dynamic.literal()
    if (bitrate != null) __obj.updateDynamic("bitrate")(bitrate.asInstanceOf[js.Any])
    if (loaded != null) __obj.updateDynamic("loaded")(loaded.asInstanceOf[js.Any])
    if (total != null) __obj.updateDynamic("total")(total.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryFileUploadProgressAllObject]
  }
}

