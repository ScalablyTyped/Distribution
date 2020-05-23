package typings.iotaLibJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Balances extends js.Object {
  var balances: js.Array[Double]
  var duration: Double
  var milestone: String
  var milestoneIndex: Double
}

object Balances {
  @scala.inline
  def apply(balances: js.Array[Double], duration: Double, milestone: String, milestoneIndex: Double): Balances = {
    val __obj = js.Dynamic.literal(balances = balances.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], milestone = milestone.asInstanceOf[js.Any], milestoneIndex = milestoneIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Balances]
  }
}

