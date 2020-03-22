package typings.jupyterlabApputils.inputdialogMod.InputDialog

import typings.jupyterlabApputils.dialogMod.Dialog.IResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/apputils/lib/inputdialog", "InputDialog.getPassword")
@js.native
object getPassword extends js.Object {
  /**
    * Create and show a input dialog for a password.
    *
    * @param options - The dialog setup options.
    *
    * @returns A promise that resolves with whether the dialog was accepted
    */
  def apply(options: ITextOptions): js.Promise[IResult[String]] = js.native
}

