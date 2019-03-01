package typings
package jsforceLib.describeDashResultMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeGlobalResult extends js.Object {
  var encoding: java.lang.String
  var maxBatchSize: scala.Double
  var sobjects: js.Array[DescribeGlobalSObjectResult]
}

object DescribeGlobalResult {
  @scala.inline
  def apply(
    encoding: java.lang.String,
    maxBatchSize: scala.Double,
    sobjects: js.Array[DescribeGlobalSObjectResult]
  ): DescribeGlobalResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("encoding")(encoding)
    __obj.updateDynamic("maxBatchSize")(maxBatchSize)
    __obj.updateDynamic("sobjects")(sobjects)
    __obj.asInstanceOf[DescribeGlobalResult]
  }
}

