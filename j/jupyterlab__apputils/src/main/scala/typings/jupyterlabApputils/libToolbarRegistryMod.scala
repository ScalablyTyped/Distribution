package typings.jupyterlabApputils

import typings.jupyterlabApputils.libTokensMod.IToolbarWidgetRegistry
import typings.jupyterlabApputils.libTokensMod.ToolbarRegistry.IOptions
import typings.jupyterlabApputils.libTokensMod.ToolbarRegistry.IWidget
import typings.luminoCommands.mod.CommandRegistry
import typings.luminoWidgets.mod.Widget
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libToolbarRegistryMod {
  
  @JSImport("@jupyterlab/apputils/lib/toolbar/registry", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@jupyterlab/apputils/lib/toolbar/registry", "ToolbarWidgetRegistry")
  @js.native
  open class ToolbarWidgetRegistry protected ()
    extends StObject
       with IToolbarWidgetRegistry {
    def this(options: IOptions) = this()
    
    /* protected */ def _defaultFactory(widgetFactory: String, widget: Widget, toolbarItem: IWidget): Widget = js.native
    
    /* protected */ var _widgets: Map[String, Map[String, js.Function1[/* main */ Widget, Widget]]] = js.native
    
    /**
      * Create a toolbar item widget
      *
      * @param widgetFactory The widget factory name that creates the toolbar
      * @param widget The newly widget containing the toolbar
      * @param toolbarItem The toolbar item definition
      * @returns The widget to be inserted in the toolbar.
      */
    /* CompleteClass */
    override def createWidget(widgetFactory: String, widget: Widget, toolbarItem: IWidget): Widget = js.native
    
    /**
      * Default toolbar item factory
      */
    def defaultFactory: js.Function3[/* widgetFactory */ String, /* widget */ Widget, /* toolbarItem */ IWidget, Widget] = js.native
    /**
      * Default toolbar item factory
      */
    /* CompleteClass */
    override def defaultFactory(widgetFactory: String, widget: Widget, toolbarItem: IWidget): Widget = js.native
    def defaultFactory_=(
      factory: js.Function3[/* widgetFactory */ String, /* widget */ Widget, /* toolbarItem */ IWidget, Widget]
    ): Unit = js.native
    
    /**
      * Register a new toolbar item factory
      *
      * @param widgetFactory The widget factory name that creates the toolbar
      * @param toolbarItemName The unique toolbar item
      * @param factory The factory function that receives the widget containing the toolbar and returns the toolbar widget.
      * @returns The previously defined factory
      */
    /* CompleteClass */
    override def registerFactory[T /* <: Widget */](widgetFactory: String, toolbarItemName: String, factory: js.Function1[/* main */ T, Widget]): js.UndefOr[js.Function1[/* main */ T, Widget]] = js.native
  }
  
  inline def createDefaultFactory(commands: CommandRegistry): js.Function3[/* widgetFactory */ String, /* widget */ Widget, /* toolbarItem */ IWidget, Widget] = ^.asInstanceOf[js.Dynamic].applyDynamic("createDefaultFactory")(commands.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* widgetFactory */ String, /* widget */ Widget, /* toolbarItem */ IWidget, Widget]]
}
