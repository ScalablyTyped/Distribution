package typings
package atJupyterlabApputilsLib.libToolbarMod.ToolbarButtonComponentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for ToolbarButttonComponent props.
  */
trait IProps extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  var iconClassName: js.UndefOr[java.lang.String] = js.undefined
  var iconLabel: js.UndefOr[java.lang.String] = js.undefined
  var label: js.UndefOr[java.lang.String] = js.undefined
  var onClick: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var tooltip: js.UndefOr[java.lang.String] = js.undefined
}

object IProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    iconClassName: java.lang.String = null,
    iconLabel: java.lang.String = null,
    label: java.lang.String = null,
    onClick: () => scala.Unit = null,
    tooltip: java.lang.String = null
  ): IProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (iconClassName != null) __obj.updateDynamic("iconClassName")(iconClassName)
    if (iconLabel != null) __obj.updateDynamic("iconLabel")(iconLabel)
    if (label != null) __obj.updateDynamic("label")(label)
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction0(onClick))
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    __obj.asInstanceOf[IProps]
  }
}

