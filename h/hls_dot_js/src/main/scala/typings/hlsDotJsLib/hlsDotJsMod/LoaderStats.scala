package typings
package hlsDotJsLib.hlsDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoaderStats extends js.Object {
  /**
    * download bandwitdh in bit/s
    */
  var bw: scala.Double
  /**
    * number of loaded bytes
    */
  var loaded: scala.Double
  /**
    * performance.now() of first received byte
    */
  var tfirst: scala.Double
  /**
    * performance.now() on load complete
    */
  var tload: scala.Double
  /**
    * total nb of bytes
    */
  var total: scala.Double
  /**
    * performance.now() just after load() has been called
    */
  var trequest: scala.Double
}

object LoaderStats {
  @scala.inline
  def apply(
    bw: scala.Double,
    loaded: scala.Double,
    tfirst: scala.Double,
    tload: scala.Double,
    total: scala.Double,
    trequest: scala.Double
  ): LoaderStats = {
    val __obj = js.Dynamic.literal(bw = bw, loaded = loaded, tfirst = tfirst, tload = tload, total = total, trequest = trequest)
  
    __obj.asInstanceOf[LoaderStats]
  }
}

