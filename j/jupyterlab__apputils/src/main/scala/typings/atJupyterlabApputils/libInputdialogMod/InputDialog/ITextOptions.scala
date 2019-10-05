package typings.atJupyterlabApputils.libInputdialogMod.InputDialog

import typings.atJupyterlabApputils.libDialogMod.Dialog.Header
import typings.atJupyterlabApputils.libDialogMod.Dialog.IRenderer
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Constructor options for text input dialogs
  */
trait ITextOptions extends IOptions {
  /**
    * Placeholder text
    */
  var placeholder: js.UndefOr[String] = js.undefined
  /**
    * Default input text
    */
  var text: js.UndefOr[String] = js.undefined
}

object ITextOptions {
  @scala.inline
  def apply(
    title: Header,
    cancelLabel: String = null,
    host: HTMLElement = null,
    label: String = null,
    okLabel: String = null,
    placeholder: String = null,
    renderer: IRenderer = null,
    text: String = null
  ): ITextOptions = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    if (cancelLabel != null) __obj.updateDynamic("cancelLabel")(cancelLabel)
    if (host != null) __obj.updateDynamic("host")(host)
    if (label != null) __obj.updateDynamic("label")(label)
    if (okLabel != null) __obj.updateDynamic("okLabel")(okLabel)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (renderer != null) __obj.updateDynamic("renderer")(renderer)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[ITextOptions]
  }
}

