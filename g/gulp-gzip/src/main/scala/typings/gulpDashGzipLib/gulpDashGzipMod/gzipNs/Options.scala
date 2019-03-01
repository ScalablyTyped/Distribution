package typings
package gulpDashGzipLib.gulpDashGzipMod.gzipNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Appends .gz file extension if true.
    * @default true
    */
  var append: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Appends an arbitrary extension to the filename. Disables append and preExtension options.
    */
  var extension: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Options object to pass through to zlib.Gzip.
    * See <a href='https://nodejs.org/api/zlib.html#zlib_options'>zlib</a> documentation for more information.
    */
  var gzipOptions: js.UndefOr[nodeLib.zlibMod.ZlibOptions] = js.undefined
  /**
    * Appends an arbitrary pre-extension to the filename. Disables append and extension options.
    */
  var preExtension: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Minimum size required to compress a file.
    * @default false
    */
  var threshold: js.UndefOr[scala.Double | java.lang.String | scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    append: js.UndefOr[scala.Boolean] = js.undefined,
    extension: java.lang.String = null,
    gzipOptions: nodeLib.zlibMod.ZlibOptions = null,
    preExtension: java.lang.String = null,
    threshold: scala.Double | java.lang.String | scala.Boolean = null
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

