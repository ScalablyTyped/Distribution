package typings.jupyterlabApputils.inputdialogMod.InputDialog

import typings.jupyterlabApputils.dialogMod.Dialog.Header
import typings.jupyterlabApputils.dialogMod.Dialog.IRenderer
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Common constructor options for input dialogs
  */
trait IOptions extends js.Object {
  /**
    * Label for cancel button.
    */
  var cancelLabel: js.UndefOr[String] = js.undefined
  /**
    * The host element for the dialog. Defaults to `document.body`.
    */
  var host: js.UndefOr[HTMLElement] = js.undefined
  /**
    * Label of the requested input
    */
  var label: js.UndefOr[String] = js.undefined
  /**
    * Label for ok button.
    */
  var okLabel: js.UndefOr[String] = js.undefined
  /**
    * An optional renderer for dialog items.  Defaults to a shared
    * default renderer.
    */
  var renderer: js.UndefOr[IRenderer] = js.undefined
  /**
    * The top level text for the dialog.  Defaults to an empty string.
    */
  var title: Header
}

object IOptions {
  @scala.inline
  def apply(
    title: Header,
    cancelLabel: String = null,
    host: HTMLElement = null,
    label: String = null,
    okLabel: String = null,
    renderer: IRenderer = null
  ): IOptions = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    if (cancelLabel != null) __obj.updateDynamic("cancelLabel")(cancelLabel.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (okLabel != null) __obj.updateDynamic("okLabel")(okLabel.asInstanceOf[js.Any])
    if (renderer != null) __obj.updateDynamic("renderer")(renderer.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

