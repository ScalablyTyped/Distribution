package typings.jupyterlabUiComponents

import typings.luminoDisposable.mod.IDisposable
import typings.luminoSignaling.mod.ISignal
import typings.luminoSignaling.mod.Signal
import typings.luminoWidgets.mod.ContextMenu
import typings.luminoWidgets.mod.Menu
import typings.luminoWidgets.typesContextmenuMod.ContextMenu.IOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconWidgetsMenusvgMod {
  
  @JSImport("@jupyterlab/ui-components/lib/icon/widgets/menusvg", "ContextMenuSvg")
  @js.native
  open class ContextMenuSvg protected ()
    extends ContextMenu
       with IDisposable {
    /**
      * Construct a new context menu.
      *
      * @param options - The options for initializing the menu.
      */
    def this(options: IOptions) = this()
    
    /* protected */ var _isDisposed: Boolean = js.native
    
    /* protected */ var _opened: Signal[ContextMenu, Unit] = js.native
    
    /**
      * Dispose of the resources held by the object.
      *
      * #### Notes
      * If the object's `dispose` method is called more than once, all
      * calls made after the first will be a no-op.
      *
      * #### Undefined Behavior
      * It is undefined behavior to use any functionality of the object
      * after it has been disposed unless otherwise explicitly noted.
      */
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /**
      * Test whether the object has been disposed.
      *
      * #### Notes
      * This property is always safe to access.
      */
    /* CompleteClass */
    override val isDisposed: Boolean = js.native
    /**
      * Test whether the context menu is disposed.
      */
    @JSName("isDisposed")
    def isDisposed_MContextMenuSvg: Boolean = js.native
    
    @JSName("menu")
    val menu_ContextMenuSvg: MenuSvg = js.native
    
    /**
      * A signal fired when the context menu is opened.
      */
    def opened: ISignal[ContextMenu, Unit] = js.native
  }
  
  @JSImport("@jupyterlab/ui-components/lib/icon/widgets/menusvg", "MenuSvg")
  @js.native
  open class MenuSvg protected () extends Menu {
    /**
      * construct a new menu. Overrides the default renderer
      *
      * @param options - The options for initializing the tab bar.
      */
    def this(options: typings.luminoWidgets.typesMenuMod.Menu.IOptions) = this()
  }
  object MenuSvg {
    
    @JSImport("@jupyterlab/ui-components/lib/icon/widgets/menusvg", "MenuSvg")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * a modified implementation of the Menu Renderer
      */
    @JSImport("@jupyterlab/ui-components/lib/icon/widgets/menusvg", "MenuSvg.Renderer")
    @js.native
    open class Renderer ()
      extends typings.luminoWidgets.mod.Menu.Renderer
    
    @JSImport("@jupyterlab/ui-components/lib/icon/widgets/menusvg", "MenuSvg.defaultRenderer")
    @js.native
    val defaultRenderer: Renderer = js.native
    
    inline def overrideDefaultRenderer(menu: Menu): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("overrideDefaultRenderer")(menu.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}
