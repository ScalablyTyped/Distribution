package typings.atJupyterlabApputils.libInputdialogMod.InputDialog

import typings.atJupyterlabApputils.libDialogMod.Dialog.IResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/apputils/lib/inputdialog", "InputDialog.getItem")
@js.native
object getItem extends js.Object {
  /**
    * Create and show a input dialog for a choice.
    *
    * @param options - The dialog setup options.
    *
    * @returns A promise that resolves with whether the dialog was accepted
    */
  def apply(options: IItemOptions): js.Promise[IResult[String]] = js.native
}

