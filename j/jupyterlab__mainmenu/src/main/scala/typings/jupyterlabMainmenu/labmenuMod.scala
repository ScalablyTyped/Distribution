package typings.jupyterlabMainmenu

import typings.jupyterlabApputils.widgettrackerMod.IWidgetTracker
import typings.luminoDisposable.mod.IDisposable
import typings.luminoWidgets.menuMod.Menu.IItemOptions
import typings.luminoWidgets.menuMod.Menu.IOptions
import typings.luminoWidgets.mod.Menu
import typings.luminoWidgets.mod.Widget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object labmenuMod {
  
  @JSImport("@jupyterlab/mainmenu/lib/labmenu", "JupyterLabMenu")
  @js.native
  class JupyterLabMenu protected () extends IJupyterLabMenu {
    /**
      * Construct a new menu.
      *
      * @param options - Options for the phosphor menu.
      *
      * @param includeSeparators - whether to include separators between the
      *   groups that are added to the menu.
      */
    def this(options: IOptions) = this()
    def this(options: IOptions, includeSeparators: Boolean) = this()
    
    var _groups: js.Any = js.native
    
    var _includeSeparators: js.Any = js.native
    
    var _isDisposed: js.Any = js.native
    
    /**
      * Whether the menu has been disposed.
      */
    @JSName("isDisposed")
    def isDisposed_MJupyterLabMenu: Boolean = js.native
    
    /**
      * The underlying Phosphor menu.
      */
    val menu: Menu = js.native
  }
  
  @js.native
  trait IJupyterLabMenu extends IDisposable {
    
    /**
      * Add a group of menu items specific to a particular
      * plugin.
      */
    def addGroup(items: js.Array[IItemOptions]): IDisposable = js.native
    def addGroup(items: js.Array[IItemOptions], rank: Double): IDisposable = js.native
  }
  
  @js.native
  trait IMenuExtender[T /* <: Widget */] extends StObject {
    
    /**
      * An additional function that determines whether the extender
      * is enabled. By default it is considered enabled if the application
      * active widget is contained in the `tracker`. If this is also
      * provided, the criterion is equivalent to
      * `tracker.has(widget) && extender.isEnabled(widget)`
      */
    var isEnabled: js.UndefOr[js.Function1[/* widget */ T, Boolean]] = js.native
    
    /**
      * A widget tracker for identifying the appropriate extender.
      */
    var tracker: IWidgetTracker[T] = js.native
  }
  object IMenuExtender {
    
    @scala.inline
    def apply[T /* <: Widget */](tracker: IWidgetTracker[T]): IMenuExtender[T] = {
      val __obj = js.Dynamic.literal(tracker = tracker.asInstanceOf[js.Any])
      __obj.asInstanceOf[IMenuExtender[T]]
    }
    
    @scala.inline
    implicit class IMenuExtenderMutableBuilder[Self <: IMenuExtender[_], T /* <: Widget */] (val x: Self with IMenuExtender[T]) extends AnyVal {
      
      @scala.inline
      def setIsEnabled(value: /* widget */ T => Boolean): Self = StObject.set(x, "isEnabled", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsEnabledUndefined: Self = StObject.set(x, "isEnabled", js.undefined)
      
      @scala.inline
      def setTracker(value: IWidgetTracker[T]): Self = StObject.set(x, "tracker", value.asInstanceOf[js.Any])
    }
  }
}
