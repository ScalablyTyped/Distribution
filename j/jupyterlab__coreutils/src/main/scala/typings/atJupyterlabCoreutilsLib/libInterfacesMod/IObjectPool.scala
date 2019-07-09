package typings
package atJupyterlabCoreutilsLib.libInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObjectPool[T /* <: atPhosphorDisposableLib.atPhosphorDisposableMod.IObservableDisposable */]
  extends atPhosphorDisposableLib.atPhosphorDisposableMod.IDisposable {
  /**
    * A signal emitted when an object is added.
    *
    * ####
    * This signal does not emit if an object is added using `inject()`.
    */
  val added: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[this.type, T]
  /**
    * The current object.
    */
  val current: T | scala.Null
  /**
    * A signal emitted when the current object changes.
    *
    * #### Notes
    * If the last object being tracked is disposed, `null` will be emitted.
    */
  val currentChanged: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[this.type, T | scala.Null]
  /**
    * The number of objects held by the pool.
    */
  val size: scala.Double
  /**
    * A signal emitted when an object is updated.
    */
  val updated: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[this.type, T]
  /**
    * Filter the objects in the pool based on a predicate.
    *
    * @param fn - The function by which to filter.
    */
  def filter(fn: js.Function1[/* obj */ T, scala.Boolean]): js.Array[T]
  /**
    * Find the first object in the pool that satisfies a filter function.
    *
    * @param - fn The filter function to call on each object.
    *
    * #### Notes
    * If nothing is found, the value returned is `undefined`.
    */
  def find(fn: js.Function1[/* obj */ T, scala.Boolean]): js.UndefOr[T]
  /**
    * Iterate through each object in the pool.
    *
    * @param fn - The function to call on each object.
    */
  def forEach(fn: js.Function1[/* obj */ T, scala.Unit]): scala.Unit
  /**
    * Check if this pool has the specified object.
    *
    * @param obj - The object whose existence is being checked.
    */
  def has(obj: T): scala.Boolean
}

object IObjectPool {
  @scala.inline
  def apply[T /* <: atPhosphorDisposableLib.atPhosphorDisposableMod.IObservableDisposable */](
    added: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[IObjectPool[T], T],
    currentChanged: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[IObjectPool[T], T | scala.Null],
    dispose: () => scala.Unit,
    filter: js.Function1[/* obj */ T, scala.Boolean] => js.Array[T],
    find: js.Function1[/* obj */ T, scala.Boolean] => js.UndefOr[T],
    forEach: js.Function1[/* obj */ T, scala.Unit] => scala.Unit,
    has: T => scala.Boolean,
    isDisposed: scala.Boolean,
    size: scala.Double,
    updated: atPhosphorSignalingLib.atPhosphorSignalingMod.ISignal[IObjectPool[T], T],
    current: T = null
  ): IObjectPool[T] = {
    val __obj = js.Dynamic.literal(added = added, currentChanged = currentChanged, dispose = js.Any.fromFunction0(dispose), filter = js.Any.fromFunction1(filter), find = js.Any.fromFunction1(find), forEach = js.Any.fromFunction1(forEach), has = js.Any.fromFunction1(has), isDisposed = isDisposed, size = size, updated = updated)
    if (current != null) __obj.updateDynamic("current")(current.asInstanceOf[js.Any])
    __obj.asInstanceOf[IObjectPool[T]]
  }
}

