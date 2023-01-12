package typings.jupyterlabMainmenu

import org.scalablytyped.runtime.Shortcut
import typings.jupyterlabApputils.libWidgettrackerMod.IWidgetTracker
import typings.jupyterlabMainmenu.libEditMod.IEditMenu
import typings.jupyterlabMainmenu.libFileMod.IFileMenu
import typings.jupyterlabMainmenu.libHelpMod.IHelpMenu
import typings.jupyterlabMainmenu.libKernelMod.IKernelMenu
import typings.jupyterlabMainmenu.libRunMod.IRunMenu
import typings.jupyterlabMainmenu.libSettingsMod.ISettingsMenu
import typings.jupyterlabMainmenu.libTabsMod.ITabsMenu
import typings.jupyterlabMainmenu.libTokensMod.IMainMenu.IAddOptions
import typings.jupyterlabMainmenu.libViewMod.IViewMenu
import typings.luminoCoreutils.mod.Token
import typings.luminoWidgets.mod.Menu
import typings.luminoWidgets.mod.Widget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTokensMod {
  
  @js.native
  trait IMainMenu extends StObject {
    
    /**
      * Add a new menu to the main menu bar.
      */
    def addMenu(menu: Menu): Unit = js.native
    def addMenu(menu: Menu, options: IAddOptions): Unit = js.native
    
    /**
      * The application "Edit" menu.
      */
    val editMenu: IEditMenu = js.native
    
    /**
      * The application "File" menu.
      */
    val fileMenu: IFileMenu = js.native
    
    /**
      * The application "Help" menu.
      */
    val helpMenu: IHelpMenu = js.native
    
    /**
      * The application "Kernel" menu.
      */
    val kernelMenu: IKernelMenu = js.native
    
    /**
      * The application "Run" menu.
      */
    val runMenu: IRunMenu = js.native
    
    /**
      * The application "Settings" menu.
      */
    val settingsMenu: ISettingsMenu = js.native
    
    /**
      * The application "Tabs" menu.
      */
    val tabsMenu: ITabsMenu = js.native
    
    /**
      * The application "View" menu.
      */
    val viewMenu: IViewMenu = js.native
  }
  object IMainMenu extends Shortcut {
    
    @JSImport("@jupyterlab/mainmenu/lib/tokens", "IMainMenu")
    @js.native
    val ^ : Token[IMainMenu] = js.native
    
    /**
      * The options used to add a menu to the main menu.
      */
    trait IAddOptions extends StObject {
      
      /**
        * The rank order of the menu among its siblings.
        */
      var rank: js.UndefOr[Double] = js.undefined
    }
    object IAddOptions {
      
      inline def apply(): IAddOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IAddOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IAddOptions] (val x: Self) extends AnyVal {
        
        inline def setRank(value: Double): Self = StObject.set(x, "rank", value.asInstanceOf[js.Any])
        
        inline def setRankUndefined: Self = StObject.set(x, "rank", js.undefined)
      }
    }
    
    /**
      * The instantiation options for an IMainMenu.
      */
    type IMenuOptions = typings.jupyterlabApputils.libMenufactoryMod.MenuFactory.IMenuOptions
    
    type _To = Token[IMainMenu]
    
    /* This means you don't have to write `^`, but can instead just say `IMainMenu.foo` */
    override def _to: Token[IMainMenu] = ^
  }
  
  trait IMenuExtender[T /* <: Widget */] extends StObject {
    
    /**
      * An additional function that determines whether the extender
      * is enabled. By default it is considered enabled if the application
      * active widget is contained in the `tracker`. If this is also
      * provided, the criterion is equivalent to
      * `tracker.has(widget) && extender.isEnabled(widget)`
      */
    var isEnabled: js.UndefOr[js.Function1[/* widget */ T, Boolean]] = js.undefined
    
    /**
      * A widget tracker for identifying the appropriate extender.
      */
    var tracker: IWidgetTracker[T]
  }
  object IMenuExtender {
    
    inline def apply[T /* <: Widget */](tracker: IWidgetTracker[T]): IMenuExtender[T] = {
      val __obj = js.Dynamic.literal(tracker = tracker.asInstanceOf[js.Any])
      __obj.asInstanceOf[IMenuExtender[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IMenuExtender[?], T /* <: Widget */] (val x: Self & IMenuExtender[T]) extends AnyVal {
      
      inline def setIsEnabled(value: /* widget */ T => Boolean): Self = StObject.set(x, "isEnabled", js.Any.fromFunction1(value))
      
      inline def setIsEnabledUndefined: Self = StObject.set(x, "isEnabled", js.undefined)
      
      inline def setTracker(value: IWidgetTracker[T]): Self = StObject.set(x, "tracker", value.asInstanceOf[js.Any])
    }
  }
}
