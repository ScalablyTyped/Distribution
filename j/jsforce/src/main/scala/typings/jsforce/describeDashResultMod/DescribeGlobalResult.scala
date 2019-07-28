package typings.jsforce.describeDashResultMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeGlobalResult extends js.Object {
  var encoding: String
  var maxBatchSize: Double
  var sobjects: js.Array[DescribeGlobalSObjectResult]
}

object DescribeGlobalResult {
  @scala.inline
  def apply(encoding: String, maxBatchSize: Double, sobjects: js.Array[DescribeGlobalSObjectResult]): DescribeGlobalResult = {
    val __obj = js.Dynamic.literal(encoding = encoding, maxBatchSize = maxBatchSize, sobjects = sobjects)
  
    __obj.asInstanceOf[DescribeGlobalResult]
  }
}

