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
  def apply(max: js.UndefOr[Double] = js.undefined, min: js.UndefOr[Double] = js.undefined): SchemaRange = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRange]
  }
}

