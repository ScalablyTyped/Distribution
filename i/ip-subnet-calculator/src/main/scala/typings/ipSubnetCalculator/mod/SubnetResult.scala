package typings.ipSubnetCalculator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubnetResult extends js.Object {
  var invertedMask: Double = js.native
  var invertedMaskStr: String = js.native
  var invertedSize: Double = js.native
  var ipHigh: Double = js.native
  var ipHighStr: String = js.native
  var ipLow: Double = js.native
  var ipLowStr: String = js.native
  var prefixMask: Double = js.native
  var prefixMaskStr: String = js.native
  var prefixSize: Double = js.native
}

object SubnetResult {
  @scala.inline
  def apply(
    invertedMask: Double,
    invertedMaskStr: String,
    invertedSize: Double,
    ipHigh: Double,
    ipHighStr: String,
    ipLow: Double,
    ipLowStr: String,
    prefixMask: Double,
    prefixMaskStr: String,
    prefixSize: Double
  ): SubnetResult = {
    val __obj = js.Dynamic.literal(invertedMask = invertedMask.asInstanceOf[js.Any], invertedMaskStr = invertedMaskStr.asInstanceOf[js.Any], invertedSize = invertedSize.asInstanceOf[js.Any], ipHigh = ipHigh.asInstanceOf[js.Any], ipHighStr = ipHighStr.asInstanceOf[js.Any], ipLow = ipLow.asInstanceOf[js.Any], ipLowStr = ipLowStr.asInstanceOf[js.Any], prefixMask = prefixMask.asInstanceOf[js.Any], prefixMaskStr = prefixMaskStr.asInstanceOf[js.Any], prefixSize = prefixSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubnetResult]
  }
  @scala.inline
  implicit class SubnetResultOps[Self <: SubnetResult] (val x: Self) extends AnyVal {
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
    def setInvertedMask(value: Double): Self = this.set("invertedMask", value.asInstanceOf[js.Any])
    @scala.inline
    def setInvertedMaskStr(value: String): Self = this.set("invertedMaskStr", value.asInstanceOf[js.Any])
    @scala.inline
    def setInvertedSize(value: Double): Self = this.set("invertedSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setIpHigh(value: Double): Self = this.set("ipHigh", value.asInstanceOf[js.Any])
    @scala.inline
    def setIpHighStr(value: String): Self = this.set("ipHighStr", value.asInstanceOf[js.Any])
    @scala.inline
    def setIpLow(value: Double): Self = this.set("ipLow", value.asInstanceOf[js.Any])
    @scala.inline
    def setIpLowStr(value: String): Self = this.set("ipLowStr", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrefixMask(value: Double): Self = this.set("prefixMask", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrefixMaskStr(value: String): Self = this.set("prefixMaskStr", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrefixSize(value: Double): Self = this.set("prefixSize", value.asInstanceOf[js.Any])
  }
  
}

