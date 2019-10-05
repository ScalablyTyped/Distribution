package typings.atJupyterlabApputils.libInputdialogMod.InputDialog

import typings.atJupyterlabApputils.libDialogMod.Dialog.Header
import typings.atJupyterlabApputils.libDialogMod.Dialog.IRenderer
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Constructor options for item selection input dialogs
  */
trait IItemOptions extends IOptions {
  /**
    * Default choice
    *
    * If the list is editable a string with a default value can be provided
    * otherwise the index of the default choice should be given.
    */
  var current: js.UndefOr[Double | String] = js.undefined
  /**
    * Is the item editable?
    */
  var editable: js.UndefOr[Boolean] = js.undefined
  /**
    * List of choices
    */
  var items: js.Array[String]
  /**
    * Placeholder text for editable input
    */
  var placeholder: js.UndefOr[String] = js.undefined
}

object IItemOptions {
  @scala.inline
  def apply(
    items: js.Array[String],
    title: Header,
    cancelLabel: String = null,
    current: Double | String = null,
    editable: js.UndefOr[Boolean] = js.undefined,
    host: HTMLElement = null,
    label: String = null,
    okLabel: String = null,
    placeholder: String = null,
    renderer: IRenderer = null
  ): IItemOptions = {
    val __obj = js.Dynamic.literal(items = items, title = title.asInstanceOf[js.Any])
    if (cancelLabel != null) __obj.updateDynamic("cancelLabel")(cancelLabel)
    if (current != null) __obj.updateDynamic("current")(current.asInstanceOf[js.Any])
    if (!js.isUndefined(editable)) __obj.updateDynamic("editable")(editable)
    if (host != null) __obj.updateDynamic("host")(host)
    if (label != null) __obj.updateDynamic("label")(label)
    if (okLabel != null) __obj.updateDynamic("okLabel")(okLabel)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (renderer != null) __obj.updateDynamic("renderer")(renderer)
    __obj.asInstanceOf[IItemOptions]
  }
}

