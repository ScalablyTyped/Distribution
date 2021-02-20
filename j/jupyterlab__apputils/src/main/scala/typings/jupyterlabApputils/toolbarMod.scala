package typings.jupyterlabApputils

import typings.jupyterlabApputils.sessioncontextMod.ISessionContext
import typings.jupyterlabApputils.sessioncontextMod.ISessionContext.IDialogs
import typings.jupyterlabApputils.toolbarMod.CommandToolbarButtonComponent.IProps
import typings.jupyterlabApputils.vdomMod.ReactWidget
import typings.jupyterlabUiComponents.labiconMod.LabIcon.IMaybeResolvable
import typings.luminoAlgorithm.iterMod.IIterator
import typings.luminoCommands.mod.CommandRegistry
import typings.luminoCoreutils.jsonMod.ReadonlyJSONObject
import typings.luminoWidgets.mod.Widget
import typings.react.mod.global.JSX.Element
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toolbarMod {
  
  @JSImport("@jupyterlab/apputils/lib/toolbar", "CommandToolbarButton")
  @js.native
  class CommandToolbarButton protected () extends ReactWidget {
    /**
      * Creates a command toolbar button
      * @param props props for underlying `CommandToolbarButtonComponent` componenent
      */
    def this(props: IProps) = this()
    
    var props: js.Any = js.native
  }
  
  object CommandToolbarButtonComponent {
    
    @JSImport("@jupyterlab/apputils/lib/toolbar", "CommandToolbarButtonComponent")
    @js.native
    def apply(props: IProps): Element = js.native
    
    /**
      * Interface for CommandToolbarButtonComponent props.
      */
    @js.native
    trait IProps extends StObject {
      
      var args: js.UndefOr[ReadonlyJSONObject] = js.native
      
      var commands: CommandRegistry = js.native
      
      var id: String = js.native
    }
    object IProps {
      
      @scala.inline
      def apply(commands: CommandRegistry, id: String): IProps = {
        val __obj = js.Dynamic.literal(commands = commands.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
        __obj.asInstanceOf[IProps]
      }
      
      @scala.inline
      implicit class IPropsMutableBuilder[Self <: IProps] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setArgs(value: ReadonlyJSONObject): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
        
        @scala.inline
        def setCommands(value: CommandRegistry): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      }
    }
  }
  
  @JSImport("@jupyterlab/apputils/lib/toolbar", "Toolbar")
  @js.native
  /**
    * Construct a new toolbar widget.
    */
  class Toolbar[T /* <: Widget */] () extends Widget {
    
    var _insertRelative: js.Any = js.native
    
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
    
    /**
      * Create an interrupt toolbar item.
      */
    @JSImport("@jupyterlab/apputils/lib/toolbar", "Toolbar.createInterruptButton")
    @js.native
    def createInterruptButton(sessionContext: ISessionContext): Widget = js.native
    
    /**
      * Create a kernel name indicator item.
      *
      * #### Notes
      * It will display the `'display_name`' of the session context. It can
      * handle a change in context or kernel.
      */
    @JSImport("@jupyterlab/apputils/lib/toolbar", "Toolbar.createKernelNameItem")
    @js.native
    def createKernelNameItem(sessionContext: ISessionContext): Widget = js.native
    @JSImport("@jupyterlab/apputils/lib/toolbar", "Toolbar.createKernelNameItem")
    @js.native
    def createKernelNameItem(sessionContext: ISessionContext, dialogs: IDialogs): Widget = js.native
    
    /**
      * Create a kernel status indicator item.
      *
      * #### Notes
      * It will show a busy status if the kernel status is busy.
      * It will show the current status in the node title.
      * It can handle a change to the context or the kernel.
      */
    @JSImport("@jupyterlab/apputils/lib/toolbar", "Toolbar.createKernelStatusItem")
    @js.native
    def createKernelStatusItem(sessionContext: ISessionContext): Widget = js.native
    
    /**
      * Create a restart toolbar item.
      */
    @JSImport("@jupyterlab/apputils/lib/toolbar", "Toolbar.createRestartButton")
    @js.native
    def createRestartButton(sessionContext: ISessionContext): Widget = js.native
    @JSImport("@jupyterlab/apputils/lib/toolbar", "Toolbar.createRestartButton")
    @js.native
    def createRestartButton(sessionContext: ISessionContext, dialogs: IDialogs): Widget = js.native
    
    /**
      * Create a toolbar spacer item.
      *
      * #### Notes
      * It is a flex spacer that separates the left toolbar items
      * from the right toolbar items.
      */
    @JSImport("@jupyterlab/apputils/lib/toolbar", "Toolbar.createSpacerItem")
    @js.native
    def createSpacerItem(): Widget = js.native
  }
  
  @JSImport("@jupyterlab/apputils/lib/toolbar", "ToolbarButton")
  @js.native
  /**
    * Creates a toolbar button
    * @param props props for underlying `ToolbarButton` componenent
    */
  class ToolbarButton () extends ReactWidget {
    def this(props: typings.jupyterlabApputils.toolbarMod.ToolbarButtonComponent.IProps) = this()
    
    var props: js.Any = js.native
  }
  
  object ToolbarButtonComponent {
    
    @JSImport("@jupyterlab/apputils/lib/toolbar", "ToolbarButtonComponent")
    @js.native
    def apply(props: typings.jupyterlabApputils.toolbarMod.ToolbarButtonComponent.IProps): Element = js.native
    
    /**
      * Interface for ToolbarButttonComponent props.
      */
    @js.native
    trait IProps extends StObject {
      
      var className: js.UndefOr[String] = js.native
      
      var enabled: js.UndefOr[Boolean] = js.native
      
      var icon: js.UndefOr[IMaybeResolvable] = js.native
      
      var iconClass: js.UndefOr[String] = js.native
      
      var iconLabel: js.UndefOr[String] = js.native
      
      var label: js.UndefOr[String] = js.native
      
      var onClick: js.UndefOr[js.Function0[Unit]] = js.native
      
      var tooltip: js.UndefOr[String] = js.native
    }
    object IProps {
      
      @scala.inline
      def apply(): typings.jupyterlabApputils.toolbarMod.ToolbarButtonComponent.IProps = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.jupyterlabApputils.toolbarMod.ToolbarButtonComponent.IProps]
      }
      
      @scala.inline
      implicit class IPropsMutableBuilder[Self <: typings.jupyterlabApputils.toolbarMod.ToolbarButtonComponent.IProps] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
        
        @scala.inline
        def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
        
        @scala.inline
        def setIcon(value: IMaybeResolvable): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIconClass(value: String): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIconClassUndefined: Self = StObject.set(x, "iconClass", js.undefined)
        
        @scala.inline
        def setIconLabel(value: String): Self = StObject.set(x, "iconLabel", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIconLabelUndefined: Self = StObject.set(x, "iconLabel", js.undefined)
        
        @scala.inline
        def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
        
        @scala.inline
        def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
        
        @scala.inline
        def setOnClick(value: () => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction0(value))
        
        @scala.inline
        def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
        
        @scala.inline
        def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      }
    }
  }
  
  @JSImport("@jupyterlab/apputils/lib/toolbar", "addCommandToolbarButtonClass")
  @js.native
  def addCommandToolbarButtonClass(w: Widget): Widget = js.native
  
  @JSImport("@jupyterlab/apputils/lib/toolbar", "addToolbarButtonClass")
  @js.native
  def addToolbarButtonClass(w: Widget): Widget = js.native
}
