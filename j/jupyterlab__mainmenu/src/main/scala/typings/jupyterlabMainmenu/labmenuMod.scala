package typings.jupyterlabMainmenu

import typings.jupyterlabApputils.widgettrackerMod.IWidgetTracker
import typings.luminoDisposable.mod.IDisposable
import typings.luminoWidgets.menuMod.Menu.IItemOptions
import typings.luminoWidgets.menuMod.Menu.IOptions
import typings.luminoWidgets.mod.Menu
import typings.luminoWidgets.mod.Widget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object labmenuMod {
  
  @JSImport("@jupyterlab/mainmenu/lib/labmenu", "JupyterLabMenu")
  @js.native
  class JupyterLabMenu protected ()
    extends StObject
       with IJupyterLabMenu {
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
    
    /* private */ var _groups: js.Any = js.native
    
    /* private */ var _includeSeparators: js.Any = js.native
    
    /* private */ var _isDisposed: js.Any = js.native
    
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
  trait IJupyterLabMenu
    extends StObject
       with IDisposable {
    
    /**
      * Add a group of menu items specific to a particular
      * plugin.
      */
    def addGroup(items: js.Array[IItemOptions]): IDisposable = js.native
    def addGroup(items: js.Array[IItemOptions], rank: Double): IDisposable = js.native
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
    
    extension [Self <: IMenuExtender[?], T /* <: Widget */](x: Self & IMenuExtender[T]) {
      
      inline def setIsEnabled(value: /* widget */ T => Boolean): Self = StObject.set(x, "isEnabled", js.Any.fromFunction1(value))
      
      inline def setIsEnabledUndefined: Self = StObject.set(x, "isEnabled", js.undefined)
      
      inline def setTracker(value: IWidgetTracker[T]): Self = StObject.set(x, "tracker", value.asInstanceOf[js.Any])
    }
  }
}
