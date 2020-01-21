package typings.googleapis.monitoringV3Mod.monitoringV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The range of the population values.
  */
@js.native
trait SchemaRange extends js.Object {
  /**
    * The maximum of the population values.
    */
  var max: js.UndefOr[Double] = js.native
  /**
    * The minimum of the population values.
    */
  var min: js.UndefOr[Double] = js.native
}

object SchemaRange {
  @scala.inline
  def apply(max: Int | Double = null, min: Int | Double = null): SchemaRange = {
    val __obj = js.Dynamic.literal()
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRange]
  }
}

