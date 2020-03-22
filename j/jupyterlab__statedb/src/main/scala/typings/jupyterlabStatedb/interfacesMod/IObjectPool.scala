package typings.jupyterlabStatedb.interfacesMod

import typings.luminoDisposable.mod.IDisposable
import typings.luminoDisposable.mod.IObservableDisposable
import typings.luminoSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObjectPool[T /* <: IObservableDisposable */] extends IDisposable {
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
    * The number of objects held by the pool.
    */
  val size: Double
  /**
    * A signal emitted when an object is updated.
    */
  val updated: ISignal[this.type, T]
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
}

object IObjectPool {
  @scala.inline
  def apply[T /* <: IObservableDisposable */](
    added: ISignal[IObjectPool[T], T],
    currentChanged: ISignal[IObjectPool[T], T | Null],
    dispose: () => Unit,
    filter: js.Function1[/* obj */ T, Boolean] => js.Array[T],
    find: js.Function1[/* obj */ T, Boolean] => js.UndefOr[T],
    forEach: js.Function1[/* obj */ T, Unit] => Unit,
    has: T => Boolean,
    isDisposed: Boolean,
    size: Double,
    updated: ISignal[IObjectPool[T], T],
    current: T = null
  ): IObjectPool[T] = {
    val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], currentChanged = currentChanged.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), filter = js.Any.fromFunction1(filter), find = js.Any.fromFunction1(find), forEach = js.Any.fromFunction1(forEach), has = js.Any.fromFunction1(has), isDisposed = isDisposed.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
    if (current != null) __obj.updateDynamic("current")(current.asInstanceOf[js.Any])
    __obj.asInstanceOf[IObjectPool[T]]
  }
}

