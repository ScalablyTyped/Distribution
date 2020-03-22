package typings.grommet

import typings.grommet.grommetStrings.`bottom-left`
import typings.grommet.grommetStrings.`bottom-right`
import typings.grommet.grommetStrings.`top-left`
import typings.grommet.grommetStrings.`top-right`
import typings.grommet.grommetStrings.bottom
import typings.grommet.grommetStrings.large
import typings.grommet.grommetStrings.left
import typings.grommet.grommetStrings.medium
import typings.grommet.grommetStrings.right
import typings.grommet.grommetStrings.small
import typings.grommet.grommetStrings.top
import typings.grommet.grommetStrings.xlarge
import typings.grommet.grommetStrings.xsmall
import typings.grommet.utilsMod._RoundType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCorner extends _RoundType {
  var corner: js.UndefOr[
    top | left | bottom | right | `top-left` | `top-right` | `bottom-left` | `bottom-right`
  ] = js.undefined
  var size: js.UndefOr[xsmall | small | medium | large | xlarge | String] = js.undefined
}

object AnonCorner {
  @scala.inline
  def apply(
    corner: top | left | bottom | right | `top-left` | `top-right` | `bottom-left` | `bottom-right` = null,
    size: xsmall | small | medium | large | xlarge | String = null
  ): AnonCorner = {
    val __obj = js.Dynamic.literal()
    if (corner != null) __obj.updateDynamic("corner")(corner.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCorner]
  }
}

