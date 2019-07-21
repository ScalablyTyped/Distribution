package typings
package inflationLib.inflationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options
  extends nodeLib.zlibMod.ZlibOptions {
  /**
    * The encoding of the stream. If not given, will look in `stream.headers['content-encoding']`.
    */
  var gzip: js.UndefOr[
    inflationLib.inflationLibStrings.deflate | inflationLib.inflationLibStrings.gzip | inflationLib.inflationLibStrings.identity
  ] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    chunkSize: scala.Int | scala.Double = null,
    dictionary: nodeLib.NodeJSNs.TypedArray | stdLib.DataView | stdLib.ArrayBuffer = null,
    finishFlush: scala.Int | scala.Double = null,
    flush: scala.Int | scala.Double = null,
    gzip: inflationLib.inflationLibStrings.deflate | inflationLib.inflationLibStrings.gzip | inflationLib.inflationLibStrings.identity = null,
    level: scala.Int | scala.Double = null,
    memLevel: scala.Int | scala.Double = null,
    strategy: scala.Int | scala.Double = null,
    windowBits: scala.Int | scala.Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (chunkSize != null) __obj.updateDynamic("chunkSize")(chunkSize.asInstanceOf[js.Any])
    if (dictionary != null) __obj.updateDynamic("dictionary")(dictionary.asInstanceOf[js.Any])
    if (finishFlush != null) __obj.updateDynamic("finishFlush")(finishFlush.asInstanceOf[js.Any])
    if (flush != null) __obj.updateDynamic("flush")(flush.asInstanceOf[js.Any])
    if (gzip != null) __obj.updateDynamic("gzip")(gzip.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (memLevel != null) __obj.updateDynamic("memLevel")(memLevel.asInstanceOf[js.Any])
    if (strategy != null) __obj.updateDynamic("strategy")(strategy.asInstanceOf[js.Any])
    if (windowBits != null) __obj.updateDynamic("windowBits")(windowBits.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

