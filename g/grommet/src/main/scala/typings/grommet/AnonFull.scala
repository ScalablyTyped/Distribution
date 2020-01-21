package typings.grommet

import typings.grommet.grommetStrings.full
import typings.grommet.grommetStrings.large
import typings.grommet.grommetStrings.medium
import typings.grommet.grommetStrings.small
import typings.grommet.grommetStrings.xlarge
import typings.grommet.grommetStrings.xsmall
import typings.grommet.grommetStrings.xxsmall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFull extends js.Object {
  var height: js.UndefOr[xxsmall | xsmall | small | medium | large | xlarge | full | String] = js.undefined
  var width: js.UndefOr[xxsmall | xsmall | small | medium | large | xlarge | full | String] = js.undefined
}

object AnonFull {
  @scala.inline
  def apply(
    height: xxsmall | xsmall | small | medium | large | xlarge | full | String = null,
    width: xxsmall | xsmall | small | medium | large | xlarge | full | String = null
  ): AnonFull = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFull]
  }
}

