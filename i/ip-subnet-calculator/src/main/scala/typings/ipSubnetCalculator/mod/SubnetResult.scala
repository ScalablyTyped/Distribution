package typings.ipSubnetCalculator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubnetResult extends js.Object {
  var invertedMask: Double
  var invertedMaskStr: String
  var invertedSize: Double
  var ipHigh: Double
  var ipHighStr: String
  var ipLow: Double
  var ipLowStr: String
  var prefixMask: Double
  var prefixMaskStr: String
  var prefixSize: Double
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
}

