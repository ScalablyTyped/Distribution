package typings.jupyterlabApputils

import typings.jupyterlabApputils.libSessioncontextMod.ISessionContext
import typings.jupyterlabApputils.libSessioncontextMod.ISessionContext.IDialogs
import typings.jupyterlabApputils.libToolbarWidgetMod.CommandToolbarButtonComponent.IProps
import typings.jupyterlabApputils.libToolbarWidgetMod.Toolbar.IOptions
import typings.jupyterlabApputils.libVdomMod.ReactWidget
import typings.jupyterlabTranslation.libTokensMod.ITranslator
import typings.jupyterlabUiComponents.libIconLabiconMod.LabIcon.IMaybeResolvable
import typings.jupyterlabUiComponents.mod.LabIcon
import typings.luminoAlgorithm.typesIterMod.IIterator
import typings.luminoCommands.mod.CommandRegistry
import typings.luminoCoreutils.typesJsonMod.ReadonlyJSONObject
import typings.luminoWidgets.mod.Layout
import typings.luminoWidgets.mod.Widget
import typings.luminoWidgets.mod.Widget.ResizeMessage
import typings.react.mod.global.JSX.Element
import typings.std.DOMStringMap
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libToolbarWidgetMod {
  
  @JSImport("@jupyterlab/apputils/lib/toolbar/widget", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@jupyterlab/apputils/lib/toolbar/widget", "CommandToolbarButton")
  @js.native
  open class CommandToolbarButton protected () extends ReactWidget {
    /**
      * Creates a command toolbar button
      * @param props props for underlying `CommandToolbarButtonComponent` component
      */
    def this(props: IProps) = this()
    
    /* private */ var props: Any = js.native
  }
  
  object CommandToolbarButtonComponent {
    
    inline def apply(props: IProps): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("@jupyterlab/apputils/lib/toolbar/widget", "CommandToolbarButtonComponent")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Interface for CommandToolbarButtonComponent props.
      */
    trait IProps extends StObject {
      
      /**
        * Command arguments
        */
      var args: js.UndefOr[ReadonlyJSONObject] = js.undefined
      
      /**
        * Application commands registry
        */
      var commands: CommandRegistry
      
      /**
        * Overrides command icon
        */
      var icon: js.UndefOr[LabIcon] = js.undefined
      
      /**
        * Command unique id
        */
      var id: String
      
      /**
        * Overrides command label
        */
      var label: js.UndefOr[String] = js.undefined
    }
    object IProps {
      
      inline def apply(commands: CommandRegistry, id: String): IProps = {
        val __obj = js.Dynamic.literal(commands = commands.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
        __obj.asInstanceOf[IProps]
      }
      
      extension [Self <: IProps](x: Self) {
        
        inline def setArgs(value: ReadonlyJSONObject): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
        
        inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
        
        inline def setCommands(value: CommandRegistry): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
        
        inline def setIcon(value: LabIcon): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
        
        inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
        
        inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      }
    }
  }
  
  @JSImport("@jupyterlab/apputils/lib/toolbar/widget", "ReactiveToolbar")
  @js.native
  /**
    * Construct a new toolbar widget.
    */
  open class ReactiveToolbar () extends Toolbar[Widget] {
    
    /* private */ var _getWidgetWidth: Any = js.native
    
    /* private */ var _onResize: Any = js.native
    
    /* private */ val _resizer: Any = js.native
    
    /* private */ var _saveWidgetWidth: Any = js.native
    
    /* private */ val _widgetWidths: Any = js.native
    
    /* protected */ def onResize(msg: ResizeMessage): Unit = js.native
    
    /* protected */ val popupOpener: ToolbarPopupOpener = js.native
  }
  
  @JSImport("@jupyterlab/apputils/lib/toolbar/widget", "Toolbar")
  @js.native
  /**
    * Construct a new toolbar widget.
    */
  open class Toolbar[T /* <: Widget */] () extends Widget {
    def this(options: IOptions) = this()
    
    /* private */ var _insertRelative: Any = js.native
    
    /**
      * Add an item to the end of the toolbar.
      *
      * @param name - The name of the widget to add to the toolbar.
      *
      * @param widget - The widget to add to the toolbar.
      *
      * @param index - The optional name of the item to insert after.
      *
      * @returns Whether the item was added to toolbar.  Returns false if
      *   an item of the same name is already in the toolbar.
      *
      * #### Notes
      * The item can be removed from the toolbar by setting its parent to `null`.
      */
    def addItem(name: String, widget: T): Boolean = js.native
    
    /**
      * Handle a DOM click event.
      */
    /* protected */ def handleClick(event: Event): Unit = js.native
    
    /**
      * Handle the DOM events for the widget.
      *
      * @param event - The DOM event sent to the widget.
      *
      * #### Notes
      * This method implements the DOM `EventListener` interface and is
      * called in response to events on the dock panel's node. It should
      * not be called directly by user code.
      */
    def handleEvent(event: Event): Unit = js.native
    
    /**
      * Insert an item into the toolbar at the after a target item.
      *
      * @param at - The target item to insert after.
      *
      * @param name - The name of the item.
      *
      * @param widget - The widget to add.
      *
      * @returns Whether the item was added to the toolbar. Returns false if
      *   an item of the same name is already in the toolbar.
      *
      * #### Notes
      * The index will be clamped to the bounds of the items.
      * The item can be removed from the toolbar by setting its parent to `null`.
      */
    def insertAfter(at: String, name: String, widget: T): Boolean = js.native
    
    /**
      * Insert an item into the toolbar at the before a target item.
      *
      * @param at - The target item to insert before.
      *
      * @param name - The name of the item.
      *
      * @param widget - The widget to add.
      *
      * @returns Whether the item was added to the toolbar. Returns false if
      *   an item of the same name is already in the toolbar.
      *
      * #### Notes
      * The index will be clamped to the bounds of the items.
      * The item can be removed from the toolbar by setting its parent to `null`.
      */
    def insertBefore(at: String, name: String, widget: T): Boolean = js.native
    
    /**
      * Insert an item into the toolbar at the specified index.
      *
      * @param index - The index at which to insert the item.
      *
      * @param name - The name of the item.
      *
      * @param widget - The widget to add.
      *
      * @returns Whether the item was added to the toolbar. Returns false if
      *   an item of the same name is already in the toolbar.
      *
      * #### Notes
      * The index will be clamped to the bounds of the items.
      * The item can be removed from the toolbar by setting its parent to `null`.
      */
    def insertItem(index: Double, name: String, widget: T): Boolean = js.native
    
    /**
      * Get an iterator over the ordered toolbar item names.
      *
      * @returns An iterator over the toolbar item names.
      */
    def names(): IIterator[String] = js.native
  }
  object Toolbar {
    
    @JSImport("@jupyterlab/apputils/lib/toolbar/widget", "Toolbar")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create an interrupt toolbar item.
      *
      * @deprecated since version v3.2
      * This is dead code now.
      */
    inline def createInterruptButton(sessionContext: ISessionContext): Widget = ^.asInstanceOf[js.Dynamic].applyDynamic("createInterruptButton")(sessionContext.asInstanceOf[js.Any]).asInstanceOf[Widget]
    inline def createInterruptButton(sessionContext: ISessionContext, translator: ITranslator): Widget = (^.asInstanceOf[js.Dynamic].applyDynamic("createInterruptButton")(sessionContext.asInstanceOf[js.Any], translator.asInstanceOf[js.Any])).asInstanceOf[Widget]
    
    /**
      * Create a kernel name indicator item.
      *
      * #### Notes
      * It will display the `'display_name`' of the session context. It can
      * handle a change in context or kernel.
      */
    inline def createKernelNameItem(sessionContext: ISessionContext): Widget = ^.asInstanceOf[js.Dynamic].applyDynamic("createKernelNameItem")(sessionContext.asInstanceOf[js.Any]).asInstanceOf[Widget]
    inline def createKernelNameItem(sessionContext: ISessionContext, dialogs: Unit, translator: ITranslator): Widget = (^.asInstanceOf[js.Dynamic].applyDynamic("createKernelNameItem")(sessionContext.asInstanceOf[js.Any], dialogs.asInstanceOf[js.Any], translator.asInstanceOf[js.Any])).asInstanceOf[Widget]
    inline def createKernelNameItem(sessionContext: ISessionContext, dialogs: IDialogs): Widget = (^.asInstanceOf[js.Dynamic].applyDynamic("createKernelNameItem")(sessionContext.asInstanceOf[js.Any], dialogs.asInstanceOf[js.Any])).asInstanceOf[Widget]
    inline def createKernelNameItem(sessionContext: ISessionContext, dialogs: IDialogs, translator: ITranslator): Widget = (^.asInstanceOf[js.Dynamic].applyDynamic("createKernelNameItem")(sessionContext.asInstanceOf[js.Any], dialogs.asInstanceOf[js.Any], translator.asInstanceOf[js.Any])).asInstanceOf[Widget]
    
    /**
      * Create a kernel status indicator item.
      *
      * #### Notes
      * It will show a busy status if the kernel status is busy.
      * It will show the current status in the node title.
      * It can handle a change to the context or the kernel.
      */
    inline def createKernelStatusItem(sessionContext: ISessionContext): Widget = ^.asInstanceOf[js.Dynamic].applyDynamic("createKernelStatusItem")(sessionContext.asInstanceOf[js.Any]).asInstanceOf[Widget]
    inline def createKernelStatusItem(sessionContext: ISessionContext, translator: ITranslator): Widget = (^.asInstanceOf[js.Dynamic].applyDynamic("createKernelStatusItem")(sessionContext.asInstanceOf[js.Any], translator.asInstanceOf[js.Any])).asInstanceOf[Widget]
    
    /**
      * Create a restart toolbar item.
      *
      * @deprecated since v3.2
      * This is dead code now.
      */
    inline def createRestartButton(sessionContext: ISessionContext): Widget = ^.asInstanceOf[js.Dynamic].applyDynamic("createRestartButton")(sessionContext.asInstanceOf[js.Any]).asInstanceOf[Widget]
    inline def createRestartButton(sessionContext: ISessionContext, dialogs: Unit, translator: ITranslator): Widget = (^.asInstanceOf[js.Dynamic].applyDynamic("createRestartButton")(sessionContext.asInstanceOf[js.Any], dialogs.asInstanceOf[js.Any], translator.asInstanceOf[js.Any])).asInstanceOf[Widget]
    inline def createRestartButton(sessionContext: ISessionContext, dialogs: IDialogs): Widget = (^.asInstanceOf[js.Dynamic].applyDynamic("createRestartButton")(sessionContext.asInstanceOf[js.Any], dialogs.asInstanceOf[js.Any])).asInstanceOf[Widget]
    inline def createRestartButton(sessionContext: ISessionContext, dialogs: IDialogs, translator: ITranslator): Widget = (^.asInstanceOf[js.Dynamic].applyDynamic("createRestartButton")(sessionContext.asInstanceOf[js.Any], dialogs.asInstanceOf[js.Any], translator.asInstanceOf[js.Any])).asInstanceOf[Widget]
    
    /**
      * Create a toolbar spacer item.
      *
      * #### Notes
      * It is a flex spacer that separates the left toolbar items
      * from the right toolbar items.
      */
    inline def createSpacerItem(): Widget = ^.asInstanceOf[js.Dynamic].applyDynamic("createSpacerItem")().asInstanceOf[Widget]
    
    /**
      * The options used to create a toolbar.
      */
    trait IOptions extends StObject {
      
      /**
        * Toolbar widget layout.
        */
      var layout: js.UndefOr[Layout] = js.undefined
    }
    object IOptions {
      
      inline def apply(): IOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IOptions]
      }
      
      extension [Self <: IOptions](x: Self) {
        
        inline def setLayout(value: Layout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
        
        inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      }
    }
    
    /**
      * Widget with associated toolbar
      */
    @js.native
    trait IWidgetToolbar extends Widget {
      
      /**
        * Toolbar of actions on the widget
        */
      var toolbar: js.UndefOr[Toolbar[Widget]] = js.native
    }
  }
  
  @JSImport("@jupyterlab/apputils/lib/toolbar/widget", "ToolbarButton")
  @js.native
  /**
    * Creates a toolbar button
    * @param props props for underlying `ToolbarButton` component
    */
  open class ToolbarButton () extends ReactWidget {
    def this(props: typings.jupyterlabApputils.libToolbarWidgetMod.ToolbarButtonComponent.IProps) = this()
    
    /* private */ var _enabled: Any = js.native
    
    /* private */ var _onClick: Any = js.native
    
    /* private */ var _pressed: Any = js.native
    
    /**
      * Returns true if button is enabled, false otherwise
      */
    def enabled: Boolean = js.native
    /**
      * Sets the enabled state for the button
      * @param value true to enable the button, false otherwise
      */
    def enabled_=(value: Boolean): Unit = js.native
    
    /**
      * Returns the click handler for the button
      */
    def onClick: js.Function0[Unit] = js.native
    /**
      * Sets the click handler for the button
      * @param value click handler
      */
    def onClick_=(value: js.Function0[Unit]): Unit = js.native
    
    /**
      * Returns true if button is pressed, false otherwise
      */
    def pressed: Boolean = js.native
    /**
      * Sets the pressed state for the button
      * @param value true if button is pressed, false otherwise
      */
    def pressed_=(value: Boolean): Unit = js.native
    
    /* private */ var props: Any = js.native
  }
  
  object ToolbarButtonComponent {
    
    inline def apply(props: typings.jupyterlabApputils.libToolbarWidgetMod.ToolbarButtonComponent.IProps): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("@jupyterlab/apputils/lib/toolbar/widget", "ToolbarButtonComponent")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Interface for ToolbarButtonComponent props.
      */
    trait IProps extends StObject {
      
      /**
        * Trigger the button on the actual onClick event rather than onMouseDown.
        *
        * See note in ToolbarButtonComponent below as to why the default is to
        * trigger on onMouseDown.
        */
      var actualOnClick: js.UndefOr[Boolean] = js.undefined
      
      var className: js.UndefOr[String] = js.undefined
      
      /**
        * Data set of the button
        */
      var dataset: js.UndefOr[DOMStringMap] = js.undefined
      
      var disabledTooltip: js.UndefOr[String] = js.undefined
      
      var enabled: js.UndefOr[Boolean] = js.undefined
      
      var icon: js.UndefOr[IMaybeResolvable] = js.undefined
      
      var iconClass: js.UndefOr[String] = js.undefined
      
      var iconLabel: js.UndefOr[String] = js.undefined
      
      var label: js.UndefOr[String] = js.undefined
      
      var onClick: js.UndefOr[js.Function0[Unit]] = js.undefined
      
      var pressed: js.UndefOr[Boolean] = js.undefined
      
      var pressedIcon: js.UndefOr[IMaybeResolvable] = js.undefined
      
      var pressedTooltip: js.UndefOr[String] = js.undefined
      
      var tooltip: js.UndefOr[String] = js.undefined
      
      /**
        * The application language translator.
        */
      var translator: js.UndefOr[ITranslator] = js.undefined
    }
    object IProps {
      
      inline def apply(): typings.jupyterlabApputils.libToolbarWidgetMod.ToolbarButtonComponent.IProps = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.jupyterlabApputils.libToolbarWidgetMod.ToolbarButtonComponent.IProps]
      }
      
      extension [Self <: typings.jupyterlabApputils.libToolbarWidgetMod.ToolbarButtonComponent.IProps](x: Self) {
        
        inline def setActualOnClick(value: Boolean): Self = StObject.set(x, "actualOnClick", value.asInstanceOf[js.Any])
        
        inline def setActualOnClickUndefined: Self = StObject.set(x, "actualOnClick", js.undefined)
        
        inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
        
        inline def setDataset(value: DOMStringMap): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
        
        inline def setDatasetUndefined: Self = StObject.set(x, "dataset", js.undefined)
        
        inline def setDisabledTooltip(value: String): Self = StObject.set(x, "disabledTooltip", value.asInstanceOf[js.Any])
        
        inline def setDisabledTooltipUndefined: Self = StObject.set(x, "disabledTooltip", js.undefined)
        
        inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
        
        inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
        
        inline def setIcon(value: IMaybeResolvable): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
        
        inline def setIconClass(value: String): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
        
        inline def setIconClassUndefined: Self = StObject.set(x, "iconClass", js.undefined)
        
        inline def setIconLabel(value: String): Self = StObject.set(x, "iconLabel", value.asInstanceOf[js.Any])
        
        inline def setIconLabelUndefined: Self = StObject.set(x, "iconLabel", js.undefined)
        
        inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
        
        inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
        
        inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
        
        inline def setOnClick(value: () => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction0(value))
        
        inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
        
        inline def setPressed(value: Boolean): Self = StObject.set(x, "pressed", value.asInstanceOf[js.Any])
        
        inline def setPressedIcon(value: IMaybeResolvable): Self = StObject.set(x, "pressedIcon", value.asInstanceOf[js.Any])
        
        inline def setPressedIconUndefined: Self = StObject.set(x, "pressedIcon", js.undefined)
        
        inline def setPressedTooltip(value: String): Self = StObject.set(x, "pressedTooltip", value.asInstanceOf[js.Any])
        
        inline def setPressedTooltipUndefined: Self = StObject.set(x, "pressedTooltip", js.undefined)
        
        inline def setPressedUndefined: Self = StObject.set(x, "pressed", js.undefined)
        
        inline def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
        
        inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
        
        inline def setTranslator(value: ITranslator): Self = StObject.set(x, "translator", value.asInstanceOf[js.Any])
        
        inline def setTranslatorUndefined: Self = StObject.set(x, "translator", js.undefined)
      }
    }
  }
  
  inline def addCommandToolbarButtonClass(w: Widget): Widget = ^.asInstanceOf[js.Dynamic].applyDynamic("addCommandToolbarButtonClass")(w.asInstanceOf[js.Any]).asInstanceOf[Widget]
  
  inline def addToolbarButtonClass(w: Widget): Widget = ^.asInstanceOf[js.Dynamic].applyDynamic("addToolbarButtonClass")(w.asInstanceOf[js.Any]).asInstanceOf[Widget]
  
  /**
    *  A class which provides a toolbar popup
    *  used to store widgets that don't fit
    *  in the toolbar when it is resized
    */
  @js.native
  trait ToolbarPopup extends Widget {
    
    /**
      * Aligns the popup to left bottom of widget
      *
      * @param widget the widget to align to
      * @private
      */
    def alignTo(widget: Widget): Unit = js.native
    
    /**
      * Inserts the widget at specified index
      * @param index the index
      * @param widget widget to add
      */
    def insertWidget(index: Double, widget: Widget): Unit = js.native
    
    /**
      * Updates the width of the popup, this
      * should match with the toolbar width
      *
      * @param width - The width to resize to
      * @protected
      */
    def updateWidth(width: Double): Unit = js.native
    
    /**
      * Returns the widget at index
      * @param index the index
      */
    def widgetAt(index: Double): Widget = js.native
    
    /**
      *  Total number of widgets in the popup
      */
    def widgetCount(): Double = js.native
    
    var width: Double = js.native
  }
  
  /**
    *  A class that provides a ToolbarPopupOpener,
    *  which is a button added to toolbar when
    *  the toolbar items overflow toolbar width
    */
  @js.native
  trait ToolbarPopupOpener extends ToolbarButton {
    
    /**
      * Add widget to the popup, prepends widgets
      * @param widget the widget to add
      */
    def addWidget(widget: Widget): Unit = js.native
    
    /* protected */ def handleClick(): Unit = js.native
    
    /**
      * Hides the popup
      */
    def hidePopup(): Unit = js.native
    
    /* protected */ var popup: ToolbarPopup = js.native
    
    /**
      *  Updates width and position of the popup
      *  to align with the toolbar
      */
    def updatePopup(): Unit = js.native
    
    /**
      * Returns widget at index in the popup
      * @param index
      */
    def widgetAt(index: Double): Widget = js.native
    
    /**
      * Returns total number of widgets in the popup
      *
      * @returns Number of widgets
      */
    def widgetCount(): Double = js.native
  }
}
