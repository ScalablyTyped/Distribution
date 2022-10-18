package typings.jupyterlabApplication

import typings.jupyterlabApplication.libShellMod.ILabShell.ILayout
import typings.jupyterlabApputils.mod.WidgetTracker
import typings.jupyterlabStatedb.libInterfacesMod.IDataConnector
import typings.jupyterlabStatedb.libInterfacesMod.IRestorable
import typings.jupyterlabStatedb.libInterfacesMod.IRestorer
import typings.jupyterlabStatedb.libInterfacesMod.IRestorer.IOptions
import typings.luminoCommands.mod.CommandRegistry
import typings.luminoCoreutils.mod.Token
import typings.luminoCoreutils.typesJsonMod.ReadonlyPartialJSONValue
import typings.luminoDisposable.mod.IObservableDisposable
import typings.luminoWidgets.mod.Widget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLayoutrestorerMod {
  
  trait ILayoutRestorer
    extends StObject
       with IRestorer[IRestorable[IObservableDisposable, Any], IObservableDisposable, Any] {
    
    /**
      * Add a widget to be tracked by the layout restorer.
      */
    def add(widget: Widget, name: String): Unit
    
    /**
      * Restore the widgets of a particular widget tracker.
      *
      * @param tracker - The widget tracker whose widgets will be restored.
      *
      * @param options - The restoration options.
      */
    def restore[T /* <: Widget */](tracker: WidgetTracker[T], options: IOptions[T]): js.Promise[Any]
    
    /**
      * A promise resolved when the layout restorer is ready to receive signals.
      */
    @JSName("restored")
    var restored_ILayoutRestorer: js.Promise[Unit]
  }
  object ILayoutRestorer {
    
    @JSImport("@jupyterlab/application/lib/layoutrestorer", "ILayoutRestorer")
    @js.native
    val ^ : Token[ILayoutRestorer] = js.native
    
    extension [Self <: ILayoutRestorer](x: Self) {
      
      inline def setAdd(value: (Widget, String) => Unit): Self = StObject.set(x, "add", js.Any.fromFunction2(value))
      
      inline def setRestore(value: (WidgetTracker[Any], IOptions[Any]) => js.Promise[Any]): Self = StObject.set(x, "restore", js.Any.fromFunction2(value))
      
      inline def setRestored(value: js.Promise[Unit]): Self = StObject.set(x, "restored", value.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("@jupyterlab/application/lib/layoutrestorer", "LayoutRestorer")
  @js.native
  open class LayoutRestorer protected ()
    extends StObject
       with ILayoutRestorer {
    /**
      * Create a layout restorer.
      */
    def this(options: typings.jupyterlabApplication.libLayoutrestorerMod.LayoutRestorer.IOptions) = this()
    
    /* private */ var _connector: Any = js.native
    
    /**
      * Dehydrate a down area description into a serializable object.
      */
    /* private */ var _dehydrateDownArea: Any = js.native
    
    /**
      * Dehydrate a main area description into a serializable object.
      */
    /* private */ var _dehydrateMainArea: Any = js.native
    
    /**
      * Dehydrate a side area description into a serializable object.
      */
    /* private */ var _dehydrateSideArea: Any = js.native
    
    /* private */ var _first: Any = js.native
    
    /* private */ var _firstDone: Any = js.native
    
    /**
      * Handle a widget disposal.
      */
    /* private */ var _onWidgetDisposed: Any = js.native
    
    /* private */ var _promises: Any = js.native
    
    /* private */ var _promisesDone: Any = js.native
    
    /* private */ var _registry: Any = js.native
    
    /**
      * Reydrate a serialized side area description object.
      *
      * #### Notes
      * This function consumes data that can become corrupted, so it uses type
      * coercion to guarantee the dehydrated object is safely processed.
      */
    /* private */ var _rehydrateDownArea: Any = js.native
    
    /**
      * Reydrate a serialized main area description object.
      *
      * #### Notes
      * This function consumes data that can become corrupted, so it uses type
      * coercion to guarantee the dehydrated object is safely processed.
      */
    /* private */ var _rehydrateMainArea: Any = js.native
    
    /**
      * Reydrate a serialized side area description object.
      *
      * #### Notes
      * This function consumes data that can become corrupted, so it uses type
      * coercion to guarantee the dehydrated object is safely processed.
      */
    /* private */ var _rehydrateSideArea: Any = js.native
    
    /* private */ var _restored: Any = js.native
    
    /* private */ var _trackers: Any = js.native
    
    /* private */ var _widgets: Any = js.native
    
    /**
      * Add a widget to be tracked by the layout restorer.
      */
    /* CompleteClass */
    override def add(widget: Widget, name: String): Unit = js.native
    
    /**
      * Fetch the layout state for the application.
      *
      * #### Notes
      * Fetching the layout relies on all widget restoration to be complete, so
      * calls to `fetch` are guaranteed to return after restoration is complete.
      */
    def fetch(): js.Promise[ILayout] = js.native
    
    /**
      * Restore the objects in a given restorable collection.
      *
      * @param restorable - The restorable collection being restored.
      *
      * @param options - The configuration options that describe restoration.
      *
      * @returns A promise that settles when restored with `any` results.
      *
      */
    /* CompleteClass */
    override def restore(
      restorable: IRestorable[IObservableDisposable, Any],
      options: typings.jupyterlabStatedb.libInterfacesMod.IRestorable.IOptions[IObservableDisposable]
    ): js.Promise[Any] = js.native
    /**
      * Restore the widgets of a particular widget tracker.
      *
      * @param tracker - The widget tracker whose widgets will be restored.
      *
      * @param options - The restoration options.
      */
    /* CompleteClass */
    override def restore[T /* <: Widget */](tracker: WidgetTracker[T], options: IOptions[T]): js.Promise[Any] = js.native
    
    /**
      * A promise that settles when the collection has been restored.
      */
    /* CompleteClass */
    override val restored: js.Promise[Any] = js.native
    /**
      * A promise resolved when the layout restorer is ready to receive signals.
      */
    /* CompleteClass */
    @JSName("restored")
    var restored_ILayoutRestorer: js.Promise[Unit] = js.native
    /**
      * A promise resolved when the layout restorer is ready to receive signals.
      */
    @JSName("restored")
    def restored_MLayoutRestorer: js.Promise[Unit] = js.native
    
    /**
      * Save the layout state for the application.
      */
    def save(data: ILayout): js.Promise[Unit] = js.native
  }
  object LayoutRestorer {
    
    /**
      * The configuration options for layout restorer instantiation.
      */
    trait IOptions extends StObject {
      
      /**
        * The data connector used for layout saving and fetching.
        */
      var connector: IDataConnector[ReadonlyPartialJSONValue, ReadonlyPartialJSONValue, String, String]
      
      /**
        * The initial promise that has to be resolved before restoration.
        *
        * #### Notes
        * This promise should equal the JupyterLab application `started` notifier.
        */
      var first: js.Promise[Any]
      
      /**
        * The application command registry.
        */
      var registry: CommandRegistry
    }
    object IOptions {
      
      inline def apply(
        connector: IDataConnector[ReadonlyPartialJSONValue, ReadonlyPartialJSONValue, String, String],
        first: js.Promise[Any],
        registry: CommandRegistry
      ): typings.jupyterlabApplication.libLayoutrestorerMod.LayoutRestorer.IOptions = {
        val __obj = js.Dynamic.literal(connector = connector.asInstanceOf[js.Any], first = first.asInstanceOf[js.Any], registry = registry.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.jupyterlabApplication.libLayoutrestorerMod.LayoutRestorer.IOptions]
      }
      
      extension [Self <: typings.jupyterlabApplication.libLayoutrestorerMod.LayoutRestorer.IOptions](x: Self) {
        
        inline def setConnector(value: IDataConnector[ReadonlyPartialJSONValue, ReadonlyPartialJSONValue, String, String]): Self = StObject.set(x, "connector", value.asInstanceOf[js.Any])
        
        inline def setFirst(value: js.Promise[Any]): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
        
        inline def setRegistry(value: CommandRegistry): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
      }
    }
  }
}
