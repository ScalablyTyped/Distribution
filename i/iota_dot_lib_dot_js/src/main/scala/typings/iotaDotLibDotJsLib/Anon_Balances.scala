package typings
package iotaDotLibDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Balances extends js.Object {
  var balances: js.Array[scala.Double]
  var duration: scala.Double
  var milestone: java.lang.String
  var milestoneIndex: scala.Double
}

object Anon_Balances {
  @scala.inline
  def apply(
    balances: js.Array[scala.Double],
    duration: scala.Double,
    milestone: java.lang.String,
    milestoneIndex: scala.Double
  ): Anon_Balances = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("balances")(balances)
    __obj.updateDynamic("duration")(duration)
    __obj.updateDynamic("milestone")(milestone)
    __obj.updateDynamic("milestoneIndex")(milestoneIndex)
    __obj.asInstanceOf[Anon_Balances]
  }
}

