package typings.iotaLibJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBranchTransaction extends js.Object {
  var branchTransaction: String
  var duration: Double
  var trunkTransaction: String
}

object AnonBranchTransaction {
  @scala.inline
  def apply(branchTransaction: String, duration: Double, trunkTransaction: String): AnonBranchTransaction = {
    val __obj = js.Dynamic.literal(branchTransaction = branchTransaction.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], trunkTransaction = trunkTransaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBranchTransaction]
  }
}

