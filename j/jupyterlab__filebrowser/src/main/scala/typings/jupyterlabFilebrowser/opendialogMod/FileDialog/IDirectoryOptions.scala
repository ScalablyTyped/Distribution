package typings.jupyterlabFilebrowser.opendialogMod.FileDialog

import typings.jupyterlabApputils.dialogMod.Dialog.Header
import typings.jupyterlabApputils.dialogMod.Dialog.IRenderer
import typings.jupyterlabDocmanager.tokensMod.IDocumentManager
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for the open directory dialog
  */
/* Inlined parent std.Partial<std.Pick<@jupyterlab/apputils.@jupyterlab/apputils.Dialog.IOptions<std.Promise<std.Array<@jupyterlab/services.@jupyterlab/services.Contents.IModel>>>, std.Exclude<keyof @jupyterlab/apputils.@jupyterlab/apputils.Dialog.IOptions<std.Promise<std.Array<@jupyterlab/services.@jupyterlab/services.Contents.IModel>>>, 'body' | 'buttons' | 'defaultButton'>>> */
trait IDirectoryOptions extends js.Object {
  var focusNodeSelector: js.UndefOr[String] = js.undefined
  var host: js.UndefOr[HTMLElement] = js.undefined
  /**
    * Document manager
    */
  var manager: IDocumentManager
  var renderer: js.UndefOr[IRenderer] = js.undefined
  var title: js.UndefOr[Header] = js.undefined
}

object IDirectoryOptions {
  @scala.inline
  def apply(
    manager: IDocumentManager,
    focusNodeSelector: String = null,
    host: HTMLElement = null,
    renderer: IRenderer = null,
    title: Header = null
  ): IDirectoryOptions = {
    val __obj = js.Dynamic.literal(manager = manager.asInstanceOf[js.Any])
    if (focusNodeSelector != null) __obj.updateDynamic("focusNodeSelector")(focusNodeSelector.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (renderer != null) __obj.updateDynamic("renderer")(renderer.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDirectoryOptions]
  }
}

