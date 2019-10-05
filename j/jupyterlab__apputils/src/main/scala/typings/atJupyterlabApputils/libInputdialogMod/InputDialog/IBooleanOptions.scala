package typings.atJupyterlabApputils.libInputdialogMod.InputDialog

import typings.atJupyterlabApputils.libDialogMod.Dialog.Header
import typings.atJupyterlabApputils.libDialogMod.Dialog.IRenderer
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Constructor options for boolean input dialogs
  */
trait IBooleanOptions extends IOptions {
  /**
    * Default value
    */
  var value: js.UndefOr[Boolean] = js.undefined
}

object IBooleanOptions {
  @scala.inline
  def apply(
    title: Header,
    cancelLabel: String = null,
    host: HTMLElement = null,
    label: String = null,
    okLabel: String = null,
    renderer: IRenderer = null,
    value: js.UndefOr[Boolean] = js.undefined
  ): IBooleanOptions = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    if (cancelLabel != null) __obj.updateDynamic("cancelLabel")(cancelLabel)
    if (host != null) __obj.updateDynamic("host")(host)
    if (label != null) __obj.updateDynamic("label")(label)
    if (okLabel != null) __obj.updateDynamic("okLabel")(okLabel)
    if (renderer != null) __obj.updateDynamic("renderer")(renderer)
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[IBooleanOptions]
  }
}

