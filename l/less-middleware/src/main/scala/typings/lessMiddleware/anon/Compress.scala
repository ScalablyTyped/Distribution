package typings.lessMiddleware.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Compress extends js.Object {
  var compress: js.UndefOr[String] = js.undefined
  var paths: js.UndefOr[js.Array[String]] = js.undefined
  var yuicompress: js.UndefOr[Boolean] = js.undefined
}

object Compress {
  @scala.inline
  def apply(
    compress: String = null,
    paths: js.Array[String] = null,
    yuicompress: js.UndefOr[Boolean] = js.undefined
  ): Compress = {
    val __obj = js.Dynamic.literal()
    if (compress != null) __obj.updateDynamic("compress")(compress.asInstanceOf[js.Any])
    if (paths != null) __obj.updateDynamic("paths")(paths.asInstanceOf[js.Any])
    if (!js.isUndefined(yuicompress)) __obj.updateDynamic("yuicompress")(yuicompress.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Compress]
  }
}

