package typings.atJupyterlabCoreutils.libRestorablepoolMod

import typings.atJupyterlabCoreutils.libInterfacesMod.IObjectPool
import typings.atJupyterlabCoreutils.libInterfacesMod.IRestorable
import typings.atJupyterlabCoreutils.libRestorablepoolMod.RestorablePoolNs.IOptions
import typings.atPhosphorDisposable.atPhosphorDisposableMod.IObservableDisposable
import typings.atPhosphorSignaling.atPhosphorSignalingMod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/coreutils/lib/restorablepool", "RestorablePool")
@js.native
class RestorablePool[T /* <: IObservableDisposable */] protected ()
  extends IObjectPool[T]
     with IRestorable[T, js.Any] {
  /**
    * Create a new restorable pool.
    *
    * @param options - The instantiation options for a restorable pool.
    */
  def this(options: IOptions) = this()
  var _added: js.Any = js.native
  var _current: js.Any = js.native
  var _currentChanged: js.Any = js.native
  var _hasRestored: js.Any = js.native
  var _isDisposed: js.Any = js.native
  var _objects: js.Any = js.native
  /**
    * Clean up after disposed objects.
    */
  var _onInstanceDisposed: js.Any = js.native
  var _restore: js.Any = js.native
  var _restored: js.Any = js.native
  var _updated: js.Any = js.native
  /**
    * A signal emitted when an object is added.
    *
    * ####
    * This signal does not emit if an object is added using `inject()`.
    */
  /* CompleteClass */
  override val added: ISignal[this.type, T] = js.native
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
    * Test whether the object has been disposed.
    *
    * #### Notes
    * This property is always safe to access.
    */
  /* CompleteClass */
  override val isDisposed: Boolean = js.native
  /**
    * A namespace for all tracked objects.
    */
  val namespace: String = js.native
  /**
    * A promise that settles when the collection has been restored.
    */
  /* CompleteClass */
  override val restored: js.Promise[js.Any] = js.native
  /**
    * A promise resolved when the restorable pool has been restored.
    */
  @JSName("restored")
  val restored_RestorablePool: js.Promise[Unit] = js.native
  /**
    * The number of objects held by the pool.
    */
  /* CompleteClass */
  override val size: Double = js.native
  /**
    * A signal emitted when an object is updated.
    */
  /* CompleteClass */
  override val updated: ISignal[this.type, T] = js.native
  /**
    * Add a new object to the pool.
    *
    * @param obj - The object object being added.
    *
    * #### Notes
    * The object passed into the tracker is added synchronously; its existence in
    * the tracker can be checked with the `has()` method. The promise this method
    * returns resolves after the object has been added and saved to an underlying
    * restoration connector, if one is available.
    */
  def add(obj: T): js.Promise[Unit] = js.native
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
    * Restore the objects in this restorable collection.
    *
    * @param options - The configuration options that describe restoration.
    *
    * @returns A promise that settles when restored with `any` results.
    *
    */
  /* CompleteClass */
  override def restore(options: typings.atJupyterlabCoreutils.libInterfacesMod.IRestorableNs.IOptions[T]): js.Promise[js.Any] = js.native
  /**
    * Save the restore data for a given object.
    *
    * @param obj - The object being saved.
    */
  def save(obj: T): js.Promise[Unit] = js.native
}

