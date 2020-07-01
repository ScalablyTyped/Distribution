package typings.googleapis.v14Mod.adexchangebuyerV14

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaTargetingValueSize extends js.Object {
  /**
    * The height of the creative.
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * The width of the creative.
    */
  var width: js.UndefOr[Double] = js.native
}

object SchemaTargetingValueSize {
  @scala.inline
  def apply(height: js.UndefOr[Double] = js.undefined, width: js.UndefOr[Double] = js.undefined): SchemaTargetingValueSize = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTargetingValueSize]
  }
}

