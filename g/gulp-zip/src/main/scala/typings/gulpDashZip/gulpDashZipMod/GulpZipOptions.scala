package typings.gulpDashZip.gulpDashZipMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GulpZipOptions extends js.Object {
  /**
    * Compress
    * @default true
    */
  var compress: js.UndefOr[Boolean] = js.undefined
}

object GulpZipOptions {
  @scala.inline
  def apply(compress: js.UndefOr[Boolean] = js.undefined): GulpZipOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(compress)) __obj.updateDynamic("compress")(compress)
    __obj.asInstanceOf[GulpZipOptions]
  }
}

