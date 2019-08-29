package typings.atJupyterlabFilebrowser.libMod

import typings.atJupyterlabApputils.libDialogMod.DialogNs.IResult
import typings.atJupyterlabFilebrowser.libOpendialogMod.FileDialogNs.IDirectoryOptions
import typings.atJupyterlabFilebrowser.libOpendialogMod.FileDialogNs.IFileOptions
import typings.atJupyterlabServices.libContentsMod.ContentsNs.IModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/filebrowser/lib", "FileDialog")
@js.native
object FileDialogNs extends js.Object {
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

