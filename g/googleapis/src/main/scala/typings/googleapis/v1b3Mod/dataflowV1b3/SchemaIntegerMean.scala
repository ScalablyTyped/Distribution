package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A representation of an integer mean metric contribution.
  */
@js.native
trait SchemaIntegerMean extends js.Object {
  /**
    * The number of values being aggregated.
    */
  var count: js.UndefOr[SchemaSplitInt64] = js.native
  /**
    * The sum of all values being aggregated.
    */
  var sum: js.UndefOr[SchemaSplitInt64] = js.native
}

object SchemaIntegerMean {
  @scala.inline
  def apply(count: SchemaSplitInt64 = null, sum: SchemaSplitInt64 = null): SchemaIntegerMean = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (sum != null) __obj.updateDynamic("sum")(sum.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaIntegerMean]
  }
}

