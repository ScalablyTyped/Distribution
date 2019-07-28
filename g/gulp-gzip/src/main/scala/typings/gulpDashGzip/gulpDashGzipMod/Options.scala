package typings.gulpDashGzip.gulpDashGzipMod

import typings.node.zlibMod.ZlibOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Appends .gz file extension if true.
    * @default true
    */
  var append: js.UndefOr[Boolean] = js.undefined
  /**
    * Appends an arbitrary extension to the filename. Disables append and preExtension options.
    */
  var extension: js.UndefOr[String] = js.undefined
  /**
    * Options object to pass through to zlib.Gzip.
    * See <a href='https://nodejs.org/api/zlib.html#zlib_options'>zlib</a> documentation for more information.
    */
  var gzipOptions: js.UndefOr[ZlibOptions] = js.undefined
  /**
    * Appends an arbitrary pre-extension to the filename. Disables append and extension options.
    */
  var preExtension: js.UndefOr[String] = js.undefined
  /**
    * Minimum size required to compress a file.
    * @default false
    */
  var threshold: js.UndefOr[Double | String | Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    append: js.UndefOr[Boolean] = js.undefined,
    extension: String = null,
    gzipOptions: ZlibOptions = null,
    preExtension: String = null,
    threshold: Double | String | Boolean = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(append)) __obj.updateDynamic("append")(append)
    if (extension != null) __obj.updateDynamic("extension")(extension)
    if (gzipOptions != null) __obj.updateDynamic("gzipOptions")(gzipOptions)
    if (preExtension != null) __obj.updateDynamic("preExtension")(preExtension)
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

