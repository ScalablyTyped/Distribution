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
  def apply(height: Int | Double = null, width: Int | Double = null): SchemaTargetingValueSize = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTargetingValueSize]
  }
}

