package typings.jupyterlabApputils.mod

import typings.jupyterlabApputils.dialogMod.Dialog.IResult
import typings.jupyterlabApputils.inputdialogMod.InputDialog.IBooleanOptions
import typings.jupyterlabApputils.inputdialogMod.InputDialog.IItemOptions
import typings.jupyterlabApputils.inputdialogMod.InputDialog.INumberOptions
import typings.jupyterlabApputils.inputdialogMod.InputDialog.ITextOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/apputils", "InputDialog")
@js.native
object InputDialog extends js.Object {
  /**
    * Create and show a input dialog for a boolean.
    *
    * @param options - The dialog setup options.
    *
    * @returns A promise that resolves with whether the dialog was accepted
    */
  def getBoolean(options: IBooleanOptions): js.Promise[IResult[Boolean]] = js.native
  /**
    * Create and show a input dialog for a choice.
    *
    * @param options - The dialog setup options.
    *
    * @returns A promise that resolves with whether the dialog was accepted
    */
  def getItem(options: IItemOptions): js.Promise[IResult[String]] = js.native
  /**
    * Create and show a input dialog for a number.
    *
    * @param options - The dialog setup options.
    *
    * @returns A promise that resolves with whether the dialog was accepted
    */
  def getNumber(options: INumberOptions): js.Promise[IResult[Double]] = js.native
  /**
    * Create and show a input dialog for a text.
    *
    * @param options - The dialog setup options.
    *
    * @returns A promise that resolves with whether the dialog was accepted
    */
  def getText(options: ITextOptions): js.Promise[IResult[String]] = js.native
}

