package typings
package hlsDotJsLib.hlsDotJsMod.HlsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait fragBufferedData extends js.Object {
  var frag: Fragment
  var id: java.lang.String
  var stats: Stats
}

object fragBufferedData {
  @scala.inline
  def apply(frag: Fragment, id: java.lang.String, stats: Stats): fragBufferedData = {
    val __obj = js.Dynamic.literal(frag = frag, id = id, stats = stats)
  
    __obj.asInstanceOf[fragBufferedData]
  }
}

