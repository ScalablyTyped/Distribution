package typings.hlsJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait fragLoadProgressData extends js.Object {
  var frag: Fragment = js.native
  var stats: Stats = js.native
}

object fragLoadProgressData {
  @scala.inline
  def apply(frag: Fragment, stats: Stats): fragLoadProgressData = {
    val __obj = js.Dynamic.literal(frag = frag.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[fragLoadProgressData]
  }
  @scala.inline
  implicit class fragLoadProgressDataOps[Self <: fragLoadProgressData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFrag(value: Fragment): Self = this.set("frag", value.asInstanceOf[js.Any])
    @scala.inline
    def setStats(value: Stats): Self = this.set("stats", value.asInstanceOf[js.Any])
  }
  
}

