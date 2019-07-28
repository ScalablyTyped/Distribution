package typings.grommet.componentsTableCellMod

import typings.grommet.grommetStrings.`1/2`
import typings.grommet.grommetStrings.`1/3`
import typings.grommet.grommetStrings.`1/4`
import typings.grommet.grommetStrings.`2/3`
import typings.grommet.grommetStrings.`2/4`
import typings.grommet.grommetStrings.`3/4`
import typings.grommet.grommetStrings.bottom
import typings.grommet.grommetStrings.col
import typings.grommet.grommetStrings.large
import typings.grommet.grommetStrings.medium
import typings.grommet.grommetStrings.middle
import typings.grommet.grommetStrings.row
import typings.grommet.grommetStrings.small
import typings.grommet.grommetStrings.top
import typings.grommet.grommetStrings.xlarge
import typings.grommet.grommetStrings.xsmall
import typings.grommet.grommetStrings.xxsmall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableCellProps extends js.Object {
  var plain: js.UndefOr[Boolean] = js.undefined
  var scope: js.UndefOr[col | row] = js.undefined
  var size: js.UndefOr[
    xxsmall | xsmall | small | medium | large | xlarge | `1/2` | `1/3` | `2/3` | `1/4` | `2/4` | `3/4` | String
  ] = js.undefined
  var verticalAlign: js.UndefOr[top | middle | bottom] = js.undefined
}

object TableCellProps {
  @scala.inline
  def apply(
    plain: js.UndefOr[Boolean] = js.undefined,
    scope: col | row = null,
    size: xxsmall | xsmall | small | medium | large | xlarge | `1/2` | `1/3` | `2/3` | `1/4` | `2/4` | `3/4` | String = null,
    verticalAlign: top | middle | bottom = null
  ): TableCellProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(plain)) __obj.updateDynamic("plain")(plain)
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableCellProps]
  }
}

