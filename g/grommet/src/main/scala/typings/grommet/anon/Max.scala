package typings.grommet.anon

import typings.grommet.grommetStrings.large
import typings.grommet.grommetStrings.medium
import typings.grommet.grommetStrings.small
import typings.grommet.grommetStrings.xlarge
import typings.grommet.grommetStrings.xsmall
import typings.grommet.grommetStrings.xxlarge
import typings.grommet.grommetStrings.xxsmall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Max extends js.Object {
  var max: js.UndefOr[xxsmall | xsmall | small | medium | large | xlarge | xxlarge | String] = js.undefined
  var min: js.UndefOr[xxsmall | xsmall | small | medium | large | xlarge | xxlarge | String] = js.undefined
}

object Max {
  @scala.inline
  def apply(
    max: xxsmall | xsmall | small | medium | large | xlarge | xxlarge | String = null,
    min: xxsmall | xsmall | small | medium | large | xlarge | xxlarge | String = null
  ): Max = {
    val __obj = js.Dynamic.literal()
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    __obj.asInstanceOf[Max]
  }
}

