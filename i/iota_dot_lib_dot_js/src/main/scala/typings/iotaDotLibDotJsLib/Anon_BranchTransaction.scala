package typings
package iotaDotLibDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BranchTransaction extends js.Object {
  var branchTransaction: java.lang.String
  var duration: scala.Double
  var trunkTransaction: java.lang.String
}

object Anon_BranchTransaction {
  @scala.inline
  def apply(branchTransaction: java.lang.String, duration: scala.Double, trunkTransaction: java.lang.String): Anon_BranchTransaction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("branchTransaction")(branchTransaction)
    __obj.updateDynamic("duration")(duration)
    __obj.updateDynamic("trunkTransaction")(trunkTransaction)
    __obj.asInstanceOf[Anon_BranchTransaction]
  }
}

