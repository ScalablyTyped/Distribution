package typings.googleapis.jobsV2Mod.jobsV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents starting and ending value of a range in double.
  */
@js.native
trait SchemaBucketRange extends js.Object {
  /**
    * Starting value of the bucket range.
    */
  var from: js.UndefOr[Double] = js.native
  /**
    * Ending value of the bucket range.
    */
  var to: js.UndefOr[Double] = js.native
}

object SchemaBucketRange {
  @scala.inline
  def apply(from: js.UndefOr[Double] = js.undefined, to: js.UndefOr[Double] = js.undefined): SchemaBucketRange = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(from)) __obj.updateDynamic("from")(from.get.asInstanceOf[js.Any])
    if (!js.isUndefined(to)) __obj.updateDynamic("to")(to.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBucketRange]
  }
}

