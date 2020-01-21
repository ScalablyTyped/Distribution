package typings.koaCompress.mod

import typings.node.NodeJS.ArrayBufferView
import typings.node.zlibMod.ZlibOptions
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompressOptions extends ZlibOptions {
  /**
    * An optional function that checks the response content type to decide whether to compress. By default, it uses compressible.
    */
  var filter: js.UndefOr[js.Function1[/* content_type */ String, Boolean]] = js.undefined
  /**
    * Minimum response size in bytes to compress. Default 1024 bytes or 1kb.
    */
  var threshold: js.UndefOr[Double] = js.undefined
}

object CompressOptions {
  @scala.inline
  def apply(
    chunkSize: Int | Double = null,
    dictionary: ArrayBufferView | ArrayBuffer = null,
    filter: /* content_type */ String => Boolean = null,
    finishFlush: Int | Double = null,
    flush: Int | Double = null,
    level: Int | Double = null,
    memLevel: Int | Double = null,
    strategy: Int | Double = null,
    threshold: Int | Double = null,
    windowBits: Int | Double = null
  ): CompressOptions = {
    val __obj = js.Dynamic.literal()
    if (chunkSize != null) __obj.updateDynamic("chunkSize")(chunkSize.asInstanceOf[js.Any])
    if (dictionary != null) __obj.updateDynamic("dictionary")(dictionary.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1(filter))
    if (finishFlush != null) __obj.updateDynamic("finishFlush")(finishFlush.asInstanceOf[js.Any])
    if (flush != null) __obj.updateDynamic("flush")(flush.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (memLevel != null) __obj.updateDynamic("memLevel")(memLevel.asInstanceOf[js.Any])
    if (strategy != null) __obj.updateDynamic("strategy")(strategy.asInstanceOf[js.Any])
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    if (windowBits != null) __obj.updateDynamic("windowBits")(windowBits.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompressOptions]
  }
}

