package typings.jupyterlabFilebrowser.opendialogMod.FileDialog

import typings.jupyterlabApputils.dialogMod.Dialog.IResult
import typings.jupyterlabServices.contentsMod.Contents.IModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/filebrowser/lib/opendialog", "FileDialog.getExistingDirectory")
@js.native
object getExistingDirectory extends js.Object {
  
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
  def apply(options: IDirectoryOptions): js.Promise[IResult[js.Array[IModel]]] = js.native
}
