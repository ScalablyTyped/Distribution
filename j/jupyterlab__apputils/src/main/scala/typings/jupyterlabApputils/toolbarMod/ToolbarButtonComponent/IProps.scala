package typings.jupyterlabApputils.toolbarMod.ToolbarButtonComponent

import typings.jupyterlabUiComponents.labiconMod.LabIcon.IMaybeResolvable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for ToolbarButttonComponent props.
  */
trait IProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var enabled: js.UndefOr[Boolean] = js.undefined
  var icon: js.UndefOr[IMaybeResolvable] = js.undefined
  var iconClass: js.UndefOr[String] = js.undefined
  var iconLabel: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var onClick: js.UndefOr[js.Function0[Unit]] = js.undefined
  var tooltip: js.UndefOr[String] = js.undefined
}

object IProps {
  @scala.inline
  def apply(
    className: String = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    icon: IMaybeResolvable = null,
    iconClass: String = null,
    iconLabel: String = null,
    label: String = null,
    onClick: () => Unit = null,
    tooltip: String = null
  ): IProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (iconClass != null) __obj.updateDynamic("iconClass")(iconClass.asInstanceOf[js.Any])
    if (iconLabel != null) __obj.updateDynamic("iconLabel")(iconLabel.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction0(onClick))
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProps]
  }
}

