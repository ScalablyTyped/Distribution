package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The rotation applied to text in a cell.
  */
@js.native
trait SchemaTextRotation extends js.Object {
  /**
    * The angle between the standard orientation and the desired orientation.
    * Measured in degrees. Valid values are between -90 and 90. Positive angles
    * are angled upwards, negative are angled downwards.  Note: For LTR text
    * direction positive angles are in the counterclockwise direction, whereas
    * for RTL they are in the clockwise direction
    */
  var angle: js.UndefOr[Double] = js.native
  /**
    * If true, text reads top to bottom, but the orientation of individual
    * characters is unchanged. For example:      | V |     | e |     | r | | t
    * |     | i |     | c |     | a |     | l |
    */
  var vertical: js.UndefOr[Boolean] = js.native
}

object SchemaTextRotation {
  @scala.inline
  def apply(angle: Int | Double = null, vertical: js.UndefOr[Boolean] = js.undefined): SchemaTextRotation = {
    val __obj = js.Dynamic.literal()
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTextRotation]
  }
}

