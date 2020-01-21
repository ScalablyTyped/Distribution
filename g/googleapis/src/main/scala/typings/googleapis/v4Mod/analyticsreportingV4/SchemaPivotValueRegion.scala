package typings.googleapis.v4Mod.analyticsreportingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The metric values in the pivot region.
  */
@js.native
trait SchemaPivotValueRegion extends js.Object {
  /**
    * The values of the metrics in each of the pivot regions.
    */
  var values: js.UndefOr[js.Array[String]] = js.native
}

object SchemaPivotValueRegion {
  @scala.inline
  def apply(values: js.Array[String] = null): SchemaPivotValueRegion = {
    val __obj = js.Dynamic.literal()
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPivotValueRegion]
  }
}

