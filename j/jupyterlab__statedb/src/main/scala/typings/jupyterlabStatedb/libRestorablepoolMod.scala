package typings.jupyterlabStatedb

import typings.jupyterlabStatedb.libInterfacesMod.IObjectPool
import typings.jupyterlabStatedb.libInterfacesMod.IRestorable
import typings.jupyterlabStatedb.libRestorablepoolMod.RestorablePool.IOptions
import typings.luminoDisposable.mod.IObservableDisposable
import typings.luminoSignaling.mod.ISignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libRestorablepoolMod {
  
  @JSImport("@jupyterlab/statedb/lib/restorablepool", "RestorablePool")
  @js.native
  open class RestorablePool[T /* <: IObservableDisposable */] protected ()
    extends StObject
       with IObjectPool[T]
       with IRestorable[T, Any] {
    /**
      * Create a new restorable pool.
      *
      * @param options - The instantiation options for a restorable pool.
      */
    def this(options: IOptions) = this()
    
    /* private */ var _added: Any = js.native
    
    /* private */ var _current: Any = js.native
    
    /* private */ var _currentChanged: Any = js.native
    
    /* private */ var _hasRestored: Any = js.native
    
    /* private */ var _isDisposed: Any = js.native
    
    /* private */ var _objects: Any = js.native
    
    /**
      * Clean up after disposed objects.
      */
    /* private */ var _onInstanceDisposed: Any = js.native
    
    /* private */ var _restore: Any = js.native
    
    /* private */ var _restored: Any = js.native
    
    /* private */ var _updated: Any = js.native
    
    /**
      * Add a new object to the pool.
      *
      * @param obj - The object object being added.
      *
      * #### Notes
      * The object passed into the pool is added synchronously; its existence in
      * the pool can be checked with the `has()` method. The promise this method
      * returns resolves after the object has been added and saved to an underlying
      * restoration connector, if one is available.
      */
    def add(obj: T): js.Promise[Unit] = js.native
    
    /**
      * A signal emitted when an object is added.
      *
      * ####
      * This signal does not emit if an object is added using `inject()`.
      */
    /* CompleteClass */
    override val added: ISignal[this.type, T] = js.native
    /**
      * A signal emitted when an object object is added.
      *
      * #### Notes
      * This signal will only fire when an object is added to the pool.
      * It will not fire if an object injected into the pool.
      */
    @JSName("added")
    def added_MRestorablePool: ISignal[this.type, T] = js.native
    
    /**
      * The current object.
      */
    /* CompleteClass */
    override val current: T | Null = js.native
    
    /**
      * A signal emitted when the current object changes.
      *
      * #### Notes
      * If the last object being tracked is disposed, `null` will be emitted.
      */
    /* CompleteClass */
    override val currentChanged: ISignal[this.type, T | Null] = js.native
    /**
      * A signal emitted when the current widget changes.
      */
    @JSName("currentChanged")
    def currentChanged_MRestorablePool: ISignal[this.type, T | Null] = js.native
    
    def current_=(obj: T | Null): Unit = js.native
    /**
      * The current object.
      *
      * #### Notes
      * The restorable pool does not set `current`. It is intended for client use.
      *
      * If `current` is set to an object that does not exist in the pool, it is a
      * no-op.
      */
    @JSName("current")
    def current_MRestorablePool: T | Null = js.native
    
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
      * Filter the objects in the pool based on a predicate.
      *
      * @param fn - The function by which to filter.
      */
    /* CompleteClass */
    override def filter(fn: js.Function1[T, Boolean]): js.Array[T] = js.native
    
    /**
      * Find the first object in the pool that satisfies a filter function.
      *
      * @param - fn The filter function to call on each object.
      *
      * #### Notes
      * If nothing is found, the value returned is `undefined`.
      */
    /* CompleteClass */
    override def find(fn: js.Function1[T, Boolean]): js.UndefOr[T] = js.native
    
    /**
      * Iterate through each object in the pool.
      *
      * @param fn - The function to call on each object.
      */
    /* CompleteClass */
    override def forEach(fn: js.Function1[T, Unit]): Unit = js.native
    
    /**
      * Check if this pool has the specified object.
      *
      * @param obj - The object whose existence is being checked.
      */
    /* CompleteClass */
    override def has(obj: T): Boolean = js.native
    
    /**
      * Inject an object into the restorable pool without the pool handling its
      * restoration lifecycle.
      *
      * @param obj - The object to inject into the pool.
      */
    def inject(obj: T): js.Promise[Unit] = js.native
    
    /**
      * Test whether the object has been disposed.
      *
      * #### Notes
      * This property is always safe to access.
      */
    /* CompleteClass */
    override val isDisposed: Boolean = js.native
    /**
      * Test whether the pool is disposed.
      */
    @JSName("isDisposed")
    def isDisposed_MRestorablePool: Boolean = js.native
    
    /**
      * A namespace for all tracked objects.
      */
    val namespace: String = js.native
    
    /**
      * Restore the objects in this restorable collection.
      *
      * @param options - The configuration options that describe restoration.
      *
      * @returns A promise that settles when restored with `any` results.
      *
      */
    /* CompleteClass */
    override def restore(options: typings.jupyterlabStatedb.libInterfacesMod.IRestorable.IOptions[T]): js.Promise[Any] = js.native
    
    /**
      * A promise that settles when the collection has been restored.
      */
    /* CompleteClass */
    override val restored: js.Promise[Any] = js.native
    /**
      * A promise resolved when the restorable pool has been restored.
      */
    @JSName("restored")
    def restored_MRestorablePool: js.Promise[Unit] = js.native
    
    /**
      * Save the restore data for a given object.
      *
      * @param obj - The object being saved.
      */
    def save(obj: T): js.Promise[Unit] = js.native
    
    /**
      * The number of objects held by the pool.
      */
    /* CompleteClass */
    override val size: Double = js.native
    /**
      * The number of objects held by the pool.
      */
    @JSName("size")
    def size_MRestorablePool: Double = js.native
    
    /**
      * A signal emitted when an object is updated.
      */
    /* CompleteClass */
    override val updated: ISignal[this.type, T] = js.native
    /**
      * A signal emitted when an object is updated.
      */
    @JSName("updated")
    def updated_MRestorablePool: ISignal[this.type, T] = js.native
  }
  object RestorablePool {
    
    /**
      * The instantiation options for the restorable pool.
      */
    trait IOptions extends StObject {
      
      /**
        * A namespace designating objects from this pool.
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
}
