package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A batch entry encoding a single non-batch datafeeds response.
  */
@js.native
trait SchemaDatafeedsCustomBatchResponseEntry extends js.Object {
  /**
    * The ID of the request entry this entry responds to.
    */
  var batchId: js.UndefOr[Double] = js.native
  /**
    * The requested data feed. Defined if and only if the request was
    * successful.
    */
  var datafeed: js.UndefOr[SchemaDatafeed] = js.native
  /**
    * A list of errors defined if and only if the request failed.
    */
  var errors: js.UndefOr[SchemaErrors] = js.native
}

object SchemaDatafeedsCustomBatchResponseEntry {
  @scala.inline
  def apply(batchId: Int | Double = null, datafeed: SchemaDatafeed = null, errors: SchemaErrors = null): SchemaDatafeedsCustomBatchResponseEntry = {
    val __obj = js.Dynamic.literal()
    if (batchId != null) __obj.updateDynamic("batchId")(batchId.asInstanceOf[js.Any])
    if (datafeed != null) __obj.updateDynamic("datafeed")(datafeed.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDatafeedsCustomBatchResponseEntry]
  }
}

