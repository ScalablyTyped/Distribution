package typings.atJupyterlabApputils.libDialogMod

import typings.atJupyterlabApputils.atJupyterlabApputilsStrings.default
import typings.atJupyterlabApputils.atJupyterlabApputilsStrings.warn
import typings.atJupyterlabApputils.libDialogMod.DialogNs.Body
import typings.atJupyterlabApputils.libDialogMod.DialogNs.Header
import typings.atJupyterlabApputils.libDialogMod.DialogNs.IBodyWidget
import typings.atJupyterlabApputils.libDialogMod.DialogNs.IButton
import typings.atJupyterlabApputils.libDialogMod.DialogNs.IRenderer
import typings.atJupyterlabApputils.libDialogMod.DialogNs.Renderer
import typings.atJupyterlabApputils.libWidgettrackerMod.WidgetTracker
import typings.atPhosphorWidgets.atPhosphorWidgetsMod.Widget
import typings.react.reactMod.ReactElement
import typings.std.HTMLElement
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/apputils/lib/dialog", "Dialog")
@js.native
object DialogNs extends js.Object {
  /**
    * A widget used as a dialog body.
    */
  @js.native
  trait IBodyWidget[T] extends Widget {
    /**
      * Get the serialized value of the widget.
      */
    var getValue: js.UndefOr[js.Function0[T]] = js.native
  }
  
  /**
    * The options used to make a button item.
    */
  trait IButton extends js.Object {
    /**
      * The dialog action to perform when the button is clicked.
      */
    var accept: Boolean
    /**
      * The caption for the button.
      */
    var caption: String
    /**
      * The extra class name for the button.
      */
    var className: String
    /**
      * The button display type.
      */
    var displayType: default | warn
    /**
      * The icon class for the button.
      */
    var iconClass: String
    /**
      * The icon label for the button.
      */
    var iconLabel: String
    /**
      * The label for the button.
      */
    var label: String
  }
  
  /**
    * The options used to create a dialog.
    */
  trait IOptions[T] extends js.Object {
    /**
      * The main body element for the dialog or a message to display.
      * Defaults to an empty string.
      *
      * #### Notes
      * If a widget is given as the body, it will be disposed after the
      * dialog is resolved.  If the widget has a `getValue()` method,
      * the method will be called prior to disposal and the value
      * will be provided as part of the dialog result.
      * A string argument will be used as raw `textContent`.
      * All `input` and `select` nodes will be wrapped and styled.
      */
    var body: Body[T]
    /**
      * The buttons to display. Defaults to cancel and accept buttons.
      */
    var buttons: js.Array[IButton]
    /**
      * The index of the default button.  Defaults to the last button.
      */
    var defaultButton: Double
    /**
      * A selector for the primary element that should take focus in the dialog.
      * Defaults to an empty string, causing the [[defaultButton]] to take
      * focus.
      */
    var focusNodeSelector: String
    /**
      * The host element for the dialog. Defaults to `document.body`.
      */
    var host: HTMLElement
    /**
      * An optional renderer for dialog items.  Defaults to a shared
      * default renderer.
      */
    var renderer: IRenderer
    /**
      * The top level text for the dialog.  Defaults to an empty string.
      */
    var title: Header
  }
  
  /**
    * A dialog renderer.
    */
  trait IRenderer extends js.Object {
    /**
      * Create the body of the dialog.
      *
      * @param value - The input value for the body.
      *
      * @returns A widget for the body.
      */
    def createBody(body: Body[_]): Widget
    /**
      * Create a button node for the dialog.
      *
      * @param button - The button data.
      *
      * @returns A node for the button.
      */
    def createButtonNode(button: IButton): HTMLElement
    /**
      * Create the footer of the dialog.
      *
      * @param buttons - The button nodes to add to the footer.
      *
      * @returns A widget for the footer.
      */
    def createFooter(buttons: js.Array[HTMLElement]): Widget
    /**
      * Create the header of the dialog.
      *
      * @param title - The title of the dialog.
      *
      * @returns A widget for the dialog header.
      */
    def createHeader(title: Header): Widget
  }
  
  /**
    * The result of a dialog.
    */
  trait IResult[T] extends js.Object {
    /**
      * The button that was pressed.
      */
    var button: IButton
    /**
      * The value retrieved from `.getValue()` if given on the widget.
      */
    var value: T | Null
  }
  
  /**
    * The default implementation of a dialog renderer.
    */
  @js.native
  class Renderer () extends js.Object {
    /**
      * Create the body of the dialog.
      *
      * @param value - The input value for the body.
      *
      * @returns A widget for the body.
      */
    def createBody(value: Body[_]): Widget = js.native
    /**
      * Create a button node for the dialog.
      *
      * @param button - The button data.
      *
      * @returns A node for the button.
      */
    def createButtonNode(button: IButton): HTMLElement = js.native
    /**
      * Create the footer of the dialog.
      *
      * @param buttonNodes - The buttons nodes to add to the footer.
      *
      * @returns A widget for the footer.
      */
    def createFooter(buttons: js.Array[HTMLElement]): Widget = js.native
    /**
      * Create the header of the dialog.
      *
      * @param title - The title of the dialog.
      *
      * @returns A widget for the dialog header.
      */
    def createHeader(title: Header): Widget = js.native
    /**
      * Create the class name for the button icon.
      *
      * @param data - The data to use for the class name.
      *
      * @returns The full class name for the item icon.
      */
    def createIconClass(data: IButton): String = js.native
    /**
      * Create the class name for the button.
      *
      * @param data - The data to use for the class name.
      *
      * @returns The full class name for the button.
      */
    def createItemClass(data: IButton): String = js.native
    /**
      * Render an icon element for a dialog item.
      *
      * @param data - The data to use for rendering the icon.
      *
      * @returns An HTML element representing the icon.
      */
    def renderIcon(data: IButton): HTMLElement = js.native
    /**
      * Render the label element for a button.
      *
      * @param data - The data to use for rendering the label.
      *
      * @returns An HTML element representing the item label.
      */
    def renderLabel(data: IButton): HTMLElement = js.native
  }
  
  /**
    * The default renderer instance.
    */
  val defaultRenderer: Renderer = js.native
  /**
    * The dialog widget tracker.
    */
  val tracker: WidgetTracker[Dialog[js.Any]] = js.native
  /**
    * Create a reject button.
    */
  def cancelButton(): IButton = js.native
  def cancelButton(options: Partial[IButton]): IButton = js.native
  /**
    * Create a button item.
    */
  def createButton(value: Partial[IButton]): IButton = js.native
  /**
    * Disposes all dialog instances.
    *
    * #### Notes
    * This function should only be used in tests or cases where application state
    * may be discarded.
    */
  def flush(): Unit = js.native
  /**
    * Create an accept button.
    */
  def okButton(): IButton = js.native
  def okButton(options: Partial[IButton]): IButton = js.native
  /**
    * Create a warn button.
    */
  def warnButton(): IButton = js.native
  def warnButton(options: Partial[IButton]): IButton = js.native
  /**
    * The body input types.
    */
  type Body[T] = IBodyWidget[T] | ReactElement | String
  /**
    * The header input types.
    */
  type Header = ReactElement | String
}

