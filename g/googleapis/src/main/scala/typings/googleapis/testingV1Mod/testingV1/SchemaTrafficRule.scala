package typings.googleapis.testingV1Mod.testingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Network emulation parameters.
  */
@js.native
trait SchemaTrafficRule extends js.Object {
  /**
    * Bandwidth in kbits/second.
    */
  var bandwidth: js.UndefOr[Double] = js.native
  /**
    * Burst size in kbits.
    */
  var burst: js.UndefOr[Double] = js.native
  /**
    * Packet delay, must be &gt;= 0.
    */
  var delay: js.UndefOr[String] = js.native
  /**
    * Packet duplication ratio (0.0 - 1.0).
    */
  var packetDuplicationRatio: js.UndefOr[Double] = js.native
  /**
    * Packet loss ratio (0.0 - 1.0).
    */
  var packetLossRatio: js.UndefOr[Double] = js.native
}

object SchemaTrafficRule {
  @scala.inline
  def apply(): SchemaTrafficRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTrafficRule]
  }
  @scala.inline
  implicit class SchemaTrafficRuleOps[Self <: SchemaTrafficRule] (val x: Self) extends AnyVal {
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
    def setBandwidth(value: Double): Self = this.set("bandwidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBandwidth: Self = this.set("bandwidth", js.undefined)
    @scala.inline
    def setBurst(value: Double): Self = this.set("burst", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBurst: Self = this.set("burst", js.undefined)
    @scala.inline
    def setDelay(value: String): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    @scala.inline
    def setPacketDuplicationRatio(value: Double): Self = this.set("packetDuplicationRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePacketDuplicationRatio: Self = this.set("packetDuplicationRatio", js.undefined)
    @scala.inline
    def setPacketLossRatio(value: Double): Self = this.set("packetLossRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePacketLossRatio: Self = this.set("packetLossRatio", js.undefined)
  }
  
}

