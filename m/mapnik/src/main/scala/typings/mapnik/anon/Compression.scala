package typings.mapnik.anon

import typings.mapnik.mapnikStrings.DEFAULT
import typings.mapnik.mapnikStrings.FILTERED
import typings.mapnik.mapnikStrings.FIXED
import typings.mapnik.mapnikStrings.HUFFMAN_ONLY
import typings.mapnik.mapnikStrings.RLE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Compression extends js.Object {
  var compression: js.UndefOr[Double] = js.undefined
  var level: js.UndefOr[Double] = js.undefined
  var strategy: js.UndefOr[FILTERED | HUFFMAN_ONLY | RLE | FIXED | DEFAULT] = js.undefined
}

object Compression {
  @scala.inline
  def apply(
    compression: js.UndefOr[Double] = js.undefined,
    level: js.UndefOr[Double] = js.undefined,
    strategy: FILTERED | HUFFMAN_ONLY | RLE | FIXED | DEFAULT = null
  ): Compression = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(compression)) __obj.updateDynamic("compression")(compression.get.asInstanceOf[js.Any])
    if (!js.isUndefined(level)) __obj.updateDynamic("level")(level.get.asInstanceOf[js.Any])
    if (strategy != null) __obj.updateDynamic("strategy")(strategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Compression]
  }
}

