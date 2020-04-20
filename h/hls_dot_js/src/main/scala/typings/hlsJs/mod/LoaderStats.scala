package typings.hlsJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoaderStats extends js.Object {
  /**
    * download bandwitdh in bit/s
    */
  var bw: Double
  /**
    * number of loaded bytes
    */
  var loaded: Double
  /**
    * performance.now() of first received byte
    */
  var tfirst: Double
  /**
    * performance.now() on load complete
    */
  var tload: Double
  /**
    * total nb of bytes
    */
  var total: Double
  /**
    * performance.now() just after load() has been called
    */
  var trequest: Double
}

object LoaderStats {
  @scala.inline
  def apply(bw: Double, loaded: Double, tfirst: Double, tload: Double, total: Double, trequest: Double): LoaderStats = {
    val __obj = js.Dynamic.literal(bw = bw.asInstanceOf[js.Any], loaded = loaded.asInstanceOf[js.Any], tfirst = tfirst.asInstanceOf[js.Any], tload = tload.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], trequest = trequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoaderStats]
  }
}

