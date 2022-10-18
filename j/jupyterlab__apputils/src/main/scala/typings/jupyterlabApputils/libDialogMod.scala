package typings.jupyterlabApputils

import typings.jupyterlabApputils.anon.PartialIButton
import typings.jupyterlabApputils.anon.ReadonlyIButton
import typings.jupyterlabApputils.jupyterlabApputilsStrings.default
import typings.jupyterlabApputils.jupyterlabApputilsStrings.warn
import typings.jupyterlabApputils.libDialogMod.Dialog.IButton
import typings.jupyterlabApputils.libDialogMod.Dialog.IOptions
import typings.jupyterlabApputils.libDialogMod.Dialog.IResult
import typings.jupyterlabApputils.libWidgettrackerMod.WidgetTracker
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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDialogMod {
  
  @JSImport("@jupyterlab/apputils/lib/dialog", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@jupyterlab/apputils/lib/dialog", "Dialog")
  @js.native
  /**
    * Create a dialog panel instance.
    *
    * @param options - The dialog setup options.
    */
  open class Dialog[T] () extends Widget {
    def this(options: Partial[IOptions[T]]) = this()
    
    /* private */ var _body: Any = js.native
    
    /* private */ var _buttonNodes: Any = js.native
    
    /* private */ var _buttons: Any = js.native
    
    /* private */ var _defaultButton: Any = js.native
    
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
    
    /**
      * Handle the `'mousedown'` event for the widget.
      *
      * @param event - The DOM event sent to the widget
      */
    /* protected */ def _evtMouseDown(event: MouseEvent): Unit = js.native
    
    /* private */ var _first: Any = js.native
    
    /* private */ var _focusNodeSelector: Any = js.native
    
    /* private */ var _hasClose: Any = js.native
    
    /* private */ var _host: Any = js.native
    
    /* private */ var _lastMouseDownInDialog: Any = js.native
    
    /* private */ var _original: Any = js.native
    
    /* private */ var _primary: Any = js.native
    
    /* private */ var _promise: Any = js.native
    
    /**
      * Resolve a button item.
      */
    /* private */ var _resolve: Any = js.native
    
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
    
    @JSImport("@jupyterlab/apputils/lib/dialog", "Dialog")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The default implementation of a dialog renderer.
      */
    @JSImport("@jupyterlab/apputils/lib/dialog", "Dialog.Renderer")
    @js.native
    open class Renderer () extends StObject {
      
      /**
        * Create the body of the dialog.
        *
        * @param value - The input value for the body.
        *
        * @returns A widget for the body.
        */
      def createBody(value: Body[Any]): Widget = js.native
      
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
      def createHeader[T](title: Header): Widget = js.native
      def createHeader[T](title: Header, reject: js.Function0[Unit]): Widget = js.native
      def createHeader[T](title: Header, reject: js.Function0[Unit], options: Partial[IOptions[T]]): Widget = js.native
      def createHeader[T](title: Header, reject: Unit, options: Partial[IOptions[T]]): Widget = js.native
      
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
    inline def cancelButton(): ReadonlyIButton = ^.asInstanceOf[js.Dynamic].applyDynamic("cancelButton")().asInstanceOf[ReadonlyIButton]
    inline def cancelButton(options: PartialIButton): ReadonlyIButton = ^.asInstanceOf[js.Dynamic].applyDynamic("cancelButton")(options.asInstanceOf[js.Any]).asInstanceOf[ReadonlyIButton]
    
    /**
      * Create a button item.
      */
    inline def createButton(value: PartialIButton): ReadonlyIButton = ^.asInstanceOf[js.Dynamic].applyDynamic("createButton")(value.asInstanceOf[js.Any]).asInstanceOf[ReadonlyIButton]
    
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
    inline def flush(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("flush")().asInstanceOf[Unit]
    
    /**
      * Create an accept button.
      */
    inline def okButton(): ReadonlyIButton = ^.asInstanceOf[js.Dynamic].applyDynamic("okButton")().asInstanceOf[ReadonlyIButton]
    inline def okButton(options: PartialIButton): ReadonlyIButton = ^.asInstanceOf[js.Dynamic].applyDynamic("okButton")(options.asInstanceOf[js.Any]).asInstanceOf[ReadonlyIButton]
    
    /**
      * The dialog widget tracker.
      */
    @JSImport("@jupyterlab/apputils/lib/dialog", "Dialog.tracker")
    @js.native
    val tracker: WidgetTracker[Dialog[Any]] = js.native
    
    /**
      * Create a warn button.
      */
    inline def warnButton(): ReadonlyIButton = ^.asInstanceOf[js.Dynamic].applyDynamic("warnButton")().asInstanceOf[ReadonlyIButton]
    inline def warnButton(options: PartialIButton): ReadonlyIButton = ^.asInstanceOf[js.Dynamic].applyDynamic("warnButton")(options.asInstanceOf[js.Any]).asInstanceOf[ReadonlyIButton]
    
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
    trait IButton extends StObject {
      
      /**
        * The dialog action to perform when the button is clicked.
        */
      var accept: Boolean
      
      /**
        * The additional dialog actions to perform when the button is clicked.
        */
      var actions: js.Array[String]
      
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
    object IButton {
      
      inline def apply(
        accept: Boolean,
        actions: js.Array[String],
        caption: String,
        className: String,
        displayType: default | warn,
        iconClass: String,
        iconLabel: String,
        label: String
      ): IButton = {
        val __obj = js.Dynamic.literal(accept = accept.asInstanceOf[js.Any], actions = actions.asInstanceOf[js.Any], caption = caption.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], displayType = displayType.asInstanceOf[js.Any], iconClass = iconClass.asInstanceOf[js.Any], iconLabel = iconLabel.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
        __obj.asInstanceOf[IButton]
      }
      
      extension [Self <: IButton](x: Self) {
        
        inline def setAccept(value: Boolean): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
        
        inline def setActions(value: js.Array[String]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
        
        inline def setActionsVarargs(value: String*): Self = StObject.set(x, "actions", js.Array(value*))
        
        inline def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
        
        inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        inline def setDisplayType(value: default | warn): Self = StObject.set(x, "displayType", value.asInstanceOf[js.Any])
        
        inline def setIconClass(value: String): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
        
        inline def setIconLabel(value: String): Self = StObject.set(x, "iconLabel", value.asInstanceOf[js.Any])
        
        inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * The options used to create a dialog.
      */
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
        * When "false", disallows user from dismissing the dialog by clicking outside it
        * or pressing escape. Defaults to "true", which renders a close button.
        */
      var hasClose: Boolean
      
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
    object IOptions {
      
      inline def apply[T](
        body: Body[T],
        buttons: js.Array[IButton],
        defaultButton: Double,
        focusNodeSelector: String,
        hasClose: Boolean,
        host: HTMLElement,
        renderer: IRenderer,
        title: Header
      ): IOptions[T] = {
        val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], defaultButton = defaultButton.asInstanceOf[js.Any], focusNodeSelector = focusNodeSelector.asInstanceOf[js.Any], hasClose = hasClose.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], renderer = renderer.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions[T]]
      }
      
      extension [Self <: IOptions[?], T](x: Self & IOptions[T]) {
        
        inline def setBody(value: Body[T]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
        
        inline def setButtons(value: js.Array[IButton]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
        
        inline def setButtonsVarargs(value: IButton*): Self = StObject.set(x, "buttons", js.Array(value*))
        
        inline def setDefaultButton(value: Double): Self = StObject.set(x, "defaultButton", value.asInstanceOf[js.Any])
        
        inline def setFocusNodeSelector(value: String): Self = StObject.set(x, "focusNodeSelector", value.asInstanceOf[js.Any])
        
        inline def setHasClose(value: Boolean): Self = StObject.set(x, "hasClose", value.asInstanceOf[js.Any])
        
        inline def setHost(value: HTMLElement): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
        
        inline def setRenderer(value: IRenderer): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
        
        inline def setTitle(value: Header): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * A dialog renderer.
      */
    trait IRenderer extends StObject {
      
      /**
        * Create the body of the dialog.
        *
        * @param value - The input value for the body.
        *
        * @returns A widget for the body.
        */
      def createBody(body: Body[Any]): Widget
      
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
      def createHeader[T](title: Header, reject: js.Function0[Unit], options: Partial[IOptions[T]]): Widget
    }
    object IRenderer {
      
      inline def apply(
        createBody: Body[Any] => Widget,
        createButtonNode: IButton => HTMLElement,
        createFooter: js.Array[HTMLElement] => Widget,
        createHeader: (Header, js.Function0[Unit], Partial[IOptions[Any]]) => Widget
      ): IRenderer = {
        val __obj = js.Dynamic.literal(createBody = js.Any.fromFunction1(createBody), createButtonNode = js.Any.fromFunction1(createButtonNode), createFooter = js.Any.fromFunction1(createFooter), createHeader = js.Any.fromFunction3(createHeader))
        __obj.asInstanceOf[IRenderer]
      }
      
      extension [Self <: IRenderer](x: Self) {
        
        inline def setCreateBody(value: Body[Any] => Widget): Self = StObject.set(x, "createBody", js.Any.fromFunction1(value))
        
        inline def setCreateButtonNode(value: IButton => HTMLElement): Self = StObject.set(x, "createButtonNode", js.Any.fromFunction1(value))
        
        inline def setCreateFooter(value: js.Array[HTMLElement] => Widget): Self = StObject.set(x, "createFooter", js.Any.fromFunction1(value))
        
        inline def setCreateHeader(value: (Header, js.Function0[Unit], Partial[IOptions[Any]]) => Widget): Self = StObject.set(x, "createHeader", js.Any.fromFunction3(value))
      }
    }
    
    /**
      * The result of a dialog.
      */
    trait IResult[T] extends StObject {
      
      /**
        * The button that was pressed.
        */
      var button: IButton
      
      /**
        * The value retrieved from `.getValue()` if given on the widget.
        */
      var value: T | Null
    }
    object IResult {
      
      inline def apply[T](button: IButton): IResult[T] = {
        val __obj = js.Dynamic.literal(button = button.asInstanceOf[js.Any], value = null)
        __obj.asInstanceOf[IResult[T]]
      }
      
      extension [Self <: IResult[?], T](x: Self & IResult[T]) {
        
        inline def setButton(value: IButton): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
        
        inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        inline def setValueNull: Self = StObject.set(x, "value", null)
      }
    }
  }
  
  inline def showDialog[T](): js.Promise[IResult[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("showDialog")().asInstanceOf[js.Promise[IResult[T]]]
  inline def showDialog[T](options: Partial[IOptions[T]]): js.Promise[IResult[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("showDialog")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IResult[T]]]
  
  inline def showErrorMessage(title: String, error: Any): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("showErrorMessage")(title.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def showErrorMessage(title: String, error: Any, buttons: js.Array[IButton]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("showErrorMessage")(title.asInstanceOf[js.Any], error.asInstanceOf[js.Any], buttons.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
