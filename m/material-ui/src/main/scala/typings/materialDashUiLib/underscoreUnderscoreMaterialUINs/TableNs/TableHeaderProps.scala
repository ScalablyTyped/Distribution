package typings
package materialDashUiLib.underscoreUnderscoreMaterialUINs.TableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableHeaderProps extends js.Object {
  var adjustForCheckbox: js.UndefOr[scala.Boolean] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var displaySelectAll: js.UndefOr[scala.Boolean] = js.undefined
  var enableSelectAll: js.UndefOr[scala.Boolean] = js.undefined
  /** @deprecated Instead, use event handler on Table */
  var onSelectAll: js.UndefOr[js.Function1[/* checked */ scala.Boolean, scala.Unit]] = js.undefined
  /** @deprecated Instead, use event handler on Table */
  var selectAllSelected: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
}

object TableHeaderProps {
  @scala.inline
  def apply(
    adjustForCheckbox: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    displaySelectAll: js.UndefOr[scala.Boolean] = js.undefined,
    enableSelectAll: js.UndefOr[scala.Boolean] = js.undefined,
    onSelectAll: /* checked */ scala.Boolean => scala.Unit = null,
    selectAllSelected: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactLib.reactMod.CSSProperties = null
  ): TableHeaderProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(adjustForCheckbox)) __obj.updateDynamic("adjustForCheckbox")(adjustForCheckbox)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(displaySelectAll)) __obj.updateDynamic("displaySelectAll")(displaySelectAll)
    if (!js.isUndefined(enableSelectAll)) __obj.updateDynamic("enableSelectAll")(enableSelectAll)
    if (onSelectAll != null) __obj.updateDynamic("onSelectAll")(js.Any.fromFunction1(onSelectAll))
    if (!js.isUndefined(selectAllSelected)) __obj.updateDynamic("selectAllSelected")(selectAllSelected)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[TableHeaderProps]
  }
}

