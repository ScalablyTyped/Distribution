package typings.googleapis.fitnessV1Mod.fitnessV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaAggregateResponse extends js.Object {
  /**
    * A list of buckets containing the aggregated data.
    */
  var bucket: js.UndefOr[js.Array[SchemaAggregateBucket]] = js.native
}

object SchemaAggregateResponse {
  @scala.inline
  def apply(bucket: js.Array[SchemaAggregateBucket] = null): SchemaAggregateResponse = {
    val __obj = js.Dynamic.literal()
    if (bucket != null) __obj.updateDynamic("bucket")(bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAggregateResponse]
  }
}

