package typings.atJupyterlabFilebrowser.libOpendialogMod

import typings.atJupyterlabApputils.libDialogMod.DialogNs.IResult
import typings.atJupyterlabDocmanager.libTokensMod.IDocumentManager
import typings.atJupyterlabFilebrowser.libOpendialogMod.FileDialogNs.IDirectoryOptions
import typings.atJupyterlabFilebrowser.libOpendialogMod.FileDialogNs.IFileOptions
import typings.atJupyterlabServices.libContentsMod.ContentsNs.IModel
import typings.atJupyterlabUiDashComponents.libIconInterfacesMod.IIconRegistry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/filebrowser/lib/opendialog", "FileDialog")
@js.native
object FileDialogNs extends js.Object {
  /**
    * Options for the open directory dialog
    */
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in keyof std.Pick<@jupyterlab/apputils.@jupyterlab/apputils/lib/dialog.Dialog.IOptions<std.Promise<std.Array<@jupyterlab/services.@jupyterlab/services/lib/contents.Contents.IModel>>>, std.Exclude<keyof @jupyterlab/apputils.@jupyterlab/apputils/lib/dialog.Dialog.IOptions<std.Promise<std.Array<@jupyterlab/services.@jupyterlab/services/lib/contents.Contents.IModel>>>, 'body' | 'buttons' | 'defaultButton'>> ]:? std.Pick<@jupyterlab/apputils.@jupyterlab/apputils/lib/dialog.Dialog.IOptions<std.Promise<std.Array<@jupyterlab/services.@jupyterlab/services/lib/contents.Contents.IModel>>>, std.Exclude<keyof @jupyterlab/apputils.@jupyterlab/apputils/lib/dialog.Dialog.IOptions<std.Promise<std.Array<@jupyterlab/services.@jupyterlab/services/lib/contents.Contents.IModel>>>, 'body' | 'buttons' | 'defaultButton'>>[P]} */ trait IDirectoryOptions extends js.Object {
    /**
      * An icon registry instance.
      */
    var iconRegistry: IIconRegistry
    /**
      * Document manager
      */
    var manager: IDocumentManager
  }
  
  /**
    * Options for the open file dialog
    */
  trait IFileOptions extends IDirectoryOptions {
    /**
      * Filter function on file browser item model
      */
    var filter: js.UndefOr[js.Function1[/* value */ IModel, Boolean]] = js.undefined
  }
  
  /**
    * Create and show a open directory dialog.
    *
    * Note: if nothing is selected when `getValue` will return the browser
    * model current path.
    *
    * @param options - The dialog setup options.
    *
    * @returns A promise that resolves with whether the dialog was accepted.
    */
  def getExistingDirectory(options: IDirectoryOptions): js.Promise[IResult[js.Array[IModel]]] = js.native
  /**
    * Create and show a open files dialog.
    *
    * Note: if nothing is selected when `getValue` will return the browser
    * model current path.
    *
    * @param options - The dialog setup options.
    *
    * @returns A promise that resolves with whether the dialog was accepted.
    */
  def getOpenFiles(options: IFileOptions): js.Promise[IResult[js.Array[IModel]]] = js.native
}

