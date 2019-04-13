package typings
package hlsDotJsLib.hlsDotJsMod

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
    val __obj = js.Dynamic.literal(frag = frag, stats = stats)
  
    __obj.asInstanceOf[fragLoadProgressData]
  }
}

