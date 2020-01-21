package typings.grommet

import typings.grommet.grommetStrings.center
import typings.grommet.grommetStrings.curved
import typings.grommet.grommetStrings.direct
import typings.grommet.grommetStrings.hair
import typings.grommet.grommetStrings.horizontal
import typings.grommet.grommetStrings.large
import typings.grommet.grommetStrings.medium
import typings.grommet.grommetStrings.rectilinear
import typings.grommet.grommetStrings.small
import typings.grommet.grommetStrings.vertical
import typings.grommet.grommetStrings.xsmall
import typings.grommet.grommetStrings.xxsmall
import typings.grommet.utilsMod.ColorType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAnchor extends js.Object {
  var anchor: js.UndefOr[center | vertical | horizontal] = js.undefined
  var color: js.UndefOr[ColorType] = js.undefined
  var fromTarget: String | js.Object
  var label: js.UndefOr[String] = js.undefined
  var offset: js.UndefOr[xsmall | small | medium | large | String] = js.undefined
  var thickness: js.UndefOr[hair | xxsmall | xsmall | small | medium | large | String] = js.undefined
  var toTarget: String | js.Object
  var `type`: js.UndefOr[direct | curved | rectilinear] = js.undefined
}

object AnonAnchor {
  @scala.inline
  def apply(
    fromTarget: String | js.Object,
    toTarget: String | js.Object,
    anchor: center | vertical | horizontal = null,
    color: ColorType = null,
    label: String = null,
    offset: xsmall | small | medium | large | String = null,
    thickness: hair | xxsmall | xsmall | small | medium | large | String = null,
    `type`: direct | curved | rectilinear = null
  ): AnonAnchor = {
    val __obj = js.Dynamic.literal(fromTarget = fromTarget.asInstanceOf[js.Any], toTarget = toTarget.asInstanceOf[js.Any])
    if (anchor != null) __obj.updateDynamic("anchor")(anchor.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (thickness != null) __obj.updateDynamic("thickness")(thickness.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAnchor]
  }
}

