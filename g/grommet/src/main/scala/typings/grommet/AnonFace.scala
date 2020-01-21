package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFace extends js.Object {
  var face: js.UndefOr[String] = js.undefined
  var family: js.UndefOr[String] = js.undefined
  var height: js.UndefOr[String] = js.undefined
  var maxWidth: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[String] = js.undefined
}

object AnonFace {
  @scala.inline
  def apply(
    face: String = null,
    family: String = null,
    height: String = null,
    maxWidth: String = null,
    size: String = null
  ): AnonFace = {
    val __obj = js.Dynamic.literal()
    if (face != null) __obj.updateDynamic("face")(face.asInstanceOf[js.Any])
    if (family != null) __obj.updateDynamic("family")(family.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFace]
  }
}

