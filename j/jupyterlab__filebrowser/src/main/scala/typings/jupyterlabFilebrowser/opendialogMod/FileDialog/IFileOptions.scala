package typings.jupyterlabFilebrowser.opendialogMod.FileDialog

import typings.jupyterlabApputils.dialogMod.Dialog.Header
import typings.jupyterlabApputils.dialogMod.Dialog.IRenderer
import typings.jupyterlabDocmanager.tokensMod.IDocumentManager
import typings.jupyterlabServices.contentsMod.Contents.IModel
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for the open file dialog
  */
trait IFileOptions extends IDirectoryOptions {
  /**
    * Filter function on file browser item model
    */
  var filter: js.UndefOr[js.Function1[/* value */ IModel, Boolean]] = js.undefined
}

object IFileOptions {
  @scala.inline
  def apply(
    manager: IDocumentManager,
    filter: /* value */ IModel => Boolean = null,
    focusNodeSelector: String = null,
    host: HTMLElement = null,
    renderer: IRenderer = null,
    title: Header = null
  ): IFileOptions = {
    val __obj = js.Dynamic.literal(manager = manager.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1(filter))
    if (focusNodeSelector != null) __obj.updateDynamic("focusNodeSelector")(focusNodeSelector.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (renderer != null) __obj.updateDynamic("renderer")(renderer.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFileOptions]
  }
}

