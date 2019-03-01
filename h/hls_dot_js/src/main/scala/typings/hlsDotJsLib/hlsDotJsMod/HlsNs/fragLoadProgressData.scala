package typings
package hlsDotJsLib.hlsDotJsMod.HlsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait fragLoadProgressData extends js.Object {
  var frag: Fragment
  var stats: Stats
}

object fragLoadProgressData {
  @scala.inline
  def apply(frag: Fragment, stats: Stats): fragLoadProgressData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("frag")(frag)
    __obj.updateDynamic("stats")(stats)
    __obj.asInstanceOf[fragLoadProgressData]
  }
}

