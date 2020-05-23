package typings.gulpZip.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GulpZipOptions extends js.Object {
  /**
    * Compress
    * @default true
    */
  var compress: js.UndefOr[Boolean] = js.undefined
  /**
    * Overrides the modification timestamp for all files added to the archive.
    *
    * Tip: Setting it to the same value across executions enables you to create stable archives
    * that change only when the contents of their entries change, regardless of whether those
    * entries were "touched" or regenerated.
    *
    * @default undefined
    */
  var modifiedTime: js.UndefOr[Date] = js.undefined
}

object GulpZipOptions {
  @scala.inline
  def apply(compress: js.UndefOr[Boolean] = js.undefined, modifiedTime: Date = null): GulpZipOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(compress)) __obj.updateDynamic("compress")(compress.get.asInstanceOf[js.Any])
    if (modifiedTime != null) __obj.updateDynamic("modifiedTime")(modifiedTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[GulpZipOptions]
  }
}

