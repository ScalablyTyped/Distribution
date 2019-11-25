package typings.logrotateDashStream.logrotateDashStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Optionally compress rotated files with gzip.
    */
  var compress: js.UndefOr[Boolean] = js.undefined
  /**
    * The file log file to write data to.
    */
  var file: String
  /**
    * The number of rotated log files to keep (including the primary log file). Additional logs are deleted no rotation.
    */
  var keep: Double
  /**
    * The max file size of a log before rotation occurs. Supports 1024, 1k, 1m, 1g
    */
  var size: String
}

object Options {
  @scala.inline
  def apply(file: String, keep: Double, size: String, compress: js.UndefOr[Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], keep = keep.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    if (!js.isUndefined(compress)) __obj.updateDynamic("compress")(compress.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

