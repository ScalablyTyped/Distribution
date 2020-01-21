package typings.grommet

import typings.grommet.grommetStrings.large
import typings.grommet.grommetStrings.medium
import typings.grommet.grommetStrings.small
import typings.grommet.grommetStrings.xlarge
import typings.grommet.grommetStrings.xsmall
import typings.grommet.grommetStrings.xxsmall
import typings.grommet.utilsMod._MarginType
import typings.grommet.utilsMod._PadType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBottomHorizontal
  extends _MarginType
     with _PadType {
  var bottom: js.UndefOr[xxsmall | xsmall | small | medium | large | xlarge | String] = js.undefined
  var horizontal: js.UndefOr[xxsmall | xsmall | small | medium | large | xlarge | String] = js.undefined
  var left: js.UndefOr[xxsmall | xsmall | small | medium | large | xlarge | String] = js.undefined
  var right: js.UndefOr[xxsmall | xsmall | small | medium | large | xlarge | String] = js.undefined
  var top: js.UndefOr[xxsmall | xsmall | small | medium | large | xlarge | String] = js.undefined
  var vertical: js.UndefOr[xxsmall | xsmall | small | medium | large | xlarge | String] = js.undefined
}

object AnonBottomHorizontal {
  @scala.inline
  def apply(
    bottom: xxsmall | xsmall | small | medium | large | xlarge | String = null,
    horizontal: xxsmall | xsmall | small | medium | large | xlarge | String = null,
    left: xxsmall | xsmall | small | medium | large | xlarge | String = null,
    right: xxsmall | xsmall | small | medium | large | xlarge | String = null,
    top: xxsmall | xsmall | small | medium | large | xlarge | String = null,
    vertical: xxsmall | xsmall | small | medium | large | xlarge | String = null
  ): AnonBottomHorizontal = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (horizontal != null) __obj.updateDynamic("horizontal")(horizontal.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (vertical != null) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBottomHorizontal]
  }
}

