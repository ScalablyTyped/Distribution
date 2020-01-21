package typings.googleapis.fitnessV1Mod.fitnessV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaAggregateBucket extends js.Object {
  /**
    * Available for Bucket.Type.ACTIVITY_TYPE, Bucket.Type.ACTIVITY_SEGMENT
    */
  var activity: js.UndefOr[Double] = js.native
  /**
    * There will be one dataset per AggregateBy in the request.
    */
  var dataset: js.UndefOr[js.Array[SchemaDataset]] = js.native
  /**
    * The end time for the aggregated data, in milliseconds since epoch,
    * inclusive.
    */
  var endTimeMillis: js.UndefOr[String] = js.native
  /**
    * Available for Bucket.Type.SESSION
    */
  var session: js.UndefOr[SchemaSession] = js.native
  /**
    * The start time for the aggregated data, in milliseconds since epoch,
    * inclusive.
    */
  var startTimeMillis: js.UndefOr[String] = js.native
  /**
    * The type of a bucket signifies how the data aggregation is performed in
    * the bucket.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaAggregateBucket {
  @scala.inline
  def apply(
    activity: Int | Double = null,
    dataset: js.Array[SchemaDataset] = null,
    endTimeMillis: String = null,
    session: SchemaSession = null,
    startTimeMillis: String = null,
    `type`: String = null
  ): SchemaAggregateBucket = {
    val __obj = js.Dynamic.literal()
    if (activity != null) __obj.updateDynamic("activity")(activity.asInstanceOf[js.Any])
    if (dataset != null) __obj.updateDynamic("dataset")(dataset.asInstanceOf[js.Any])
    if (endTimeMillis != null) __obj.updateDynamic("endTimeMillis")(endTimeMillis.asInstanceOf[js.Any])
    if (session != null) __obj.updateDynamic("session")(session.asInstanceOf[js.Any])
    if (startTimeMillis != null) __obj.updateDynamic("startTimeMillis")(startTimeMillis.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAggregateBucket]
  }
}

