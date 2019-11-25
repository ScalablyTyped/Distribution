package typings.hlsDotJs.hlsDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stats extends js.Object {
  var length: js.UndefOr[Double] = js.undefined
  var mtime: Double
  var tbuffered: js.UndefOr[Double] = js.undefined
  /**
    * performance.now() of first received byte
    */
  var tfirst: Double
  /**
    * performance.now() on load complete
    */
  var tload: Double
  /**
    * performance.now() just after load() has been called
    */
  var trequest: Double
}

object Stats {
  @scala.inline
  def apply(
    mtime: Double,
    tfirst: Double,
    tload: Double,
    trequest: Double,
    length: Int | Double = null,
    tbuffered: Int | Double = null
  ): Stats = {
    val __obj = js.Dynamic.literal(mtime = mtime.asInstanceOf[js.Any], tfirst = tfirst.asInstanceOf[js.Any], tload = tload.asInstanceOf[js.Any], trequest = trequest.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (tbuffered != null) __obj.updateDynamic("tbuffered")(tbuffered.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stats]
  }
}

