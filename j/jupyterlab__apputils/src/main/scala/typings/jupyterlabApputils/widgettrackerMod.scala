package typings.jupyterlabApputils

import typings.jupyterlabApputils.widgettrackerMod.WidgetTracker.IOptions
import typings.jupyterlabStatedb.interfacesMod.IRestorable
import typings.luminoDisposable.mod.IDisposable
import typings.luminoSignaling.mod.ISignal
import typings.luminoWidgets.mod.Widget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object widgettrackerMod {
  
  @JSImport("@jupyterlab/apputils/lib/widgettracker", "WidgetTracker")
  @js.native
  class WidgetTracker[T /* <: Widget */] protected ()
    extends StObject
       with IWidgetTracker[T]
       with IRestorable[T, js.Any] {
    /**
      * Create a new widget tracker.
      *
      * @param options - The instantiation options for a widget tracker.
      */
    def this(options: IOptions) = this()
    
    /* private */ var _currentChanged: js.Any = js.native
    
    /* private */ var _focusTracker: js.Any = js.native
    
    /* private */ var _isDisposed: js.Any = js.native
    
    /* private */ var _pool: js.Any = js.native
    
    /* private */ var _widgetAdded: js.Any = js.native
    
    /* private */ var _widgetUpdated: js.Any = js.native
    
    /**
      * Add a new widget to the tracker.
      *
      * @param widget - The widget being added.
      *
      * #### Notes
      * The widget passed into the tracker is added synchronously; its existence in
      * the tracker can be checked with the `has()` method. The promise this method
      * returns resolves after the widget has been added and saved to an underlying
      * restoration connector, if one is available.
      *
      * The newly added widget becomes the current widget unless the focus tracker
      * already had a focused widget.
      */
    def add(widget: T): js.Promise[Unit] = js.native
    
    /**
      * A signal emitted when the current instance changes.
      *
      * #### Notes
      * If the last instance being tracked is disposed, `null` will be emitted.
      */
    /* CompleteClass */
    override val currentChanged: ISignal[this.type, T | Null] = js.native
    /**
      * A signal emitted when the current widget changes.
      */
    @JSName("currentChanged")
    def currentChanged_MWidgetTracker: ISignal[this.type, T | Null] = js.native
    
    /**
      * The current widget is the most recently focused or added widget.
      *
      * #### Notes
      * It is the most recently focused widget, or the most recently added
      * widget if no widget has taken focus.
      */
    /* CompleteClass */
    override val currentWidget: T | Null = js.native
    /**
      * The current widget is the most recently focused or added widget.
      *
      * #### Notes
      * It is the most recently focused widget, or the most recently added
      * widget if no widget has taken focus.
      */
    @JSName("currentWidget")
    def currentWidget_MWidgetTracker: T | Null = js.native
    
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
      * Filter the instances in the tracker based on a predicate.
      *
      * @param fn - The function by which to filter.
      */
    /* CompleteClass */
    override def filter(fn: js.Function1[T, Boolean]): js.Array[T] = js.native
    
    /**
      * Find the first instance in the tracker that satisfies a filter function.
      *
      * @param - fn The filter function to call on each instance.
      *
      * #### Notes
      * If nothing is found, the value returned is `undefined`.
      */
    /* CompleteClass */
    override def find(fn: js.Function1[T, Boolean]): js.UndefOr[T] = js.native
    
    /**
      * Iterate through each instance in the tracker.
      *
      * @param fn - The function to call on each instance.
      */
    /* CompleteClass */
    override def forEach(fn: js.Function1[T, Unit]): Unit = js.native
    
    /**
      * Check if this tracker has the specified instance.
      *
      * @param obj - The object whose existence is being checked.
      */
    /* CompleteClass */
    override def has(obj: Widget): Boolean = js.native
    
    /**
      * Inject an instance into the widget tracker without the tracker handling
      * its restoration lifecycle.
      *
      * @param obj - The instance to inject into the tracker.
      */
    /* CompleteClass */
    override def inject(obj: T): Unit = js.native
    
    /**
      * Test whether the object has been disposed.
      *
      * #### Notes
      * This property is always safe to access.
      */
    /* CompleteClass */
    override val isDisposed: Boolean = js.native
    /**
      * Test whether the tracker is disposed.
      */
    @JSName("isDisposed")
    def isDisposed_MWidgetTracker: Boolean = js.native
    
    /**
      * A namespace for all tracked widgets, (e.g., `notebook`).
      */
    val namespace: String = js.native
    
    /**
      * Handle the current change event.
      *
      * #### Notes
      * The default implementation is a no-op.
      */
    /* protected */ def onCurrentChanged(): Unit = js.native
    /* protected */ def onCurrentChanged(value: T): Unit = js.native
    
    /**
      * Restore the objects in this restorable collection.
      *
      * @param options - The configuration options that describe restoration.
      *
      * @returns A promise that settles when restored with `any` results.
      *
      */
    /* CompleteClass */
    override def restore(options: typings.jupyterlabStatedb.interfacesMod.IRestorable.IOptions[T]): js.Promise[js.Any] = js.native
    
    /**
      * A promise that settles when the collection has been restored.
      */
    /* InferMemberOverrides */
    override val restored: js.Promise[js.Any] & js.Promise[Unit] = js.native
    /**
      * A promise resolved when the tracker has been restored.
      */
    @JSName("restored")
    def restored_MWidgetTracker: js.Promise[Unit] = js.native
    
    /**
      * Save the restore data for a given widget.
      *
      * @param widget - The widget being saved.
      */
    def save(widget: T): js.Promise[Unit] = js.native
    
    /**
      * The number of instances held by the tracker.
      */
    /* CompleteClass */
    override val size: Double = js.native
    /**
      * The number of widgets held by the tracker.
      */
    @JSName("size")
    def size_MWidgetTracker: Double = js.native
    
    /**
      * A signal emitted when a widget is added.
      */
    /* CompleteClass */
    override val widgetAdded: ISignal[this.type, T] = js.native
    /**
      * A signal emitted when a widget is added.
      *
      * #### Notes
      * This signal will only fire when a widget is added to the tracker. It will
      * not fire if a widget is injected into the tracker.
      */
    @JSName("widgetAdded")
    def widgetAdded_MWidgetTracker: ISignal[this.type, T] = js.native
    
    /**
      * A signal emitted when a widget is updated.
      */
    /* CompleteClass */
    override val widgetUpdated: ISignal[this.type, T] = js.native
    /**
      * A signal emitted when a widget is updated.
      */
    @JSName("widgetUpdated")
    def widgetUpdated_MWidgetTracker: ISignal[this.type, T] = js.native
  }
  object WidgetTracker {
    
    /**
      * The instantiation options for a widget tracker.
      */
    trait IOptions extends StObject {
      
      /**
        * A namespace for all tracked widgets, (e.g., `notebook`).
        */
      var namespace: String
    }
    object IOptions {
      
      inline def apply(namespace: String): IOptions = {
        val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      extension [Self <: IOptions](x: Self) {
        
        inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      }
    }
  }
  
  trait IWidgetTracker[T /* <: Widget */]
    extends StObject
       with IDisposable {
    
    /**
      * A signal emitted when the current instance changes.
      *
      * #### Notes
      * If the last instance being tracked is disposed, `null` will be emitted.
      */
    val currentChanged: ISignal[this.type, T | Null]
    
    /**
      * The current widget is the most recently focused or added widget.
      *
      * #### Notes
      * It is the most recently focused widget, or the most recently added
      * widget if no widget has taken focus.
      */
    val currentWidget: T | Null
    
    /**
      * Filter the instances in the tracker based on a predicate.
      *
      * @param fn - The function by which to filter.
      */
    def filter(fn: js.Function1[/* obj */ T, Boolean]): js.Array[T]
    
    /**
      * Find the first instance in the tracker that satisfies a filter function.
      *
      * @param - fn The filter function to call on each instance.
      *
      * #### Notes
      * If nothing is found, the value returned is `undefined`.
      */
    def find(fn: js.Function1[/* obj */ T, Boolean]): js.UndefOr[T]
    
    /**
      * Iterate through each instance in the tracker.
      *
      * @param fn - The function to call on each instance.
      */
    def forEach(fn: js.Function1[/* obj */ T, Unit]): Unit
    
    /**
      * Check if this tracker has the specified instance.
      *
      * @param obj - The object whose existence is being checked.
      */
    def has(obj: Widget): Boolean
    
    /**
      * Inject an instance into the widget tracker without the tracker handling
      * its restoration lifecycle.
      *
      * @param obj - The instance to inject into the tracker.
      */
    def inject(obj: T): Unit
    
    /**
      * A promise that is resolved when the widget tracker has been
      * restored from a serialized state.
      *
      * #### Notes
      * Most client code will not need to use this, since they can wait
      * for the whole application to restore. However, if an extension
      * wants to perform actions during the application restoration, but
      * after the restoration of another widget tracker, they can use
      * this promise.
      */
    val restored: js.Promise[Unit]
    
    /**
      * The number of instances held by the tracker.
      */
    val size: Double
    
    /**
      * A signal emitted when a widget is added.
      */
    val widgetAdded: ISignal[this.type, T]
    
    /**
      * A signal emitted when a widget is updated.
      */
    val widgetUpdated: ISignal[this.type, T]
  }
  object IWidgetTracker {
    
    inline def apply[T /* <: Widget */](
      currentChanged: ISignal[IWidgetTracker[T], T | Null],
      dispose: () => Unit,
      filter: js.Function1[/* obj */ T, Boolean] => js.Array[T],
      find: js.Function1[/* obj */ T, Boolean] => js.UndefOr[T],
      forEach: js.Function1[/* obj */ T, Unit] => Unit,
      has: Widget => Boolean,
      inject: T => Unit,
      isDisposed: Boolean,
      restored: js.Promise[Unit],
      size: Double,
      widgetAdded: ISignal[IWidgetTracker[T], T],
      widgetUpdated: ISignal[IWidgetTracker[T], T]
    ): IWidgetTracker[T] = {
      val __obj = js.Dynamic.literal(currentChanged = currentChanged.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), filter = js.Any.fromFunction1(filter), find = js.Any.fromFunction1(find), forEach = js.Any.fromFunction1(forEach), has = js.Any.fromFunction1(has), inject = js.Any.fromFunction1(inject), isDisposed = isDisposed.asInstanceOf[js.Any], restored = restored.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], widgetAdded = widgetAdded.asInstanceOf[js.Any], widgetUpdated = widgetUpdated.asInstanceOf[js.Any], currentWidget = null)
      __obj.asInstanceOf[IWidgetTracker[T]]
    }
    
    extension [Self <: IWidgetTracker[?], T /* <: Widget */](x: Self & IWidgetTracker[T]) {
      
      inline def setCurrentChanged(value: ISignal[IWidgetTracker[T], T | Null]): Self = StObject.set(x, "currentChanged", value.asInstanceOf[js.Any])
      
      inline def setCurrentWidget(value: T): Self = StObject.set(x, "currentWidget", value.asInstanceOf[js.Any])
      
      inline def setCurrentWidgetNull: Self = StObject.set(x, "currentWidget", null)
      
      inline def setFilter(value: js.Function1[/* obj */ T, Boolean] => js.Array[T]): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      inline def setFind(value: js.Function1[/* obj */ T, Boolean] => js.UndefOr[T]): Self = StObject.set(x, "find", js.Any.fromFunction1(value))
      
      inline def setForEach(value: js.Function1[/* obj */ T, Unit] => Unit): Self = StObject.set(x, "forEach", js.Any.fromFunction1(value))
      
      inline def setHas(value: Widget => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
      
      inline def setInject(value: T => Unit): Self = StObject.set(x, "inject", js.Any.fromFunction1(value))
      
      inline def setRestored(value: js.Promise[Unit]): Self = StObject.set(x, "restored", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setWidgetAdded(value: ISignal[IWidgetTracker[T], T]): Self = StObject.set(x, "widgetAdded", value.asInstanceOf[js.Any])
      
      inline def setWidgetUpdated(value: ISignal[IWidgetTracker[T], T]): Self = StObject.set(x, "widgetUpdated", value.asInstanceOf[js.Any])
    }
  }
}
