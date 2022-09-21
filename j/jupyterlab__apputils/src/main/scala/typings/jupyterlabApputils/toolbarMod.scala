package typings.jupyterlabApputils

import typings.jupyterlabApputils.sessioncontextMod.ISessionContext
import typings.jupyterlabApputils.sessioncontextMod.ISessionContext.IDialogs
import typings.jupyterlabApputils.tokensMod.IToolbarWidgetRegistry
import typings.jupyterlabApputils.tokensMod.ToolbarRegistry.IToolbarItem
import typings.jupyterlabApputils.tokensMod.ToolbarRegistry.IWidget
import typings.jupyterlabApputils.widgetMod.CommandToolbarButtonComponent.IProps
import typings.jupyterlabApputils.widgetMod.Toolbar.IOptions
import typings.jupyterlabApputils.widgetMod.Toolbar.IWidgetToolbar
import typings.jupyterlabObservables.observablelistMod.IObservableList
import typings.jupyterlabSettingregistry.tokensMod.ISettingRegistry
import typings.jupyterlabTranslation.tokensMod.ITranslator
import typings.luminoCommands.mod.CommandRegistry
import typings.luminoWidgets.mod.Widget
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toolbarMod {
  
  @JSImport("@jupyterlab/apputils/lib/toolbar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@jupyterlab/apputils/lib/toolbar", "CommandToolbarButton")
  @js.native
  open class CommandToolbarButton protected ()
    extends typings.jupyterlabApputils.widgetMod.CommandToolbarButton {
    /**
      * Creates a command toolbar button
      * @param props props for underlying `CommandToolbarButtonComponent` component
      */
    def this(props: IProps) = this()
  }
  
  inline def CommandToolbarButtonComponent(props: IProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("CommandToolbarButtonComponent")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@jupyterlab/apputils/lib/toolbar", "ReactiveToolbar")
  @js.native
  /**
    * Construct a new toolbar widget.
    */
  open class ReactiveToolbar ()
    extends typings.jupyterlabApputils.widgetMod.ReactiveToolbar
  
  @JSImport("@jupyterlab/apputils/lib/toolbar", "Toolbar")
  @js.native
  /**
    * Construct a new toolbar widget.
    */
  open class Toolbar[T /* <: Widget */] ()
    extends typings.jupyterlabApputils.widgetMod.Toolbar[T] {
    def this(options: IOptions) = this()
  }
  object Toolbar {
    
    @JSImport("@jupyterlab/apputils/lib/toolbar", "Toolbar")
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
  }
  
  @JSImport("@jupyterlab/apputils/lib/toolbar", "ToolbarButton")
  @js.native
  /**
    * Creates a toolbar button
    * @param props props for underlying `ToolbarButton` component
    */
  open class ToolbarButton ()
    extends typings.jupyterlabApputils.widgetMod.ToolbarButton {
    def this(props: typings.jupyterlabApputils.widgetMod.ToolbarButtonComponent.IProps) = this()
  }
  
  inline def ToolbarButtonComponent(props: typings.jupyterlabApputils.widgetMod.ToolbarButtonComponent.IProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ToolbarButtonComponent")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@jupyterlab/apputils/lib/toolbar", "ToolbarWidgetRegistry")
  @js.native
  open class ToolbarWidgetRegistry protected ()
    extends typings.jupyterlabApputils.registryMod.ToolbarWidgetRegistry {
    def this(options: typings.jupyterlabApputils.tokensMod.ToolbarRegistry.IOptions) = this()
  }
  
  inline def addCommandToolbarButtonClass(w: Widget): Widget = ^.asInstanceOf[js.Dynamic].applyDynamic("addCommandToolbarButtonClass")(w.asInstanceOf[js.Any]).asInstanceOf[Widget]
  
  inline def addToolbarButtonClass(w: Widget): Widget = ^.asInstanceOf[js.Dynamic].applyDynamic("addToolbarButtonClass")(w.asInstanceOf[js.Any]).asInstanceOf[Widget]
  
  inline def createDefaultFactory(commands: CommandRegistry): js.Function3[/* widgetFactory */ String, /* widget */ Widget, /* toolbarItem */ IWidget, Widget] = ^.asInstanceOf[js.Dynamic].applyDynamic("createDefaultFactory")(commands.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* widgetFactory */ String, /* widget */ Widget, /* toolbarItem */ IWidget, Widget]]
  
  inline def createToolbarFactory(
    toolbarRegistry: IToolbarWidgetRegistry,
    settingsRegistry: ISettingRegistry,
    factoryName: String,
    pluginId: String,
    translator: ITranslator
  ): js.Function1[/* widget */ Widget, IObservableList[IToolbarItem]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createToolbarFactory")(toolbarRegistry.asInstanceOf[js.Any], settingsRegistry.asInstanceOf[js.Any], factoryName.asInstanceOf[js.Any], pluginId.asInstanceOf[js.Any], translator.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* widget */ Widget, IObservableList[IToolbarItem]]]
  inline def createToolbarFactory(
    toolbarRegistry: IToolbarWidgetRegistry,
    settingsRegistry: ISettingRegistry,
    factoryName: String,
    pluginId: String,
    translator: ITranslator,
    propertyId: String
  ): js.Function1[/* widget */ Widget, IObservableList[IToolbarItem]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createToolbarFactory")(toolbarRegistry.asInstanceOf[js.Any], settingsRegistry.asInstanceOf[js.Any], factoryName.asInstanceOf[js.Any], pluginId.asInstanceOf[js.Any], translator.asInstanceOf[js.Any], propertyId.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* widget */ Widget, IObservableList[IToolbarItem]]]
  
  inline def setToolbar(
    widget: IWidgetToolbar,
    factory: js.Function1[/* widget */ Widget, IObservableList[IToolbarItem] | js.Array[IToolbarItem]]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setToolbar")(widget.asInstanceOf[js.Any], factory.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
