package typings.iotaDotLibDotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Balances extends js.Object {
  var balances: js.Array[Double]
  var duration: Double
  var milestone: String
  var milestoneIndex: Double
}

object Anon_Balances {
  @scala.inline
  def apply(balances: js.Array[Double], duration: Double, milestone: String, milestoneIndex: Double): Anon_Balances = {
    val __obj = js.Dynamic.literal(balances = balances, duration = duration, milestone = milestone, milestoneIndex = milestoneIndex)
  
    __obj.asInstanceOf[Anon_Balances]
  }
}

