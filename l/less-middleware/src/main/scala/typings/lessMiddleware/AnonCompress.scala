package typings.lessMiddleware

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCompress extends js.Object {
  var compress: js.UndefOr[String] = js.undefined
  var paths: js.UndefOr[js.Array[String]] = js.undefined
  var yuicompress: js.UndefOr[Boolean] = js.undefined
}

object AnonCompress {
  @scala.inline
  def apply(
    compress: String = null,
    paths: js.Array[String] = null,
    yuicompress: js.UndefOr[Boolean] = js.undefined
  ): AnonCompress = {
    val __obj = js.Dynamic.literal()
    if (compress != null) __obj.updateDynamic("compress")(compress.asInstanceOf[js.Any])
    if (paths != null) __obj.updateDynamic("paths")(paths.asInstanceOf[js.Any])
    if (!js.isUndefined(yuicompress)) __obj.updateDynamic("yuicompress")(yuicompress.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCompress]
  }
}

