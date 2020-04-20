package typings.jsforce.describeResultMod

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
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any], maxBatchSize = maxBatchSize.asInstanceOf[js.Any], sobjects = sobjects.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeGlobalResult]
  }
}

