package typings.atJupyterlabApputils.libInputdialogMod.InputDialog

import typings.atJupyterlabApputils.libDialogMod.Dialog.IResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/apputils/lib/inputdialog", "InputDialog.getText")
@js.native
object getText extends js.Object {
  /**
    * Create and show a input dialog for a text.
    *
    * @param options - The dialog setup options.
    *
    * @returns A promise that resolves with whether the dialog was accepted
    */
  def apply(options: ITextOptions): js.Promise[IResult[String]] = js.native
}

