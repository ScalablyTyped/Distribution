package typings.koaCompress.mod

import typings.koaCompress.koaCompressBooleans.`false`
import typings.node.zlibMod.BrotliOptions
import typings.node.zlibMod.ZlibOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompressOptions extends js.Object {
  /**
    * Options for brotli compression.
    */
  var br: js.UndefOr[BrotliOptions | `false`] = js.undefined
  /**
    * Options for deflate compression.
    */
  var deflate: js.UndefOr[ZlibOptions | `false`] = js.undefined
  /**
    * An optional function that checks the response content type to decide whether to compress. By default, it uses compressible.
    */
  var filter: js.UndefOr[js.Function1[/* mimeType */ String, Boolean]] = js.undefined
  /**
    * Options for gzip compression.
    */
  var gzip: js.UndefOr[ZlibOptions | `false`] = js.undefined
  /**
    * Minimum response size in bytes to compress. Default 1024 bytes or 1kb.
    */
  var threshold: js.UndefOr[Double | String] = js.undefined
}

object CompressOptions {
  @scala.inline
  def apply(
    br: BrotliOptions | `false` = null,
    deflate: ZlibOptions | `false` = null,
    filter: /* mimeType */ String => Boolean = null,
    gzip: ZlibOptions | `false` = null,
    threshold: Double | String = null
  ): CompressOptions = {
    val __obj = js.Dynamic.literal()
    if (br != null) __obj.updateDynamic("br")(br.asInstanceOf[js.Any])
    if (deflate != null) __obj.updateDynamic("deflate")(deflate.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1(filter))
    if (gzip != null) __obj.updateDynamic("gzip")(gzip.asInstanceOf[js.Any])
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompressOptions]
  }
}

