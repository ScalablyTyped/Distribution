package typings.googleapis.jobsV3Mod.jobsV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents count of jobs within one bucket.
  */
@js.native
trait SchemaBucketizedCount extends js.Object {
  /**
    * Number of jobs whose numeric field value fall into `range`.
    */
  var count: js.UndefOr[Double] = js.native
  /**
    * Bucket range on which histogram was performed for the numeric field, that
    * is, the count represents number of jobs in this range.
    */
  var range: js.UndefOr[SchemaBucketRange] = js.native
}

object SchemaBucketizedCount {
  @scala.inline
  def apply(count: js.UndefOr[Double] = js.undefined, range: SchemaBucketRange = null): SchemaBucketizedCount = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(count)) __obj.updateDynamic("count")(count.get.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBucketizedCount]
  }
}

