package typings.hlsJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * a LevelDetails object contains level details retrieved after level playlist parsing
  */
@js.native
trait LevelDetails extends js.Object {
  /**
    * average fragment duration
    */
  var averagetargetduration: Double = js.native
  /**
    * end sequence number
    */
  var endSN: Double = js.native
  /**
    * array of fragments info
    */
  var fragments: js.Array[Fragment] = js.native
  /**
    * is this level a live playlist or not?
    */
  var live: Boolean = js.native
  /**
    * start sequence number
    */
  var startSN: Double = js.native
  /**
    * level fragment target duration
    */
  var targetduration: Double = js.native
  /**
    * level total duration
    */
  var totalduration: Double = js.native
  /**
    * playlist type
    */
  var `type`: String = js.native
  /**
    * protocol version
    */
  var version: Double = js.native
}

object LevelDetails {
  @scala.inline
  def apply(
    averagetargetduration: Double,
    endSN: Double,
    fragments: js.Array[Fragment],
    live: Boolean,
    startSN: Double,
    targetduration: Double,
    totalduration: Double,
    `type`: String,
    version: Double
  ): LevelDetails = {
    val __obj = js.Dynamic.literal(averagetargetduration = averagetargetduration.asInstanceOf[js.Any], endSN = endSN.asInstanceOf[js.Any], fragments = fragments.asInstanceOf[js.Any], live = live.asInstanceOf[js.Any], startSN = startSN.asInstanceOf[js.Any], targetduration = targetduration.asInstanceOf[js.Any], totalduration = totalduration.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LevelDetails]
  }
  @scala.inline
  implicit class LevelDetailsOps[Self <: LevelDetails] (val x: Self) extends AnyVal {
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
    def setAveragetargetduration(value: Double): Self = this.set("averagetargetduration", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndSN(value: Double): Self = this.set("endSN", value.asInstanceOf[js.Any])
    @scala.inline
    def setFragmentsVarargs(value: Fragment*): Self = this.set("fragments", js.Array(value :_*))
    @scala.inline
    def setFragments(value: js.Array[Fragment]): Self = this.set("fragments", value.asInstanceOf[js.Any])
    @scala.inline
    def setLive(value: Boolean): Self = this.set("live", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartSN(value: Double): Self = this.set("startSN", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetduration(value: Double): Self = this.set("targetduration", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotalduration(value: Double): Self = this.set("totalduration", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
  }
  
}

