package typings
package grommetLib.componentsTableCellMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableCellProps extends js.Object {
  var plain: js.UndefOr[scala.Boolean] = js.undefined
  var scope: js.UndefOr[grommetLib.grommetLibStrings.col | grommetLib.grommetLibStrings.row] = js.undefined
  var size: js.UndefOr[
    grommetLib.grommetLibStrings.xxsmall | grommetLib.grommetLibStrings.xsmall | grommetLib.grommetLibStrings.small | grommetLib.grommetLibStrings.medium | grommetLib.grommetLibStrings.large | grommetLib.grommetLibStrings.xlarge | grommetLib.grommetLibStrings.`1/2` | grommetLib.grommetLibStrings.`1/3` | grommetLib.grommetLibStrings.`2/3` | grommetLib.grommetLibStrings.`1/4` | grommetLib.grommetLibStrings.`2/4` | grommetLib.grommetLibStrings.`3/4` | java.lang.String
  ] = js.undefined
  var verticalAlign: js.UndefOr[
    grommetLib.grommetLibStrings.top | grommetLib.grommetLibStrings.middle | grommetLib.grommetLibStrings.bottom
  ] = js.undefined
}

object TableCellProps {
  @scala.inline
  def apply(
    plain: js.UndefOr[scala.Boolean] = js.undefined,
    scope: grommetLib.grommetLibStrings.col | grommetLib.grommetLibStrings.row = null,
    size: grommetLib.grommetLibStrings.xxsmall | grommetLib.grommetLibStrings.xsmall | grommetLib.grommetLibStrings.small | grommetLib.grommetLibStrings.medium | grommetLib.grommetLibStrings.large | grommetLib.grommetLibStrings.xlarge | grommetLib.grommetLibStrings.`1/2` | grommetLib.grommetLibStrings.`1/3` | grommetLib.grommetLibStrings.`2/3` | grommetLib.grommetLibStrings.`1/4` | grommetLib.grommetLibStrings.`2/4` | grommetLib.grommetLibStrings.`3/4` | java.lang.String = null,
    verticalAlign: grommetLib.grommetLibStrings.top | grommetLib.grommetLibStrings.middle | grommetLib.grommetLibStrings.bottom = null
  ): TableCellProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(plain)) __obj.updateDynamic("plain")(plain)
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableCellProps]
  }
}

