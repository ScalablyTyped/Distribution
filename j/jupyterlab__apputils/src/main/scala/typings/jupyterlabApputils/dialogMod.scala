package typings.jupyterlabApputils

import typings.jupyterlabApputils.anon.PartialIButton
import typings.jupyterlabApputils.anon.ReadonlyIButton
import typings.jupyterlabApputils.dialogMod.Dialog.IButton
import typings.jupyterlabApputils.dialogMod.Dialog.IOptions
import typings.jupyterlabApputils.dialogMod.Dialog.IResult
import typings.jupyterlabApputils.jupyterlabApputilsStrings.default
import typings.jupyterlabApputils.jupyterlabApputilsStrings.warn
import typings.jupyterlabApputils.widgettrackerMod.WidgetTracker
import typings.luminoWidgets.mod.Widget
import typings.react.mod.ReactElement
import typings.std.Event
import typings.std.FocusEvent
import typings.std.HTMLElement
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dialogMod {
  
  @JSImport("@jupyterlab/apputils/lib/dialog", "Dialog")
  @js.native
  /**
    * Create a dialog panel instance.
    *
    * @param options - The dialog setup options.
    */
  class Dialog[T] () extends Widget {
    def this(options: Partial[IOptions[T]]) = this()
    
    var _body: js.Any = js.native
    
    var _buttonNodes: js.Any = js.native
    
    var _buttons: js.Any = js.native
    
    var _defaultButton: js.Any = js.native
    
    /**
      * Handle the `'click'` event for a dialog button.
      *
      * @param event - The DOM event sent to the widget
      */
    /* protected */ def _evtClick(event: MouseEvent): Unit = js.native
    
    /**
      * Handle the `'focus'` event for the widget.
      *
      * @param event - The DOM event sent to the widget
      */
    /* protected */ def _evtFocus(event: FocusEvent): Unit = js.native
    
    /**
      * Handle the `'keydown'` event for the widget.
      *
      * @param event - The DOM event sent to the widget
      */
    /* protected */ def _evtKeydown(event: KeyboardEvent): Unit = js.native
    
    var _first: js.Any = js.native
    
    var _focusNodeSelector: js.Any = js.native
    
    var _host: js.Any = js.native
    
    var _original: js.Any = js.native
    
    var _primary: js.Any = js.native
    
    var _promise: js.Any = js.native
    
    /**
      * Resolve a button item.
      */
    var _resolve: js.Any = js.native
    
    /**
      * Handle the DOM events for the directory listing.
      *
      * @param event - The DOM event sent to the widget.
      *
      * #### Notes
      * This method implements the DOM `EventListener` interface and is
      * called in response to events on the panel's DOM node. It should
      * not be called directly by user code.
      */
    def handleEvent(event: Event): Unit = js.native
    
    /**
      * Launch the dialog as a modal window.
      *
      * @returns a promise that resolves with the result of the dialog.
      */
    def launch(): js.Promise[IResult[T]] = js.native
    
    /**
      * Reject the current dialog with a default reject value.
      *
      * #### Notes
      * Will be a no-op if the dialog is not shown.
      */
    def reject(): Unit = js.native
    
    /**
      * Resolve the current dialog.
      *
      * @param index - An optional index to the button to resolve.
      *
      * #### Notes
      * Will default to the defaultIndex.
      * Will resolve the current `show()` with the button value.
      * Will be a no-op if the dialog is not shown.
      */
    def resolve(): Unit = js.native
    def resolve(index: Double): Unit = js.native
  }
  object Dialog {
    
    /**
      * The default implementation of a dialog renderer.
      */
    @JSImport("@jupyterlab/apputils/lib/dialog", "Dialog.Renderer")
    @js.native
    class Renderer () extends StObject {
      
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
      * Create a reject button.
      */
    @JSImport("@jupyterlab/apputils/lib/dialog", "Dialog.cancelButton")
    @js.native
    def cancelButton(): ReadonlyIButton = js.native
    @JSImport("@jupyterlab/apputils/lib/dialog", "Dialog.cancelButton")
    @js.native
    def cancelButton(options: PartialIButton): ReadonlyIButton = js.native
    
    /**
      * Create a button item.
      */
    @JSImport("@jupyterlab/apputils/lib/dialog", "Dialog.createButton")
    @js.native
    def createButton(value: PartialIButton): ReadonlyIButton = js.native
    
    /**
      * The default renderer instance.
      */
    @JSImport("@jupyterlab/apputils/lib/dialog", "Dialog.defaultRenderer")
    @js.native
    val defaultRenderer: Renderer = js.native
    
    /**
      * Disposes all dialog instances.
      *
      * #### Notes
      * This function should only be used in tests or cases where application state
      * may be discarded.
      */
    @JSImport("@jupyterlab/apputils/lib/dialog", "Dialog.flush")
    @js.native
    def flush(): Unit = js.native
    
    /**
      * Create an accept button.
      */
    @JSImport("@jupyterlab/apputils/lib/dialog", "Dialog.okButton")
    @js.native
    def okButton(): ReadonlyIButton = js.native
    @JSImport("@jupyterlab/apputils/lib/dialog", "Dialog.okButton")
    @js.native
    def okButton(options: PartialIButton): ReadonlyIButton = js.native
    
    /**
      * The dialog widget tracker.
      */
    @JSImport("@jupyterlab/apputils/lib/dialog", "Dialog.tracker")
    @js.native
    val tracker: WidgetTracker[Dialog[js.Any]] = js.native
    
    /**
      * Create a warn button.
      */
    @JSImport("@jupyterlab/apputils/lib/dialog", "Dialog.warnButton")
    @js.native
    def warnButton(): ReadonlyIButton = js.native
    @JSImport("@jupyterlab/apputils/lib/dialog", "Dialog.warnButton")
    @js.native
    def warnButton(options: PartialIButton): ReadonlyIButton = js.native
    
    /**
      * The body input types.
      */
    type Body[T] = IBodyWidget[T] | ReactElement | String
    
    /**
      * The header input types.
      */
    type Header = ReactElement | String
    
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
    @js.native
    trait IButton extends StObject {
      
      /**
        * The dialog action to perform when the button is clicked.
        */
      var accept: Boolean = js.native
      
      /**
        * The caption for the button.
        */
      var caption: String = js.native
      
      /**
        * The extra class name for the button.
        */
      var className: String = js.native
      
      /**
        * The button display type.
        */
      var displayType: default | warn = js.native
      
      /**
        * The icon class for the button.
        */
      var iconClass: String = js.native
      
      /**
        * The icon label for the button.
        */
      var iconLabel: String = js.native
      
      /**
        * The label for the button.
        */
      var label: String = js.native
    }
    object IButton {
      
      @scala.inline
      def apply(
        accept: Boolean,
        caption: String,
        className: String,
        displayType: default | warn,
        iconClass: String,
        iconLabel: String,
        label: String
      ): IButton = {
        val __obj = js.Dynamic.literal(accept = accept.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], displayType = displayType.asInstanceOf[js.Any], iconClass = iconClass.asInstanceOf[js.Any], iconLabel = iconLabel.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
        __obj.asInstanceOf[IButton]
      }
      
      @scala.inline
      implicit class IButtonMutableBuilder[Self <: IButton] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAccept(value: Boolean): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDisplayType(value: default | warn): Self = StObject.set(x, "displayType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIconClass(value: String): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIconLabel(value: String): Self = StObject.set(x, "iconLabel", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * The options used to create a dialog.
      */
    @js.native
    trait IOptions[T] extends StObject {
      
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
      var body: Body[T] = js.native
      
      /**
        * The buttons to display. Defaults to cancel and accept buttons.
        */
      var buttons: js.Array[IButton] = js.native
      
      /**
        * The index of the default button.  Defaults to the last button.
        */
      var defaultButton: Double = js.native
      
      /**
        * A selector for the primary element that should take focus in the dialog.
        * Defaults to an empty string, causing the [[defaultButton]] to take
        * focus.
        */
      var focusNodeSelector: String = js.native
      
      /**
        * The host element for the dialog. Defaults to `document.body`.
        */
      var host: HTMLElement = js.native
      
      /**
        * An optional renderer for dialog items.  Defaults to a shared
        * default renderer.
        */
      var renderer: IRenderer = js.native
      
      /**
        * The top level text for the dialog.  Defaults to an empty string.
        */
      var title: Header = js.native
    }
    object IOptions {
      
      @scala.inline
      def apply[T](
        body: Body[T],
        buttons: js.Array[IButton],
        defaultButton: Double,
        focusNodeSelector: String,
        host: HTMLElement,
        renderer: IRenderer,
        title: Header
      ): IOptions[T] = {
        val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], defaultButton = defaultButton.asInstanceOf[js.Any], focusNodeSelector = focusNodeSelector.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], renderer = renderer.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions[T]]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: IOptions[_], T] (val x: Self with IOptions[T]) extends AnyVal {
        
        @scala.inline
        def setBody(value: Body[T]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setButtons(value: js.Array[IButton]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setButtonsVarargs(value: IButton*): Self = StObject.set(x, "buttons", js.Array(value :_*))
        
        @scala.inline
        def setDefaultButton(value: Double): Self = StObject.set(x, "defaultButton", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFocusNodeSelector(value: String): Self = StObject.set(x, "focusNodeSelector", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHost(value: HTMLElement): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRenderer(value: IRenderer): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTitle(value: Header): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * A dialog renderer.
      */
    @js.native
    trait IRenderer extends StObject {
      
      /**
        * Create the body of the dialog.
        *
        * @param value - The input value for the body.
        *
        * @returns A widget for the body.
        */
      def createBody(body: Body[_]): Widget = js.native
      
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
        * @param buttons - The button nodes to add to the footer.
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
    }
    object IRenderer {
      
      @scala.inline
      def apply(
        createBody: Body[_] => Widget,
        createButtonNode: IButton => HTMLElement,
        createFooter: js.Array[HTMLElement] => Widget,
        createHeader: Header => Widget
      ): IRenderer = {
        val __obj = js.Dynamic.literal(createBody = js.Any.fromFunction1(createBody), createButtonNode = js.Any.fromFunction1(createButtonNode), createFooter = js.Any.fromFunction1(createFooter), createHeader = js.Any.fromFunction1(createHeader))
        __obj.asInstanceOf[IRenderer]
      }
      
      @scala.inline
      implicit class IRendererMutableBuilder[Self <: IRenderer] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCreateBody(value: Body[_] => Widget): Self = StObject.set(x, "createBody", js.Any.fromFunction1(value))
        
        @scala.inline
        def setCreateButtonNode(value: IButton => HTMLElement): Self = StObject.set(x, "createButtonNode", js.Any.fromFunction1(value))
        
        @scala.inline
        def setCreateFooter(value: js.Array[HTMLElement] => Widget): Self = StObject.set(x, "createFooter", js.Any.fromFunction1(value))
        
        @scala.inline
        def setCreateHeader(value: Header => Widget): Self = StObject.set(x, "createHeader", js.Any.fromFunction1(value))
      }
    }
    
    /**
      * The result of a dialog.
      */
    @js.native
    trait IResult[T] extends StObject {
      
      /**
        * The button that was pressed.
        */
      var button: IButton = js.native
      
      /**
        * The value retrieved from `.getValue()` if given on the widget.
        */
      var value: T | Null = js.native
    }
    object IResult {
      
      @scala.inline
      def apply[T](button: IButton): IResult[T] = {
        val __obj = js.Dynamic.literal(button = button.asInstanceOf[js.Any])
        __obj.asInstanceOf[IResult[T]]
      }
      
      @scala.inline
      implicit class IResultMutableBuilder[Self <: IResult[_], T] (val x: Self with IResult[T]) extends AnyVal {
        
        @scala.inline
        def setButton(value: IButton): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValueNull: Self = StObject.set(x, "value", null)
      }
    }
  }
  
  @JSImport("@jupyterlab/apputils/lib/dialog", "showDialog")
  @js.native
  def showDialog[T](): js.Promise[IResult[T]] = js.native
  @JSImport("@jupyterlab/apputils/lib/dialog", "showDialog")
  @js.native
  def showDialog[T](options: Partial[IOptions[T]]): js.Promise[IResult[T]] = js.native
  
  @JSImport("@jupyterlab/apputils/lib/dialog", "showErrorMessage")
  @js.native
  def showErrorMessage(title: String, error: js.Any): js.Promise[Unit] = js.native
  @JSImport("@jupyterlab/apputils/lib/dialog", "showErrorMessage")
  @js.native
  def showErrorMessage(title: String, error: js.Any, buttons: js.Array[IButton]): js.Promise[Unit] = js.native
}
