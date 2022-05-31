package typings.jupyterlabApputils

import typings.jupyterlabApputils.anon.PartialIButton
import typings.jupyterlabApputils.anon.ReadonlyIButton
import typings.jupyterlabApputils.clipboardMod.ClipboardData
import typings.jupyterlabApputils.collapseMod.Collapse.IOptions
import typings.jupyterlabApputils.dialogMod.Dialog.IButton
import typings.jupyterlabApputils.dialogMod.Dialog.IResult
import typings.jupyterlabApputils.inputdialogMod.InputDialog.IBooleanOptions
import typings.jupyterlabApputils.inputdialogMod.InputDialog.IItemOptions
import typings.jupyterlabApputils.inputdialogMod.InputDialog.INumberOptions
import typings.jupyterlabApputils.inputdialogMod.InputDialog.ITextOptions
import typings.jupyterlabApputils.jupyterlabApputilsStrings.copy
import typings.jupyterlabApputils.jupyterlabApputilsStrings.cut
import typings.jupyterlabApputils.printingMod.Printing.OptionalAsyncThunk
import typings.jupyterlabApputils.sanitizerMod.ISanitizer
import typings.jupyterlabApputils.sessioncontextMod.ISessionContext
import typings.jupyterlabApputils.sessioncontextMod.ISessionContext.IDialogs
import typings.jupyterlabApputils.sessioncontextMod.SessionContext.IKernelSearch
import typings.jupyterlabApputils.toolbarMod.CommandToolbarButtonComponent.IProps
import typings.jupyterlabApputils.vdomMod.IUseSignalProps
import typings.jupyterlabApputils.vdomMod.ReactRenderElement
import typings.jupyterlabApputils.vdomMod.VDomRenderer.IModel
import typings.luminoCoreutils.mod.MimeData
import typings.luminoCoreutils.mod.Token
import typings.luminoWidgets.mod.Widget
import typings.react.mod.global.JSX.Element
import typings.std.HTMLCollection
import typings.std.HTMLCollectionOf
import typings.std.HTMLElement
import typings.std.HTMLSelectElement
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jupyterlab/apputils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object Clipboard {
    
    @JSImport("@jupyterlab/apputils", "Clipboard")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Copy text to the system clipboard.
      *
      * #### Notes
      * This can only be called in response to a user input event.
      */
    inline def copyToSystem(clipboardData: ClipboardData): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("copyToSystem")(clipboardData.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Generate a clipboard event on a node.
      *
      * @param node - The element on which to generate the event.
      *
      * @param type - The type of event to generate.
      *   `'paste'` events cannot be programmatically generated.
      *
      * #### Notes
      * This can only be called in response to a user input event.
      */
    inline def generateEvent(node: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("generateEvent")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def generateEvent_copy(node: HTMLElement, `type`: copy): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generateEvent")(node.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def generateEvent_cut(node: HTMLElement, `type`: cut): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("generateEvent")(node.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Get the application clipboard instance.
      */
    inline def getInstance(): MimeData = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[MimeData]
    
    /**
      * Set the application clipboard instance.
      */
    inline def setInstance(value: MimeData): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setInstance")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  @JSImport("@jupyterlab/apputils", "Collapse")
  @js.native
  class Collapse[T /* <: Widget */] protected ()
    extends typings.jupyterlabApputils.collapseMod.Collapse[T] {
    def this(options: IOptions[T]) = this()
  }
  
  @JSImport("@jupyterlab/apputils", "CommandLinker")
  @js.native
  class CommandLinker protected ()
    extends typings.jupyterlabApputils.commandlinkerMod.CommandLinker {
    /**
      * Instantiate a new command linker.
      */
    def this(options: typings.jupyterlabApputils.commandlinkerMod.CommandLinker.IOptions) = this()
  }
  
  @JSImport("@jupyterlab/apputils", "CommandToolbarButton")
  @js.native
  class CommandToolbarButton protected ()
    extends typings.jupyterlabApputils.toolbarMod.CommandToolbarButton {
    /**
      * Creates a command toolbar button
      * @param props props for underlying `CommandToolbarButtonComponent` componenent
      */
    def this(props: IProps) = this()
  }
  
  inline def CommandToolbarButtonComponent(props: IProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("CommandToolbarButtonComponent")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  object DOMUtils {
    
    @JSImport("@jupyterlab/apputils", "DOMUtils")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create a DOM id with prefix "id-" to solve bug for UUIDs beginning with numbers.
      */
    inline def createDomID(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("createDomID")().asInstanceOf[String]
    
    /**
      * Find the first element matching a class name.
      */
    inline def findElement(parent: HTMLElement, className: String): HTMLElement = (^.asInstanceOf[js.Dynamic].applyDynamic("findElement")(parent.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLElement]
    
    /**
      * Find the first element matching a class name.
      */
    inline def findElements(parent: HTMLElement, className: String): HTMLCollectionOf[HTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("findElements")(parent.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[HTMLCollectionOf[HTMLElement]]
    
    /**
      * Get the index of the node at a client position, or `-1`.
      */
    inline def hitTestNodes(nodes: js.Array[HTMLElement], x: Double, y: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("hitTestNodes")(nodes.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def hitTestNodes(nodes: HTMLCollection, x: Double, y: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("hitTestNodes")(nodes.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Double]
  }
  
  @JSImport("@jupyterlab/apputils", "Dialog")
  @js.native
  /**
    * Create a dialog panel instance.
    *
    * @param options - The dialog setup options.
    */
  class Dialog[T] ()
    extends typings.jupyterlabApputils.dialogMod.Dialog[T] {
    def this(options: Partial[typings.jupyterlabApputils.dialogMod.Dialog.IOptions[T]]) = this()
  }
  object Dialog {
    
    @JSImport("@jupyterlab/apputils", "Dialog")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The default implementation of a dialog renderer.
      */
    @JSImport("@jupyterlab/apputils", "Dialog.Renderer")
    @js.native
    class Renderer ()
      extends typings.jupyterlabApputils.dialogMod.Dialog.Renderer
    
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
    @JSImport("@jupyterlab/apputils", "Dialog.defaultRenderer")
    @js.native
    val defaultRenderer: typings.jupyterlabApputils.dialogMod.Dialog.Renderer = js.native
    
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
    @JSImport("@jupyterlab/apputils", "Dialog.tracker")
    @js.native
    val tracker: typings.jupyterlabApputils.widgettrackerMod.WidgetTracker[typings.jupyterlabApputils.dialogMod.Dialog[js.Any]] = js.native
    
    /**
      * Create a warn button.
      */
    inline def warnButton(): ReadonlyIButton = ^.asInstanceOf[js.Dynamic].applyDynamic("warnButton")().asInstanceOf[ReadonlyIButton]
    inline def warnButton(options: PartialIButton): ReadonlyIButton = ^.asInstanceOf[js.Dynamic].applyDynamic("warnButton")(options.asInstanceOf[js.Any]).asInstanceOf[ReadonlyIButton]
  }
  
  object HoverBox {
    
    @JSImport("@jupyterlab/apputils", "HoverBox")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Set the visible dimensions of a hovering box anchored to an editor cursor.
      *
      * @param options - The hover box geometry calculation options.
      */
    inline def setGeometry(options: typings.jupyterlabApputils.hoverboxMod.HoverBox.IOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setGeometry")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  @JSImport("@jupyterlab/apputils", "ICommandPalette")
  @js.native
  val ICommandPalette: Token[typings.jupyterlabApputils.commandpaletteMod.ICommandPalette] = js.native
  
  @JSImport("@jupyterlab/apputils", "IFrame")
  @js.native
  /**
    * Create a new IFrame widget.
    */
  class IFrame ()
    extends typings.jupyterlabApputils.iframeMod.IFrame {
    def this(options: typings.jupyterlabApputils.iframeMod.IFrame.IOptions) = this()
  }
  
  @JSImport("@jupyterlab/apputils", "ISessionContextDialogs")
  @js.native
  val ISessionContextDialogs: Token[IDialogs] = js.native
  
  @JSImport("@jupyterlab/apputils", "ISplashScreen")
  @js.native
  val ISplashScreen: Token[typings.jupyterlabApputils.splashMod.ISplashScreen] = js.native
  
  @JSImport("@jupyterlab/apputils", "IThemeManager")
  @js.native
  val IThemeManager: Token[typings.jupyterlabApputils.tokensMod.IThemeManager] = js.native
  
  @JSImport("@jupyterlab/apputils", "IWindowResolver")
  @js.native
  val IWindowResolver: Token[typings.jupyterlabApputils.windowresolverMod.IWindowResolver] = js.native
  
  object InputDialog {
    
    @JSImport("@jupyterlab/apputils", "InputDialog")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create and show a input dialog for a boolean.
      *
      * @param options - The dialog setup options.
      *
      * @returns A promise that resolves with whether the dialog was accepted
      */
    inline def getBoolean(options: IBooleanOptions): js.Promise[IResult[Boolean]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBoolean")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IResult[Boolean]]]
    
    /**
      * Create and show a input dialog for a choice.
      *
      * @param options - The dialog setup options.
      *
      * @returns A promise that resolves with whether the dialog was accepted
      */
    inline def getItem(options: IItemOptions): js.Promise[IResult[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getItem")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IResult[String]]]
    
    /**
      * Create and show a input dialog for a number.
      *
      * @param options - The dialog setup options.
      *
      * @returns A promise that resolves with whether the dialog was accepted
      */
    inline def getNumber(options: INumberOptions): js.Promise[IResult[Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getNumber")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IResult[Double]]]
    
    /**
      * Create and show a input dialog for a password.
      *
      * @param options - The dialog setup options.
      *
      * @returns A promise that resolves with whether the dialog was accepted
      */
    inline def getPassword(options: ITextOptions): js.Promise[IResult[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPassword")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IResult[String]]]
    
    /**
      * Create and show a input dialog for a text.
      *
      * @param options - The dialog setup options.
      *
      * @returns A promise that resolves with whether the dialog was accepted
      */
    inline def getText(options: ITextOptions): js.Promise[IResult[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getText")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IResult[String]]]
  }
  
  @JSImport("@jupyterlab/apputils", "MainAreaWidget")
  @js.native
  class MainAreaWidget[T /* <: Widget */] protected ()
    extends typings.jupyterlabApputils.mainareawidgetMod.MainAreaWidget[T] {
    /**
      * Construct a new main area widget.
      *
      * @param options - The options for initializing the widget.
      */
    def this(options: typings.jupyterlabApputils.mainareawidgetMod.MainAreaWidget.IOptions[T]) = this()
  }
  
  object Printing {
    
    @JSImport("@jupyterlab/apputils", "Printing")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns the print function for an object, or null if it does not provide a handler.
      */
    inline def getPrintFunction(`val`: js.Any): OptionalAsyncThunk = ^.asInstanceOf[js.Dynamic].applyDynamic("getPrintFunction")(`val`.asInstanceOf[js.Any]).asInstanceOf[OptionalAsyncThunk]
    
    /**
      * Returns whether an object implements a print method.
      */
    inline def isPrintable(a: js.Any): /* is @jupyterlab/apputils.@jupyterlab/apputils/lib/printing.Printing.IPrintable */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPrintable")(a.asInstanceOf[js.Any]).asInstanceOf[/* is @jupyterlab/apputils.@jupyterlab/apputils/lib/printing.Printing.IPrintable */ Boolean]
    
    /**
      * Prints a URL by loading it into an iframe.
      *
      * @param url URL to load into an iframe.
      */
    inline def printURL(url: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("printURL")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    
    /**
      * Prints a widget by copying it's DOM node
      * to a hidden iframe and printing that iframe.
      */
    inline def printWidget(widget: Widget): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("printWidget")(widget.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
    
    /**
      * Symbol to use for a method that returns a function to print an object.
      */
    @JSImport("@jupyterlab/apputils", "Printing.symbol")
    @js.native
    val symbol: js.Symbol = js.native
  }
  
  @JSImport("@jupyterlab/apputils", "ReactWidget")
  @js.native
  /**
    * Construct a new widget.
    *
    * @param options - The options for initializing the widget.
    */
  abstract class ReactWidget ()
    extends typings.jupyterlabApputils.vdomMod.ReactWidget {
    def this(options: typings.luminoWidgets.widgetMod.Widget.IOptions) = this()
  }
  /* static members */
  object ReactWidget {
    
    @JSImport("@jupyterlab/apputils", "ReactWidget")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new `ReactWidget` that renders a constant element.
      * @param element React element to render.
      */
    inline def create(element: ReactRenderElement): typings.jupyterlabApputils.vdomMod.ReactWidget = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(element.asInstanceOf[js.Any]).asInstanceOf[typings.jupyterlabApputils.vdomMod.ReactWidget]
  }
  
  @JSImport("@jupyterlab/apputils", "SessionContext")
  @js.native
  class SessionContext protected ()
    extends typings.jupyterlabApputils.sessioncontextMod.SessionContext {
    /**
      * Construct a new session context.
      */
    def this(options: typings.jupyterlabApputils.sessioncontextMod.SessionContext.IOptions) = this()
  }
  object SessionContext {
    
    @JSImport("@jupyterlab/apputils", "SessionContext")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get the default kernel name given select options.
      */
    inline def getDefaultKernel(options: IKernelSearch): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultKernel")(options.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  }
  
  @JSImport("@jupyterlab/apputils", "Spinner")
  @js.native
  /**
    * Construct a spinner widget.
    */
  class Spinner ()
    extends typings.jupyterlabApputils.spinnerMod.Spinner
  
  object Styling {
    
    @JSImport("@jupyterlab/apputils", "Styling")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Style a node and its child elements with the default tag names.
      *
      * @param node - The base node.
      *
      * @param className - The optional CSS class to add to styled nodes.
      */
    inline def styleNode(node: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("styleNode")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def styleNode(node: HTMLElement, className: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("styleNode")(node.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Style a node and its elements that have a given tag name.
      *
      * @param node - The base node.
      *
      * @param tagName - The html tag name to style.
      *
      * @param className - The optional CSS class to add to styled nodes.
      */
    inline def styleNodeByTag(node: HTMLElement, tagName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("styleNodeByTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def styleNodeByTag(node: HTMLElement, tagName: String, className: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("styleNodeByTag")(node.asInstanceOf[js.Any], tagName.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Wrap a select node.
      */
    inline def wrapSelect(node: HTMLSelectElement): HTMLElement = ^.asInstanceOf[js.Dynamic].applyDynamic("wrapSelect")(node.asInstanceOf[js.Any]).asInstanceOf[HTMLElement]
  }
  
  @JSImport("@jupyterlab/apputils", "ThemeManager")
  @js.native
  class ThemeManager protected ()
    extends typings.jupyterlabApputils.thememanagerMod.ThemeManager {
    /**
      * Construct a new theme manager.
      */
    def this(options: typings.jupyterlabApputils.thememanagerMod.ThemeManager.IOptions) = this()
  }
  
  @JSImport("@jupyterlab/apputils", "Toolbar")
  @js.native
  /**
    * Construct a new toolbar widget.
    */
  class Toolbar[T /* <: Widget */] ()
    extends typings.jupyterlabApputils.toolbarMod.Toolbar[T]
  object Toolbar {
    
    @JSImport("@jupyterlab/apputils", "Toolbar")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create an interrupt toolbar item.
      */
    inline def createInterruptButton(sessionContext: ISessionContext): Widget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInterruptButton")(sessionContext.asInstanceOf[js.Any]).asInstanceOf[Widget]
    
    /**
      * Create a kernel name indicator item.
      *
      * #### Notes
      * It will display the `'display_name`' of the session context. It can
      * handle a change in context or kernel.
      */
    inline def createKernelNameItem(sessionContext: ISessionContext): Widget = ^.asInstanceOf[js.Dynamic].applyDynamic("createKernelNameItem")(sessionContext.asInstanceOf[js.Any]).asInstanceOf[Widget]
    inline def createKernelNameItem(sessionContext: ISessionContext, dialogs: IDialogs): Widget = (^.asInstanceOf[js.Dynamic].applyDynamic("createKernelNameItem")(sessionContext.asInstanceOf[js.Any], dialogs.asInstanceOf[js.Any])).asInstanceOf[Widget]
    
    /**
      * Create a kernel status indicator item.
      *
      * #### Notes
      * It will show a busy status if the kernel status is busy.
      * It will show the current status in the node title.
      * It can handle a change to the context or the kernel.
      */
    inline def createKernelStatusItem(sessionContext: ISessionContext): Widget = ^.asInstanceOf[js.Dynamic].applyDynamic("createKernelStatusItem")(sessionContext.asInstanceOf[js.Any]).asInstanceOf[Widget]
    
    /**
      * Create a restart toolbar item.
      */
    inline def createRestartButton(sessionContext: ISessionContext): Widget = ^.asInstanceOf[js.Dynamic].applyDynamic("createRestartButton")(sessionContext.asInstanceOf[js.Any]).asInstanceOf[Widget]
    inline def createRestartButton(sessionContext: ISessionContext, dialogs: IDialogs): Widget = (^.asInstanceOf[js.Dynamic].applyDynamic("createRestartButton")(sessionContext.asInstanceOf[js.Any], dialogs.asInstanceOf[js.Any])).asInstanceOf[Widget]
    
    /**
      * Create a toolbar spacer item.
      *
      * #### Notes
      * It is a flex spacer that separates the left toolbar items
      * from the right toolbar items.
      */
    inline def createSpacerItem(): Widget = ^.asInstanceOf[js.Dynamic].applyDynamic("createSpacerItem")().asInstanceOf[Widget]
  }
  
  @JSImport("@jupyterlab/apputils", "ToolbarButton")
  @js.native
  /**
    * Creates a toolbar button
    * @param props props for underlying `ToolbarButton` componenent
    */
  class ToolbarButton ()
    extends typings.jupyterlabApputils.toolbarMod.ToolbarButton {
    def this(props: typings.jupyterlabApputils.toolbarMod.ToolbarButtonComponent.IProps) = this()
  }
  
  inline def ToolbarButtonComponent(props: typings.jupyterlabApputils.toolbarMod.ToolbarButtonComponent.IProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ToolbarButtonComponent")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@jupyterlab/apputils", "UseSignal")
  @js.native
  class UseSignal[SENDER, ARGS] protected ()
    extends typings.jupyterlabApputils.vdomMod.UseSignal[SENDER, ARGS] {
    def this(props: IUseSignalProps[SENDER, ARGS]) = this()
  }
  
  @JSImport("@jupyterlab/apputils", "VDomModel")
  @js.native
  class VDomModel ()
    extends typings.jupyterlabApputils.vdomMod.VDomModel
  
  @JSImport("@jupyterlab/apputils", "VDomRenderer")
  @js.native
  abstract class VDomRenderer[T /* <: IModel | Null */] protected ()
    extends typings.jupyterlabApputils.vdomMod.VDomRenderer[T] {
    /**
      * Create a new VDomRenderer
      */
    def this(model: T | Unit) = this()
  }
  
  @JSImport("@jupyterlab/apputils", "WidgetTracker")
  @js.native
  class WidgetTracker[T /* <: Widget */] protected ()
    extends typings.jupyterlabApputils.widgettrackerMod.WidgetTracker[T] {
    /**
      * Create a new widget tracker.
      *
      * @param options - The instantiation options for a widget tracker.
      */
    def this(options: typings.jupyterlabApputils.widgettrackerMod.WidgetTracker.IOptions) = this()
  }
  
  @JSImport("@jupyterlab/apputils", "WindowResolver")
  @js.native
  class WindowResolver ()
    extends typings.jupyterlabApputils.windowresolverMod.WindowResolver
  
  inline def addCommandToolbarButtonClass(w: Widget): Widget = ^.asInstanceOf[js.Dynamic].applyDynamic("addCommandToolbarButtonClass")(w.asInstanceOf[js.Any]).asInstanceOf[Widget]
  
  inline def addToolbarButtonClass(w: Widget): Widget = ^.asInstanceOf[js.Dynamic].applyDynamic("addToolbarButtonClass")(w.asInstanceOf[js.Any]).asInstanceOf[Widget]
  
  @JSImport("@jupyterlab/apputils", "defaultSanitizer")
  @js.native
  val defaultSanitizer: ISanitizer = js.native
  
  @JSImport("@jupyterlab/apputils", "sessionContextDialogs")
  @js.native
  val sessionContextDialogs: IDialogs = js.native
  
  inline def showDialog[T](): js.Promise[IResult[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("showDialog")().asInstanceOf[js.Promise[IResult[T]]]
  inline def showDialog[T](options: Partial[typings.jupyterlabApputils.dialogMod.Dialog.IOptions[T]]): js.Promise[IResult[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("showDialog")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IResult[T]]]
  
  inline def showErrorMessage(title: String, error: js.Any): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("showErrorMessage")(title.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def showErrorMessage(title: String, error: js.Any, buttons: js.Array[IButton]): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("showErrorMessage")(title.asInstanceOf[js.Any], error.asInstanceOf[js.Any], buttons.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
