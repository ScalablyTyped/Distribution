package typings.jupyterlabStatedb

import typings.jupyterlabStatedb.anon.Ids
import typings.jupyterlabStatedb.interfacesMod.IRestorable.IOptions
import typings.luminoCommands.mod.CommandRegistry
import typings.luminoCoreutils.jsonMod.ReadonlyPartialJSONObject
import typings.luminoCoreutils.jsonMod.ReadonlyPartialJSONValue
import typings.luminoDisposable.mod.IDisposable
import typings.luminoDisposable.mod.IObservableDisposable
import typings.luminoSignaling.mod.ISignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interfacesMod {
  
  @js.native
  trait IDataConnector[T, U, V, W] extends StObject {
    
    /**
      * Retrieve an item from the data connector.
      *
      * @param id - The identifier used to retrieve an item.
      *
      * @returns A promise that bears a data payload if available.
      *
      * #### Notes
      * The promise returned by this method may be rejected if an error occurs in
      * retrieving the data. Nonexistence of an `id` resolves with `undefined`.
      */
    def fetch(id: V): js.Promise[js.UndefOr[T]] = js.native
    
    /**
      * Retrieve the list of items available from the data connector.
      *
      * @param query - The optional query filter to apply to the connector request.
      *
      * @returns A promise that bears a list of `values` and an associated list of
      * fetch `ids`.
      *
      * #### Notes
      * The promise returned by this method may be rejected if an error occurs in
      * retrieving the data. The two lists will always be the same size. If there
      * is no data, this method will succeed with empty `ids` and `values`.
      */
    def list(): js.Promise[Ids[V, T]] = js.native
    def list(query: W): js.Promise[Ids[V, T]] = js.native
    
    /**
      * Remove a value using the data connector.
      *
      * @param id - The identifier for the data being removed.
      *
      * @returns A promise that is rejected if remove fails and succeeds otherwise.
      *
      * #### Notes
      * This promise may resolve with a back-end response or `undefined`.
      * Existence of resolved content in the promise is not prescribed and must be
      * tested for. For example, some back-ends may return a copy of the item of
      * type `T` being removed while others may return no content.
      */
    def remove(id: V): js.Promise[Any] = js.native
    
    /**
      * Save a value using the data connector.
      *
      * @param id - The identifier for the data being saved.
      *
      * @param value - The data being saved.
      *
      * @returns A promise that is rejected if saving fails and succeeds otherwise.
      *
      * #### Notes
      * This promise may resolve with a back-end response or `undefined`.
      * Existence of resolved content in the promise is not prescribed and must be
      * tested for. For example, some back-ends may return a copy of the item of
      * type `T` being saved while others may return no content.
      */
    def save(id: V, value: U): js.Promise[Any] = js.native
  }
  
  trait IObjectPool[T /* <: IObservableDisposable */]
    extends StObject
       with IDisposable {
    
    /**
      * A signal emitted when an object is added.
      *
      * ####
      * This signal does not emit if an object is added using `inject()`.
      */
    val added: ISignal[this.type, T]
    
    /**
      * The current object.
      */
    val current: T | Null
    
    /**
      * A signal emitted when the current object changes.
      *
      * #### Notes
      * If the last object being tracked is disposed, `null` will be emitted.
      */
    val currentChanged: ISignal[this.type, T | Null]
    
    /**
      * Filter the objects in the pool based on a predicate.
      *
      * @param fn - The function by which to filter.
      */
    def filter(fn: js.Function1[/* obj */ T, Boolean]): js.Array[T]
    
    /**
      * Find the first object in the pool that satisfies a filter function.
      *
      * @param - fn The filter function to call on each object.
      *
      * #### Notes
      * If nothing is found, the value returned is `undefined`.
      */
    def find(fn: js.Function1[/* obj */ T, Boolean]): js.UndefOr[T]
    
    /**
      * Iterate through each object in the pool.
      *
      * @param fn - The function to call on each object.
      */
    def forEach(fn: js.Function1[/* obj */ T, Unit]): Unit
    
    /**
      * Check if this pool has the specified object.
      *
      * @param obj - The object whose existence is being checked.
      */
    def has(obj: T): Boolean
    
    /**
      * The number of objects held by the pool.
      */
    val size: Double
    
    /**
      * A signal emitted when an object is updated.
      */
    val updated: ISignal[this.type, T]
  }
  object IObjectPool {
    
    inline def apply[T /* <: IObservableDisposable */](
      added: ISignal[IObjectPool[T], T],
      currentChanged: ISignal[IObjectPool[T], T | Null],
      dispose: () => Unit,
      filter: js.Function1[/* obj */ T, Boolean] => js.Array[T],
      find: js.Function1[/* obj */ T, Boolean] => js.UndefOr[T],
      forEach: js.Function1[/* obj */ T, Unit] => Unit,
      has: T => Boolean,
      isDisposed: Boolean,
      size: Double,
      updated: ISignal[IObjectPool[T], T]
    ): IObjectPool[T] = {
      val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], currentChanged = currentChanged.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), filter = js.Any.fromFunction1(filter), find = js.Any.fromFunction1(find), forEach = js.Any.fromFunction1(forEach), has = js.Any.fromFunction1(has), isDisposed = isDisposed.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any], current = null)
      __obj.asInstanceOf[IObjectPool[T]]
    }
    
    extension [Self <: IObjectPool[?], T /* <: IObservableDisposable */](x: Self & IObjectPool[T]) {
      
      inline def setAdded(value: ISignal[IObjectPool[T], T]): Self = StObject.set(x, "added", value.asInstanceOf[js.Any])
      
      inline def setCurrent(value: T): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setCurrentChanged(value: ISignal[IObjectPool[T], T | Null]): Self = StObject.set(x, "currentChanged", value.asInstanceOf[js.Any])
      
      inline def setCurrentNull: Self = StObject.set(x, "current", null)
      
      inline def setFilter(value: js.Function1[/* obj */ T, Boolean] => js.Array[T]): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      inline def setFind(value: js.Function1[/* obj */ T, Boolean] => js.UndefOr[T]): Self = StObject.set(x, "find", js.Any.fromFunction1(value))
      
      inline def setForEach(value: js.Function1[/* obj */ T, Unit] => Unit): Self = StObject.set(x, "forEach", js.Any.fromFunction1(value))
      
      inline def setHas(value: T => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setUpdated(value: ISignal[IObjectPool[T], T]): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    }
  }
  
  trait IRestorable[T /* <: IObservableDisposable */, U] extends StObject {
    
    /**
      * Restore the objects in this restorable collection.
      *
      * @param options - The configuration options that describe restoration.
      *
      * @returns A promise that settles when restored with `any` results.
      *
      */
    def restore(options: IOptions[T]): js.Promise[U]
    
    /**
      * A promise that settles when the collection has been restored.
      */
    val restored: js.Promise[U]
  }
  object IRestorable {
    
    inline def apply[T /* <: IObservableDisposable */, U](restore: IOptions[T] => js.Promise[U], restored: js.Promise[U]): IRestorable[T, U] = {
      val __obj = js.Dynamic.literal(restore = js.Any.fromFunction1(restore), restored = restored.asInstanceOf[js.Any])
      __obj.asInstanceOf[IRestorable[T, U]]
    }
    
    /**
      * The state restoration configuration options.
      *
      * @typeparam T - The type of object held by the restorable collection.
      */
    trait IOptions[T /* <: IObservableDisposable */]
      extends StObject
         with typings.jupyterlabStatedb.interfacesMod.IRestorer.IOptions[T] {
      
      /**
        * The data connector to fetch restore data.
        */
      var connector: IDataConnector[ReadonlyPartialJSONValue, ReadonlyPartialJSONValue, String, String]
      
      /**
        * The command registry which holds the restore command.
        */
      var registry: CommandRegistry
    }
    object IOptions {
      
      inline def apply[T /* <: IObservableDisposable */](
        command: String,
        connector: IDataConnector[ReadonlyPartialJSONValue, ReadonlyPartialJSONValue, String, String],
        name: T => String,
        registry: CommandRegistry
      ): IOptions[T] = {
        val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], connector = connector.asInstanceOf[js.Any], name = js.Any.fromFunction1(name), registry = registry.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions[T]]
      }
      
      extension [Self <: IOptions[?], T /* <: IObservableDisposable */](x: Self & IOptions[T]) {
        
        inline def setConnector(value: IDataConnector[ReadonlyPartialJSONValue, ReadonlyPartialJSONValue, String, String]): Self = StObject.set(x, "connector", value.asInstanceOf[js.Any])
        
        inline def setRegistry(value: CommandRegistry): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
      }
    }
    
    extension [Self <: IRestorable[?, ?], T /* <: IObservableDisposable */, U](x: Self & (IRestorable[T, U])) {
      
      inline def setRestore(value: IOptions[T] => js.Promise[U]): Self = StObject.set(x, "restore", js.Any.fromFunction1(value))
      
      inline def setRestored(value: js.Promise[U]): Self = StObject.set(x, "restored", value.asInstanceOf[js.Any])
    }
  }
  
  trait IRestorer[T /* <: IRestorable[U, Any] */, U /* <: IObservableDisposable */, V] extends StObject {
    
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
    def restore(restorable: T, options: IOptions[U]): js.Promise[V]
    
    /**
      * A promise that settles when the collection has been restored.
      */
    val restored: js.Promise[V]
  }
  object IRestorer {
    
    inline def apply[T /* <: IRestorable[U, Any] */, U /* <: IObservableDisposable */, V](
      restore: (T, typings.jupyterlabStatedb.interfacesMod.IRestorable.IOptions[U]) => js.Promise[V],
      restored: js.Promise[V]
    ): IRestorer[T, U, V] = {
      val __obj = js.Dynamic.literal(restore = js.Any.fromFunction2(restore), restored = restored.asInstanceOf[js.Any])
      __obj.asInstanceOf[IRestorer[T, U, V]]
    }
    
    /**
      * The state restoration configuration options.
      *
      * @typeparam T - The type of object held by the restorable collection.
      */
    trait IOptions[T /* <: IObservableDisposable */] extends StObject {
      
      /**
        * A function that returns the args needed to restore an instance.
        */
      var args: js.UndefOr[js.Function1[/* obj */ T, ReadonlyPartialJSONObject]] = js.undefined
      
      /**
        * The command to execute when restoring instances.
        */
      var command: String
      
      /**
        * A function that returns a unique persistent name for this instance.
        */
      def name(obj: T): String
      
      /**
        * The point after which it is safe to restore state.
        */
      var when: js.UndefOr[js.Promise[Any] | js.Array[js.Promise[Any]]] = js.undefined
    }
    object IOptions {
      
      inline def apply[T /* <: IObservableDisposable */](command: String, name: T => String): typings.jupyterlabStatedb.interfacesMod.IRestorer.IOptions[T] = {
        val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], name = js.Any.fromFunction1(name))
        __obj.asInstanceOf[typings.jupyterlabStatedb.interfacesMod.IRestorer.IOptions[T]]
      }
      
      extension [Self <: typings.jupyterlabStatedb.interfacesMod.IRestorer.IOptions[?], T /* <: IObservableDisposable */](x: Self & typings.jupyterlabStatedb.interfacesMod.IRestorer.IOptions[T]) {
        
        inline def setArgs(value: /* obj */ T => ReadonlyPartialJSONObject): Self = StObject.set(x, "args", js.Any.fromFunction1(value))
        
        inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
        
        inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
        
        inline def setName(value: T => String): Self = StObject.set(x, "name", js.Any.fromFunction1(value))
        
        inline def setWhen(value: js.Promise[Any] | js.Array[js.Promise[Any]]): Self = StObject.set(x, "when", value.asInstanceOf[js.Any])
        
        inline def setWhenUndefined: Self = StObject.set(x, "when", js.undefined)
        
        inline def setWhenVarargs(value: js.Promise[Any]*): Self = StObject.set(x, "when", js.Array(value*))
      }
    }
    
    extension [Self <: IRestorer[?, ?, ?], T /* <: IRestorable[U, Any] */, U /* <: IObservableDisposable */, V](x: Self & (IRestorer[T, U, V])) {
      
      inline def setRestore(value: (T, typings.jupyterlabStatedb.interfacesMod.IRestorable.IOptions[U]) => js.Promise[V]): Self = StObject.set(x, "restore", js.Any.fromFunction2(value))
      
      inline def setRestored(value: js.Promise[V]): Self = StObject.set(x, "restored", value.asInstanceOf[js.Any])
    }
  }
}
