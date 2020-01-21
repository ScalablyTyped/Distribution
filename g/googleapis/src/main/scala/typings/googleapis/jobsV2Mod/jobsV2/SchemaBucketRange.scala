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
  def apply(from: Int | Double = null, to: Int | Double = null): SchemaBucketRange = {
    val __obj = js.Dynamic.literal()
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBucketRange]
  }
}

