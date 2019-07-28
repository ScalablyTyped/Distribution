package typings.iotaDotLibDotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BranchTransaction extends js.Object {
  var branchTransaction: String
  var duration: Double
  var trunkTransaction: String
}

object Anon_BranchTransaction {
  @scala.inline
  def apply(branchTransaction: String, duration: Double, trunkTransaction: String): Anon_BranchTransaction = {
    val __obj = js.Dynamic.literal(branchTransaction = branchTransaction, duration = duration, trunkTransaction = trunkTransaction)
  
    __obj.asInstanceOf[Anon_BranchTransaction]
  }
}

