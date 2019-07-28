package typings.atJupyterlabApputils.libInputdialogMod

import typings.atJupyterlabApputils.libDialogMod.DialogNs.Header
import typings.atJupyterlabApputils.libDialogMod.DialogNs.IRenderer
import typings.atJupyterlabApputils.libDialogMod.DialogNs.IResult
import typings.atJupyterlabApputils.libInputdialogMod.InputDialogNs.IBooleanOptions
import typings.atJupyterlabApputils.libInputdialogMod.InputDialogNs.IItemOptions
import typings.atJupyterlabApputils.libInputdialogMod.InputDialogNs.INumberOptions
import typings.atJupyterlabApputils.libInputdialogMod.InputDialogNs.IOptions
import typings.atJupyterlabApputils.libInputdialogMod.InputDialogNs.ITextOptions
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/apputils/lib/inputdialog", "InputDialog")
@js.native
object InputDialogNs extends js.Object {
  /**
    * Constructor options for boolean input dialogs
    */
  trait IBooleanOptions extends IOptions {
    /**
      * Default value
      */
    var value: js.UndefOr[Boolean] = js.undefined
  }
  
  /**
    * Constructor options for item selection input dialogs
    */
  trait IItemOptions extends IOptions {
    /**
      * Default choice
      *
      * If the list is editable a string with a default value can be provided
      * otherwise the index of the default choice should be given.
      */
    var current: js.UndefOr[Double | String] = js.undefined
    /**
      * Is the item editable?
      */
    var editable: js.UndefOr[Boolean] = js.undefined
    /**
      * List of choices
      */
    var items: js.Array[String]
    /**
      * Placeholder text for editable input
      */
    var placeholder: js.UndefOr[String] = js.undefined
  }
  
  /**
    * Constructor options for number input dialogs
    */
  trait INumberOptions extends IOptions {
    /**
      * Default value
      */
    var value: js.UndefOr[Double] = js.undefined
  }
  
  /**
    * Common constructor options for input dialogs
    */
  trait IOptions extends js.Object {
    /**
      * Label for cancel button.
      */
    var cancelLabel: js.UndefOr[String] = js.undefined
    /**
      * The host element for the dialog. Defaults to `document.body`.
      */
    var host: js.UndefOr[HTMLElement] = js.undefined
    /**
      * Label of the requested input
      */
    var label: js.UndefOr[String] = js.undefined
    /**
      * Label for ok button.
      */
    var okLabel: js.UndefOr[String] = js.undefined
    /**
      * An optional renderer for dialog items.  Defaults to a shared
      * default renderer.
      */
    var renderer: js.UndefOr[IRenderer] = js.undefined
    /**
      * The top level text for the dialog.  Defaults to an empty string.
      */
    var title: Header
  }
  
  /**
    * Constructor options for text input dialogs
    */
  trait ITextOptions extends IOptions {
    /**
      * Placeholder text
      */
    var placeholder: js.UndefOr[String] = js.undefined
    /**
      * Default input text
      */
    var text: js.UndefOr[String] = js.undefined
  }
  
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

