package typings.hlsJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait fragBufferedData extends js.Object {
  var frag: Fragment
  var id: String
  var stats: Stats
}

object fragBufferedData {
  @scala.inline
  def apply(frag: Fragment, id: String, stats: Stats): fragBufferedData = {
    val __obj = js.Dynamic.literal(frag = frag.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[fragBufferedData]
  }
}

