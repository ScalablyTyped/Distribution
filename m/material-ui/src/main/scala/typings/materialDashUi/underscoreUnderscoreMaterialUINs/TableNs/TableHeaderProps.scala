package typings.materialDashUi.underscoreUnderscoreMaterialUINs.TableNs

import typings.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableHeaderProps extends js.Object {
  var adjustForCheckbox: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var displaySelectAll: js.UndefOr[Boolean] = js.undefined
  var enableSelectAll: js.UndefOr[Boolean] = js.undefined
  /** @deprecated Instead, use event handler on Table */
  var onSelectAll: js.UndefOr[js.Function1[/* checked */ Boolean, Unit]] = js.undefined
  /** @deprecated Instead, use event handler on Table */
  var selectAllSelected: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object TableHeaderProps {
  @scala.inline
  def apply(
    adjustForCheckbox: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    displaySelectAll: js.UndefOr[Boolean] = js.undefined,
    enableSelectAll: js.UndefOr[Boolean] = js.undefined,
    onSelectAll: /* checked */ Boolean => Unit = null,
    selectAllSelected: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null
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

