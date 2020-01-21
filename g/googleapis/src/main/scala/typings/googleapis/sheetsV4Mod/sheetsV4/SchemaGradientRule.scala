package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A rule that applies a gradient color scale format, based on the
  * interpolation points listed. The format of a cell will vary based on its
  * contents as compared to the values of the interpolation points.
  */
@js.native
trait SchemaGradientRule extends js.Object {
  /**
    * The final interpolation point.
    */
  var maxpoint: js.UndefOr[SchemaInterpolationPoint] = js.native
  /**
    * An optional midway interpolation point.
    */
  var midpoint: js.UndefOr[SchemaInterpolationPoint] = js.native
  /**
    * The starting interpolation point.
    */
  var minpoint: js.UndefOr[SchemaInterpolationPoint] = js.native
}

object SchemaGradientRule {
  @scala.inline
  def apply(
    maxpoint: SchemaInterpolationPoint = null,
    midpoint: SchemaInterpolationPoint = null,
    minpoint: SchemaInterpolationPoint = null
  ): SchemaGradientRule = {
    val __obj = js.Dynamic.literal()
    if (maxpoint != null) __obj.updateDynamic("maxpoint")(maxpoint.asInstanceOf[js.Any])
    if (midpoint != null) __obj.updateDynamic("midpoint")(midpoint.asInstanceOf[js.Any])
    if (minpoint != null) __obj.updateDynamic("minpoint")(minpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGradientRule]
  }
}

