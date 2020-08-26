package typings.jupyterlabStatedb.interfacesMod

import typings.luminoDisposable.mod.IDisposable
import typings.luminoDisposable.mod.IObservableDisposable
import typings.luminoSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IObjectPool[T /* <: IObservableDisposable */] extends IDisposable {
  /**
    * A signal emitted when an object is added.
    *
    * ####
    * This signal does not emit if an object is added using `inject()`.
    */
  val added: ISignal[this.type, T] = js.native
  /**
    * The current object.
    */
  val current: T | Null = js.native
  /**
    * A signal emitted when the current object changes.
    *
    * #### Notes
    * If the last object being tracked is disposed, `null` will be emitted.
    */
  val currentChanged: ISignal[this.type, T | Null] = js.native
  /**
    * The number of objects held by the pool.
    */
  val size: Double = js.native
  /**
    * A signal emitted when an object is updated.
    */
  val updated: ISignal[this.type, T] = js.native
  /**
    * Filter the objects in the pool based on a predicate.
    *
    * @param fn - The function by which to filter.
    */
  def filter(fn: js.Function1[/* obj */ T, Boolean]): js.Array[T] = js.native
  /**
    * Find the first object in the pool that satisfies a filter function.
    *
    * @param - fn The filter function to call on each object.
    *
    * #### Notes
    * If nothing is found, the value returned is `undefined`.
    */
  def find(fn: js.Function1[/* obj */ T, Boolean]): js.UndefOr[T] = js.native
  /**
    * Iterate through each object in the pool.
    *
    * @param fn - The function to call on each object.
    */
  def forEach(fn: js.Function1[/* obj */ T, Unit]): Unit = js.native
  /**
    * Check if this pool has the specified object.
    *
    * @param obj - The object whose existence is being checked.
    */
  def has(obj: T): Boolean = js.native
}

object IObjectPool {
  @scala.inline
  def apply[/* <: typings.luminoDisposable.mod.IObservableDisposable */ T](
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
    val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], currentChanged = currentChanged.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), filter = js.Any.fromFunction1(filter), find = js.Any.fromFunction1(find), forEach = js.Any.fromFunction1(forEach), has = js.Any.fromFunction1(has), isDisposed = isDisposed.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
    __obj.asInstanceOf[IObjectPool[T]]
  }
  @scala.inline
  implicit class IObjectPoolOps[Self <: IObjectPool[_], /* <: typings.luminoDisposable.mod.IObservableDisposable */ T] (val x: Self with IObjectPool[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAdded(value: ISignal[IObjectPool[T], T]): Self = this.set("added", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrentChanged(value: ISignal[IObjectPool[T], T | Null]): Self = this.set("currentChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilter(value: js.Function1[/* obj */ T, Boolean] => js.Array[T]): Self = this.set("filter", js.Any.fromFunction1(value))
    @scala.inline
    def setFind(value: js.Function1[/* obj */ T, Boolean] => js.UndefOr[T]): Self = this.set("find", js.Any.fromFunction1(value))
    @scala.inline
    def setForEach(value: js.Function1[/* obj */ T, Unit] => Unit): Self = this.set("forEach", js.Any.fromFunction1(value))
    @scala.inline
    def setHas(value: T => Boolean): Self = this.set("has", js.Any.fromFunction1(value))
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdated(value: ISignal[IObjectPool[T], T]): Self = this.set("updated", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrent(value: T): Self = this.set("current", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrentNull: Self = this.set("current", null)
  }
  
}

