package typings
package hlsDotJsLib.hlsDotJsMod.HlsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stats extends js.Object {
  var length: js.UndefOr[scala.Double] = js.undefined
  var mtime: scala.Double
  var tbuffered: js.UndefOr[scala.Double] = js.undefined
  /**
    * performance.now() of first received byte
    */
  var tfirst: scala.Double
  /**
    * performance.now() on load complete
    */
  var tload: scala.Double
  /**
    * performance.now() just after load() has been called
    */
  var trequest: scala.Double
}

object Stats {
  @scala.inline
  def apply(
    mtime: scala.Double,
    tfirst: scala.Double,
    tload: scala.Double,
    trequest: scala.Double,
    length: scala.Int | scala.Double = null,
    tbuffered: scala.Int | scala.Double = null
  ): Stats = {
    val __obj = js.Dynamic.literal(mtime = mtime, tfirst = tfirst, tload = tload, trequest = trequest)
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (tbuffered != null) __obj.updateDynamic("tbuffered")(tbuffered.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stats]
  }
}

