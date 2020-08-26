package typings.hlsJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait initPtsFoundData extends js.Object {
  var d: String = js.native
  var frag: Fragment = js.native
  var initPTS: Double = js.native
}

object initPtsFoundData {
  @scala.inline
  def apply(d: String, frag: Fragment, initPTS: Double): initPtsFoundData = {
    val __obj = js.Dynamic.literal(d = d.asInstanceOf[js.Any], frag = frag.asInstanceOf[js.Any], initPTS = initPTS.asInstanceOf[js.Any])
    __obj.asInstanceOf[initPtsFoundData]
  }
  @scala.inline
  implicit class initPtsFoundDataOps[Self <: initPtsFoundData] (val x: Self) extends AnyVal {
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
    def setD(value: String): Self = this.set("d", value.asInstanceOf[js.Any])
    @scala.inline
    def setFrag(value: Fragment): Self = this.set("frag", value.asInstanceOf[js.Any])
    @scala.inline
    def setInitPTS(value: Double): Self = this.set("initPTS", value.asInstanceOf[js.Any])
  }
  
}

