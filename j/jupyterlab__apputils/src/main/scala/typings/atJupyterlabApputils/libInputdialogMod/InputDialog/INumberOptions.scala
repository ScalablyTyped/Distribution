package typings.atJupyterlabApputils.libInputdialogMod.InputDialog

import typings.atJupyterlabApputils.libDialogMod.Dialog.Header
import typings.atJupyterlabApputils.libDialogMod.Dialog.IRenderer
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Constructor options for number input dialogs
  */
trait INumberOptions extends IOptions {
  /**
    * Default value
    */
  var value: js.UndefOr[Double] = js.undefined
}

object INumberOptions {
  @scala.inline
  def apply(
    title: Header,
    cancelLabel: String = null,
    host: HTMLElement = null,
    label: String = null,
    okLabel: String = null,
    renderer: IRenderer = null,
    value: Int | Double = null
  ): INumberOptions = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    if (cancelLabel != null) __obj.updateDynamic("cancelLabel")(cancelLabel)
    if (host != null) __obj.updateDynamic("host")(host)
    if (label != null) __obj.updateDynamic("label")(label)
    if (okLabel != null) __obj.updateDynamic("okLabel")(okLabel)
    if (renderer != null) __obj.updateDynamic("renderer")(renderer)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[INumberOptions]
  }
}

