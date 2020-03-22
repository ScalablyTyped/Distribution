package typings.jupyterlabApputils

import typings.jupyterlabApputils.jupyterlabApputilsStrings.default
import typings.jupyterlabApputils.jupyterlabApputilsStrings.warn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@jupyterlab/apputils.@jupyterlab/apputils/lib/dialog.Dialog.IButton> */
trait PartialIButton extends js.Object {
  var accept: js.UndefOr[Boolean] = js.undefined
  var caption: js.UndefOr[String] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var displayType: js.UndefOr[default | warn] = js.undefined
  var iconClass: js.UndefOr[String] = js.undefined
  var iconLabel: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[String] = js.undefined
}

object PartialIButton {
  @scala.inline
  def apply(
    accept: js.UndefOr[Boolean] = js.undefined,
    caption: String = null,
    className: String = null,
    displayType: default | warn = null,
    iconClass: String = null,
    iconLabel: String = null,
    label: String = null
  ): PartialIButton = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(accept)) __obj.updateDynamic("accept")(accept.asInstanceOf[js.Any])
    if (caption != null) __obj.updateDynamic("caption")(caption.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (displayType != null) __obj.updateDynamic("displayType")(displayType.asInstanceOf[js.Any])
    if (iconClass != null) __obj.updateDynamic("iconClass")(iconClass.asInstanceOf[js.Any])
    if (iconLabel != null) __obj.updateDynamic("iconLabel")(iconLabel.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialIButton]
  }
}

