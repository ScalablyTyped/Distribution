package typings.jupyterlabApplication

import typings.jupyterlabApplication.shellMod.ILabShell.ILayout
import typings.jupyterlabApputils.mod.WidgetTracker
import typings.jupyterlabStatedb.interfacesMod.IDataConnector
import typings.jupyterlabStatedb.interfacesMod.IRestorable
import typings.jupyterlabStatedb.interfacesMod.IRestorer
import typings.jupyterlabStatedb.interfacesMod.IRestorer.IOptions
import typings.luminoCommands.mod.CommandRegistry
import typings.luminoCoreutils.jsonMod.ReadonlyPartialJSONValue
import typings.luminoCoreutils.mod.Token
import typings.luminoDisposable.mod.IObservableDisposable
import typings.luminoWidgets.mod.Widget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layoutrestorerMod {
  
  @js.native
  trait ILayoutRestorer
    extends IRestorer[IRestorable[IObservableDisposable, js.Any], IObservableDisposable, js.Any] {
    
    /**
      * Add a widget to be tracked by the layout restorer.
      */
    def add(widget: Widget, name: String): Unit = js.native
    
    /**
      * Restore the widgets of a particular widget tracker.
      *
      * @param tracker - The widget tracker whose widgets will be restored.
      *
      * @param options - The restoration options.
      */
    def restore[T /* <: Widget */](tracker: WidgetTracker[T], options: IOptions[T]): js.Promise[_] = js.native
    
    /**
      * A promise resolved when the layout restorer is ready to receive signals.
      */
    @JSName("restored")
    var restored_ILayoutRestorer: js.Promise[Unit] = js.native
  }
  object ILayoutRestorer {
    
    @JSImport("@jupyterlab/application/lib/layoutrestorer", "ILayoutRestorer")
    @js.native
    val ^ : Token[ILayoutRestorer] = js.native
    
    @scala.inline
    implicit class ILayoutRestorerMutableBuilder[Self <: ILayoutRestorer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdd(value: (Widget, String) => Unit): Self = StObject.set(x, "add", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRestore(value: (WidgetTracker[js.Any], IOptions[js.Any]) => js.Promise[_]): Self = StObject.set(x, "restore", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRestored(value: js.Promise[Unit]): Self = StObject.set(x, "restored", value.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("@jupyterlab/application/lib/layoutrestorer", "LayoutRestorer")
  @js.native
  class LayoutRestorer protected () extends ILayoutRestorer {
    /**
      * Create a layout restorer.
      */
    def this(options: typings.jupyterlabApplication.layoutrestorerMod.LayoutRestorer.IOptions) = this()
    
    var _connector: js.Any = js.native
    
    /**
      * Dehydrate a main area description into a serializable object.
      */
    var _dehydrateMainArea: js.Any = js.native
    
    /**
      * Dehydrate a side area description into a serializable object.
      */
    var _dehydrateSideArea: js.Any = js.native
    
    var _first: js.Any = js.native
    
    var _firstDone: js.Any = js.native
    
    /**
      * Handle a widget disposal.
      */
    var _onWidgetDisposed: js.Any = js.native
    
    var _promises: js.Any = js.native
    
    var _promisesDone: js.Any = js.native
    
    var _registry: js.Any = js.native
    
    /**
      * Reydrate a serialized main area description object.
      *
      * #### Notes
      * This function consumes data that can become corrupted, so it uses type
      * coercion to guarantee the dehydrated object is safely processed.
      */
    var _rehydrateMainArea: js.Any = js.native
    
    /**
      * Reydrate a serialized side area description object.
      *
      * #### Notes
      * This function consumes data that can become corrupted, so it uses type
      * coercion to guarantee the dehydrated object is safely processed.
      */
    var _rehydrateSideArea: js.Any = js.native
    
    var _restored: js.Any = js.native
    
    var _trackers: js.Any = js.native
    
    var _widgets: js.Any = js.native
    
    /**
      * Fetch the layout state for the application.
      *
      * #### Notes
      * Fetching the layout relies on all widget restoration to be complete, so
      * calls to `fetch` are guaranteed to return after restoration is complete.
      */
    def fetch(): js.Promise[ILayout] = js.native
    
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
    @js.native
    trait IOptions extends StObject {
      
      /**
        * The data connector used for layout saving and fetching.
        */
      var connector: IDataConnector[ReadonlyPartialJSONValue, ReadonlyPartialJSONValue, String, String] = js.native
      
      /**
        * The initial promise that has to be resolved before restoration.
        *
        * #### Notes
        * This promise should equal the JupyterLab application `started` notifier.
        */
      var first: js.Promise[_] = js.native
      
      /**
        * The application command registry.
        */
      var registry: CommandRegistry = js.native
    }
    object IOptions {
      
      @scala.inline
      def apply(
        connector: IDataConnector[ReadonlyPartialJSONValue, ReadonlyPartialJSONValue, String, String],
        first: js.Promise[_],
        registry: CommandRegistry
      ): typings.jupyterlabApplication.layoutrestorerMod.LayoutRestorer.IOptions = {
        val __obj = js.Dynamic.literal(connector = connector.asInstanceOf[js.Any], first = first.asInstanceOf[js.Any], registry = registry.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.jupyterlabApplication.layoutrestorerMod.LayoutRestorer.IOptions]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: typings.jupyterlabApplication.layoutrestorerMod.LayoutRestorer.IOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setConnector(value: IDataConnector[ReadonlyPartialJSONValue, ReadonlyPartialJSONValue, String, String]): Self = StObject.set(x, "connector", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFirst(value: js.Promise[_]): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRegistry(value: CommandRegistry): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
      }
    }
  }
}
