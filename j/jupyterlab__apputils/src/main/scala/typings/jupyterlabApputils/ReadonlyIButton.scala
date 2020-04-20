package typings.jupyterlabApputils

import typings.jupyterlabApputils.jupyterlabApputilsStrings.default
import typings.jupyterlabApputils.jupyterlabApputilsStrings.warn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<@jupyterlab/apputils.@jupyterlab/apputils/lib/dialog.Dialog.IButton> */
trait ReadonlyIButton extends js.Object {
  val accept: Boolean
  val caption: String
  val className: String
  val displayType: default | warn
  val iconClass: String
  val iconLabel: String
  val label: String
}

object ReadonlyIButton {
  @scala.inline
  def apply(
    accept: Boolean,
    caption: String,
    className: String,
    displayType: default | warn,
    iconClass: String,
    iconLabel: String,
    label: String
  ): ReadonlyIButton = {
    val __obj = js.Dynamic.literal(accept = accept.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], displayType = displayType.asInstanceOf[js.Any], iconClass = iconClass.asInstanceOf[js.Any], iconLabel = iconLabel.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyIButton]
  }
}

