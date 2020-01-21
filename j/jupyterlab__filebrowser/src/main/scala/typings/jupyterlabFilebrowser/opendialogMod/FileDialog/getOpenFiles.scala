package typings.jupyterlabFilebrowser.opendialogMod.FileDialog

import typings.jupyterlabApputils.dialogMod.Dialog.IResult
import typings.jupyterlabServices.contentsMod.Contents.IModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/filebrowser/lib/opendialog", "FileDialog.getOpenFiles")
@js.native
object getOpenFiles extends js.Object {
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
  def apply(options: IFileOptions): js.Promise[IResult[js.Array[IModel]]] = js.native
}

