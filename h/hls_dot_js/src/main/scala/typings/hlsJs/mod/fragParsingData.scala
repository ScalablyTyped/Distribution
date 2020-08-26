package typings.hlsJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait fragParsingData extends js.Object {
  var endDTS: Double = js.native
  var endPTS: Double = js.native
  var frag: Fragment = js.native
  var id: String = js.native
  var mdat: js.Any = js.native
  var moof: js.Any = js.native
  var nb: Double = js.native
  var startDTS: Double = js.native
  var startPTS: Double = js.native
  var `type`: String = js.native
}

object fragParsingData {
  @scala.inline
  def apply(
    endDTS: Double,
    endPTS: Double,
    frag: Fragment,
    id: String,
    mdat: js.Any,
    moof: js.Any,
    nb: Double,
    startDTS: Double,
    startPTS: Double,
    `type`: String
  ): fragParsingData = {
    val __obj = js.Dynamic.literal(endDTS = endDTS.asInstanceOf[js.Any], endPTS = endPTS.asInstanceOf[js.Any], frag = frag.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], mdat = mdat.asInstanceOf[js.Any], moof = moof.asInstanceOf[js.Any], nb = nb.asInstanceOf[js.Any], startDTS = startDTS.asInstanceOf[js.Any], startPTS = startPTS.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[fragParsingData]
  }
  @scala.inline
  implicit class fragParsingDataOps[Self <: fragParsingData] (val x: Self) extends AnyVal {
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
    def setEndDTS(value: Double): Self = this.set("endDTS", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndPTS(value: Double): Self = this.set("endPTS", value.asInstanceOf[js.Any])
    @scala.inline
    def setFrag(value: Fragment): Self = this.set("frag", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setMdat(value: js.Any): Self = this.set("mdat", value.asInstanceOf[js.Any])
    @scala.inline
    def setMoof(value: js.Any): Self = this.set("moof", value.asInstanceOf[js.Any])
    @scala.inline
    def setNb(value: Double): Self = this.set("nb", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartDTS(value: Double): Self = this.set("startDTS", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartPTS(value: Double): Self = this.set("startPTS", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

